package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(tagName="h2")
	private WebElement text;
	
	
	
	@FindBy(id= "email")
	private WebElement email;
	
	public WebElement getText() {
		return text;
	}

	
	public WebElement getEmail() {
		return email;
	}

	
	public WebElement getPass() {
		return pass;
	}

	

	@FindBy(id= "pass")
	private WebElement pass;
	
	
}
