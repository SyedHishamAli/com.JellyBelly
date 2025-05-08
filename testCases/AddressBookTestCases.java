package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.AddressBookActions;
import com.modules.LoginActions;
import com.utility.TestBase;

public class AddressBookTestCases extends TestBase{

	@Test(groups = {"Smoke"},priority=1,description="Verify display of address form on click on 'Add new address' link")
	 public void verifyAddressFormAndSaveAddressFunctionality() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		AddressBookActions.AddressFormAndSaveAddressFunctionality();
	}
	
	@Test(groups = {"Smoke"},priority=2,description="Verify 'Edit address' functionality from address book")
	 public void verifyEditAddressFunctionality() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		AddressBookActions.EditAddressFunctionality1();
	}
	
	@Test(priority=3,description="Verify the error message is displayed if mandatory fields in address form are left blank")
	 public void verifyErrorMessageForMandatoryDetails() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		AddressBookActions.ErrorMessageForMandatoryDetails1();
	}
	
}
