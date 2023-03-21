package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();

		//selecting first table
		WebElement table = driver.findElement(By.id("table1"));

		//selecting the header -use tagname
		List<WebElement>headers = driver.findElements(By.tagName("thead"));

		//to print header name using foreach loop
		/*for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);
		}*/
         
		
		for (int i = 0; i < args.length; i++) {
			List<WebElement> Allrows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
			int size = Allrows.size();
			System.out.println(size);
			if (size == 4) {
				System.out.println("pass");

			} else
				System.out.println("fail");
			driver.quit();
		}


	}
}
