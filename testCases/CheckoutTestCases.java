package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.CheckoutActions;
import com.utility.TestBase;

public class CheckoutTestCases extends TestBase {
	
	@Test(groups = {"Smoke"},priority=1,description="Verify navigation to checkout page on click on next button after entering email id in continue as guest tab")
	 public void verifyCheckoutNavigationForGuestUser() throws IOException, Exception{
		CheckoutActions.CheckoutNavigationForGuestUser();
	}
	
	@Test(groups = {"Smoke"},priority=2,description="Verify user able to select shippping method")
	 public void verifyCheckoutShippingMethodSelection() throws IOException, Exception{
		CheckoutActions.CheckoutShippingMethodSelection();
	}
	
	
	@Test(groups = {"Smoke"},priority=3,description="Verify user able to apply coupon code from checkout page")
	 public void verifyCheckoutCouponApply() throws IOException, Exception{
		CheckoutActions.CheckoutCouponApply();
	}

	
	@Test(groups = {"Smoke"},priority=4,description="Verify user able to do checkout with credit card")
	 public void verifyCheckoutWithCreditCard() throws IOException, Exception{
		CheckoutActions.CheckoutWithCreditCard();
	}
	
	
	@Test(groups = {"Smoke"},priority=5,description="Verify user able to select billing address as shipping address")
	 public void verifyCopyShippingToBilling() throws IOException, Exception{
		CheckoutActions.CopyShippingToBilling();
	}
	
	@Test(groups = {"Smoke"},priority=6,description="Verify Edit Cart From Checkout")
	 public void verifyCheckoutEditCartFunctionality() throws IOException, Exception{
		CheckoutActions.CheckoutEditCartFunctionality();
	}
	
	@Test(priority=7,description="Verify Elements in guest login popup 1.Continue as guest tab. 2.Login and cotinue tab 3.Next button")
	 public void VerifyElementsInGuestLoginPopup() throws IOException, Exception{
		CheckoutActions.ElementsInGuestLoginPopup();
	}
	
	
	@Test(priority=8,description="Verify error message when user enters email address with invalid format")
	 public void VerifyErrorMessageInGuestEmailField() throws IOException, Exception{
		CheckoutActions.ErrorMessageInGuestEmailField();
	}
	
	
	@Test(priority=9,description="Verify error message on click on next button without entering email address")
	 public void VerifyErrorMessageInEmptyGuestEmailField() throws IOException, Exception{
		CheckoutActions.ErrorMessageInEmptyGuestEmailField();
	}
	
	@Test(priority=10,description="Verify elements in 'Login&continue' tab1.Email address label and text box 2.Password label with text box 3.Next button 4.Forgot password link")
	 public void VerifyLoginAndContinueTabElements() throws IOException, Exception{
		CheckoutActions.LoginAndContinueTabElements();
	}
	
	
	@Test(priority=11,description="Verify error message when login without Mandatory Credentials")
	 public void VerifyLoginWithoutMandatoryCredentialsCheckout() throws IOException, Exception{
		CheckoutActions.LoginWithoutMandatoryCredentialsCheckout();
	}
	

	@Test(priority=12,description="Verify error message when login with invalid credentials")
	 public void VerifyLoginWithInvalidCredentialsCheckout() throws IOException, Exception{
		CheckoutActions.LoginWithInvalidCredentialsCheckout();
	}
	
	
	@Test(priority=13,description="Verify navigation to checkout page by clicking next button after providing email and password in login popup")
	 public void VerifyLoginWithValidCredentialsCheckout() throws IOException, Exception{
		CheckoutActions.LoginWithValidCredentialsCheckout();
	}
	
	
	@Test(priority=14,description="Verify navigation to forget password page by clicking on Forgot password link")
	 public void VerifyForgetPasswordPageNavigation() throws IOException, Exception{
		CheckoutActions.ForgetPasswordPageNavigation();
	}
	
	
	@Test(priority=15,description="Verify user able to add new shipping address in chekout page")
	 public void VerifyAddNewAddressInCheckout() throws IOException, Exception{
		CheckoutActions.AddNewAddressInCheckout();
	}
	
	
	@Test(priority=16,description="Verify user able to select address form saved addresses")
	 public void VerifySelectSavedAddress() throws IOException, Exception{
		CheckoutActions.SelectSavedAddress();
	}
	
	@Test(priority=17,description="Verify user able to edit address form saved addresses")
	 public void VerifyEditSavedAddress() throws IOException, Exception{
		CheckoutActions.EditSavedAddress();
	}
	
	@Test(priority=18,description="Verify user able to add credit card from checkout page")
	 public void VerifyAddCreditCardFromCheckout() throws IOException, Exception{
		CheckoutActions.AddCreditCardFromCheckout();
	}
	
	@Test(priority=19,description="Verify the anonymous user is able edit the credit card")
	 public void VerifyEditCardForGuestUser() throws IOException, Exception{
		CheckoutActions.EditCardForGuestUser();
	}
	
	
	@Test(priority=20,description="Verify the error message for empty credit card details")
	 public void VerifyErrorMessageForEmptyCardDetails() throws IOException, Exception{
		CheckoutActions.ErrorMessageForEmptyCardDetails();
	}
	
	@Test(priority=21,description="Verify user able to select from saved cards from payment method")
	 public void VerifyCheckoutFromSavedCard() throws IOException, Exception{
		CheckoutActions.CheckoutFromSavedCard();
	}
	
	@Test(priority=22,description="Verify the error message for empty credit card details")
	 public void VerifyErrorMessageForEmptySavedCardCCV() throws IOException, Exception{
		CheckoutActions.ErrorMessageForEmptySavedCardCCV();
	}
	
	@Test(priority=23,description="Verify user able to do checkout with paypal")
	 public void VerifyPaypalCheckout() throws IOException, Exception{
		CheckoutActions.VerifyPaypalCheckout();
	}
	
	
	
	@Test(priority=24,description="Verify user able to login from payment method setion")
	 public void VerifyLoginFromPaymentSection() throws IOException, Exception{
		CheckoutActions.LoginFromPaymentSection();
	}
	
	@Test(priority=25,description="Verify user able to add gift message in chekout page")
	 public void verifyGiftMessageInCheckout() throws IOException, Exception{
		CheckoutActions.GiftMessageInCheckout();
	}

	
	@Test(priority=26,description="Verify the user is able to modify the cart and the same changes is refelcting in checkout page")
	 public void verifyModifyCartCheckout() throws IOException, Exception{
		CheckoutActions.ModifyCartCheckout();
	}
	
	
	
}
