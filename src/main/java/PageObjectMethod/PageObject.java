package PageObjectMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject { // recape written note

	public static WebElement Email(WebDriver driver) {
		return driver.findElement(By.name("email"));

	} 

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("pass"));

	}

	public static WebElement loginbutton(WebDriver driver) {
		return driver.findElement(By.name("login"));

	}

}
