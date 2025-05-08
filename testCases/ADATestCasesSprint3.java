package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.utility.TestBase;

public class ADATestCasesSprint3 extends TestBase{
	
	//Sprint 3
	//Need to check
		//@Test(priority=40,description="# 58 - Verify the footer tag for respective tags")
		 public void footerTag() throws IOException, Exception{
			ADAActions.footerTag();
		}
		@Test(priority=41,description="# 59 - Verify the section should have h2 tag")
		 public void footerh2() throws IOException, Exception{
			ADAActions.footerh2();
		}
		@Test(priority=42,description="# 60 - Verify the social footer section is listed")
		 public void footerTagList() throws IOException, Exception{
			ADAActions.footerTagList();
		}
		@Test(priority=43,description="# 61 - Verify the bottom logo is button")
		 public void centerLogo() throws IOException, Exception{
			ADAActions.centerLogo();
		}
		@Test(priority=44,description="# 95 - Verify the been boozled app icons should have linked properly")
		 public void beenboozledApp() throws IOException, Exception{
			ADAActions.beenboozledApp();
		}
		//uncomment @Test(priority=45,description="# 103 - Verify the aria attributes are added for the Modal properly")
		 public void candyModal() throws IOException, Exception{
			ADAActions.candyModal();
		}
		//uncomment @Test(priority=46,description="# 118 - Verify the Printable images is labled as list")
		 public void pritableImageList() throws IOException, Exception{
			ADAActions.pritableImageList();
		}
		//uncomment @Test(priority=47,description="# 119 - Verify the Printable images have proper attribute")
		 public void printableImages() throws IOException, Exception{
			ADAActions.printableImages();
		}

//New Release Need to check
		//@Test(priority=118,description="# 62 - The purpose of this button is not clear to screen reader users.")
		 public void logofooter() throws IOException, Exception{
			ADAActions.validatelogodesc();
		}
		@Test(priority=119,description="# 240 - Quantity seclector in cart page")
		 public void quantityselector() throws IOException, Exception{
			ADAActions.validatequantityselector();
		}
		/*Defect ID JEL-2010 Need to enable once this defect get fixed */
		//@Test(priority=120,description="# 242 - Cart - This table is used for layout, but it is identified by screen readers as a data table.")
		 public void ordersummary() throws IOException, Exception{
			ADAActions.validateordersummarytab();
		}
		@Test(priority=121,description="# 356 - This telephone number is not marked up as a link.")
		 public void careertelphone() throws IOException, Exception{
			ADAActions.validatecareertelphone();
		}
	
}
