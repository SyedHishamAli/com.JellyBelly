	package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.modules.MiniCartActions;
import com.utility.TestBase;

public class MiniCartTestCases extends TestBase {
		@Test(groups = {"Smoke"},priority=1,description="Verify navigation to empty shopping cart when there are no products added to cart")
		 public void verifyEmptyCartNavigation() throws IOException, Exception{
			MiniCartActions.EmptyCartNavigation();
	    }
		@Test(groups = {"Smoke"},priority=2,description="Verify product information in minicart")
		 public void verifyMinicartProductInfo() throws IOException, Exception{
			MiniCartActions.MinicartProductInfo();
		}
		@Test(groups = {"Smoke"},priority=3,description="Verify quantity in mini cart icon by adding multpile products")
		 public void verifyMultipleQuantityInMinicart() throws IOException, Exception{
			//MiniCartActions.MultipleQuantityInMinicart();
		}
		@Test(groups = {"Smoke"},priority=4,description="Verify navigation to Cart page by clicking View cart button")
		 public void verifyNavigationToCartPage() throws IOException, Exception{
			MiniCartActions.NavigationToCartPage1();
		}
		@Test(groups = {"Smoke"},priority=5,description="Verify quantity navigation to Checkout page by clicking Proceed to checkout buttony in mini cart icon by adding multpile products")
		 public void verifyNavigationToCheckoutPage() throws IOException, Exception{
			//LoginActions.verifyLoginFunctionality();
			MiniCartActions.NavigationToCartByProceedToCheckout();
		}
		@Test(priority=6,description="Verify No products added to cart text when there are no products added to cart")
		 public void verifyNoProductsTextDisplay() throws IOException, Exception{
			MiniCartActions.NoProductsTextDisplay();
		}
		@Test(priority=7,description="Verify subtotal by adding multiple products")
		 public void verifyVerfiySubtotal() throws IOException, Exception{
			//MiniCartActions.VerfiySubtotal();
		}
}
