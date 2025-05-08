package com.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.SignUpActions;
import com.utility.TestBase;

public class SignUpTestCases extends TestBase {

	/*@Test(priority=1,description="Verify sign up functionality")
	public void verifySignUpFunctionality() throws IOException, Exception{
		SignUpActions.signUpFunctionality();
		}*/
	
	@Test(groups = {"Smoke"},priority=2,description="Verify sign up functionality without mandatory fields")
	public void verifySignUpFunctionalityWithoutMandatoryFields() throws IOException, Exception{
		SignUpActions.signUpFunctionalityWithoutmandatoryFields();
		}
	
	@Test(priority=3,description="Verify sign up functionality With Existing Email")
	public void verifySignUpFunctionalityWithExistingEmail() throws IOException, Exception{
		SignUpActions.signUpFunctionalityWithExistingEmail();
		}
	@Test(priority=4,description="Verify error message on click on create account with empty fields")
	public void verifyerrormessagewithemptyfileds() throws IOException, Exception{
		SignUpActions.errormessagewithemptyfileds();
		}
}
