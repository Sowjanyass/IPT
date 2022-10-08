package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature\\amazon.feature" , glue = "com.Stepdefinition")


public class Runner_class_amazon {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUP() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowja\\eclipse-workspace\\com.IPT\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterClass
	public static void tearDown() {
		
		
		driver.close();
	}

}



