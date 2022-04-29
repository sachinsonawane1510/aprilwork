package plainTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.session.ChromeFilter;

import cucumber.api.java.en.When;
import methods.SeleniumOperations;

public class UnitTestCase
{
 public static void main(String[] args) throws InterruptedException
 {    System.setProperty("webdriver.chrome.driver","C:\\March2022Flipcartw\\FlipKart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		 //open application
		driver.get("https://www.flipkart.com/");
		
		//click on cancle button
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	
		
		//perform mouse interactions
		
		Actions abc=new Actions(driver);
		
		WebElement a=driver.findElementByXPath("//*[text()='Login']");
		abc.moveToElement(a).build().perform();
		
		
		//click on my profile
	driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();

		 //enter username
	driver.findElementByXPath("(//*[@autocomplete='off'])[2]").sendKeys("9021553876");
	
	
		//enter password
		driver.findElementByXPath("(//*[@autocomplete='off'])[3]").sendKeys("Sachin@1510");
		
		 //click on login button
		 driver.findElementByXPath("(//*[@type='submit'])[2]").click();

		 //click on manage address
		 driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		 

		 
		
		 
		 
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

 }
}
