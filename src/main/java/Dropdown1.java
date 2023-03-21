
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Dropdown1 {
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    WebElement btnClick = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    btnClick.click();
    WebElement month = driver.findElement(By.id("month"));
    
    Select s=new Select(month);
    //select by index
    s.selectByIndex(2);
    //select by value
    s.selectByValue("8");  
    //select by text
    s.selectByVisibleText("Dec");
    
    //multiple or single select
    boolean multiple = s.isMultiple();
    System.out.println(multiple);
    
    //Get All option
    List<WebElement> all = s.getOptions();
    System.out.println("Normal for");
    for(int i=0;i<all.size();i++) {
	WebElement one = all.get(i);
	System.out.println(one.getText());
    }
    System.out.println("Enhanced for");
    for(WebElement x:all) {
    	System.out.println(x.getText());
    }
    //by using sendKeys
    month.sendKeys("Jul");
    }
    }