package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasicSetup.BaseSetup;
import BasicSetup.FitPeoHomePage;
import BasicSetup.ReveneuCalculatorPage;

public class RunnerClass extends BaseSetup{
	
	@Test
	public void testOne() throws InterruptedException
	{
		// Test Operations
		FitPeoHomePage fitPeoHomePage = new FitPeoHomePage();
		fitPeoHomePage.ClickRevenueCalulatorTab();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 ReveneuCalculatorPage revCalPage = new ReveneuCalculatorPage();
		 revCalPage.PerformSliderOperation();
		RevenueValidation revenueValidation = new RevenueValidation();
		// Define the desired value
        int desiredValue = 820;
		revenueValidation.ValidateSliderValue(desiredValue);
		revenueValidation.ValidateSliderValueRespectToTextBox("540");
		// Perform CheckBox
		revCalPage.CheckCPTCheckBox("CPT-99091");
		revCalPage.CheckCPTCheckBox("CPT-99453");
		revCalPage.CheckCPTCheckBox("CPT-99454");
		revCalPage.CheckCPTCheckBox("CPT-99474");
		// Close the Browser
		closeBrowser();
		
	}

}
