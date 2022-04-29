package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class AddressCall
{
	@When("^user click on manage address$")
	public void user_click_on_manage_address1() throws Throwable {
		Thread.sleep(3000);
		  Object[] input9= new Object[1];
		  input9[0]="(//*[@class='NS64GK'])[1]";
		  Hashtable<String,Object> output9=SeleniumOperations.clickonprofile(input9);
		  
	    HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^user click on manage address$" , (String) output9.get("MESSAGE").toString());
	}
	@When("^user click on ADD A NEW ADDRESS$")
	public void user_click_on_ADD_A_NEW_ADDRESS() throws Throwable {
		Thread.sleep(3000);
		 Object[] input10= new Object[1];
	  input10[0]="//*[@class='_1QhEVk']";
	Hashtable<String,Object> output10=SeleniumOperations.clickonprofile(input10);
	 HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^user click on add aaddresses$" , (String) output10.get("MESSAGE").toString());

	}
	
	@When("^user enter (.+) as name$")
	public void user_enter_dada_as_name(String name) {
		Object[] input11=new Object[2];
		   input11[0]="//*[@name='name']";
		   input11[1]=name;
		   Hashtable<String,Object> output11=SeleniumOperations.password(input11);
	HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(),"^user enter (.+) as name$", (String) output11.get("MESSAGE").toString());
		
	}

	@When("^user enter (.+) as mobile number$")
	public void user_enter_as_mobile_number(String mono){
		Object[] input12=new Object[2];
		   input12[0]="(//*[@type='text'])[3]";
		   input12[1]=mono;
		   Hashtable<String,Object> output12=SeleniumOperations.password(input12);
	HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(),"^user enter (.+) as mobile number$", (String) output12.get("MESSAGE").toString());
		
	}

	@When("^user enter (.+) as pincode$")
	public void user_enter_as_pincode(String pincode) {
		Object[] input13=new Object[2];
	 	   input13[0]="(//*[@type='text'])[4]";
	 	   input13[1]=pincode;
	 	   Hashtable<String,Object> output13=SeleniumOperations.password(input13);
	 HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(),"^user enter (.+) as pincode$" , (String) output13.get("MESSAGE").toString());
	}
	@When("^user enter (.+) as locality$")
	public void user_enter_Aurngabad_as_locality(String local){
		Object[] input14=new Object[2];
	  	   input14[0]="(//*[@type='text'])[5]";
	  	   input14[1]=local;
	  	   Hashtable<String,Object> output14=SeleniumOperations.password(input14);
	  HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(),"^user enter (.+) as locality$", (String) output14.get("MESSAGE").toString());
	  	 
	  	}

	 @When("^user enter (.+) as address$")
	public void user_enter_talawada_as_address(String add){
		Object[] input15=new Object[2];
	   	   input15[0]="//*[@cols='10']";
	   	   input15[1]=add;
	   	   Hashtable<String,Object> output15=SeleniumOperations.password(input15);
	   HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(),"^user enter (.+) as address$", (String) output15.get("MESSAGE").toString());
	   	   
	  	}

	@When("^user click on home button$")
	public void user_click_on_home_button() throws Throwable {
		Object[] input16=new Object[1];
 	   input16[0]="//*[@for='HOME']";
 	   
 	   Hashtable<String,Object> output16=SeleniumOperations.clickonprofile(input16);
 HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(),"^user click on home button$" , (String) output16.get("MESSAGE").toString());
 	   
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
		Object[] input17=new Object[1];
	 	   input17[0]="(//*[@type='button'])[2]";
	 	   
	 	   Hashtable<String,Object> output17=SeleniumOperations.clickonprofile(input17);
	 HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(),"^user click on save button$" , (String) output17.get("MESSAGE").toString());
	 	      
	  	}

	@Then("^application shows address add successfully$")
	public void application_shows_address_add_successfully() throws Throwable {
		Thread.sleep(5000);
  		Object[] input18=new Object[2];
	   input18[0]="Sachin Sonawane";
	   input18[1]="//*[text()='Sachin Sonawane']";
	   Hashtable<String,Object> output18=  SeleniumOperations.validationforlogin(input18);
	  HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(),"^application shows address add successfully$", (String) output18.get("MESSAGE").toString());
  	
	  	
  	
	
	}
	
	
}
