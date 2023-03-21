import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='post-2632']/div[2]/div/div/div[1]/a")).click();
		
		//first browser url
		String url1=driver.getCurrentUrl();
		
		String firstwin=driver.getWindowHandle();
		System.out.println();
		Set<String> allwindow=driver.getWindowHandles();
		//System.out.println("getWindowHandles");
		//String url2=driver.getCurrentUrl();
		
		//driver.findElement(By.id("Open New Window")).click();
		
		for (String newWindow: allwindow) {
			driver.switchTo().window(newWindow);
			
		}
		String url2=driver.getCurrentUrl();
		System.out.println(url1);
		System.out.println(url2);
		
		driver.switchTo().window(firstwin);
		
		
		
		
	}

}
