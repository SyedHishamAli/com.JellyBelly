package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.modules.MyAccountActions;
import com.utility.TestBase;

public class MyAccountTestCases extends TestBase {
	
	
	@Test(groups = {"Smoke"},priority=1,description="Verify save changes functionality in my aacount info")
	 public void verifyMyAccountInformationEdit() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MyAccountActions.MyAccountInformationEdit1();
	}
	//Verify the error message is displayed if the fields in the personal information section are left blank
	@Test(priority=2,description="Verify email filed is not editable")
	 public void verifyMyAccountEmptyInformationErrorMessage() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MyAccountActions.MyAccountEmptyInformationErrorMessage();
	}
	@Test(priority=3,description="Cancel the modified information and check the changes")
	 public void verifyCancelAndCheckChanges() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MyAccountActions.CancelAndCheckChanges();
	}

	/*Email Preference link has been removed
	@Test(priority=4,description="Verify navigation to Email preference centre page on click on 'Email preference centre' link in account info")
	 public void verifyEmailPreferenceNavigation() throws IOException, Exception{
		MyAccountActions.EmailPreferenceNavigation();
	}*/
	
	 @Test(priority=5,description="Verify the error message is displayed if the fields in the password are left blank")
	 public void verifyEmptyChangePasswordErrorMessage() throws IOException, Exception{
		 LoginActions.verifyLoginFunctionality();
		MyAccountActions.EmptyChangePasswordErrorMessage();
	}
	 
	/*@Test(priority=6,description="Cancel the modified information and check the changes")
	 public void verifyChangePasswordFunctionality() throws IOException, Exception{
		MyAccountActions.changePasswordFunctionality();
	}*/
	 
	 
	 
}



