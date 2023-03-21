import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PracticeClass1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://thedemosite.co.uk/savedata.php");
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("Archana");  //max length 8-16
		System.out.println("username");

		driver.findElement(By.name("password")).sendKeys("Archana0"); //max length 4-16
		System.out.println("password");
	
		driver.findElement(By.name("FormsButton2")).click();
		
		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
		System.out.println("Added User");
	
		driver.findElement(By.name("username")).sendKeys("Archana");  
		System.out.println("username");
		
		driver.findElement(By.name("password")).sendKeys("Archana0"); 
		System.out.println("password");
	
		driver.findElement(By.name("FormsButton2")).click();
		System.out.println("Logged in Succesfully");
		
		//Screenshot 
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File("C:\\Users\\archa\\OneDrive\\Desktop\\interview QA\\screenshot.jpg"));
	}

}