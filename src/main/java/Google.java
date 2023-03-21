
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.co.in/webhp");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		 driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
 
		 List<WebElement> n= driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));  //xpath for found text in websites
		for (int i=1; i<=size(); i++) {
			 
		 }
	}
}
		 
	 
