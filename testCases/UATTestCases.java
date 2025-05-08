package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.GlobalFooterActions;
import com.modules.SignUpActions;
import com.modules.UATActions;
import com.utility.TestBase;

public class UATTestCases extends TestBase{
	@Test(priority=1,description="Verify user able to create user from payment method section")
	 public void verifyCreateUserFromPaymentSection() throws IOException, Exception{
		UATActions.CreateUserFromPaymentSection();
	}
	@Test(priority=2,description="Verify display of gift message section in order confirmation page")
	 public void verifyGiftMessageDisplay() throws IOException, Exception{
		UATActions.GiftMessageDisplay();
	}
	@Test(priority=3,description="Verify display of order confirmation popup")
	 public void verifyOrderConfirmationPopupDisplay() throws IOException, Exception{
		UATActions.OrderConfirmationPopupDisplay();
	}
	@Test(priority=4,description="Verify elements in order confirmation page")
	 public void verifyOrderConfirmationElementsDisplay() throws IOException, Exception{
		UATActions.OrderConfirmationElementsDisplay();
	}
	@Test(priority=5,description="Verify navigation on click on continue shopping link in order confirmation page")
	 public void verifyContinueShoppingNavigation() throws IOException, Exception{
		UATActions.ContinueShoppingNavigation();
	}
	@Test(priority=6,description="Verify Product information in order confirmation page")
	 public void verifyProductInfoDisplay() throws IOException, Exception{
		UATActions.ProductInfoDisplay();
	}
	@Test(priority=7,description="Compare product details,billing,shipping address, payment details in order confirmation with my orders page")
	 public void verifyMyOrdersDisplay() throws IOException, Exception{
		UATActions.MyOrdersDisplay();
	}
	@Test(priority=8,description="Verify You have not placed an orders Text when there are no orders placed")
	 public void verifyNoOrdersTextDisplay() throws IOException, Exception{
		UATActions.NoOrdersTextDisplay();
	}
	@Test(priority=9,description="Verify Add all to cart button functionality")
	 public void verifyAddAllFunctionality() throws IOException, Exception{
		UATActions.AddAllFunctionality();
	}
	@Test(priority=10,description="Verify Add to cart button functionality in order history")
	 public void verifyAddToCartFunctionality() throws IOException, Exception{
		UATActions.AddToCartFunctionality();
	}
	@Test(priority=11,description="Verify the static content")
	 public void verifyStoreCreditStaticContentDisplay() throws IOException, Exception{
		UATActions.StoreCreditStaticContentDisplay();
	}
	@Test(priority=12,description="Verify display of the Gift card text box with apply button")
	 public void verifyStoreCreditDisplay() throws IOException, Exception{
		UATActions.StoreCreditDisplay();
	}
	@Test(priority=13,description="Verify error message with invalid gift card/store credit")
	 public void verifyGiftCardErrorMessageDisplay() throws IOException, Exception{
		UATActions.GiftCardErrorMessageDisplay();
	}
	@Test(priority=14,description="Verify UI of Store credit section")
	 public void verifyStoreCreditElementsDisplay() throws IOException, Exception{
		UATActions.StoreCreditElementsDisplay();
	}
	@Test(priority=15,description="Verify sign up functionality")
	public void verifySignUpFunctionality() throws IOException, Exception{
		SignUpActions.signUpFunctionality();
		}
	@Test(priority=16,description="Verify News letter subscription functionality")
	 public void verifyNewsLetterSubscription() throws IOException, Exception{
		GlobalFooterActions.newsLetterSubscription();
	}


}
