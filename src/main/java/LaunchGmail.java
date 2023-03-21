import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=ARgdvAtBfo7BH9Ajj8hgsN7NadGnZue4RJ_"
				+ "3fGQK6OXRbi2grEbQCMKfen-hAjC6IiCF7A&flowName=GlifWebSignIn&flowEntry=ServiceLogin");


		WebElement userName= driver.findElement(By.name("identifier"));
		userName.sendKeys("archanapadmavathy0897@gmail.com");

		WebElement next1=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next1.click();

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("archana0897");	
		
		 driver.close();
		 driver.quit();
	}

}
