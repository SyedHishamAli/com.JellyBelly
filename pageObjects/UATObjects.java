package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class UATObjects {
	public static WebElement AccountLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='open-guestcheckoutmodal-modal'][contains(text(),'Account')]"));
	}
	public static WebElement FirstName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='signup-firstname']"));
	}
	public static WebElement LastName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='signup-lastname']"));
	}
	public static WebElement Email() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='signup-email']"));
	}
	public static WebElement Password() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='pswd']"));
	}
	public static WebElement ConfirmPassword() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='cnf-pswd']"));
	}
	public static WebElement RegisterButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@id='signup-submit']"));
	}
	public static WebElement CheckoutLogo() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//img[@alt='Jelly Belly homepage'])[2]"));
	}
	public static WebElement LoginSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//label[@id='labellinkto-popup']"));
	}
	public static WebElement PlaceOrder() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@data-mz-action='submit']"));
	}
	public static WebElement OrderconfirmationGiftMessage() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-ordercomments']/p)[2]"));
	}
	public static WebElement OrderconfirmationPopup() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='brshrink_fit']"));
	}
	public static WebElement OrderconfirmationPopupClose() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='brdialog-close']"));
	}
	public static WebElement OrderNumberText() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='content-container']//p[contains(text(),'Your order number is ')]"));
	}
	public static WebElement OrderNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='content-container']//p[contains(text(),'Your order number is ')]/strong"));
	}
	
	public static WebElement BillingInfo() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-checkout-payment']//dl[@class='mz-propertylist']"));
	}
	public static WebElement ShippingInfo() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-l-stack-section shipping-section']//dd[@class='mz-addresssummary']"));
	}
	public static WebElement SubTotal() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//tr[@class='mz-ordersummary-subtotal']//span[@class='mz-ordersummary-totalvalue']"));
	}
	public static WebElement Shipping() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//tr[@class='mz-ordersummary-shippingtotal']//span[@class='mz-ordersummary-totalvalue']"));
	}
	public static WebElement Total() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//tr[@class='mz-ordersummary-grandtotal']//span[@class='mz-ordersummary-totalvalue']"));
	}
	public static WebElement PaymentInfo() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-checkout-payment']//h4[@class='mz-checkout-paymenttitle']"));
	}
	public static WebElement ProductName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//td[@class='mz-ordersummary-item-product']"));
	}
	public static WebElement Quantity() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//td[@class='mz-ordersummary-item-qty']"));
	}
	public static WebElement Price() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='mz-item-price is-saleprice']"));
	}
	public static WebElement Coupon() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='mz-ordersummary-discountamt']"));
	}
	public static WebElement ContinueShopping() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='logconf']//div[2]"));
	}
	public static WebElement BillingInfoHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-l-stack-section billing-section']//h4[@class='mz-l-stack-sectiontitle']"));
	}
	public static WebElement BillingEmail() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']//dd)[1]"));
	}
	public static WebElement BillingName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']//dd)[2]"));
	}
	public static WebElement BillingAddressName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dd[@class='mz-addresssummary']//span)[1]"));
	}
	public static WebElement BillingAddressLine2() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dd[@class='mz-addresssummary']//span)[2]"));
	}
	public static WebElement BillingAddressLine1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dd[@class='mz-addresssummary']//span)[3]"));
	}
	public static WebElement BillingCompany() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dd[@class='mz-addresssummary']//span)[4]"));
	}
	public static WebElement BillingZipcode() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dd[@class='mz-addresssummary']//span)[5]"));
	}
	public static WebElement BillingCountry() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dd[@class='mz-addresssummary']//span)[6]"));
	}
	
	public static WebElement BillingPhoneNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dd[@class='mz-addresssummary']//span)[7]"));
	}
	public static WebElement CardType() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']//dd)[4]"));
	}
	public static WebElement CardNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']//dd)[5]"));
	}
	public static WebElement ShippingInfoHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-l-stack-section shipping-section']//h4[@class='mz-l-stack-sectiontitle']"));
	}
		
	public static WebElement CheckoutEmail() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-formstep-summary mz-l-stack']//p/strong"));
	}
	public static WebElement CheckoutShippingMethod() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-formstep-summary mz-date-val']/strong"));
	}
	public static WebElement ShippingMethod() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-l-stack-section shipping-section']//dd[contains(text(),'UPS')]"));
	}
	public static List<WebElement> shippingAddressLines() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//div[@class='mz-l-stack-section shipping-section']//dd[@class='mz-addresssummary']/span"));
	}
	public static List<WebElement> BillingAddressLines() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//div[@class='mz-checkout-payment']//dd[@class='mz-addresssummary']/span"));
	}
	public static WebElement CheckoutZipcode() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-formstep-summary mz-addresssummary']/span)[5]"));
	}
	public static WebElement MyOrdersLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='orderhistory-panel']"));
	}
	public static WebElement MyAccountOrderNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//ul[@class='order-list-heading']/li/span)[1]"));
	}
	public static WebElement MyAccountEmail() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd)[1]"));
	}
	public static WebElement MyAccountBillingName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd)[2]"));
	}
	public static WebElement MyAccountBillingAddressName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd/span)[1]"));
	}
	public static WebElement MyAccountAddressLine2() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd/span)[2]"));
	}
	public static WebElement MyAccountAddressLine1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd/span)[3]"));
	}
	public static WebElement MyAccountAddressCompany() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd/span)[4]"));
	}
	public static WebElement MyAccountZipcode() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd/span)[5]"));
	}
	public static WebElement MyAccountCountry() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd/span)[6]"));
	}
	public static WebElement MyAccountPhoneNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd/span)[7]"));
	}
	public static WebElement MyAccountCardType() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd)[4]"));
	}
	public static WebElement MyAccountCardNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//dl[@class='mz-propertylist']/dd)[5]"));
	}
	public static WebElement MyAccountShippingMethod() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='order-shipping-address']//div[@class='ship-to-content'])[2]"));
	}
	public static List<WebElement> MyAccountShippingAddressLines() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//div[@class='order-list-address-details']//div[@class='order-shipping-address']//div[@class='ship-to-content']/span"));
	}
	public static List<WebElement> MyAccountBillingAddressLines() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//div[@class='order-billing-address']//dd[@class='mz-addresssummary']/span"));
	}
	public static WebElement MyAccountTotal() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//p[@class='inline']"));
	}
	public static WebElement MyAccountProductName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='mz-itemlisting-title']"));
	}
	public static WebElement NoOrdersText() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//p[contains(text(),'You have not placed any orders.')]"));
	}
	public static WebElement MyAccountQuantity() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@class='quantity-field']"));
	}
	public static WebElement MyAccounttAddToCart() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='inline-add-to-cart']"));
	}
	public static WebElement AddAllButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@title='ADD ALL TO CART']"));
	}
	public static WebElement StorecreditStaticContent() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//section[@class='mz-subtitle-para']"));
	}
	public static WebElement StorecreditStaticContent1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//p[@class='mz-subtitle-para']"));
	}
	public static WebElement StorecreditLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='storecredit-panel']"));
	}
	public static WebElement GiftCardTextField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='accountStoreCreditInput']"));
	}
	public static WebElement ApplyButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@data-mz-action='addStoreCredit']"));
	}
	public static WebElement GiftCardErrorMessage() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='giftcard-messages']"));
	}
	public static WebElement StoreCreditCode() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//td[@class='mz-accountstorecredit-cell-storecreditnumber'])[1]"));
	}
	public static WebElement CreditDate() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//td[@class='mz-accountstorecredit-cell-creditdate'])[1]"));
	}
	public static WebElement CreditAmount() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//td[@class='mz-accountstorecredit-cell-creditamount'])[1]"));
	}
	public static WebElement RemainingAmount() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//td[@class='mz-accountstorecredit-cell-remaining'])[1]"));
	}
	public static WebElement TotalCreditBalance() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='mz-accountstorecredit-totalamount']"));
	}
	public static WebElement Link() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'www.jellybelly.com')]"));
	}
}
