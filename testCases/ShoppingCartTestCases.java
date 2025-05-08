package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ShoppingCartActions;
import com.utility.TestBase;

public class ShoppingCartTestCases extends TestBase{
	@Test(groups = {"Smoke"},priority=1,description="Verify elements of shopping cart page")
	public void verifyCartElementsDisplay() throws IOException, Exception{
		ShoppingCartActions.CartElementsDisplay();
	}
	@Test(groups = {"Smoke"},priority=2,description="Verify product information in shopping cart")
	public void verifyProductInfoDisplay() throws IOException, Exception{
		ShoppingCartActions.ProductInfoDisplay();
	}
	@Test(groups = {"Smoke"},priority=3,description="Verify update quantity functionality")
	public void verifyUpdateQuantity() throws IOException, Exception{
		//ShoppingCartActions.UpdateQuantity();
	}
	@Test(groups = {"Smoke"},priority=4,description="Verify remove product through cross icon in shopping cart")
	public void verifyRemoveProduct() throws IOException, Exception{
	    ShoppingCartActions.RemoveProduct();
	}
	@Test(groups = {"Smoke"},priority=5,description="Verify navigation to checkout page on click on Proceed to checkout button")
	public void verifyNavigationToCheckout() throws IOException, Exception{
		//ShoppingCartActions.NavigationToCheckout();
	}
	@Test(groups = {"Smoke"},priority=6,description="Verify coupon functionality with valid coupon code")
	public void verifyCouponFunctionality() throws IOException, Exception{
		//ShoppingCartActions.CouponFunctionality();
	}
	@Test(priority=7,description="Verify navigation to online candy store page on click on Keep shopping button ")
	public void verifyKeepShoppingNavigation() throws IOException, Exception{
		ShoppingCartActions.KeepShoppingNavigation();
	}
	@Test(priority=8,description="Verify error message when user applies invalid coupon code")
	public void verifyErrorMessageForCouponCode() throws IOException, Exception{
		//ShoppingCartActions.ErrorMessageForCouponCode();
	}
	@Test(priority=9,description="Verify estimation section(subtotal,Tax,Estimation Tax) by adding different products")
	public void verifyCartTotal() throws IOException, Exception{
		//ShoppingCartActions.VerfiyCartTotal();
	}
	@Test(priority=10,description="Verify product info in recommendation section")
	public void verifyRecommendationProductInfoDisplay() throws IOException, Exception{
		ShoppingCartActions.RecommendationProductInfoDisplay1();
	}
	@Test(priority=11,description="Verify naviagtion to PDP page on click on product name in recommendation section")
	public void verifyNavigationToPDPFromRecommendation() throws IOException, Exception{
		ShoppingCartActions.NavigationToPDPFromRecommendation1();
	}
	@Test(priority=12,description="Verify Add to cart functionality from recommendation section")
	public void verifyAddToCartFromRecommendation() throws IOException, Exception{
		ShoppingCartActions.AddToCartFromRecommendation();
	}
	@Test(priority=13,description="Compare free shipping text and amount in progress bar, mini cart and cart pages when doesnt met the free shipping")
	public void verifyShippingLabel() throws IOException, Exception{
		//ShoppingCartActions.ShippingLabel();
	}
	@Test(priority=14,description="Compare free shipping text and amount in progress bar, mini cart and cart pages when mets the free shipping")
	public void verifyShippingLabelGround() throws IOException, Exception{
		//ShoppingCartActions.ShippingLabelGround();
	}
	
}
