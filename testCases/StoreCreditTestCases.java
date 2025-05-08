package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.modules.StoreCreditActions;
import com.utility.TestBase;

public class StoreCreditTestCases extends TestBase{
	@Test(priority=1,description="Verify the display of static content")
	 public void verifyStoreCreditStaticContentDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		StoreCreditActions.StoreCreditStaticContentDisplay();
	}
	@Test(priority=2,description="Verify display of the Gift card text box with apply button")
	 public void verifyStoreCreditDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		StoreCreditActions.StoreCreditDisplay();
	}
	@Test(priority=3,description="Verify error message with invalid gift card/store credit")
	 public void verifyGiftCardErrorMessageDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		StoreCreditActions.GiftCardErrorMessageDisplay();
	}
	@Test(priority=4,description="Verify navigation to home page on click on www.jellybelly.com link in store credit section")
	 public void verifyNavigationFromStoreCredit() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		StoreCreditActions.NavigationFromStoreCredit();
	}
}
