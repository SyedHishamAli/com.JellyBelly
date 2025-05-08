package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class FreeShippingsObjects {
	
	public static WebElement addToCartButton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[contains(text(),'Add to Cart')])[2]"));
	}
	public static WebElement productPrice() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[contains(text(),'Add to Cart')]/ancestor::div[@class='jb-product-min-details']//*[contains(@class,'jb-product-prize')])[2]"));
	}
	public static WebElement productName() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[contains(text(),'Add to Cart')]/ancestor::div[@class='jb-product-min-details']//*[contains(@class,'prod-title-heading')])[1]"));
	}
	public static WebElement viewCartButtonInPopup() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='popup-container']//*[contains(@class,'view-cart')]"));
	}
	public static WebElement progressBarText() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@title='shipping information']//*[@class='text-content']"));
	}
	public static WebElement miniCartIcon() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='mini-cart-header']//*[@class='shoping-cart']/img"));
	}
	public static WebElement miniCartMessage() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='jb-minicart-total-container']//*[@class='hide-when-heat-sensitive']"));
	}
	public static WebElement cartMessage() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@id='mz-carttable-freeshipping']"));
	}
	public static WebElement searchField() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[contains(@class,'mz-searchbox-field')]"));
	}
	public static WebElement searchButton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='mz-searchbox-button']"));
	}
	public static WebElement qtyField(String productName) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'"+productName+"')]/ancestor::tr[@class='mz-carttable-item ']//*[@class='quantity-field-cart']"));
	}
	public static WebElement qtyField() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='quantity-field-cart'])[1]"));
	}
	public static WebElement miniCartMessageNonFreeProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='jb-minicart-items-container']//*[@class='no-free-shiping-msg']"));
	}
	public static WebElement cartMessageNonFreeProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'IMPORTANT')]/ancestor::*[@id='no-free-shipping-warning']/p"));
	}
	public static WebElement cartMessageLineItem() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='mz-carttable-item ']//*[@class='no-free-shiping-msg']"));
	}
	public static WebElement proceedToCheckout() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='mz-carttable-checkout-row']//*[contains(text(), 'Proceed to Checkout')]"));
	}
	public static WebElement loginPopup() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='popupmodal']//*[@id='email-dialog']//*[contains(text(),'Login & Continue')]"));
	}
	public static WebElement loginUsername() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='popupmodal']//*[@id='email-dialog']//*[@id='email']"));
	}
	public static WebElement loginPwd() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='popupmodal']//*[@id='email-dialog']//*[@id='password']"));
	}
	public static WebElement loginCheckbox() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='popupmodal']//*[contains(@class,'checkout_login')]//*[@class='checkmark-style']"));
	}
	public static WebElement loginbutton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='popupmodal']//*[@id='email-dialog']//*[@id='addbutton']"));
	}
	public static WebElement checkoutNonFreeMessage() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='mz-ordersummary-lineitems']//*[@class='mz-ordersummary-item-product']//span"));
	}
	
	public static WebElement checkoutFirstname() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='firstname']"));
	}
	public static WebElement checkoutLastname() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='lastname']"));
	}
	public static WebElement checkoutAddressLine1() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='address-line-1']"));
	}
	public static WebElement checkoutCity() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='city']"));
	}
	public static WebElement checkoutState() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='state-or-province']"));
	}
	public static WebElement checkoutZipcode() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='postal-code']"));
	}
	public static WebElement checkoutPhone() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='shippingphone']"));
	}
	public static WebElement checkoutAddressType() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@name='address-type']"));
	}
	public static WebElement continueToShippingMethod() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='step-shipping-address']//*[@id='continuetoshipping']"));
	}
	public static WebElement upsGround() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[contains(@value,'GROUND') and //*[@name='shippingMethod']]"));
	}
	public static WebElement upsSurePost() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[contains(@value,'SUREPOST') and //*[@name='shippingMethod']]"));
	}
	public static WebElement ups3DaySelect() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[contains(@value,'THREE') and //*[@name='shippingMethod']]"));
	}
	public static WebElement continueToPaymentInfo() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'Continue to Payment Information')]"));
	}
	//*[contains(@value,'SECOND') and //*[@name='shippingMethod']]
	//*[contains(@value,'NEXT') and //*[@name='shippingMethod']]
	
	public static String freeShippingMessage() throws Exception {
		return "//*[@id='step-shipping-method']//*[contains(@class,'mz-formstep-fields')]//*[@id='hide-from-heat-sensitive']";
	}
	public static String nonFreeShippingMessage() throws Exception {
		return"//*[@id='step-shipping-method']//*[contains(@class,'mz-formstep-fields')]//*[@id='no-free-shipping-statement']/p";
	}
	public static String shippingAKHI() throws Exception {
		return "//*[@id='step-shipping-method']//*[contains(@class,'mz-formstep-fields')]//*[@class='shippingAKHI']";
	}
	public static WebElement shippingEdit() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='shippingaddress-edit']"));
	}
	public static WebElement closeHarryPoterPromo() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@class='design-layer-editable']//*[@class='layer-wiziwig']//*[contains(text(),'x')]"));
	}
}
