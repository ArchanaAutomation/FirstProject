package TestNgFramework;                  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TCusingPriorityandSuit {
	/*Aim 1 launch amazon,linkedin,bing in chrome driver  
	 *Aim 2 use before and after suit to execute the program
	 *Aim 3 display time taken to run each URL */

	WebDriver driver; 
	long StartTime;   //declared as global variable so that we can use it in each method to calculate time
	long endTime;

	@BeforeSuite
	public void beforeLaunch() {
		//long StartTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Test(priority=1)
	public void amazon() {
		driver.get("http://amazon.com");

	}
	@Test(priority=2)
	public void linkedin() {
		driver.get("http://linkedin.com");
	}
	@Test
	public void bing() {
		driver.get("http://bing.com");
	}

	@AfterSuite
	public void afterLaunch() {

		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime= endTime-StartTime;
		System.out.println("Total Time Taken "  + totalTime );
	
	}
}

