package com.testCases;

import com.utility.TestBase;
import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.ADAActions;


public class ADATestCasesSprint11 extends TestBase{

	@Test(priority=192,description="#71: These elements have unnecessary ARIA attributes.")
	public void FooterCheckbox() throws IOException, Exception{
		ADAActions.FooterCheckboxTag();
	}
	//Descoped as part redesign
	//@Test(priority=193,description="#438: This image is decorative and provides no information to users.")
	public void ImageDecorativeIcon() throws IOException, Exception{
		ADAActions.ImageDecorativeIcon();
	}
	@Test(priority=194,description="#441: This element has an unnecessary ARIA attribute.")
	public void megaMenuAria() throws IOException, Exception{
		ADAActions.megaMenuAria();
	}
	@Test(priority=195,description="#444: This element has an accessible name which does not properly match its visible label.")
	public void allSubmenu() throws IOException, Exception{
		ADAActions.allSubmenu();
	}
	//Descoped in redesign site @Test(priority=196,description="#442: This element receives focus in an illogical order for screen reader and keyboard users.")
	public void FlavorMegamenu() throws IOException, Exception{
		ADAActions.FlavorMegamenuPresent();
	}
	//uncomment @Test(priority=197,description="#105: There is text within this image.")
	public void CandyCalculatorModal() throws IOException, Exception{
		ADAActions.CandyCalculatorModal();
	}
	@Test(priority=198,description="#201: This element has multiple aria-expanded attributes.")
	public void jbChildcategory() throws IOException, Exception{
		ADAActions.jbChildcategory();
	}
	@Test(priority=199,description="#505: It is not clear to screen reader users where each card or tile begins and ends.")
	public void plpattrib() throws IOException, Exception{
		ADAActions.plpattrib();
	}
	@Test(priority=200,description="#461: This icon is read to screen reader users as an unidentified character.")
	public void checkoutLock() throws IOException, Exception{
		ADAActions.checkoutLockIcon();
	}
	@Test(priority=201,description="#445: These are semantically headings, but they are not marked up as such.")
	public void verifyAllsubmenuHeader() throws IOException, Exception{
		ADAActions.verifyAllsubmenuHeader();
	}	
	@Test(priority=202,description="#446: These unactionable elements have tabindex=\"0\" attributes on them.")
	public void verifyAllsubmenuTabIndex() throws IOException, Exception{
		ADAActions.verifyAllsubmenuTabIndex();
	}	
	@Test(priority=203,description="#447: There are multiple navigation regions on the page, but they are not differentiated from one another.")
	public void verifyMainMenu() throws IOException, Exception{
		ADAActions.verifyMainMenuLabel();
	}
	@Test(priority=204,description="#451: This image lacks an alt attribute, thus it is not clear what it contains.")
	public void shopSweetImg() throws IOException, Exception{
		ADAActions.shopSweetImg();
	}
	@Test(priority=205,description="#465: These form fields use placeholder text as visual labels which disappear as a user enters text. Labels should always remain visible.")
	public void verifyCheckoutfield() throws IOException, Exception{
		ADAActions.verifyCheckoutfield();
	}
	//descoped in redesign site @Test(priority=206,description="#475: The strike-through typography used on this price is not conveyed to screen reader users.")
	public void checkoutdiscountprice() throws IOException, Exception{
		ADAActions.checkoutdiscountprice();
	}
	@Test(priority=207,description="#476: This form field is not labeled.")
	public void verifyCheckoutGift() throws IOException, Exception{
		ADAActions.verifyCheckoutGift();
	}
	//descoped in redesign site @Test(priority=208,description="#477: This is a button, but it is not marked up as such; screen readers will not identify it as actionable and it will not be usable by keyboard users.")
	public void verifyFAQbutton() throws IOException, Exception{
		ADAActions.verifyFAQbuttonRole();
	}
	//descoped in redesign site @Test(priority=209,description="#478: This element controls expandable content, but this is not indicated to screen reader users.")
	public void verifyFAQExpand() throws IOException, Exception{
		ADAActions.verifyFAQExpand();
	}
	@Test(priority=210,description="#479: This icon is read to screen reader users as an unidentified character.")
	public void verifyFAQAriaHidden() throws IOException, Exception{
		ADAActions.verifyFAQAriaHidden();
	}
	@Test(priority=211,description="#471: The required form fields are not indicated as such to screen reader users.")
	public void verifyShippingInputAttrib() throws IOException, Exception{
		ADAActions.verifyShippingInputAttrib();
	}
	@Test(priority=212,description="#448: This navigation menu uses ARIA menu roles, which are only intended for desktop-style application menus. Improper use of these roles often prevents screen reader users from accessing the menu.")
	public void verifyRoleRemovedButton() throws IOException, Exception{
		ADAActions.verifyRoleRemovedButton();
	}
	@Test(priority=213,description="#464: These are semantically headings, but they are not marked up as such.")
	public void verifyCheckoutHeader() throws IOException, Exception{
		ADAActions.verifyCheckoutHeaderTags();
	}
}
