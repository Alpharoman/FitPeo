package pages;

import BasicSetup.BaseSetup;
import BasicSetup.FitPeoHomePage;
import BasicSetup.ReveneuCalculatorPage;

public class RevenueValidation extends BaseSetup
{
	ReveneuCalculatorPage revCalPage = new ReveneuCalculatorPage();
	int actualSliderValue = revCalPage.GetSliderValue();
	public boolean ValidateSliderValue(int expectedSliderValue)
	{
		
		if(expectedSliderValue == actualSliderValue)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
