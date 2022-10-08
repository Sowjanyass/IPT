package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_class.baseclass;

public class FB_loginPage extends baseclass {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(driver);
		browserLaunch("Chrome");
		
		launchUrl("https://www.facebook.com/");
		
		//WebElement text = driver.findElement(By.tagName("h2"));
		//textonPage(lp.getText());
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("Sowjan9400@gmail.com");
		userInput(lp.getEmail(), "Sowjan9400@gmail.com");
		

		//WebElement pass = driver.findElement(By.id("pass"));
		//pass.sendKeys("Sowjan9400");
		userInput(lp.getPass(), "Sowjan9400");
		
		
		
		
	}

}
