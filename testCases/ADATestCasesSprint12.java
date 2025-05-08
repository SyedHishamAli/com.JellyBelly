package com.testCases;

import com.utility.TestBase;
import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.ADAActions;

public class ADATestCasesSprint12 extends TestBase{
	
	@Test(priority=214,description="#2: These elements have tabindex attributes set on them.")
	public void megaMenu() throws IOException, Exception{
		ADAActions.megaMenuAriaLabel();
	}
	@Test(priority=215,description="#503: This cookie banner is featured prominently for visual users, but not for keyboard and screen reader users.")
	public void cookieBannerElement() throws IOException, Exception{
		ADAActions.cookieBannerElement();
	}
	//uncomment @Test(priority=216,description="#504: It is not clear to screen reader users where the cookie consent banner begins or ends.")
	public void cookieBannerAttrib() throws IOException, Exception{
		ADAActions.cookieBannerAttrib();
	}
	@Test(priority=217,description="#505: It is not clear to screen reader users where each card or tile begins and ends.")
	public void plpListAttrib() throws IOException, Exception{
		ADAActions.plpListAttrib();
	}
	@Test(priority=218,description="#513: Text that functions as a heading should be marked up as such.")
	public void shopSweetHead() throws IOException, Exception{
		ADAActions.shopSweetHead();
	}
	@Test(priority=219,description="#489: This custom radio button or checkbox poses accessibility issues for keyboard and/or screen reader users.")
	public void paymentLoginCheckbox() throws IOException, Exception{
		ADAActions.paymentLoginCheckbox();
	}
}
