import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
     System.setProperty("webdriver.chromedriver.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     
     
     driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569657%7Cb%7Cfcebook%7C&placement=&creative=589460569657&keyword=fcebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-2472790614%26loc_physical_ms%3D9301092%26loc_"
     		+ "interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIo9jZ1OPn-wIV4JpmAh33Mwe7EAAYASAAEgJr2_D_BwE");

     driver.manage().window().maximize();
     WebElement Firstname=driver.findElement(By.name("firstname"));
     Firstname.sendKeys("Archana");
     
     WebElement Surname=driver.findElement(By.name("lastname"));
     Surname.sendKeys("Palraj");
     
     WebElement Email=driver.findElement(By.name("reg_email__"));
     Email.sendKeys("archanapadmavathy0897@gmail.com");
     
     WebElement Reenteremailid =driver.findElement(By.name("reg_email_confirmation__"));
     Reenteremailid.sendKeys("archanapadmavathy0897@gmail.com"); 
     
     WebElement Password=driver.findElement(By.id("password_step_input"));
     Password.sendKeys("1234");
     
     Select date = new Select(driver.findElement(By.xpath("id('day')")));
     date.selectByVisibleText("24");
     Select month = new Select(driver.findElement(By.xpath("id('month')")));
     month.selectByVisibleText("Dec");
     Select year = new Select(driver.findElement(By.xpath("id('year')")));
     year.selectByVisibleText("1989");     
     
     WebElement Gender= driver.findElement(By.name("sex"));
     Gender.click();
     WebElement Signin=driver.findElement(By.name("websubmit"));
     Signin.click();
      
     driver.close();
	 driver.quit();
     
	}

}
