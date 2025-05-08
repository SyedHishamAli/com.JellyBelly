package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.GlobalFooterActions;
import com.utility.TestBase;

public class GlobalFooterTestCases extends TestBase {
	@Test(priority=1,description="Verify display of links in footer")
	 public void verifyFooterLinksDisplay() throws IOException, Exception{
		GlobalFooterActions.footerLinksDisplay();
	}
	
	@Test(groups = {"Smoke"},priority=2,description="Verify navigation from footer links")
	 public void verifyFooterLinksNavigation() throws IOException, Exception{
		GlobalFooterActions.footerLinksNavigation();
	}
	
	@Test(priority=3,description="Verify navigation to all social share icons from footer")
	 public void verifysocialShareLinkFunctionality() throws IOException, Exception{
		//GlobalFooterActions.socialShareLinkFunctionality();
	}
	
	@Test(priority=4,description="Verify display of news letter subscription section")
	 public void verifyNewsLetterSectionDisplay() throws IOException, Exception{
		GlobalFooterActions.newsLetterSectionDisplay();
	}
	
	@Test(priority=5,description="Verify elements in news letter subscription section")
	 public void verifynewsLetterSectionElementsDisplay() throws IOException, Exception{
		GlobalFooterActions.newsLetterSectionElementsDisplay();
	}
	//@Test(priority=6,description="Verify navigation to free tours page")
	 public void verifynavTofreeTours() throws IOException, Exception{
		GlobalFooterActions.navTofreeTours();
	}
	
	@Test(priority=7,description="Verify News letter subscription functionality")
	 public void verifyNewsLetterSubscription() throws IOException, Exception{
		GlobalFooterActions.newsLetterSubscription();
	}
	
	@Test(priority=8,description="Verify submit button is enabled only after entering email and selecting chekcbox in news letter subscription")
	 public void verifysubmitButtonfunctionality() throws IOException, Exception{
		GlobalFooterActions.submitButtonfunctionality();
	}
	

}
