import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class LaunchSCTC {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize C:\Users\archa\Downloads\chromedriver_win32
		driver.manage().window().maximize();

		driver.get("https://www.tnstc.in/TNSTCOnline/preUserLoginAction.do");


		WebElement username = driver.findElement(By.name("txtUserLoginID"));
		username.sendKeys("Archana P");

		WebElement Password = driver.findElement(By.name("txtPassword"));
		Password.sendKeys("12345");

		// WebElement SignIn=driver.findElement(By.name("dboxheader"));
		// SignIn.click();

		WebElement createAccount = driver.findElement(By.className("footerlinks"));
		createAccount.click();

		WebElement username1 = driver.findElement(By.name("txtUserLoginID"));
		username1.sendKeys("archanapadmavathy0842@gmail.com");

		WebElement Password1 = driver.findElement(By.name("txtPassword"));
		Password1.sendKeys("123456");

		WebElement Confirmpassword = driver.findElement(By.name("txtConfirmPassword"));
		Confirmpassword.sendKeys("123456");

		WebElement Fullname = driver.findElement(By.name("txtUserFullName"));
		Fullname.sendKeys("Archana");

		WebElement Mobileno = driver.findElement(By.name("txtMobileNo"));
		Mobileno.sendKeys("9952509843");

		WebElement Checkin = driver.findElement(By.name("chkRules"));
		Checkin.click();

		WebElement Register = driver.findElement(By.className("dboxheader"));
		Register.click();

		WebElement Login = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/div/a/strong"));
		Login.click();

		WebElement From = driver.findElement(By.id("matchStartPlace"));
		From.sendKeys("Chennai");

		WebElement To = driver.findElement(By.id("matchEndPlace"));
		To.sendKeys("Madurai");
		
		Select Startdate = new Select(driver.findElement(By.id("txtdeptDateOtrip")));
		Startdate.selectByVisibleText("25");
		
		
		
		//WebElement dropdown=driver.findElement(By.id("selectOnwardTimeSlab"));
		//Select dp=new Select(dropdown);
		
		
		//driver.close();
		//Scrrenshot
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\archa\\OneDrive\\Desktop\\interview QA\\Screenshot.jpg"));

	}
}
