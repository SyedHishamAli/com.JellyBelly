package com.testCases;


import com.utility.TestBase;
import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.ADAActions;


public class ADATestCasesSprint16 extends TestBase{


	@Test(priority=256,description="#542: ")
	public void ProductDiv() throws IOException, Exception{
		ADAActions.productAndNameDiv();
	}
	@Test(priority=257,description="#454: ")
	public void addToCartPopup() throws IOException, Exception{
		ADAActions.addToCartPopup();
	}
	@Test(priority=258,description="#456: ")
	public void addToCartPopupTabindex() throws IOException, Exception{
		ADAActions.addToCartPopupTabindex();
	}
	@Test(priority=259,description="#264: ")
	public void checkoutTag() throws IOException, Exception{
		ADAActions.checkoutTag();
	}
	//CHANGES DONE AS PER NEW ADA TICKET #298@Test(priority=260,description="#267: ")
	public void paymenttype() throws IOException, Exception{
		ADAActions.paymenttype();
	}
	@Test(priority=261,description="#276: ")
	public void sweetreward() throws IOException, Exception{
		ADAActions.sweetreward();
	}
	@Test(priority=262,description="#278: ")
	public void reqfield() throws IOException, Exception{
		ADAActions.reqfield();
	}
	@Test(priority=263,description="#280: ")
	public void paymentRole() throws IOException, Exception{
		ADAActions.paymentRole();
	}
	@Test(priority=264,description="#281: ")
	public void loginmodal() throws IOException, Exception{
		ADAActions.loginmodal();
	}
	@Test(priority=265,description="#283: ")
	public void loginmodalclose() throws IOException, Exception{
		ADAActions.loginmodalclose();
	}
	@Test(priority=266,description="#284: ")
	public void loginmodalh1() throws IOException, Exception{
		ADAActions.loginmodalh1();
	}
	@Test(priority=267,description="#285: ")
	public void loginmodaltabs() throws IOException, Exception{
		ADAActions.loginmodaltabs();
	}
	@Test(priority=268,description="#293: ")
	public void coupenCodeErr() throws IOException, Exception{
		ADAActions.coupenCodeErr();
	}

	@Test(priority=269,description="#377: ")
	public void backorder() throws IOException, Exception{ 
		ADAActions.backorder(); 
	}

}
