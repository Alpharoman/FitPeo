package BasicSetup;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

public class FitPeoHomePage extends BaseSetup {
	
	
	// Locators in Home Page
	WebElement revenueCalculator = driver.findElement(By.xpath("//a[contains(@href,'revenue-calculator')]"));
	

	// Navigate to Revenue Calculator Tab
	public void ClickRevenueCalulatorTab()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", revenueCalculator);
//		revenueCalculator.click();
		System.out.println("Clicked on Revenue Calculator");
//		return new FitPeoHomePage();
	}
	

	
	
}
