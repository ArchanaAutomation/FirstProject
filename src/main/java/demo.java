import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/");
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a"));
	
		//driver.findElement(By.className("tree-branch")).click();
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Radio Buttons Demo");
		select.selectByIndex(3); 
		
		//driver.quit(); 

	}
}
