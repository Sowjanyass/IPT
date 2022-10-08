package Base_class_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_class.baseclass;
import data_driven.readData;

public class amazon_task extends baseclass {
	
	
	
	public static void main(String[] agrs) throws Exception {
		
		browserLaunch("Chrome");
		
		launchUrl("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		actions(dropdown);
		
		sleep();
		
		String value = "value";
		selectdropsown(dropdown, value, "search-alias=baby");
		
		sleep();
		
		WebElement expectedInput =driver.findElement(By.id("twotabsearchtextbox"));
		userInput(expectedInput, "Soft toys");
		
		sleep();
		
		String expectedInput2 ="Soft toys";
		
List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		
		
		for(int i=1; i<=suggestions.size(); i++) {
			
			WebElement t = driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/div["+i+"]/div/div"));
			
			String text = t.getText();
			
			if(expectedInput2.equalsIgnoreCase(text)) {
				
				t.click();
				break;
			}
			
			else
			{
				continue;
				
			}
		}
		
		
		
		
	
		
List<WebElement> result = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
		
		int size = result.size();
		
		System.out.println(size);
		
		
		
		
		
		
		
		
	}
	
	
}
