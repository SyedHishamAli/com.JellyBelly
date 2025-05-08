package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.modules.LoginActions;
import com.modules.MiniCartActions;
import com.utility.TestBase;

public class ADATestCasesSprint6 extends TestBase{
	
	//Sprint 6
	@Test(priority=101,description="# 12 - Accessibility Statement, These telephone numbers and Mail are not marked up as links.")
	public void accessibitystatement() throws IOException, Exception{
		ADAActions.accessibitystatement();
		
	}
	@Test(priority=102,description="# 20 - Accessibility Statement, This page does not have an h1 heading")
	public void accessibityPageHeading() throws IOException, Exception{
		ADAActions.accessibityPageHeading();
	
	}
	@Test(priority=94,description="# 230 - This heading level appears in an illogical order.")
	public void MinicartNameInfo() throws IOException, Exception{
		MiniCartActions.MinicartNameInfo();
		ADAActions.miniCartName();
	}	
	@Test(priority=95,description="# 233 - Multiple elements have unnecessary ARIA attributes.")
	public void MinicartNameInfo1() throws IOException, Exception{
		MiniCartActions.MinicartNameInfo1();
		ADAActions.modalCartName();
	}
	@Test(priority=97,description="# 264 - Checkout Page, These heading levels appear in an illogical order.")
	public void verifycheckoutMethodTags() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		//ADAActions.checkoutTags();
	}
	@Test(priority=96,description="# 267 - Shipping Method, Ensure that the legend tag is the first child of the fieldset that it labels.")
	public void ShippingMethodTag() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.shippingTag();
	}
	//@Test(priority=99,description="# 280 - Checkout Page, This is marked up as a list, but it is not semantically a list, add the attribute role=\"presentation\" to the list tag.")
	public void verifycreditcardTag() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.creditCardTagtag();
	}
	@Test(priority=98,description="# 293 - Checkout Page, Coupon code input field error.The error message is not associated with its form field")
	public void verifycouponcodeTag() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		//ADAActions.couponcodetag();
	}
	@Test(priority=104,description="# 309 - Checkout Page, Verify telephone Number is marked as link")
	public void phoneNumberCheckout() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.phoneNumberCheckout();
		
	}
	@Test(priority=103,description="# 366 - Home Page, These elements have an unnecessary ARIA attribute.")
	public void megaMenuHeading() throws IOException, Exception{
		ADAActions.megaMenuHeading();
	}
	//@Test(priority=100,description="# 378 - Checkout Page, Remove the tabindex attribute from this element.")
	public void verifycreditcardTag1() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.creditCardTagtag1();
	}
	
	/*@Test(priority=105,description="# 402 - Heat Sensitive Modal, The modal dialog container is not labeled as such.")
	public void HeatSensitiveToCheckout() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.HeatSensitiveToCheckout();
		ADAActions.HeatSensitiveModal();
		
	}
	
	@Test(priority=106,description="# 403 - Heat Sensitive Modal, This modal dialog lacks a main heading.")
	public void HeatSensitiveToCheckout1() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.HeatSensitiveToCheckout();
		ADAActions.HeatSensitiveModalTitle();
		
	}*/
	
}
