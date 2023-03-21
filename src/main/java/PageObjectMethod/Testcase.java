package PageObjectMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testcase {
	
	public static void main(String[] args) throws InterruptedException {	 {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("http://www.facebook.com");
		     PageObject.Email(driver).sendKeys("9952509843");
		     PageObject.password(driver).sendKeys("abhi3180");
		     PageObject.loginbutton(driver).click();
		     
		     driver.quit();
		     driver.close();
		}
	}
	}
//		     
//		     
//		     driver.get("http://www.facebook.com");
//
//		     driver.manage().window().maximize();
//		     
//		     WebElement email = driver.findElement(By.name("email"));
//		     email.sendKeys("000");
//
//		     WebElement password = driver.findElement(By.name("pass"));
//		     password.sendKeys("12345");
//
//		     WebElement loginbutton = driver.findElement(By.name("login"));
//		     loginbutton.click();
		
