import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();

		driver.findElement(By.name("alertbox")).click();
		String Alert=driver.switchTo().alert().getText(); //gettext helps to display the text in console
		System.out.println("Alert");
		driver.switchTo().alert().accept();

		driver.findElement(By.name("confirmalertbox")).click();
		String Cancel=driver.switchTo().alert().getText(); 
		System.out.println("cancel");
		driver.switchTo().alert().dismiss();

		if(Cancel.equals("You clicked on Cancel!")) {
			System.out.println("Success - I have clicked on cancel button in confirmation Alter Box");
		}

		driver.findElement(By.name("promptalertbox1234")).click();
		Alert prompt=driver.switchTo().alert();
		String Msg=prompt.getText();
		System.out.println(Msg);
		prompt.sendKeys("No");
		prompt.accept();
		String message=driver.findElement(By.id("demoone")).getText();

		if(message.equals(message)) {
			System.out.println(message);
		}




	}
}