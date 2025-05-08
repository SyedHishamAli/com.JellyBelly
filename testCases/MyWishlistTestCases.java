package com.testCases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.modules.MyWishlistActions;
import com.utility.TestBase;

public class MyWishlistTestCases extends TestBase{
	
	@Test(groups = {"Smoke"},priority=1,description="Verify Add to cart button functionality in wishlist")
	 public void verifyWishlistAddToCart() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MyWishlistActions.wishlistAddToCart();
	}
	@Test(priority=2,description="Verify 'No products' text when there are no products added in wishlist")
	 public void verifyWishlistNoProducts() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MyWishlistActions.WishlistNoProducts();
	}
	@Test(priority=3,description="Verify 'Remove' button functionality")
	 public void verifyRemoveFunctionality() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MyWishlistActions.WishlistRemoveButton();
	}
	@Test(priority=4,description="Verify navigation to Shipping info & Return Details page on click on 'Shipping info &Return Details' link in wishlist page")
	 public void verifyShippingInfoNavigation() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MyWishlistActions.ShippingInfoNavigation();
	}
}
