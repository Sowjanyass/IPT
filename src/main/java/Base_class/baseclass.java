package Base_class;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	
	public static WebDriver driver;
	
	//-----Browser Launch-----
	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowja\\eclipse-workspace\\"
				   		+ "com.IPT\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
				
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		else if (browser.equalsIgnoreCase("gecko")) {
			driver = new FirefoxDriver();
			
		}
		else  {
			System.out.println("Invalid browser");
			
		}
		return driver;
		
	}
	
	//----Browser URL-----
	
	public static void launchUrl(String url) {
		
		driver.get(url);
	}
	
	//--- User Input-----
	
	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
	
	}
	
	public static void userPassword(WebElement element, String value) {
		element.sendKeys(value);
		
		}
	
	
	//----Click on Element----
	
	public static void clickElement(WebElement element) {
		element.click();
		
		}
	
	//----Get text on Page----
	
	public static void textonPage(WebElement element) {
		String text = element.getText();
		System.out.println("Text is:" +text);
		
		}
	
	//---Drop down options----
	
	public static void select(Select selectByValue, String value) {
		selectByValue.selectByValue(value);
		
		}
	
	
	//---- Boolean method----
	public static void isselected (WebElement element) {
		boolean check = element.isEnabled();
		System.out.println("The element is selected:"+check);
		
		}
	
	public static void isEnabled (WebElement element) {
		boolean check = element.isEnabled();
		System.out.println("The element is enabled:"+check);
		
		}
	
	
	
	//---- Clear----
	
	public static void clearkElement(WebElement element, String value) {
		element.clear();
		
		}
	
	//---PlaceHolder-----
	
	public static void placeholder(WebElement element) {
		String t = element.getAttribute("placeholder");
		System.out.println("Text is:"+t);
		
		
		}
	
	//---Get current URL----
	public static void printurl() {
		String t = driver.getCurrentUrl();
		System.out.println("The current URL is: "+t);
		
		
		}
	
	
	//---Get current Title----
		public static void printtitle() {
			String t = driver.getTitle();
			System.out.println("The current URL is: "+t);
			
			
			}
		
		
		//----Alert---
		public static void alertaccept(String alert) {
			Alert a = driver.switchTo().alert();
			a.accept();
			
			}
		
		
		//-----Close---
		public static void close() {
			driver.close();
			}
		
		
		//----- Quit----
		
		public static void quit() {
			driver.quit();
			}
		
		//----Sleep----
		public static void sleep() throws Exception {
			Thread.sleep(3000);
		}
		
		
		//-----Dropdown----
		public static void selectdropsown(WebElement element, String options, String value) {
		
			Select s = new Select(element);
				if(options.equalsIgnoreCase("value")) {
					s.selectByValue(value);
				}
				else if(options.equalsIgnoreCase("text")) {
					s.selectByVisibleText(value);
					
				}
				else if(options.equalsIgnoreCase("index")) {
				int n = Integer.parseInt(value);
				s.selectByIndex(n);
				
				
				}
				
				else {
					
					System.out.println("invalid Selection");
				}
			}
		
		
		//---- Actions----
		public static void actions(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		a.click().perform();
		}
		
		//--- TakeScreenshot----
		
		
		public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)webdriver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File(fileWithPath);
			//Copy file at destination
			FileHandler.copy(SrcFile, DestFile);
			}
			
}	
		
		
		
		
		
	
	
	
	
	
	



