package Base_class_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.baseclass;

public class base_class_projects extends baseclass{
	
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowja\\eclipse-workspace\\"
			   		+ "com.IPT\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.tagName("h2"));
		textonPage(text);
		
		WebElement username = driver.findElement(By.id("email"));
		userInput(username, "abcd@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("pass"));
		userPassword(password, "abcd1234");
		Thread.sleep(2000);
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		
		clickElement(loginbtn);
		
		
		takeSnapShot(driver, "C:\\Users\\sowja\\eclipse-workspace\\IPT_Projects\\Screenshots\\facebook1.png" );
		
		
		
		
		
		
		
		
		
	}

	

}
