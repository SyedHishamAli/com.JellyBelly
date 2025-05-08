package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.HomePageActions;
import com.utility.TestBase;

public class HomePageTestCases extends TestBase {
	
	@Test(priority=1,description="Verify navigation to any PLP page on click")
	public void verifyPLPNavigation() throws IOException, Exception{
		HomePageActions.verifyPLPNavigation();
	}
	@Test(groups = {"Smoke"},priority=2,description="Verify navigation on click on all banners in homepage")
	public void verifyBannerNavigation() throws IOException, Exception{
		HomePageActions.verifyBannerFunctionality();
	}
	@Test(groups = {"Smoke"},priority=3,description="Verify BLP links should display on hover and its navigation")
	public void verifyBLPLinksNavigation() throws IOException, Exception{
		//HomePageActions.verifyBLPLinksnavigation();
	}
	@Test(priority=4,description="Verify display of flavour pages and its navigation on click")
	public void verifyFlavorpagesNavigation() throws IOException, Exception{
		//HomePageActions.verifyFlavorpagesNavigation();
	}
}
