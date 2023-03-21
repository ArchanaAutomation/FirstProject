package TestNgFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//parameter is used to run the program in xml sheet also we can directly change value in xml sheet
public class Parameterization {
	@Test
	@Parameters({"session_key","session_password"})
	public static void Linkedin(String username, String password) {
	System.setProperty("webdriver.chromedriver.driver","C:\\chromedriver\\chromedriver_win32.chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.linkedin.com/home");
	driver.manage().window().fullscreen();
	driver.findElement(By.name("session_key")).sendKeys(username);
	System.out.println("username entered");
	driver.findElement(By.name("session_password")).sendKeys(password);
	System.out.println("password typed");
	driver.findElement(By.xpath("//*[@class='sign-in-form__submit-button']")).click();
	System.out.println("logged in succesfully");
	driver.close();
	driver.quit();
}
}