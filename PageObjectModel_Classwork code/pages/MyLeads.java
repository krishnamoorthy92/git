package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeads extends LeafTapsWrappers{

	public MyLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not MyLeads Page", "FAIL");
		}
	}

	public CreateLead clickCreateLead(){
		clickByLinkNoSnap("Create Lead");
		return new CreateLead(driver, test);
		
	}
	

}














