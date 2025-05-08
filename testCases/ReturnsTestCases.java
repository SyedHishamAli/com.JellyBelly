package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.modules.ReturnsActions;
import com.utility.TestBase;

public class ReturnsTestCases extends TestBase{
	@Test(priority=1,description="Verify navigation and static content in returns page")
	 public void verifyReturnsContentDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		ReturnsActions.ReturnsContentDisplay();
	}
	//@Test(priority=2,description="Verify naviagation to return policy page on click on Click here link in returns page")
	 public void verifyReturnLinkNavigation() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		ReturnsActions.ReturnLinkNavigation();
	}
}
