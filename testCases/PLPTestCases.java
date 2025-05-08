package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.PLPActions;
import com.utility.TestBase;

public class PLPTestCases extends TestBase{
	@Test(groups = {"Smoke"},priority=1,description="Verify Sort functionality in PLP page")
	 public void verifyPLPSort() throws IOException, Exception{
		PLPActions.PLPsort();
	}
	@Test(groups = {"Smoke"},priority=2,description="Verify navigation to PDP page on click on product name")
	 public void verifyPLPtoPDPNavigation() throws IOException, Exception{
		PLPActions.PLPtoPDPNavigation();
	}
	@Test(groups = {"Smoke"},priority=3,description="Verify Add to cart functionality from PLP page")
	 public void verifyPLPAddToCart() throws IOException, Exception{
		PLPActions.PLPAddToCart();
	}
	@Test(groups = {"Smoke"},priority=4,description="Verify Load more button functionality")
	 public void verifyPLPLoadMore() throws IOException, Exception{
		PLPActions.PLPLoadMore();
	}
	@Test(groups = {"Smoke"},priority=5,description="Verify Add to cart functionality from recommendation section")
	 public void verifyAddToCartFromRecommendationSection() throws IOException, Exception{
		PLPActions.AddToCartFromRecommendationSection();
	}
	@Test(priority=6,description="Verify navigation to PDP on click on product name in recommendations section")
	 public void verifyRecommendationtoPDPNavigation() throws IOException, Exception{
		PLPActions.RecommendationtoPDPNavigation();
	}
	@Test(priority=7,description="Verify notify me functionality from recommendation section")
	 public void verifyRecommendationtoNotifyFunctionality() throws IOException, Exception{
		PLPActions.RecommendationtoNotifyFunctionality();
	}
	@Test(priority=8,description="Verify filter functionality")
	 public void verifyPLPApplyFilter() throws IOException, Exception{
		PLPActions.PLPApplyFilter();
	}
	@Test(priority=9,description="Verify display of product details in PLP page")
	 public void verifyPLPProductDetailsDisplay() throws IOException, Exception{
		PLPActions.PLPProductDetailsDisplay();
	}
	
	
}
