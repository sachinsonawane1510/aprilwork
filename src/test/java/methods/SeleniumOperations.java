package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.When;
import cucumbermap.ConfigReader;

public class SeleniumOperations 
{    public static ConfigReader config;
    public static ChromeDriver driver;

public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();

    public static Hashtable<String,Object> Browserlaunch(Object[] inputparameters)
    {
      try
      {
    	
    	 String Browsername=(String)  inputparameters[0];
    	 
    	    	 if(Browsername.equalsIgnoreCase("Chrome"));
    	 { 	 System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
          driver=new ChromeDriver();   	 
    	  driver.manage().window().maximize();
    } outputparameters.put("STATUS", "PASS");
    outputparameters.put("MESSAGE", "methodUSed:Browserlaunch, Input_Data: " + inputparameters[0].toString()); 
    
    	
      }
      catch(Exception e)
      { return outputparameters;
      }
      outputparameters.put("STATUS", "FAIL");
      outputparameters.put("MESSAGE", "methodUSed:Browserlaunch, Input_Data: " + inputparameters[0].toString());
	return outputparameters;
    }
      public static Hashtable<String,Object>  openapplication() 
    	  {
    	  try 
    	  {
    		  
    	      driver.get(config.getApplicationUrl());
    	      outputparameters.put("STATUS", "PASS");
    	      outputparameters.put("MESSAGE", "methodUSed:openapplication, Input_Data: " + config.getApplicationUrl().toString());  
    	  }
      catch(Exception e)
      {  
      }
    	  return outputparameters; 
    	  }
    	
    	  
    	 public static Hashtable<String,Object>  clickonelement(Object[] inputparameters)
    	 { 
    		 try
    		 
    		 {
    		 String xname=(String) inputparameters[0];
    	       driver.findElementByXPath(xname).click();
    	       driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS); 
    	       outputparameters.put("STATUS", "PASS");
     	      outputparameters.put("MESSAGE", "methodUSed:openapplication, Input_Data: " + inputparameters[0].toString());  
    		 }
    		 catch(Exception e)
             { outputparameters.put("STATUS", "FAIL");
    	      outputparameters.put("MESSAGE", "methodUSed:openapplication, Input_Data: " + inputparameters[0].toString());  

             }
    		 return outputparameters; 
    		 }
        public static Hashtable<String,Object>  mouseinteractions(Object[] inpputparameters) 
    	     {  
        		try
        		{
        	String mouse=(String) inpputparameters[0];
    	         Actions abc=new Actions(driver);
 	           	WebElement a=driver.findElementByXPath(mouse);
 	         	abc.moveToElement(a).build().perform();
 	         	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
 	         	outputparameters.put("STATUS", "PASS");
 	     	      outputparameters.put("MESSAGE", "methodUSed:mouseinteractions, Input_Data: " + inpputparameters[0].toString());  

        		
        		}
        		 catch(Exception e)
                { outputparameters.put("STATUS", "FAIL");
	     	      outputparameters.put("MESSAGE", "methodUSed:mouseinteractions, Input_Data: " + inpputparameters[0].toString());  


                }
        		return outputparameters; }
        public static Hashtable<String,Object>  clickonprofile(Object[] inputparameters)
        { 
        	try
        	{
        		
        	String xyz=(String) inputparameters[0];
         driver.findElementByXPath(xyz).click();  
         driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
         outputparameters.put("STATUS", "PASS");
 	      outputparameters.put("MESSAGE", "methodUSed:clickonprofile, Input_Data: " + inputparameters[0].toString());  


        	}
        	 catch(Exception e)
            { outputparameters.put("STATUS", "FAIL");
   	      outputparameters.put("MESSAGE", "methodUSed:clickonprofile, Input_Data: " + inputparameters[0].toString());  

            }
        	return outputparameters; 	
        }
        
        public static Hashtable<String,Object>  username(Object[] inputparameters) 
        {
        	try
        	{
        
           String xpath1=(String) inputparameters[0];
           String user=(String) inputparameters[1];
            driver.findElementByXPath(xpath1).sendKeys(user);
            driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
            outputparameters.put("STATUS", "PASS");
   	      outputparameters.put("MESSAGE", "methodUSed:username, Input_Data: " + inputparameters[0].toString());  

        	}
        catch(Exception e)
        { outputparameters.put("STATUS", "FAIL");
	      outputparameters.put("MESSAGE", "methodUSed:username, Input_Data: " + inputparameters[0].toString());  

        }
        	return outputparameters; 	
        }
        
        public static Hashtable<String,Object>  password(Object[] inputparameters) 
        { try
        {
        	String xpath2=(String) inputparameters[0];
           String user1=(String) inputparameters[1];
            driver.findElementByXPath(xpath2).sendKeys(user1);
            driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
            outputparameters.put("STATUS", "PASS");
   	      outputparameters.put("MESSAGE", "methodUSed:password, Input_Data: " + inputparameters[1].toString());  
    
        }
        catch(Exception e)
        {outputparameters.put("STATUS", "FAIL");
	      outputparameters.put("MESSAGE", "methodUSed:password, Input_Data: " + inputparameters[1].toString());  

        }
        return outputparameters; }

       
       public static Hashtable<String,Object>  validationforlogin(Object[] inputparameters) 
        {  
        	try
        	{
        	 
          	String giventext=(String) inputparameters[0];
           String xpath=(String) inputparameters[1];
          String actualtext=driver.findElementByXPath(xpath).getText();
          driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);  
            if(giventext.equalsIgnoreCase(actualtext))
            {   System.out.println("test case pass");
       }
            else
            { System.out.println("test case fail");
            }
            outputparameters.put("STATUS", "PASS");
   	      outputparameters.put("MESSAGE", "methodUSe:validationforlogin, Input_Data: " + inputparameters[0].toString());  

        	}
            catch(Exception e)
            { outputparameters.put("STATUS", "FAIL");
   	      outputparameters.put("MESSAGE", "methodUSe:validationforlogin, Input_Data: " + inputparameters[0].toString());  

            }
        	return outputparameters; }   
        
        
      
  	
  		  
  		  
  		  
  		  
  		  
  		  
        
        
        
	 
		  
		  
		  
		  
 
		  
		  
		  }	
		
	 
	 
	 