package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.utility.TestBase;

public class ADATestCasesSprint21 extends TestBase {
	
	@Test(priority = 334, description="#138: Invisible elements should not receive focus or be visible to screen reader users.")
	public void verifyTabIndex() throws IOException, Exception {
		ADAActions.verfiyTabIndex();
	}
	
	@Test(priority = 335, description="#63: This is marked up as a navbar, but it is not semantically a navbar.")
	public void verifyNavTag() throws IOException, Exception {
		ADAActions.verifyNavTag();
	}
	
	@Test(priority = 336, description="#95: It is difficult for screen reader users to identify when one slide ends and the next begins.")
	public void verifyAriaLabelPDP() throws IOException, Exception {
		ADAActions.verifyAriaLabelPDP();
	}
	
	@Test(priority = 337, description="#111: These unactionable elements have tabindex=\"0\" attributes on them.")
	public void verifyTabIndexPrice() throws IOException, Exception {
		ADAActions.verifyTabIndexPrice();
	}
	
	@Test(priority = 338, description="#120: Content that functions as a list should be indicated as such to screen reader users.")
	public void verifyliTagApplYReset() throws IOException, Exception {
		ADAActions.verifyliTagApplYReset();
	}
	//This is available only on sandbox
	//@Test(priority = 339, description="#144: When content is marked up as a list, but is not semantically a list, it can be confusing for screen reader users.")
	public void verifyliTagShoppingCart() throws IOException, Exception {
		ADAActions.verifyliTagShoppingCart();
	}
	
	@Test(priority = 340, description="#171: These are marked up as separate lists; however, this is semantically a single list.")
	public void verifyliTagFAQ() throws IOException, Exception {
		ADAActions.verifyliTagFAQ();
	}
	
	@Test(priority = 341, description="#172: Unactionable elements should not have tabindex")
	public void verifyliTagHeader() throws IOException, Exception {
		ADAActions.verifyliTagHeader();
	}

	@Test(priority = 342, description="#185: iframes should have titles.")
	public void verifyTitletag() throws IOException, Exception {
		ADAActions.verifyTitletag();
	}
}
