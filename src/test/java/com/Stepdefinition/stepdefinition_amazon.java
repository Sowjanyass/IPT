package com.Stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Runner.Runner_class_amazon;


import data_driven.readData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition_amazon {
	
	public WebDriver driver = Runner_class_amazon.driver;
	String expectedInput;

@Given("^user Launch The Apploication Url$")
public void user_Launch_The_Apploication_Url() throws Throwable {
	driver.get("https://www.amazon.in/");
}

@When("^user select From Category$")
public void user_select_From_Category() throws Throwable {
String expectedDropDownVlaue=  readData.particularData("Sheet", 1, 0);
	
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	
	Actions a = new Actions(driver);
	a.moveToElement(dropdown).perform();
	a.click().perform();
	
	Thread.sleep(2000);
	
	Select s = new Select(dropdown);
	
	List<WebElement> op = s.getOptions();
	
	for (int i=1; i<op.size(); i++){
	String actualdropdownvlaue = op.get(i).getText();
	
	if(actualdropdownvlaue.equalsIgnoreCase(expectedDropDownVlaue))
	{
	
		s.selectByVisibleText(actualdropdownvlaue);
	}
	
	
	}
	Thread.sleep(2000);
	

}

@When("^user Enter The Product$")
public void user_Enter_The_Product() throws Throwable {
	expectedInput=  readData.particularData("Sheet", 1,1);
	Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(expectedInput);

	Thread.sleep(4000);
}

@Then("^comapre The Suggestions and Click The Suggestions$")
public void comapre_The_Suggestions_and_Click_The_Suggestions() throws Throwable {
List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
	
	
	for(int i=1; i<=suggestions.size(); i++) {
		
		WebElement t = driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/div["+i+"]/div/div"));
		
		String text = t.getText();
		
		if(expectedInput.equalsIgnoreCase(text)) {
			
			t.click();
			break;
		}
		
		else
		{
			continue;
			
		}
	}

}


}








