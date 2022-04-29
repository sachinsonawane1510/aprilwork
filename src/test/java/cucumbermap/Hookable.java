package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import methods.HTMLReportGenerator;

public class Hookable {

	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{ 
		HTMLReportGenerator.TestSuiteStart("D:\\morningbatch2\\flipkart.html", "flipkartproject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("----------------------scenario starts---------------------------------");
		
	}
	
	@After
	public void after(Scenario scenario)
	{
		System.out.println("------------------------scenario ends------------------------------");
	
	HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
	
	}
	
	
	
}
