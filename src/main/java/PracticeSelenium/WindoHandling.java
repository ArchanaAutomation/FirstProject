package PracticeSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		//driver.manage().window().maximize();
		
		driver.findElement(By.linkText("WYSIWYG Editor")).click();
		String Url1 = driver.getCurrentUrl();
		
		//storing oldwindow identity
		String Parentwin=driver.getWindowHandle();
		System.out.println("Parentwinndow - "+Parentwin);
				
       //identify multiple window 	
		Set<String> Allwindows=driver.getWindowHandles();
		System.out.println("Allwindows - "+Allwindows);
		for (String Singwin : Allwindows) {
			driver.switchTo().window(Singwin);
		}
		String url2 = driver.getCurrentUrl();
		System.out.println(Url1);
		System.out.println(url2);
		
		//driver.get("http://the-internet.herokuapp.com/tinymce");
		//driver.findElement(By.xpath("//span[text()='Format']")).click();
		//driver.findElement(By.xpath("//div[text()='Bold']")).click();
				
		
		
		
	}
}
