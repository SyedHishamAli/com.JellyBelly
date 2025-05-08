package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.LoginActions;
import com.modules.PDPActions;
import com.utility.TestBase;

public class PDPTestCases extends TestBase {
	@Test(groups = {"Smoke"},priority=1,description="Verify Add to cart functionality from PDP")
	 public void verifyPDPAddToCart() throws IOException, Exception{
		PDPActions.PDPAddToCart1();
	}
	@Test(groups = {"Smoke"},priority=2,description="Verify Add to wishlist functionality from PDP")
	 public void verifyPDPAddToWishlistFunctionality() throws IOException, Exception{
		PDPActions.PDPAddToWishlist();
	}
	/*@Test(groups = {"Smoke"},priority=3,description="Verify navigation to review page on click on Write a review link")
	 public void verifyPDPReviewLinkNavigation() throws IOException, Exception{
		PDPActions.PDPReviewLinkDNavigation();
	}*/
	@Test(priority=4,description="Verify elements in PDP page")
	 public void verifyPDPElements() throws IOException, Exception{
		PDPActions.VerifyPDPElements();
	}
	@Test(priority=5,description="Verify navigation to another PDP page from recommendations section")
	 public void verifyPDPNavigationFromRecommendationSection() throws IOException, Exception{
		PDPActions.PDPNavigationFromRecommendationSection();
	}
	@Test(priority=6,description="Verify Add to cart functionality from recommendation section")
	 public void verifyRecommendationAddToCart() throws IOException, Exception{
		PDPActions.RecommendationAddToCart2();
	}
	/*@Test(priority=7,description="Verify navigation to another PDP page from related product section")
	 public void verifyPDPNavigationFromRelatedProducts() throws IOException, Exception{
		PDPActions.PDPNavigationFromRelatedProducts();
	}*/
	//@Test(priority=8,description="Verify navigation to social sites on clicks on social share icons from PDP")
	 public void verifyPDPsocialShareFunctionality() throws IOException, Exception{
		PDPActions.PDPsocialShareFunctionality();
	}
	@Test(priority=9,description="Verify display of thumbnails in PDP page")
	 public void verifyThumbnailDisplay() throws IOException, Exception{
		PDPActions.ThumbnailDisplay();
	}
	/*@Test(priority=10,description="Verify zoom image on click on product image")
	 public void verifyZoomFunctionality() throws IOException, Exception{
		PDPActions.ZoomFunctionality();
	}*/
	@Test(priority=11,description="Verify Product info on click on product info section")
	 public void verifyProductInfoClick() throws IOException, Exception{
		PDPActions.ProductInfoClick();
	}
	@Test(priority=12,description="Verify description in Nutrition & Ingredients section")
	 public void verifyNutritionDescDisplay() throws IOException, Exception{
		PDPActions.NutritionDescDisplay();
	}
	//@Test(priority=13,description="Verify reviews and ratings in reviews and ratings section")
	 public void verifyRatingsAndReviewDisplay() throws IOException, Exception{
		PDPActions.RatingsAndReviewDisplay();
	}
	@Test(priority=14,description="Verify display of elements in confirmation pop up on click on add to cart")
	 public void verifyDisplayOfEleInConfPopup() throws IOException, Exception{
		PDPActions.DisplayOfEleInConfPopup();
	}
	@Test(priority=15,description="Verify navigation on click on view cart button")
	 public void verifyNavToCartPage() throws IOException, Exception{
		PDPActions.NavToCartPage();
	}
	@Test(priority=16,description="Verify navigation on click on continue shopping button")
	 public void verifyNavToHomePage() throws IOException, Exception{
		PDPActions.NavToHomePage();
	}
	@Test(priority=17,description="Compare product name, price and quantity in confirmation pop up when user adds product from jelly belly recommendation section")
	 public void verifyProInformInConfPopup() throws IOException, Exception{
		PDPActions.ProInformInConfPopup3();
	}
	//uncomment @Test(priority=18,description="Verify navigation to review page on click on Write a review link")
	 public void verifyNavWriteReviewPage() throws IOException, Exception{
		PDPActions.NavWriteReviewPage();
	}
	@Test(priority=19,description="Verify navigation to another PDP page from recommendations section")
	 public void verifyNavToOtherPDPFromRecom() throws IOException, Exception{
		PDPActions.NavToOtherPDPFromRecom();
	}
	@Test(priority=20,description="Verify navigation to another PDP page from related product section")
	 public void verifyNavToOtherPDPFromRelated() throws IOException, Exception{
		PDPActions.NavToOtherPDPFromRelated();
	}
}
