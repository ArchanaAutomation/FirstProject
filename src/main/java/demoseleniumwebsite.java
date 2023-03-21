import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoseleniumwebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\chromedriver\\chromedriver_win32.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn_basic_example")).click();
		driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='isAgeSelected']")).click();
		System.out.println("Check box is checked Successfully!!");
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[4]/a")).click();
		Select dropdown=new Select(driver.findElement(By.className("dropdown-toggle")));
		dropdown.selectByVisibleText("Drag and Drop");
		
		
		driver.close();
		driver.quit();
		
	}

}
