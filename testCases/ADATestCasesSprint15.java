package com.testCases;


import com.utility.TestBase;
import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.ADAActions;


public class ADATestCasesSprint15 extends TestBase{
	
	// Descoped in redesign site @Test(priority=247,description="#542: It is not clear to screen reader users where the carousel begins or ends.")
	public void verifyCarouselRole() throws IOException, Exception{
		ADAActions.carouselRole();
	}
	// Descoped in redesign site @Test(priority=248,description="#543: It may not be clear to screen reader users how to interact with this carousel.")
	public void playpauseAttrib() throws IOException, Exception{
		ADAActions.playpauseAttrib();
	}
	@Test(priority=249,description="#544: These images do not have unique and descriptive alt attributes.")
	public void altImgTag() throws IOException, Exception{
		ADAActions.altImgTag();
	}
	@Test(priority=250,description="#208: Screen reader and keyboard users cannot open or use this menu.")
	public void filterRole() throws IOException, Exception{
		ADAActions.filterRole();
	}
	@Test(priority=251,description="#214: depends on #525: This component was audited previously.")
	public void productImgName() throws IOException, Exception{
		ADAActions.productImgName();
	}
	@Test(priority=252,description="#180: An invisible element can receive focus and is visible to screen reader users at all times.")
	public void relatedProdDisplay() throws IOException, Exception{
		ADAActions.relatedProdDisplay();
	}
	// Descoped in redesign site @Test(priority=253,description="#462: This element has an unnecessary ARIA attribute.")
	public void cart_AriaLabel() throws IOException, Exception{
		ADAActions.cart_AriaLabel();
	}
	@Test(priority=254,description="#474: This is structurally a table, but it is not marked up as such.")
	public void checkoutSummary() throws IOException, Exception{
		ADAActions.checkoutSummary();
	}
	@Test(priority=255,description="#535: This element has an unnecessary ARIA attribute.")
	public void billingInfo() throws IOException, Exception{
		ADAActions.billingInfo();
	}
}
