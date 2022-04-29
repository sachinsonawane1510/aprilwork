package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class Login
{
	@When("^user open \"(.*)\" browser with exe as$")
	public void user_open_browser_with_exe_as(String arg1) throws Throwable {
	    Object[] input=new Object[1];
	    input[0]=arg1;
	   
	    Hashtable<String,Object> output=SeleniumOperations.Browserlaunch(input);
	    }
	
	@When("^user open URL as$")
      	public void user_open_URL_as()
	{  
    			 Hashtable<String,Object> output1= SeleniumOperations.openapplication();  
    			 HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"^user open URL as \"([^\"]*)\";$" , (String) output1.get("MESSAGE").toString());
    		      	
    	}
    	@When("^user click on login cancle button$")
      	public void user_click_on_login_cancle_button() throws Throwable {
    		 Object[] input2=new Object[1];
    		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
    		   Hashtable<String,Object> output2= SeleniumOperations.clickonelement(input2);
    		   HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^user click on login cancle button$", (String) output2.get("MESSAGE").toString());
  
      	}

      	@When("^user move to login$")
      	public void user_move_to_login() throws Throwable {
      		Object[] input3=new Object[1];
   	     input3[0]="//*[text()='Login']";
   	  Hashtable<String,Object> output3=  SeleniumOperations.mouseinteractions(input3);
   	  HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user move to login$" , (String) output3.get("MESSAGE").toString());
    	 
      	}
      	
      	@When("^user click on login$")
      	public void user_click_on_login() throws Throwable {
      		 Object[] input4=new Object[1];
   		  input4[0]="(//*[@class='_3vhnxf'])[1]";
   		 Hashtable<String,Object> output4= SeleniumOperations.clickonprofile(input4);
   		
   		 HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on login$" , (String) output4.get("MESSAGE").toString());
      	
      	
      	
      	}
      	@When("^user enter \"([^\"]*)\" as a username$")
      	public void user_enter_as_a_username(String arg1) throws Throwable {
      		 Object[] input5=new Object[2];
  		   input5[0]="(//*[@type='text'])[2]";
  		   input5[1]="9021553876";
  		 Hashtable<String,Object> output5= SeleniumOperations.username(input5);	   
  		 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as a username$" , (String) output5.get("MESSAGE").toString());
       	
      	}

    	@When("^user enter \"([^\"]*)\" as a password$")
      	public void user_enter_as_a_password(String arg1) throws Throwable {
      	
      	   Object[] input6=new Object[2];
		   input6[0]="(//*[@autocomplete='off'])[3]";
		   input6[1]="Sachin@1510";
		   Hashtable<String,Object> output6=SeleniumOperations.password(input6);
      HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as a password$" , (String) output6.get("MESSAGE").toString());
    	
      	
      	}
      	@When("^user click on login button$")
      	public void user_click_on_login_button() throws Throwable {
      	
      		 Object[] input7= new Object[1];
   		  input7[0]="(//*[@type='submit'])[2]";
   		 Hashtable<String,Object> output7= SeleniumOperations.clickonelement(input7);
   		 HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user click on login button$" , (String) output7.get("MESSAGE").toString());
       	
      	}
     
      	@Then("^application shows login successfully$")
      	public void application_shows_login_successfully() throws Throwable {
      	 Thread.sleep(5000);
      		Object[] input8=new Object[2];
		   input8[0]="Sachin Sonawane";
		   input8[1]="//*[text()='Sachin Sonawane']";
		   Hashtable<String,Object> output8=  SeleniumOperations.validationforlogin(input8);
		  HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^application shows login successfully$" , (String) output8.get("MESSAGE").toString());
      	}
		  
      	 }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
      		
      
      	
     	 