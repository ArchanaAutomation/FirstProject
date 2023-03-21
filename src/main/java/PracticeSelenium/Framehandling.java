package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://letcode.in/frame");  
	    driver.manage().window().maximize();
	    
	    //first iframe - consider as 0
	    driver.switchTo().frame("firstFr");
	    driver.findElement(By.name("fname")).sendKeys("Aarthi");
	    driver.findElement(By.name("lname")).sendKeys("F");
	    Thread.sleep(1000);
	    //going to nested frame so index(0)
	    driver.switchTo().frame(0);
	    driver.findElement(By.name("email")).sendKeys("Aarthi@yahoo.com");
	    Thread.sleep(1000);
	    driver.quit();
	}
}

/*which helps access the previous frame
   driver.switchTo().parentFrame();
	    
*/