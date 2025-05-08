package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.FlavorspageActions;
import com.modules.LoginActions;
import com.utility.TestBase;

public class FlavorPageTestCases extends TestBase {
	
	@Test(priority=1,description="Verify view all favorite items button in flavours page")
	public void verifyFlavorslistexpansion() throws Exception{
		FlavorspageActions.Flavorslistexpansion();
	}
	@Test(priority=2,description="Verify navigation on click on shop online and find store buttons in flavors page")
	public void verifyShoponlineandfindstore() throws  Exception{
		FlavorspageActions.Shoponlineandfindstore();
	}
	//Descoped in redesign site @Test(priority=3,description="Verify navigation on click on sub category links in flavors page")
	public void verifySubcategorynavigation() throws  Exception{
		FlavorspageActions.Subcategorynavigation();
	}
	@Test(priority=4,description="Verify sort functionality in flavors page")
	public void verifysortfunctionality() throws  Exception{
		FlavorspageActions.sortfunctionality();
	}
	@Test(groups = {"Smoke"},priority=5,description="Verify filter functionality in flavors page")
	public void verifyfilterfunctionality() throws  Exception{
		FlavorspageActions.filterfunctionality();
	}
	//Descoped in redesign site @Test(groups = {"Smoke"},priority=6,description="Verify navigation to PDP page on click on product name")
	 public void verifyFLPtoPDPNavigation() throws IOException, Exception{
		FlavorspageActions.FLPtoPDPNavigation();
	}
	@Test(groups = {"Smoke"},priority=7,description="Verify Load more and show all button functionality")
	 public void verifyPLPLoadMoreandshowmore() throws IOException, Exception{
		FlavorspageActions.FLPLoadMoreandshowmore();
	}
	@Test(groups = {"Smoke"},priority=8,description="Verify add to cart functionality and display of elements in confirmation pop up")
	 public void verifyATCandelementsinpopup() throws IOException, Exception{
		FlavorspageActions.ATCandelementsinpopup();
	}
	@Test(priority=9,description="Verify notify me functionality")
	 public void verifyNotifyFunctionality() throws IOException, Exception{
		FlavorspageActions.NotifyFunctionality();
	}
	//Descoped in redesign site @Test(priority=10,description="Verify add product to wishlit functionality")
	 public void verifyWishlistFunctionality() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		FlavorspageActions.WishlistFunctionality();
	}
}
