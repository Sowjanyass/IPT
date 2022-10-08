package com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Runner.Runner_class_facebook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition_facebook {
	
	public WebDriver driver = Runner_class_facebook.driver;
	

@Given("user lauched the url")
public void user_lauched_the_url() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
}
	@When("user inputs the Email id")
	public void user_inputs_the_email_id() throws Exception {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("abger@gmail.com");
		Thread.sleep(2000);
	}
	@When("user enters the Password")
	public void user_enters_the_password() throws InterruptedException {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("abcfrd");
		Thread.sleep(2000);
	}
	@Then("clicks on the Login button")
	public void clicks_on_the_login_button() throws InterruptedException {
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		Thread.sleep(2000);
	}

	
	


	
	
}
