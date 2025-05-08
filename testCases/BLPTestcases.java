package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.BLPActions;
import com.modules.LoginActions;
import com.utility.TestBase;

public class BLPTestcases extends TestBase {
	
	@Test(priority=1,description="Verify brand landing page navigation and Aspot verification")
	public void verifyAspotverification() throws Exception{
		BLPActions.Aspotverification();
	}
	@Test(priority=2,description="Verify navigation on click on shop online and find store buttons in BLP page")
	public void verifyShoponlineandfindstore() throws  Exception{
		BLPActions.Shoponlineandfindstore();
	}
	@Test(priority=3,description="Verify navigation on click on sub category links in BLP page")
	public void verifySubcategorynavigation() throws  Exception{
		BLPActions.Subcategorynavigation();
	}
	@Test(priority=4,description="Verify sort functionality in BLP page")
	public void verifysortfunctionality() throws  Exception{
		BLPActions.sortfunctionality();
	}
	@Test(groups = {"Smoke"},priority=5,description="Verify filter functionality in BLP page")
	public void verifyfilterfunctionality() throws  Exception{
		BLPActions.filterfunctionality();
	}
	@Test(groups = {"Smoke"},priority=6,description="Verify navigation to PDP page on click on product name")
	 public void verifyBLPtoPDPNavigation() throws IOException, Exception{
		BLPActions.BLPtoPDPNavigation();
	}
	@Test(groups = {"Smoke"},priority=7,description="Verify Load more and show all button functionality")
	 public void verifyPLPLoadMoreandshowmore() throws IOException, Exception{
		BLPActions.BLPLoadMoreandshowmore();
	}
	@Test(groups = {"Smoke"},priority=8,description="Verify add to cart functionality and display of elements in confirmation pop up")
	 public void verifyATCandelementsinpopup() throws IOException, Exception{
		BLPActions.ATCandelementsinpopup();
	}
	@Test(priority=9,description="Verify notify me functionality")
	 public void verifyNotifyFunctionality() throws IOException, Exception{
		BLPActions.NotifyFunctionality();
	}
	//Descoped in redesign site @Test(priority=10,description="Verify add product to wishlit functionality")
	 public void verifyWishlistFunctionality() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		BLPActions.WishlistFunctionality();
	}
	@Test(priority=11,description="Verify Add to cart functionality from Recommendation section")
	 public void verifyRecommendationATCFun() throws IOException, Exception{
		BLPActions.RecommendationATCFun();
	}
}
