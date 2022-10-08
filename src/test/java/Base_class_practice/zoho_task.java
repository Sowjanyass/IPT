package Base_class_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_class.baseclass;

public class zoho_task extends baseclass {

	public static void main(String[] args) throws Exception {
		
		browserLaunch("Chrome");
		
		launchUrl("https://www.zoho.com/login.html");
		
		WebElement signup =driver.findElement(By.linkText("Sign Up Now"));
		clickElement(signup);

		WebElement email = driver.findElement(By.id("emailfield"));
		userInput(email, "Sowjan94345@gmail.com");
		
		sleep();
		
		WebElement password = driver.findElement(By.id("password"));
		userInput(password, "sowjan1234");
		
		sleep();
		
		
		WebElement check =driver.findElement(By.xpath("//span[@id=\"signup-termservice\"]"));
		clickElement(check);
		
		sleep();
		

		WebElement signup1 = driver.findElement(By.id("signupbtn"));
		clickElement(signup1);
		
		
		takeSnapShot(driver, "C:\\Users\\sowja\\eclipse-workspace\\IPT_Projects\\Screenshots\\zoho1.png");
		
		
		
		
		
	}
}
