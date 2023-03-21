package FrameworkDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonChromeT1 {
	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://amazon.com");
		 driver.manage().window().maximize();
		 
		 WebElement textfield=driver.findElement(By.id("twotabsearchtextbox"));
		 textfield.sendKeys("iphone 13 phone case");
		 System.out.println("iphone 13 displayed");
		 
		 WebElement searchIcon=driver.findElement(By.id("nav-search-submit-button"));
		 searchIcon.click();
		 
		 WebElement phone=driver.findElement(By.className("s-image"));
		 phone.click();
		 
		 WebElement Color=driver.findElement(By.name("6"));
		 Color.click();
		 System.out.println("selected my fav color");
		 
		 driver.close();
		 driver.quit();
	}

}

