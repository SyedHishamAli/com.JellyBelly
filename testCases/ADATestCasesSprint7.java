package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.modules.LoginActions;
import com.modules.MiniCartActions;
import com.utility.TestBase;

public class ADATestCasesSprint7 extends TestBase{
	
	//Sprint 7
		//Descoped in redesign site @Test(priority=107,description="# 37 - Home Page, This telephone number link is not marked up correctly.")
		public void HomePhone() throws IOException, Exception{
			ADAActions.HomePhone();
		}
		
		@Test(priority=108,description="# 86 - Factory Cafe, Remove the heading tag from everything except Hours of operation.")
		public void FactoryHeading() throws IOException, Exception{
			ADAActions.FactoryHeading();
		}
		
		//uncomment @Test(priority=109,description="# 99 - Birthday, This is marked up as a link, but it functions like a button.")
		public void CandyCalculator() throws IOException, Exception{
			ADAActions.CandyCalculator();
		}
		
		//uncomment @Test(priority=110,description="# 104 - Birthday, The escape key does not close the modal.")
		public void CandyCalculatorClose() throws IOException, Exception{
			ADAActions.CandyCalculatorClose();
		}
		
		@Test(priority=111,description="# 228 - Flavoured page, The escape key does not close the modal.")
		public void FlavouredClose() throws IOException, Exception{
			ADAActions.FlavouredClose();
		}
		
		@Test(priority=112,description="# 278 - Checkout page, The meaning of the asterisk (*) is not defined.")
		public void Asterik() throws IOException, Exception{
			LoginActions.verifyLoginFunctionality();
	//		MiniCartActions.NavigationToCheckoutPage1();
	//		ADAActions.Asterik();
		}
		
		@Test(priority=113,description="# 276 - Checkout page, This form field is not labeled correctly.")
		public void GiftcardText() throws IOException, Exception{
			LoginActions.verifyLoginFunctionality();
	//		MiniCartActions.NavigationToCheckoutPage1();
	//		ADAActions.GiftCardText();
		}
		
		@Test(priority=114,description="# 377 - Checkout page, This form field is not labeled correctly.")
		public void BackToCart() throws IOException, Exception{
			LoginActions.verifyLoginFunctionality();
			MiniCartActions.NavigationToCheckoutPage1();
			ADAActions.BackToCart();
			
		}
		
	//New Release
		@Test(priority=125,description="# 67 - Home - The escape key does not close the modal.")
		 public void homeclosemodal() throws IOException, Exception{
			//ADAActions.validateclosemodal();
		}
		@Test(priority=126,description="# 187 - There are multiple separate and adjacent links to the same location.")
		 public void pdpprodname() throws IOException, Exception{
			ADAActions.validatepdpprodname();
		}
		@Test(priority=127,description="# 241 - The strike-through typography used on this price is not conveyed to screen reader users.")
		 public void strikethrough() throws IOException, Exception{
			ADAActions.validatestrikethrough();
		}
}
