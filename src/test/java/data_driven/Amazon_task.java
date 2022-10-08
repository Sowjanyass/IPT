package data_driven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_task {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowja\\eclipse-workspace\\"
		   		+ "com.IPT\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Actions a = new Actions(driver);
		a.moveToElement(dropdown).perform();
		a.click().perform();
		
		Thread.sleep(2000);
		
		String expectedDropDownVlaue=  readData.particularData("Sheet", 1, 0);
		
		String expectedInput=  readData.particularData("Sheet", 1,1);
		
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
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(expectedInput);
		
		Thread.sleep(2000);
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
		
		
		List<WebElement> result = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
		
		int size = result.size();
		
		System.out.println(size);
		
	

}

}



