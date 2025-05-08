package com.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.SavedCardActions;
import com.utility.TestBase;

public class SavedCardTestCases extends TestBase{
	
	@Test(groups = {"Smoke"},priority=1,description="Verify 'Edit card' functionality from saved card page")
	 public void verifyEditSavedCardFunctionality() throws IOException, Exception{
		SavedCardActions.editSavedCardFunctionality();
	}

	
	@Test(priority=2,description="Verify the error message is displayed if the mandatory fields in the save card form is left blank")
	 public void verifyErrorMessageForMandatoryFields() throws IOException, Exception{
		SavedCardActions.ErrorMessageForMandatoryFields();
	}
	
	@Test(priority=3,description="Verify display of saved adresses in add new card page")
	 public void verifySavedAddressDisplay() throws IOException, Exception{
		SavedCardActions.SavedAddressDisplay();
	}
}
