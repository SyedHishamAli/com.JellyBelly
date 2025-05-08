package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.utility.TestBase;

public class LoginTestCases extends TestBase {
	
	@Test(priority=1,description="Verify elements in login Page")
	public void verifyLoginElements() throws IOException, Exception{
		LoginActions.verifyLoginElements();
	}
	
	@Test(priority=2,description="Verify navigation to forgot password page through Forget password link in login page")
	public void verifyForgotPassword() throws IOException, Exception{
		LoginActions.verifyForgotPasswordFunctionality();
	}
	
	@Test(groups = {"Smoke"},priority=3,description="Verify login functionality using valid credentials")
	public void verifyLogin() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
	}
	@Test(priority=4,description="Verify error message when user logins with invalid credentials")
	public void verifyInvalidLogin() throws IOException, Exception{
		LoginActions.verifyInvalidLoginFunctionality();
	}
	@Test(priority=5,description="Verify error message when user logins without filling mandatory fields in login layover")
	public void verifyMandatoryField() throws IOException, Exception{
		LoginActions.verifyMandatoryFieldValidation();
	}
	@Test(priority=6,description="Verify display of elements and its navigation in login layover")
	public void verifyLoginlayoverElements() throws IOException, Exception{
		LoginActions.verifyLoginlayoverElements();
	}
	@Test(groups = {"Smoke"},priority=7,description="Verify logout functionality")
	public void verifyLogoutfunctionality() throws IOException, Exception{
		LoginActions.verifyLogoutfunctionality();
	}
}
