package TestNgFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider {
	
	
	public void getdata() {
		String[][] data =new String[2][1];
		data[0][0]=""
		data[0][1]=
		
		
		
	}
	
	
	public void Linkedin() {
			System.setProperty("webdriver.chromedriver.driver","C:\\chromedriver\\chromedriver_win32.chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/home");
			driver.manage().window().fullscreen();
			driver.findElement(By.name("session_key")).sendKeys("@gmail.com");
			System.out.println("username entered");
			driver.findElement(By.name("session_password")).sendKeys("99525089843");
			System.out.println("password typed");
			driver.findElement(By.xpath("//*[@class='sign-in-form__submit-button']")).click();
			System.out.println("logged in succesfully");
			driver.close();
			driver.quit();
		
		
		}
	}
