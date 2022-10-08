package Base_class_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base_class.baseclass;

public class facebook_signup extends baseclass {
	public static void main(String[] args) throws Exception {
		
		
		browserLaunch("Chrome");
		
		launchUrl("https://www.facebook.com/");
		
		sleep();
		printurl();
		printtitle();
		
		WebElement text = driver.findElement(By.tagName("h2"));
		textonPage(text);
		
		WebElement create = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		clickElement(create);
		
		Thread.sleep(2000);
		
		WebElement pholder = driver.findElement(By.name("firstname"));
		placeholder(pholder);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		clearkElement(fname, "Sowjanyaaaa");
		
		WebElement fname1 = driver.findElement(By.name("firstname"));
		userInput(fname1, "Sowjanya");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		userInput(lname, "ilayaraja");
		
		
		WebElement mobnum = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
		userInput(mobnum, "8056281746");
		
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
		userPassword(pass, "sowjanya09");
		
		
		
		Select selectByValue = new Select(driver.findElement(By.id("day")));
		  select(selectByValue, "9");
		  Thread.sleep(2000);

		  Select selectByValue1 = new Select(driver.findElement(By.id("month")));
		  select(selectByValue1, "6");
          Thread.sleep(2000);
          
          Select selectByValue2 = new Select(driver.findElement(By.id("year")));
		  select(selectByValue2, "1994");
		  Thread.sleep(2000);
		  
          WebElement gender = driver.findElement(By.name("sex"));
          clickElement(gender);
          isselected(gender);
          
          
          WebElement signup = driver.findElement(By.name("websubmit"));
          clickElement(signup);
          
          isEnabled(signup);
		
         takeSnapShot(driver, "C:\\Users\\sowja\\eclipse-workspace\\IPT_Projects\\Screenshots\\facebook1.png");
		
          close();
		
		
		
		
		
		
}

	
}