
package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.modules.SweetRewardsActions;
import com.utility.TestBase;

public class SweetRewardsTestCases extends TestBase{

	@Test(priority=1,description="Verify navigation to sweet rewards page on click on sweet rewards link in left panel")
	 public void verifySweetRewardsNavigation() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		SweetRewardsActions.SweetRewardsNavigation();
	}
	@Test(priority=2,description="Verify display of Sweet rewards title in sweet rewards page")
	 public void verifySweetRewardsTitleDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		SweetRewardsActions.SweetRewardsTitleDisplay();
	}
	/*@Test(priority=3,description="Verify display of points expiration section on click on Check points expiry link in sweet rewards page")
	 public void verifyPointsExpirySectionDisplay() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		SweetRewardsActions.PointsExpirySectionDisplay();
	}*/

}
