package BasicSetup;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BaseSetup {

    public static WebDriver driver;
    private SoftAssert softAssert;
   
    
    public void NavigateToURL()
    {
    	String URL = "https://www.fitpeo.com/";
    	driver.get(URL);
    }
    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\eclipse-workspace\\fitpeo\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        NavigateToURL();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        softAssert = new SoftAssert();
        
    }

 
    //public void CheckCPTCheckBox(String text)
    //{
    	//WebElement ele = driver.findElement(By.xpath("//p[text()='" + text +"']/parent::div//input"));
    	//ele.click();
    //}
    
//    public void test() throws InterruptedException {
//        //driver.get("https://www.fitpeo.com/");
//        
//        
//        //WebElement revenueCalculator = driver.findElement(By.xpath("//div[text()='Revenue Calculator']"));
//        //revenueCalculator.click();
//        
//        WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb')]"));
//        WebElement valueDisplay = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb')]/input"));
//        WebElement textValue = driver.findElement(By.xpath("//div[contains(@class,'MuiInputBase')]/input"));
//        WebElement sliderTrack = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-track')]"));
//
//          
//        
//        // Define the desired value
//        //int desiredValue = 820;
//
//        // Get the current value of the slider (assume it's displayed in valueDisplay element)
//        //int currentValue = Integer.parseInt(valueDisplay.getAttribute("value"));
//        //System.out.println("Current Value: " + currentValue);
//
//        // Define the range of the slider
//        //int minValue = 0;
//        //int maxValue = 211; 
//
//        // Get the size of the slider track
//        
//        //int trackWidth = sliderTrack.getSize().getWidth();
//        //System.out.println("Slider Track Width: " + trackWidth);
//
//        // Calculate the offset to move the slider to the desired value
//        //double totalOffset = ((desiredValue - currentValue) / (double) (maxValue - minValue)) * trackWidth;
//        //System.out.println("Total Offset: " + totalOffset);
//
//        // Use Actions class to move the slider
//        //action.clickAndHold(slider).moveByOffset((int) totalOffset, 0).release().perform();
//
//        // Optional: add a wait to ensure the slider has time to move
//        try {
//            Thread.sleep(2000); // 2 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Fetching the updated slider value
//        //int newValue = Integer.parseInt(valueDisplay.getAttribute("value"));
//        //System.out.println("Updated Value: " + newValue);
//        

//        //CheckCPTCheckBox("CPT-99091");
//        //Thread.sleep(2000);
//        //CheckCPTCheckBox("CPT-99453");
//        //Thread.sleep(2000);
//        //CheckCPTCheckBox("CPT-99454");
//        //Thread.sleep(2000);
//        //CheckCPTCheckBox("CPT-99474");
//        Thread.sleep(2000);
//        WebElement totalRevenue = driver.findElement(By.xpath("//p[contains(text(),'Total Recurring Reimbursement for a')]/p"));
//        String total =totalRevenue.getText();
//        System.out.println("Total Recurring Reimbursement: " + total);
//        softAssert.assertEquals("$110970", total);
//        
//        
//       
//    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
