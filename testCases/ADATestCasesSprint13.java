package com.testCases;

import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.TestBase;
import com.utility.WebdriverUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.modules.ADAActions;
import com.pageObjects.ADAObjects;
import com.pageObjects.FlavourpageObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.ShoppingCartObjects;

public class ADATestCasesSprint13 extends TestBase{
	
	@Test(priority=220,description="#508: This unactionable element has a tabindex=\"0\" attribute on it.")
	public void verifyFooterInfo() throws IOException, Exception{
		ADAActions.verifyFooterInfo();
	}
	@Test(priority=221,description="#511: These are semantically lists, but they are not properly marked up as such. Currently, the each list of links is reading out as \"list with 1 items\" although there are several items in each list.")
	public void verifyFooterLinks() throws IOException, Exception{
		ADAActions.verifyFooterLinks();
	}
	// Descoped in redesign site @Test(priority=222,description="#518: This carousel automatically rotates through its slides, but the user is not provided with a means to pause or stop this rotation.")
	public void verifyPausePlayBtn() throws IOException, Exception{
		ADAActions.verifyPausePlayBtn();
	}
	@Test(priority=223,description="#522: This unactionable element has a tabindex=\"0\" attribute on it.")
	public void verifyFilteAttrib() throws IOException, Exception{
		ADAActions.verifyFilteAttrib();
	}
	@Test(priority=224,description="#530: These elements refer to footnotes, but they are not marked up as a link.")
	public void verifyOrderSummaryTax() throws IOException, Exception{
		ADAActions.verifyOrderSummaryTax();
	}
	@Test(priority=225,description="#527: This element has an unnecessary ARIA attribute.")
	public void signupCheckbox() throws IOException, Exception{
		ADAActions.verifysignupCheckbox();
	}	
	@Test(priority=226,description="#531: These elements lack focus indicators when they receive focus.")
	public void guestLoginFocus() throws IOException, Exception{
		ADAActions.guestLoginFocus();
	}	
	@Test(priority=227,description="#533: This element has an unnecessary ARIA attribute.")
	public void verifyLabelOrderSummaryProduct() throws IOException, Exception{
		ADAActions.verifyLabelOrderSummaryProduct();
	}
	
}
