package FrameworkDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartChromeT3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("archanapadmavathy@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("archana0897");

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		}

}
