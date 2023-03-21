import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchLinkedin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.linkedin.com/home");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//*[@id='session_key']")).sendKeys("9952509843");
		System.out.println("username entered");
		driver.findElement(By.xpath("//*[@id='session_password']")).sendKeys("Archana0897");
		System.out.println("password typed");
		driver.findElement(By.xpath("//*[@class='sign-in-form__submit-button']")).click();
		System.out.println("logged in succesfully");
		//driver.close();
		//driver.quit();
		System.out.println("chrome closed");

	}

}
