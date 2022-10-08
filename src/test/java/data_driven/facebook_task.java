package data_driven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class facebook_task {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowja\\eclipse-workspace\\"
			   		+ "com.IPT\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.tagName("h2"));
		String writeValue = text.getText();
		writeData.particularData("IPT1", 2, 1, writeValue);
		
		WebElement email = driver.findElement(By.id("email"));
		String value = readData.particularData("Sheet1", 1, 0);
		email.sendKeys(value);
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		String value1 = readData.particularData("Sheet1", 1, 1);
		password.sendKeys(value1);
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		
		
		
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File ("C:\\Users\\sowja\\eclipse-workspace\\IPT_Projects\\Screenshots\\facebook.png");
		
		FileHandler.copy(s, d);

		
}

	
}
