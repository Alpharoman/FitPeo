package BasicSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReveneuCalculatorPage extends BaseSetup{
	WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb')]"));
	WebElement valueDisplay = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb')]/input"));
    WebElement textValue = driver.findElement(By.xpath("//div[contains(@class,'MuiInputBase')]/input"));
    WebElement sliderTrack = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-track')]"));	
    
    public double CalculateOffsetOfSlider()
	{
		// Define the desired value
        int desiredValue = 820;

        // Get the current value of the slider (assume it's displayed in valueDisplay element)
        int currentValue = Integer.parseInt(valueDisplay.getAttribute("value"));
        System.out.println("Current Value: " + currentValue);

        // Define the range of the slider
        int minValue = 0;
        int maxValue = 211; 

        // Get the size of the slider track
        
        int trackWidth = sliderTrack.getSize().getWidth();
        System.out.println("Slider Track Width: " + trackWidth);

        // Calculate the offset to move the slider to the desired value
        double totalOffset = ((desiredValue - currentValue) / (double) (maxValue - minValue)) * trackWidth;
        System.out.println("Total Offset: " + totalOffset);
        return totalOffset;
	}
	
	// Perform Slide Operation 
	public FitPeoHomePage PerformSliderOperation() 
	{
		double totalOffset = CalculateOffsetOfSlider();
		Actions action = new Actions(driver);
		
        action.clickAndHold(slider).moveByOffset((int) totalOffset, 0).release().perform();
		return new FitPeoHomePage();
	}
	
	public int GetSliderValue()
	{
		int newValue = Integer.parseInt(valueDisplay.getAttribute("value"));
        //System.out.println("Updated Value: " + newValue);
		return newValue;
	}
	
	public FitPeoHomePage CheckCPTCheckBox(String text)
    {
    	WebElement ele = driver.findElement(By.xpath("//p[text()='" + text +"']/parent::div//input"));
    	ele.click();
    	return new FitPeoHomePage();
    }
}
