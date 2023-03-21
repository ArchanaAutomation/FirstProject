package FrameworkDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceboolEdgeT2 {
	public static void main(String[] args) {
	     System.setProperty("webdriver.edge.driver","C:\\Users\\archa\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	     WebDriver driver=new EdgeDriver();
	     
	     
	     driver.get("http://www.facebook.com");

	     driver.manage().window().maximize();
	     
	     WebElement email = driver.findElement(By.name("email"));
	     email.sendKeys("9952509843");

	     WebElement password = driver.findElement(By.name("pass"));
	     password.sendKeys("abhi3180");

	     WebElement loginbutton = driver.findElement(By.name("login"));
	     loginbutton.click();

	     System.out.println("done!");
	     
	     //driver.close();
	     //driver.quit();
	 }
		}

	


