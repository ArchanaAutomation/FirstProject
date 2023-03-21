import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {


	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Browser Launch
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
	   //URL Launch
		 driver.get("https://jqueryui.com/droppable/");
		 
	   //Maximize
		 driver.manage().window().maximize();
	   //time
		 //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 //driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
	  //objcreateion-drag
		 WebElement dragobj= driver.findElement(By.id("draggable"));
		
	  //objcreation-drop
		 WebElement dropobj=driver.findElement(By.id("droppable"));
		 
		 Actions actions= new Actions(driver);  //imported action
		 actions.dragAndDrop(dragobj, dropobj).perform();
		 
		//actions.moveToElement(driver.findElement(By.className("demo-frame")));
		 
		// act.dragAndDrop(From, To).build().perform();//Actions.dragAndDrop(drag, drop).build().perform();
		 
		 driver.quit();
	}
}
		 
		 
