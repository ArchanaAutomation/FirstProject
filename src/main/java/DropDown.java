import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.globalsqa.com/");
	WebElement TesterHub=driver.findElement(By.xpath("//*[@id=\"menu-item-2822\"]/a"));
	//TesterHub.click();
	Select dropdown1 = new Select(TesterHub);
	dropdown1.selectByIndex(1);
	
	WebElement DemoTesting=driver.findElement(By.id("menu-item-2823"));
	Select dropdown2 = new Select(TesterHub);
	dropdown2.selectByIndex(8);
	//DemoTesting.click();
	WebElement draganddrop=driver.findElement(By.xpath("//*[@id=\"menu-item-2825\"]/a/span"));
	draganddrop.click();
	
}
}