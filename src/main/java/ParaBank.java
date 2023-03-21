import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","C:\\chromedriver\\chromedriver_win32.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("archana");
		driver.findElement(By.xpath("//*[@name='password'] ")).sendKeys("archana0897");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		driver.findElement(By.className("ng-binding")).click();
		driver.findElement(By.xpath("//*[@id=\"month\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"transactionType\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input")).click();
		driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
		System.out.println("credit balance in the account is $100.00");

		driver.close();
		driver.quit();

	}

}
