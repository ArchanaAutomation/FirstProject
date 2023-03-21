package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();

		WebElement table = driver.findElement(By.id("table1"));
		WebElement body = table.findElement(By.tagName("tbody"));

		List<WebElement>multiplerows = body.findElements(By.tagName("tr"));
           for (WebElement singlerow : multiplerows) {
			List<WebElement> multipledata = singlerow.findElements(By.tagName("td"));
			
			for (WebElement singledata : multipledata) {
				String Text = singledata.getText();
				System.out.println(Text);
			}
           }
			driver.quit();
	}
}