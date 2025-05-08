package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.HelpActions;
import com.modules.LoginActions;
import com.utility.TestBase;

public class HelpTestCases extends TestBase{

	//uncomment @Test(priority=1,description="Verify display of elements")
	 public void verifyElementsDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		HelpActions.ElementsDisplay();
	}
	//uncomment @Test(priority=2,description="Verify navigation to return policy page on click on Click here link in Returns&Refunds section")
	 public void verifyReturnPolicyNavigation() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		HelpActions.ReturnPolicyNavigation();
	}
	@Test(priority=3,description="Verify display of static content on click on any question available in right side")
	 public void verifyFAQStaticContentDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		HelpActions.FAQStaticContentDisplay();
	}
	@Test(priority=4,description="Verify navigation to respective on click on links inside the FAQ questions")
	 public void verifyFAQNavigation() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		HelpActions.FAQNavigation();
	}
	//uncomment @Test(priority=5,description="Verify navigation to Shipping information page on click on on Click here link in Shipping Information section")
	 public void verifyShippingInfoNavigation() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		HelpActions.ShippingInfoNavigation();
	}

}
