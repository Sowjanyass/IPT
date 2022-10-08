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

public class Zoho_task {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowja\\eclipse-workspace\\"
			   		+ "com.IPT\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/login.html");
		
		driver.findElement(By.linkText("Sign Up Now")).click();
		
		WebElement email = driver.findElement(By.id("emailfield"));
		String value = readData.particularData("Sheet1", 4, 0);
		email.sendKeys(value);
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		String value1 = readData.particularData("Sheet1", 4, 1);
		password.sendKeys(value1);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[@id=\"signup-termservice\"]")).click();
		
		Thread.sleep(2000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File ("C:\\Users\\sowja\\eclipse-workspace\\IPT_Projects\\Screenshots\\facebook.png");
		
		FileHandler.copy(s, d);

}
}