package com.modules;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pageObjects.CheckoutObjects;
import com.pageObjects.FreeShippingsObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.PLPObjects;
import com.utility.BrowserUtils;
import com.utility.DriverFactory;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class FreeShippingsActions {

	public static void freeShippingProductWithLess() throws Exception {

		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.showAll(), 10);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.addToCartButton(), "Add to Cart button");
		String productPrice=FreeShippingsObjects.productPrice().getText().replace("$", "").trim();
		float price=FreeShippingsActions.getPriceWith2Decimal(productPrice);
		WebdriverUtils.clickAction(FreeShippingsObjects.addToCartButton());
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.viewCartButtonInPopup(), "ViewCartButton");
		WebdriverUtils.clickAction(FreeShippingsObjects.viewCartButtonInPopup());
		addNonFreeshippingProduct("912");
		WebdriverUtils.refreshPage();
		Thread.sleep(6000);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.miniCartIcon(), "Mini Cart");
		WebdriverUtils.moveToElementByActions(FreeShippingsObjects.miniCartIcon());
		String miniCartMessage=FreeShippingsObjects.miniCartMessage().getText().replace(" ", "").trim().toLowerCase();
		String progressBarText=FreeShippingsObjects.progressBarText().getText().replace(" ", "").trim().toLowerCase();
		double progressPrice=FreeShippingsActions.getProgressBarValue();
		String tresholdPriceS=WebdriverUtils.getProperty("tresholdPrice").replace("$", "");
		int tresholdPrice=Integer.parseInt(tresholdPriceS);
		double expProgressPriceDecimal=tresholdPrice-price;
		double expProgressPrice=getPriceWith2DecimalForNumber(expProgressPriceDecimal);
		String cartMessage=FreeShippingsObjects.cartMessage().getText().replace(" ", "").trim().toLowerCase();
		assertEquals(progressPrice, expProgressPrice);

		//Expected message in Progress bar
		String exp="Add $"+progressPrice+" more to get Discounted Shipping. Click for Details";
		String expText=exp.replace(" ", "").trim().toLowerCase();
		System.out.println("progressBarText -- "+progressBarText);
		System.out.println("expText -- "+expText);
		assertTrue(progressBarText.contains(expText));

		//Expected message in Minicart section
		String exp1="You are only $"+progressPrice+" away from Discounted Shipping!";
		String expTextMiniCart=exp1.replace(" ", "").trim().toLowerCase();
		System.out.println("miniCartMessage -- "+miniCartMessage);
		System.out.println("expTextMiniCart -- "+expTextMiniCart);
		assertTrue(miniCartMessage.contains(expTextMiniCart));

		//Expected message in Shopping cart section
		String exp2="You are only $"+progressPrice+" away from Discounted Shipping!";
		String expTextCart=exp2.replace(" ", "").trim().toLowerCase();
		System.out.println("cartMessage -- "+cartMessage);
		System.out.println("expTextCart -- "+expTextCart);
		assertTrue(cartMessage.contains(expTextCart));
	}

	public static Double getProgressBarValue() throws Exception {
		DecimalFormat df2 = new DecimalFormat("#.##");
		WebdriverUtils.waitUntilElementIsDisplayed(FreeShippingsObjects.progressBarText());
		String progressText=FreeShippingsObjects.progressBarText().getText();
		String[] progress=progressText.split(" ");
		String progressPriceArray=progress[3].replace("$", "");
		double progressPrice=Double.parseDouble(progressPriceArray);
		String productPriceDecExp=df2.format(progressPrice);
		progressPrice=Double.valueOf(productPriceDecExp);
		return progressPrice;
	}
	public static float getPriceWith2Decimal(String productPrice) {
		DecimalFormat df2 = new DecimalFormat("#.##");
		float price=Float.parseFloat(productPrice);
		String productPriceDec=df2.format(price);
		price = Float.valueOf(productPriceDec);
		return price;
	}
	public static double getPriceWith2DecimalForNumber(double number) {
		DecimalFormat df2 = new DecimalFormat("#.##");
		String productPriceDec=df2.format(number);
		double price=Double.parseDouble(productPriceDec);
		return price;
	}
	public static void addNonFreeshippingProduct(String categoryID) throws Exception {
		DriverFactory.getInstance().getDriver().get(Environments.getURL()+"/c/"+categoryID);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.addToCartButton(), "Add to Cart button");
		WebdriverUtils.clickAction(FreeShippingsObjects.addToCartButton());
		try {
			WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.viewCartButtonInPopup(), "ViewCartButton");
			WebdriverUtils.clickAction(FreeShippingsObjects.viewCartButtonInPopup());
			DriverFactory.getInstance().getDriver().get("https://www.jellybelly.com/cart");
		}
		catch(Exception e) {
			DriverFactory.getInstance().getDriver().get("https://www.jellybelly.com/cart");
		}
	}
	public static void increaseQuantity(String productName) throws Exception {
		Thread.sleep(4000);
		WebdriverUtils.scrollToElement("300");	
		//WebdriverUtils.clickAction(FreeShippingsObjects.qtyField(productName));
		WebdriverUtils.clickAction(FreeShippingsObjects.qtyField());
		WebdriverUtils.sendKeysWithClear(FreeShippingsObjects.qtyField(), "10");
		Thread.sleep(5000);
	}

	public static void freeShippingProductWithMore() throws Exception {

		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.showAll(), 10);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.addToCartButton(), "Add to Cart button");
		String productName=FreeShippingsObjects.productName().getText().replace(".", "").trim();
		System.out.println("productName -- "+productName);
		//String productPrice=FreeShippingsObjects.productPrice().getText().replace("$", "").trim();
		//double price=FreeShippingsActions.getPriceWith2Decimal(productPrice);
		WebdriverUtils.clickAction(FreeShippingsObjects.addToCartButton());
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.viewCartButtonInPopup(), "ViewCartButton");
		WebdriverUtils.clickAction(FreeShippingsObjects.viewCartButtonInPopup());
		addNonFreeshippingProduct("912");
		Thread.sleep(5000);
		increaseQuantity(productName);
		WebdriverUtils.refreshPage();
		Thread.sleep(2000);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.miniCartIcon(), "Mini Cart");
		WebdriverUtils.moveToElementByActions(FreeShippingsObjects.miniCartIcon());
		String miniCartMessage=FreeShippingsObjects.miniCartMessage().getText().replace(" ", "").trim().toLowerCase();
		String progressBarText=FreeShippingsObjects.progressBarText().getText().replace(" ", "").trim().toLowerCase();
		String cartMessage=FreeShippingsObjects.cartMessage().getText().replace(" ", "").trim().toLowerCase();

		//Expected message in Progress bar
		String exp="Congratulations, you qualify for Discounted Shipping! Click for Details.";
		String expText=exp.replace(" ", "").trim().toLowerCase();
		System.out.println("progressBarText -- "+progressBarText);
		System.out.println("expText -- "+expText);
		assertTrue(progressBarText.contains(expText));

		//Expected message in Minicart section
		String exp1="Congratulations, you qualify for Discounted Shipping!";
		String expTextMiniCart=exp1.replace(" ", "").trim().toLowerCase();
		System.out.println("miniCartMessage -- "+miniCartMessage);
		System.out.println("expTextMiniCart -- "+expTextMiniCart);
		assertTrue(miniCartMessage.contains(expTextMiniCart));

		//Expected message in Shopping cart section
		String exp2="Congratulations, you may qualify for FREE or Discounted Ground Shipping ! (Exclusions apply, click for more info.)";
		String expTextCart=exp2.replace(" ", "").trim().toLowerCase();
		System.out.println("cartMessage -- "+cartMessage);
		System.out.println("expTextCart -- "+expTextCart);
		assertTrue(cartMessage.contains(expTextCart));

	}

	public static void normalProductWithLess() throws Exception {

		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.showAll(), 10);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.addToCartButton(), "Add to Cart button");
		//String productName=FreeShippingsObjects.productName().getText();
		String productPrice=FreeShippingsObjects.productPrice().getText().replace("$", "").trim();
		double price=FreeShippingsActions.getPriceWith2Decimal(productPrice);
		WebdriverUtils.clickAction(FreeShippingsObjects.addToCartButton());
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.viewCartButtonInPopup(), "ViewCartButton");
		WebdriverUtils.clickAction(FreeShippingsObjects.viewCartButtonInPopup());
		WebdriverUtils.refreshPage();
		Thread.sleep(2000);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.miniCartIcon(), "Mini Cart");
		WebdriverUtils.moveToElementByActions(FreeShippingsObjects.miniCartIcon());
		String miniCartMessage=FreeShippingsObjects.miniCartMessage().getText().replace(" ", "").trim().toLowerCase();
		String progressBarText=FreeShippingsObjects.progressBarText().getText().replace(" ", "").trim().toLowerCase();
		double progressPrice=FreeShippingsActions.getProgressBarValue();
		String tresholdPriceS=WebdriverUtils.getProperty("tresholdPrice").replace("$", "");
		int tresholdPrice=Integer.parseInt(tresholdPriceS);
		double expProgressPriceDecimal=tresholdPrice-price;
		double expProgressPrice=getPriceWith2DecimalForNumber(expProgressPriceDecimal); 
		String cartMessage=FreeShippingsObjects.cartMessage().getText().replace(" ", "").trim().toLowerCase();
		assertEquals(progressPrice, expProgressPrice);

		//Expected message in Progress bar
		String exp="Add $"+progressPrice+" more to get Free Ground Shipping. Click for Details";
		String expText=exp.replace(" ", "").trim().toLowerCase();
		System.out.println("progressBarText -- "+progressBarText);
		System.out.println("expText -- "+expText);
		assertTrue(progressBarText.contains(expText));

		//Expected message in Minicart section
		String exp1="You are only $"+progressPrice+" away from Free Ground Shipping!";
		String expTextMiniCart=exp1.replace(" ", "").trim().toLowerCase();
		System.out.println("miniCartMessage -- "+miniCartMessage);
		System.out.println("expTextMiniCart -- "+expTextMiniCart);
		assertTrue(miniCartMessage.contains(expTextMiniCart));

		//Expected message in Shopping cart section
		String exp2="You are only $"+progressPrice+" away from Free Ground Shipping!";
		String expTextCart=exp2.replace(" ", "").trim().toLowerCase();
		System.out.println("cartMessage -- "+cartMessage);
		System.out.println("expTextCart -- "+expTextCart);
		assertTrue(cartMessage.contains(expTextCart));
	}

	public static void normalProductWithMore() throws Exception {

		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(WebdriverUtils.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.showAll(), 10);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.addToCartButton(), "Add to Cart button");
		String productName=FreeShippingsObjects.productName().getText();
		System.out.println("productName -- "+productName);
		//String productPrice=FreeShippingsObjects.productPrice().getText().replace("$", "").trim();
		//double price=FreeShippingsActions.getPriceWith2Decimal(productPrice);
		WebdriverUtils.clickAction(FreeShippingsObjects.addToCartButton());
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.viewCartButtonInPopup(), "ViewCartButton");
		WebdriverUtils.clickAction(FreeShippingsObjects.viewCartButtonInPopup());
		Thread.sleep(5000);
		increaseQuantity(productName);
		WebdriverUtils.refreshPage();
		Thread.sleep(2000);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.miniCartIcon(), "Mini Cart");
		WebdriverUtils.moveToElementByActions(FreeShippingsObjects.miniCartIcon());
		String miniCartMessage=FreeShippingsObjects.miniCartMessage().getText().replace(" ", "").trim().toLowerCase();
		String progressBarText=FreeShippingsObjects.progressBarText().getText().replace(" ", "").trim().toLowerCase();
		String cartMessage=FreeShippingsObjects.cartMessage().getText().replace(" ", "").trim().toLowerCase();

		//Expected message in Progress bar
		String exp="Congratulations, you qualify for Free Ground Shipping! Click for Details.";
		String expText=exp.replace(" ", "").trim().toLowerCase();
		System.out.println("progressBarText -- "+progressBarText);
		System.out.println("expText -- "+expText);
		assertTrue(progressBarText.contains(expText));

		//Expected message in Minicart section
		String exp1="Congratulations, you qualify for Free Ground Shipping!";
		String expTextMiniCart=exp1.replace(" ", "").trim().toLowerCase();
		System.out.println("miniCartMessage -- "+miniCartMessage);
		System.out.println("expTextMiniCart -- "+expTextMiniCart);
		assertTrue(miniCartMessage.contains(expTextMiniCart));

		//Expected message in Shopping cart section
		String exp2="Congratulations, you may qualify for FREE or Discounted Ground Shipping ! (Exclusions apply, click for more info.)";
		String expTextCart=exp2.replace(" ", "").trim().toLowerCase();
		System.out.println("cartMessage -- "+cartMessage);
		System.out.println("expTextCart -- "+expTextCart);
		assertTrue(cartMessage.contains(expTextCart));
	}

	public static void nonFreeshippingProduct() throws Exception {

		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		addNonFreeshippingProduct("912");
		WebdriverUtils.refreshPage();
		Thread.sleep(5000);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.miniCartIcon(), "Mini Cart");
		WebdriverUtils.moveToElementByActions(FreeShippingsObjects.miniCartIcon());
		String miniCartMessage=FreeShippingsObjects.miniCartMessage().getText().replace(" ", "").trim().toLowerCase();
		//String progressBarText=FreeShippingsObjects.progressBarText().getText().replace(" ", "").trim().toLowerCase();
		String cartMessage=FreeShippingsObjects.cartMessage().getText().replace(" ", "").trim().toLowerCase();

		//Expected message in Progress bar
		/*String exp="0% complete. Add $55.00 more to get Discounted Shipping. Click for Details";
		String expText=exp.replace(" ", "").trim().toLowerCase();
		System.out.println("progressBarText -- "+progressBarText);
		System.out.println("expText -- "+expText);
		assertTrue(progressBarText.contains(expText));*/

		//Expected message in Minicart section
		String exp1="You are only "+WebdriverUtils.getProperty("tresholdPrice")+".00 away from Discounted Shipping";
		String expTextMiniCart=exp1.replace(" ", "").trim().toLowerCase();
		System.out.println("miniCartMessage -- "+miniCartMessage);
		System.out.println("expTextMiniCart -- "+expTextMiniCart);
		assertTrue(miniCartMessage.contains(expTextMiniCart));

		//Expected message in Shopping cart section
		String exp2="You are only "+WebdriverUtils.getProperty("tresholdPrice")+".00 away from Discounted Shipping";
		String expTextCart=exp2.replace(" ", "").trim().toLowerCase();
		System.out.println("cartMessage -- "+cartMessage);
		System.out.println("expTextCart -- "+expTextCart);
		assertTrue(cartMessage.contains(expTextCart));
	}

	public static void nonFreeshippingMsgs() throws Exception {

		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		addNonFreeshippingProduct("912");
		WebdriverUtils.refreshPage();
		Thread.sleep(5000);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.miniCartIcon(), "Mini Cart");
		WebdriverUtils.moveToElementByActions(FreeShippingsObjects.miniCartIcon());
		String miniCartMessage=FreeShippingsObjects.miniCartMessageNonFreeProduct().getText().replace(" ", "").trim().toLowerCase();
		String cartMessage=FreeShippingsObjects.cartMessageNonFreeProduct().getText().replace(" ", "").trim().toLowerCase();
		String lineItemMessage=FreeShippingsObjects.cartMessageLineItem().getText().replace(" ", "").trim().toLowerCase();

		//Expected message in Minicart section
		String exp1="This product does not count toward the Free Shipping threshold";
		String expTextMiniCart=exp1.replace(" ", "").trim().toLowerCase();
		System.out.println("miniCartMessage -- "+miniCartMessage);
		System.out.println("expTextMiniCart -- "+expTextMiniCart);
		assertTrue(miniCartMessage.contains(expTextMiniCart));

		//Expected message in Shopping cart section
		String exp2="You have at least one product that does not count toward the Free Shipping threshold.";
		String expTextCart=exp2.replace(" ", "").trim().toLowerCase();
		System.out.println("cartMessage -- "+cartMessage);
		System.out.println("expTextCart -- "+expTextCart);
		assertTrue(cartMessage.contains(expTextCart));

		//Expected message in LineItem of cart
		String exp="This product does not count toward the Free Shipping threshold";
		String expTextLineItem=exp.replace(" ", "").trim().toLowerCase();
		System.out.println("progressBarText -- "+lineItemMessage);
		System.out.println("expText -- "+expTextLineItem);
		assertTrue(lineItemMessage.contains(expTextLineItem));

		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.proceedToCheckout(), "Proceed to Checkout");
		WebdriverUtils.clickAction(FreeShippingsObjects.proceedToCheckout());
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.loginPopup(), "Login popup");
		WebdriverUtils.clickAction(FreeShippingsObjects.loginPopup());
		WebdriverUtils.clickAction(FreeShippingsObjects.loginUsername());
		WebdriverUtils.sendKeys(FreeShippingsObjects.loginUsername(), WebdriverUtils.getProperty("Email"));
		WebdriverUtils.sendKeys(FreeShippingsObjects.loginPwd(), WebdriverUtils.getProperty("Password"));
		WebdriverUtils.scrollToElement(FreeShippingsObjects.loginCheckbox());
		WebdriverUtils.clickAction(FreeShippingsObjects.loginCheckbox());
		Thread.sleep(2000);
		WebdriverUtils.clickAction(FreeShippingsObjects.loginbutton());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Thread.sleep(4000);
		WebdriverUtils.swipeDownUntillElement(FreeShippingsObjects.checkoutNonFreeMessage());
		String checkoutNonFredtMessage=FreeShippingsObjects.checkoutNonFreeMessage().getText().replace(" ", "").trim().toLowerCase();

		//Expected message in LineItem of cart
		String expCheckout="This product does not count toward the Free Shipping threshold";
		String expCheckoutMessage=expCheckout.replace(" ", "").trim().toLowerCase();
		System.out.println("checkoutNonFredtMessage -- "+checkoutNonFredtMessage);
		System.out.println("expCheckoutMessage -- "+expCheckoutMessage);
		assertTrue(checkoutNonFredtMessage.contains(expCheckoutMessage));
	}

	public static void shippingForm(String firstname, String lastname, String addressLine1, 
			String city, String state, String zipcode, String phone, String addressType) throws Exception {

		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.checkoutFirstname(), "Checkout form firstname");
		WebdriverUtils.clickAction(FreeShippingsObjects.checkoutFirstname());
		WebdriverUtils.sendKeysWithClear(FreeShippingsObjects.checkoutFirstname(), firstname);
		WebdriverUtils.clickAction(FreeShippingsObjects.checkoutLastname());
		WebdriverUtils.sendKeysWithClear(FreeShippingsObjects.checkoutLastname(), lastname);
		WebdriverUtils.clickAction(FreeShippingsObjects.checkoutAddressLine1());
		WebdriverUtils.sendKeysWithClear(FreeShippingsObjects.checkoutAddressLine1(), addressLine1);
		WebdriverUtils.clickAction(FreeShippingsObjects.checkoutCity());
		WebdriverUtils.sendKeysWithClear(FreeShippingsObjects.checkoutCity(), city);
		WebdriverUtils.selectByValue(FreeShippingsObjects.checkoutState(), state);
		WebdriverUtils.clickAction(FreeShippingsObjects.checkoutZipcode());
		WebdriverUtils.sendKeysWithClear(FreeShippingsObjects.checkoutZipcode(), zipcode);
		WebdriverUtils.clickAction(FreeShippingsObjects.checkoutPhone());
		WebdriverUtils.sendKeysWithClear(FreeShippingsObjects.checkoutPhone(), phone);
		WebdriverUtils.selectByValue(FreeShippingsObjects.checkoutAddressType(), addressType);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.continueToShippingMethod(), "Continue to Shipping method button");
		WebdriverUtils.clickAction(FreeShippingsObjects.continueToShippingMethod());
		Thread.sleep(6000);
		//WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.continueToPaymentInfo(), "Continue to Payment Info");
	}
	public static void loginAtCheckout() throws Exception {

		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.proceedToCheckout(), "Proceed to Checkout");
		WebdriverUtils.clickAction(FreeShippingsObjects.proceedToCheckout());
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.loginPopup(), "Login popup");
		WebdriverUtils.clickAction(FreeShippingsObjects.loginPopup());
		WebdriverUtils.clickAction(FreeShippingsObjects.loginUsername());
		WebdriverUtils.sendKeys(FreeShippingsObjects.loginUsername(), WebdriverUtils.getProperty("Email"));
		WebdriverUtils.sendKeys(FreeShippingsObjects.loginPwd(), WebdriverUtils.getProperty("Password"));
		WebdriverUtils.scrollToElement(FreeShippingsObjects.loginCheckbox());
		WebdriverUtils.clickAction(FreeShippingsObjects.loginCheckbox());
		Thread.sleep(2000);
		WebdriverUtils.clickAction(FreeShippingsObjects.loginbutton());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Thread.sleep(4000);
	}

	public static void gettingMessageForDifferentAddresses(String webElementString1, String msg1, String webElementString2, String msg2, int countOfMessages) throws Exception {

		shippingForm(WebdriverUtils.getProperty("firstname1"), WebdriverUtils.getProperty("lastname1"), 
				WebdriverUtils.getProperty("addressLineOne1"), WebdriverUtils.getProperty("city1"), 
				WebdriverUtils.getProperty("state1"), WebdriverUtils.getProperty("zipcode1"),
				WebdriverUtils.getProperty("phone1"),WebdriverUtils.getProperty("addressType1"));
		Thread.sleep(2000);
		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.upsGround(), "UPS ground");
		WebdriverUtils.clickAction(FreeShippingsObjects.upsGround());
		Thread.sleep(8000);
		String shippingMethodmsg=getMessageFromWebElement(webElementString1);

		//Expected message in checkout payment section
		String expshippingMethod=WebdriverUtils.getProperty(msg1);
		String expshippingMethodmsg=expshippingMethod.replace(" ", "").trim().toLowerCase();
		System.out.println("shippingMethodmsg -- "+shippingMethodmsg);
		System.out.println("expshippingMethodmsg -- "+expshippingMethodmsg);
		assertTrue(shippingMethodmsg.contains(expshippingMethodmsg));

		WebdriverUtils.waitForElementToBeClickable(FreeShippingsObjects.shippingEdit(), "Shipping edit button");
		WebdriverUtils.swipeUpUntillElement(FreeShippingsObjects.shippingEdit());
		WebdriverUtils.clickAction(FreeShippingsObjects.shippingEdit());
		shippingForm(WebdriverUtils.getProperty("firstname2"), WebdriverUtils.getProperty("lastname2"), 
				WebdriverUtils.getProperty("addressLineOne2"), WebdriverUtils.getProperty("city2"), 
				WebdriverUtils.getProperty("state2"), WebdriverUtils.getProperty("zipcode2"),
				WebdriverUtils.getProperty("phone2"),WebdriverUtils.getProperty("addressType2"));
		Thread.sleep(8000);
		int i=countOfMessages;
		if(i>2) {
			String shippingMethodmsg1=getMessageFromWebElement(webElementString2);

			//Expected message in checkout payment section
			String expshippingMethod1=WebdriverUtils.getProperty(msg2);
			String expshippingMethodmsg1=expshippingMethod1.replace(" ", "").trim().toLowerCase();
			System.out.println("shippingMethodmsg1 -- "+shippingMethodmsg+shippingMethodmsg1);
			System.out.println("expshippingMethodmsg1 -- "+expshippingMethodmsg1);
			String shippingMethodmsgConcat=shippingMethodmsg+shippingMethodmsg1;
			assertTrue(shippingMethodmsgConcat.contains(expshippingMethodmsg1));
		}
		else {
			String shippingMethodmsg1=getMessageFromWebElement(webElementString2);

			//Expected message in checkout payment section
			String expshippingMethod1=WebdriverUtils.getProperty(msg2);
			String expshippingMethodmsg1=expshippingMethod1.replace(" ", "").trim().toLowerCase();
			System.out.println("shippingMethodmsg1 -- "+shippingMethodmsg1);
			System.out.println("expshippingMethodmsg1 -- "+expshippingMethodmsg1);
			assertTrue(shippingMethodmsg1.contains(expshippingMethodmsg1));
		}
	}

	public static String getMessageFromWebElement(String webElementString) {
		try {
			return DriverFactory.getInstance().getDriver().findElement(By.xpath(webElementString)).getText().replace(" ", "").trim().toLowerCase();
		}
		catch(Exception e) {
			return "Not able to find webElement which is searching";
		}
	}
	public static void freeShippNonFreeShippLessCheckout() throws Exception {
		gettingMessageForDifferentAddresses(FreeShippingsObjects.nonFreeShippingMessage(), "nonFreeShippingMessage", FreeShippingsObjects.shippingAKHI(), "shippingAKHIWithFreeShip", 3);
	}

	public static void freeShippNonFreeShippMoreCheckout() throws Exception {
		gettingMessageForDifferentAddresses(FreeShippingsObjects.nonFreeShippingMessage(), "nonFreeShippingMessage", FreeShippingsObjects.shippingAKHI(), "shippingAKHIWithFreeShip", 3);
	}

	public static void normalProductLessCheckout() throws Exception {
		gettingMessageForDifferentAddresses(FreeShippingsObjects.freeShippingMessage(), "freeShippingMessage", FreeShippingsObjects.shippingAKHI(), "shippingAKHI", 2);
	}

	public static void normalProductMoreCheckout() throws Exception {
		gettingMessageForDifferentAddresses(FreeShippingsObjects.freeShippingMessage(), "freeShippingMessage", FreeShippingsObjects.shippingAKHI(), "shippingAKHI", 2);
	}
	public static void nonFreeShippCheckout() throws Exception {
		gettingMessageForDifferentAddresses(FreeShippingsObjects.nonFreeShippingMessage(), "nonFreeShippingMessage", FreeShippingsObjects.shippingAKHI(), "shippingAKHIWithFreeShip", 3);
	}

}
