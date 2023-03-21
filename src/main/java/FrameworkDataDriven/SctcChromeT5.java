package FrameworkDataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SctcChromeT5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize C:\Users\archa\Downloads\chromedriver_win32
		driver.manage().window().maximize();

		driver.get("https://www.tnstc.in/TNSTCOnline/preUserLoginAction.do");


		WebElement username = driver.findElement(By.name("txtUserLoginID"));
		username.sendKeys("archanapadmavathy0897@gmail.com");

		WebElement Password = driver.findElement(By.name("txtPassword"));
		Password.sendKeys("123456");

		WebElement SignIn=driver.findElement(By.className("dboxheader"));
		SignIn.click();
}
}