import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99website {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/");
	     WebElement Firstname=driver.findElement(By.name("firstname"));
	     Firstname.sendKeys("Archana");
		 
	     driver.findElement(By.name("emailid")).sendKeys("archanaraj0897@gmail.com");  
		 System.out.println("emailid");
		 
		 driver.findElement(By.name("btnLogin")).click();  
		 System.out.println("login succesfully");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}