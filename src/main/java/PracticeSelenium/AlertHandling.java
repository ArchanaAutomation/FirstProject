package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.manage().window().maximize();

		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		String JSAlert=driver.switchTo().alert().getText();
		System.out.println(JSAlert);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	

		String Result = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		if(Result.equals(Result)){
			System.out.println(Result);
		}

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		String JSConfirm=driver.switchTo().alert().getText();
		System.out.println(JSConfirm);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String message=driver.findElement(By.xpath("//p[text()='You clicked: Ok']")).getText();

		if(message.equals(message)) {
			System.out.println(message);
		}

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		String JSPrompt=driver.switchTo().alert().getText();
		System.out.println(JSPrompt);
		driver.switchTo().alert().sendKeys("Hello World");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String Status=driver.findElement(By.id("result")).getText();

		if(Status.equals(Status)) {
			System.out.println(Status);
		}

		driver.quit();
	}
}

