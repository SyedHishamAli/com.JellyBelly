package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.DriverFactory;
import com.utility.WebdriverUtils;

public class CheckoutObjects {

	public static WebElement CheckoutPageHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h1[@class='mz-pagetitle']//span[contains(text(),'Secure Checkout')]"));
	}
	public static WebElement req() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='ind-req']"));
	}
	
	public static WebElement defaultShippingAddress() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//label[@class='mz-contactselector-contact'])[1]"));
	}
	
	public static WebElement defaultAddressRadioButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//label[@class='mz-contactselector-contact'])[1]//input[@type='radio']"));
	}
	
	public static int TotalShippingMethods() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//input[@type='radio' and @name='shippingMethod']")).size();
	}
	
	public static List<WebElement> ShippingMethods() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//input[@type='radio' and @name='shippingMethod']"));
	}
	 public static WebElement ContinueToPaymentInformation () throws Exception{
		 return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'Continue to Payment Information')]"));
	 }
	public static List<WebElement> ShippingMethodsPrice() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//input[@type='radio' and @name='shippingMethod']/following-sibling::span"));
	}
	
	public static WebElement ShippingMethodsPriceInOrderSummary() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Shipping & Handling:')]/following-sibling::span[@class='mz-ordersummary-totalvalue']"));
	}
	
	public static WebElement ShippingMethodsEdit() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@id='shippingmethod-edit']"));
	}
	
	public static WebElement ShippingMethodLabel() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//label[contains(text(),'Shipping Method')]"));
	}
	
	public static WebElement Groundshipping() throws Exception{
		return  WebdriverUtils.findElement(By.xpath("//*[contains(text(),'FREE Ground Shipping')]"));
	}
	
	public static WebElement couponCodeInputField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='coupon-code']"));
	}
	public static WebElement shippingMethodFieldset() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id=\"step-shipping-method\"]/div[1]/div[2]/fieldset[1]"));
	}
	
	public static WebElement couponCodeApplyButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button'][contains(text(),'Apply')]"));
	}
	
	public static WebElement couponCodeRemoveButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='remove-coupon']"));
	}

	
	public static WebElement continueToPaymentOptions() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[contains(text(),'Continue to Payment Information')]"));
	}
	public static WebElement shipOpt() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[text()='Basic Economy Ground ']"));
	}
	
	
	public static WebElement shippingMethodBasic() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//*[@class='customradio'])[1]"));
	}
	public static WebElement hsYesBtn_popup() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='hs-yes']"));
	}
	public static WebElement hsNoBtn_popup() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='hs-no']"));
	}
	public static WebElement cardType() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='mz-payment-credit-card-type']"));
	}
	
	public static WebElement paymentSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h4[contains(text(),'CREDIT CARD & PAYPAL')]"));
	}
	
	public static WebElement paymentSectionLogin() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='open-guestcheckoutmodal-modal' and contains(text(),'Log in')]"));
	}
	
	public static WebElement paymentSectionLoginModel() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='email-dialog']//*[@id='checkout_login']"));
	}
	public static WebElement loginmodal() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//*[@id='email-dialog'])[1]"));
	}
	public static WebElement loginmodalclose() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='close-icon']/a"));
	}
	
	public static WebElement loginmodalh1tag() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='logo']/h1"));
	}
	
	
	public static WebElement cardNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='mz-payment-credit-card-number']"));
	}
	
	
	public static WebElement cardName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='mz-payment-credit-card-name']"));
	}
	
	
	public static WebElement cardExpirationMonth() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='mz-payment-expiration-month']"));
	}
	
	public static WebElement cardExpirationYear() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@name='mz-payment-expiration-year']"));
	}
	
	public static WebElement cardCVV() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='mz-payment-security-code']"));
	}
	
	public static WebElement copyBillingToShipping() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='copyshipping']"));
	}
	
	public static WebElement backToCart() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button mz-button-small']"));
	}
	
	
	public static WebElement productName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//td[@class='mz-ordersummary-item-product']"));
	}
	
	public static WebElement productPrice() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='mz-item-rowtotal is-saleprice']"));
	}
	
	
	
	public static WebElement reviewOrderDescription() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//p[@class='mz-formstep-desc']"));
	}
	
	
	public static WebElement savedCreditCards() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@name='savedPaymentMethods']"));
	}
	
	public static WebElement selectSaveCardOption() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='saved-card-info']"));
	}
	
	
	public static WebElement paymentEdit() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@id='paymentinfo-edit']"));
	}
	
	public static WebElement nextReviewButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='brontocart-billing mz-button checkout-btn btn_validatepaypal']"));
	}
	
	public static WebElement nextPaypalButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='btn_xpressPaypal']"));
	}
	
	
	public static WebElement editBilingInfo() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='copyshipping' and @aria-label='EDIT BILLING INFO ']"));
	}
	
	

	public static List<WebElement> shippingAddressLines() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//div[@class='mz-formstep-summary mz-addresssummary']//*"));
	}
	
	public static List<WebElement> billingAddressLines() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//div[@id='mz-same-as-shipping-summary']//*"));
	}
	
	public static WebElement shippingAddressLine1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-formstep-summary mz-addresssummary']//*)[1]"));
	}
	
	public static WebElement shippingAddressLine2() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-formstep-summary mz-addresssummary']//*)[2]"));
	}
	
	public static WebElement shippingAddressLine3() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-formstep-summary mz-addresssummary']//*)[3]"));
	}
	
	
	public static WebElement shippingAddressLine4() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-formstep-summary mz-addresssummary']//*)[4]"));
	}
	
	
	public static WebElement shippingAddressLine5() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-formstep-summary mz-addresssummary']//*)[3]"));
	}
	
	public static WebElement companyName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='companyname']"));
	}
	
	public static WebElement shippingFirstName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='firstname']"));
	}
	public static WebElement shippingFirstNameHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='firstname']/span"));
	}
	public static WebElement shippingLastName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='lastname']"));
	}
	public static WebElement shippingLastNameHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='lastname']/span"));
	}	
	public static WebElement shippingAddressLineFirst() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='address-line-1']"));
	}
	public static WebElement shippingAddressLineFirstHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='address-line-1']/span"));
	}
	public static WebElement shippingAddressLineSecond() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='address-line-2']"));
	}
	public static WebElement shippingAddressCity() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='city']"));
	}
	public static WebElement shippingAddressCityHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='city']/span"));
	}	
	public static WebElement shippingAddressState() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='stateprov']"));
	}
	public static WebElement shippingAddressStateHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='stateprov']/span"));
	}
	public static WebElement shippingAddressZipCode() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='postal-code']"));
	}
	public static WebElement shippingAddressZipCodeHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='postal-code']/span"));
	}
	public static WebElement shippingPhoneNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='shippingphone']"));
	}
	public static WebElement shippingPhoneNumberHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='shippingphone']/span"));
	}
	public static WebElement shippingAddressType() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='addresstype']"));
	}
	public static WebElement shippingAddressTypeHead() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='addresstype']/span"));
	}
	
	public static WebElement continueShippingMethods() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@id='continuetoshipping']"));
	}
	public static WebElement ShippingMethodBasic() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@name='shippingMethod']"));
	}
	
	public static WebElement continueShippingMethods1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[text()='Basic Economy Ground ']"));
	}
	
	
	public static WebElement shippingAddressEdit() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@id='shippingaddress-edit']"));
	}
	
	public static WebElement iframeBlock() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//iframe[@allow='autoplay' and contains(@style,'display: block')]"));
	}
	
	
	public static WebElement enterNewAddressText() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Enter New Address')]"));
	}
	
	public static WebElement enterNewAddressTextRadioButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//label[@class='mz-contactselector-contact mz-contactselector-new']//input[@type='radio']"));
	}
	
	
	public static List<WebElement> iframeBlocks() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("//iframe[@allow='autoplay' and contains(@style,'display: block')]"));
	}
	
	
	public static List<WebElement> iframeCloseButton() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("(//span[contains(@id,'yie-close-button')])"));
	}
	public static WebElement iframefirst() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElement(By.xpath("(//span[contains(@id,'yie-close-button')])[1]"));
	}
	public static WebElement iframeBackdrop() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElement(By.xpath("//button[contains(text(), 'Continue Shopping')]"));
	}
	public static WebElement iframeName() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElement(By.xpath("//*[contains(@name,'yie-iframe')]"));
	}
	
	public static WebElement emptyCardTypeError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_1']"));
	}
	
	public static WebElement emptyCardNumberError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_2']"));
	}
	
	public static WebElement emptyCardNameError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_3']"));
	}
	
	public static WebElement emptyCardExpiryError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_4']"));
	}
	
	public static WebElement emptyCardSecurityError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_5']"));
	}
	
	public static WebElement paypalTab() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='mz-paymenttype-label mz-paymenttype-label-check']"));
	}
	
	
	public static WebElement loginLinkInPaymentSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='open-guestcheckoutmodal-modal'][contains(text(),'Login')]"));
	}
	
	public static WebElement giftMessageTextField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//textarea[@id='order-comments']"));
	}
	
	public static WebElement giftDisplayTextField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='line0']"));
	}
	public static WebElement ProductQuantity() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//td[@class='mz-ordersummary-item-qty']/span"));
	}
	public static WebElement SubTotal() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//tr[@class='mz-ordersummary-subtotal']//span[@class='mz-ordersummary-totalvalue']"));
	}
	public static WebElement CouponApplied() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='mz-ordersummary-discountamt']"));
	}
	
	public static WebElement ContinueShoppingButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='Continue shopping']"));
	}
	public static WebElement ErrorMessageFirstName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='firstname']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement ErrorMessageLastName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='lastname']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement ErrorMessageAddress1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='address-line-1']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement ErrorMessageCity() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='city']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement ErrorMessageState() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='stateprov']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement ErrorMessageZip() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='postal-code']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement ErrorMessagePhone() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='shippingphone']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement ErrorMessageAddressType() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='addresstype']/following-sibling::span[@class='mz-validationmessage']"));
	}
	public static WebElement FAQ2() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//img[@src='/resources/images/icons/facet-close.png'])[2]"));
	}
	public static WebElement ShippingSUREPOST() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id=\"step-shipping-method\"]/div[1]/div[2]/fieldset/div[2]/label/input"));
	}
	public static WebElement paymentLoginCheckbox() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@for='guestlogin-cpp-checkbox-payment']"));
	}
	public static WebElement paymentLoginSubmit() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//*[@id='addbutton'])[1]"));
	}
	public static WebElement taxTextCart() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='price-table']/tbody/tr[3]/th"));
	}
	public static WebElement shippingTextCart() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='price-table']/tbody/tr[4]/th"));
	}
	public static WebElement productSummary() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='mz-ordersummary']"));
	}
	public static WebElement giftMsgSpan() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='comments-character-count']"));
	}
	public static WebElement giftMsgArea() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='order-comments']"));
	}
	public static WebElement faqIcon() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='faqIcon']"));
	}
	public static List<WebElement> faqArrows() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//*[@id='faq-w']/div/div/img"));
	}
	public static List<WebElement> payemnts() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//*[@class='select-ul clearfix']/li/label"));
	}	
	public static List<WebElement> payemntsli() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//*[@class='select-ul clearfix']/li"));
	}
	public static WebElement payemntsliroot() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='payment-type-select']"));
	}
	
	public static WebElement digital_btn() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//*[@for='digital-credit-code'])[1]/span"));
	}
	public static WebElement digital_lab() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//label[@for='digital-credit-code']"));
	}
	public static WebElement digital_input() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='digital-credit-code']"));
	}	
	public static WebElement createAcc() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[text()='Create an Account']"));
	}	
	public static WebElement logcont() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[text()='Login & Continue']"));
	}	
	
	public static WebElement coupenCode_arrow() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='coupondata']/span"));
	}
	public static WebElement coupen_input() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='coupon-codepayment']"));
	}
	public static WebElement coupen_apply_btn() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='coupon-codepayment-btn']"));
	}
	public static WebElement coupen_err() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='error-msg setpaymentcouponerr']"));
	}
	public static WebElement backToOrder() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@title='Back to cart']"));
	}
	
	

	
}
