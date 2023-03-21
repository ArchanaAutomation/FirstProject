package FrameworkDataDriven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonClassFW {
WebDriver driver; //global variable used bcz need to driver for each method
	public void browserlaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edgedriver","C:\\Users\\archa\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		}
	}
		public void url(String url) {
			driver.get("https://example.testproject.io/web/");	
		}
		public void max() {
			driver.manage().window().maximize();
		}
		public WebElement findelement(String attribute, String attributevalue) {
			 
			WebElement element = null;
			if(attribute.equalsIgnoreCase("name"))
			element=driver.findElement(By.name(attributevalue));
			else if(attribute.equalsIgnoreCase("classname")) 
				element=driver.findElement(By.className(attributevalue));
				else if(attribute.equalsIgnoreCase("id")) 
					element=driver.findElement(By.id(attributevalue));
					else if(attribute.equalsIgnoreCase("xpath"))
						element=driver.findElement(By.xpath(attributevalue));
			return element;
				}
		public void sendvalue(String attribute, String attributevalue, String sendvalue) {
			WebElement value=findelement(attribute,attributevalue);
			value.sendKeys("value");
		}
		public void clickaction(String attribute, String attributevalue) {
			WebElement value=findelement(attribute, attributevalue);
			value.click();
		}
		public void selectDropdown(String attribute, String attributevalue, String dropdown, String value) {
			WebElement value1=findelement(attribute,attributevalue);
			Select dp=new Select(value1);
			if(dropdown.equalsIgnoreCase("index")) {
				//converting string to int
				Integer index=Integer.parseInt("value");
				dp.selectByIndex(index);
			}
			else if(dropdown.equalsIgnoreCase("value"))
				dp.selectByValue(value);
			else if(dropdown.equalsIgnoreCase("text"))
				dp.selectByValue(value);
			
			}
			
			
			
		}
		
		
	
		



