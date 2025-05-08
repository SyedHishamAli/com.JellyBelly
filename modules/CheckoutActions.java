package com.modules;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import com.pageObjects.CheckoutObjects;
import com.pageObjects.FlavourpageObjects;
import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.MiniCartObjects;
import com.pageObjects.PLPObjects;
import com.pageObjects.QuickViewObjects;
import com.pageObjects.ShoppingCartObjects;
import com.utility.BrowserUtils;
import com.utility.DriverFactory;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class CheckoutActions {

	public static void CheckoutNavigationForGuestUser() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());

	}


	public static void CheckoutShippingMethodSelection() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);		
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());				
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(2000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));		
			}
		}
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));	
			}
		}
		Thread.sleep(2000);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 15);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		int size=CheckoutObjects.TotalShippingMethods();
		for(int i=0; i<size; i++){
			WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(i));
			Thread.sleep(1000);
			Assert.assertTrue(CheckoutObjects.ShippingMethods().get(i).isSelected());
			String act= CheckoutObjects.ShippingMethodsPrice().get(i).getText();
			WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
			Thread.sleep(2000);

			if(act.equalsIgnoreCase("FREE")){
				Assert.assertEquals(("$0.00"), CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
			}
			else{
				Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				if(CheckoutObjects.Groundshipping().isDisplayed()){
					act="$0.00";
					Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				}
				else{
					Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				}
			}

			BrowserUtils.waitFor(CheckoutObjects.ShippingMethodsEdit(), 10);
			WebdriverUtils.clickAction(CheckoutObjects.ShippingMethodsEdit());
			Thread.sleep(1000);
			break;
		}

	}

	public static void CheckoutCouponApply() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);				
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		Thread.sleep(1000);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ContinueToPaymentInformation());
		WebdriverUtils.clickAction(CheckoutObjects.ContinueToPaymentInformation());
		Thread.sleep(3000);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.couponCodeInputField());
		WebdriverUtils.sendKeys(CheckoutObjects.couponCodeInputField(), pro.getProperty("couponcodeprod"));
		Thread.sleep(1000);
		WebdriverUtils.clickAction(CheckoutObjects.couponCodeApplyButton());
		Thread.sleep(3000);
		WebdriverUtils.swipeUpUntillElement(CheckoutObjects.backToCart());
		Assert.assertEquals(CheckoutObjects.couponCodeRemoveButton().getAttribute("coupon"), pro.getProperty("couponcodeprod"));		   
	}

	public static void CheckoutWithCreditCard() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.showAll(), 10);
		WebdriverUtils.clickAction(PLPObjects.showAll());
		Thread.sleep(2000);
		BrowserUtils.waitFor(QuickViewObjects.Quickview(pro.getProperty("ProductName")), 10);
		PDPActions.disableEasterPopup();
		WebdriverUtils.swipeUpUntillElement(QuickViewObjects.Title());
		WebdriverUtils.swipeDownUntillElement(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
		WebdriverUtils.clickAction(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
		BrowserUtils.waitFor(QuickViewObjects.SeeMoreLink(pro.getProperty("ProductName")), 10);
		WebdriverUtils.clickAction(QuickViewObjects.quickViewAddToCart(pro.getProperty("ProductName")));
		WebdriverUtils.waitUntilValuePresentInElement(GlobalHeaderObjects.cartCount(), "1");
		Assert.assertEquals(GlobalHeaderObjects.cartCount().getText().trim(), "1");
		WebdriverUtils.clickAction(GlobalHeaderObjects.cartCount());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		/*WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
			    WebdriverUtils.selectByVisibleText(CheckoutObjects.cardType(), pro.getProperty("Cardtype"));
			    WebdriverUtils.sendKeys(CheckoutObjects.cardNumber(), pro.getProperty("Cardnumber"));
			    WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
			    WebdriverUtils.selectByIndex(CheckoutObjects.cardExpirationMonth(), 2);
			    WebdriverUtils.selectByVisibleText(CheckoutObjects.cardExpirationYear(), pro.getProperty("Year"));
			    WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
			    WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
			    WebdriverUtils.clickAction(CheckoutObjects.copyBillingToShipping());
			    BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
			    WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
			    BrowserUtils.waitFor(CheckoutObjects.reviewOrderDescription(), 10);
			    Assert.assertTrue(CheckoutObjects.paymentEdit().isDisplayed());
			    Assert.assertTrue(CheckoutObjects.reviewOrderDescription().isDisplayed());*/
	}


	public static void CopyShippingToBilling() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);				
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(6000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		Thread.sleep(2000);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		WebdriverUtils.clickAction(CheckoutObjects.copyBillingToShipping());
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		for(int i=0 ; i < CheckoutObjects.shippingAddressLines().size() ;i++){
			Assert.assertEquals(CheckoutObjects.shippingAddressLines().get(i).getText().trim(), CheckoutObjects.billingAddressLines().get(i).getText().trim(), "AddressLine "+(i+1)+" of shipping address not matching with billing address ");
		}
	}


	public static void CheckoutEditCartFunctionality() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());				
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(2000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));		
			}
		}
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));	
			}
		}
		Thread.sleep(2000);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 15);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		int size=CheckoutObjects.TotalShippingMethods();
		for(int i=0; i<size; i++){
			WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(i));
			Thread.sleep(1000);
			Assert.assertTrue(CheckoutObjects.ShippingMethods().get(i).isSelected());
			String act= CheckoutObjects.ShippingMethodsPrice().get(i).getText();
			WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
			Thread.sleep(2000);

			if(act.equalsIgnoreCase("FREE")){
				Assert.assertEquals(("$0.00"), CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
			}
			else{
				Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				if(CheckoutObjects.Groundshipping().isDisplayed()){
					act="$0.00";
					Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				}
				else{
					Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				}
			}

			BrowserUtils.waitFor(CheckoutObjects.ShippingMethodsEdit(), 10);
			WebdriverUtils.clickAction(CheckoutObjects.ShippingMethodsEdit());
			Thread.sleep(1000);
			break;
		}

		Thread.sleep(2000);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardType(), pro.getProperty("Cardtype"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardNumber(), pro.getProperty("Cardnumber"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
		WebdriverUtils.selectByIndex(CheckoutObjects.cardExpirationMonth(), 2);
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardExpirationYear(), pro.getProperty("Year"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		WebdriverUtils.clickAction(CheckoutObjects.copyBillingToShipping());
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		WebdriverUtils.swipeUpUntillElement(CheckoutObjects.backToCart());
		Assert.assertEquals(CheckoutObjects.productName().getText().trim(), expProductName);
		WebdriverUtils.clickAction(CheckoutObjects.backToCart());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		Assert.assertEquals(ShoppingCartObjects.ProductInformation().getText().trim(), expProductName);


	}




	public static void ElementsInGuestLoginPopup() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(				
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);				
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.showAll(), 10);
		WebdriverUtils.clickAction(PLPObjects.showAll());
		Thread.sleep(2000);
		BrowserUtils.waitFor(QuickViewObjects.Quickview(pro.getProperty("ProductName")), 10);
		PDPActions.disableEasterPopup();
		WebdriverUtils.swipeUpUntillElement(QuickViewObjects.Title());
		WebdriverUtils.swipeDownUntillElement(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
		WebdriverUtils.moveToElementByActions(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
		WebdriverUtils.clickAction(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
		BrowserUtils.waitFor(QuickViewObjects.SeeMoreLink(pro.getProperty("ProductName")), 10);
		WebdriverUtils.clickAction(QuickViewObjects.quickViewAddToCart(pro.getProperty("ProductName")));
		WebdriverUtils.waitUntilValuePresentInElement(GlobalHeaderObjects.cartCount(), "1");
		Assert.assertEquals(GlobalHeaderObjects.cartCount().getText().trim(), "1");
		WebdriverUtils.clickAction(GlobalHeaderObjects.cartCount());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		Thread.sleep(3000);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		Thread.sleep(10000);
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 15);			
	}

	public static void ErrorMessageInGuestEmailField() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), pro.getProperty("InvalidEmailFormat"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		Thread.sleep(500);
		Assert.assertTrue(ShoppingCartObjects.guestEmailError().isDisplayed());
		Assert.assertEquals(ShoppingCartObjects.guestEmailError().getText().trim(), pro.getProperty("EmailErrorMessage"));


	}

	public static void ErrorMessageInEmptyGuestEmailField() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		Thread.sleep(500);
		Assert.assertTrue(ShoppingCartObjects.guestEmailError().isDisplayed());
		Assert.assertEquals(ShoppingCartObjects.guestEmailError().getText().trim(), pro.getProperty("EmailErrorMessage"));


	}

	public static void LoginAndContinueTabElements() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());		
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		BrowserUtils.waitFor(ShoppingCartObjects.emailFieldInLoginPopUp(), 10);
		Assert.assertTrue(ShoppingCartObjects.emailFieldInLoginPopUp().isDisplayed());
		Assert.assertTrue(ShoppingCartObjects.passwordFieldInLoginPopUp().isDisplayed());
		Assert.assertTrue(ShoppingCartObjects.loginNextButton().isDisplayed());
		Assert.assertTrue(ShoppingCartObjects.forgotPasswordLink().isDisplayed());
	}


	public static void LoginWithoutMandatoryCredentialsCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());				
		BrowserUtils.waitFor(ShoppingCartObjects.emailFieldInLoginPopUp(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());
		BrowserUtils.waitFor(ShoppingCartObjects.emptyEmailError(), 10);
		Assert.assertTrue(ShoppingCartObjects.emptyEmailError().isDisplayed()); 
		Assert.assertEquals(ShoppingCartObjects.emptyEmailError().getText().trim(), pro.getProperty("EmailErrorMessage"));

	}

	public static void LoginWithInvalidCredentialsCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		BrowserUtils.waitFor(ShoppingCartObjects.emailFieldInLoginPopUp(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("InvalidEmail"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),"Welcome@2");
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(ShoppingCartObjects.invalidLoginError(), 10);
		Assert.assertTrue(ShoppingCartObjects.invalidLoginError().isDisplayed());
		Assert.assertEquals(ShoppingCartObjects.invalidLoginError().getText().trim(), "Error: Unfortunately, login as "+pro.getProperty("InvalidEmail")+" failed. Please provide your Email Address and Password and try again.");
	}

	public static void LoginWithValidCredentialsCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());

	}


	public static void ForgetPasswordPageNavigation() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.clickAction(ShoppingCartObjects.forgotPasswordLink());		
		BrowserUtils.waitFor(pro.getProperty("ForgotPasswordPageTitle"), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("ForgotPasswordPageTitle"));				
	}


	public static void AddNewAddressInCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());
	}

	public static void SelectSavedAddress() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.clickAction(CheckoutObjects.defaultAddressRadioButton());	
		Thread.sleep(2000);
		Assert.assertTrue(CheckoutObjects.defaultAddressRadioButton().isSelected());
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());				
	}


	public static void EditSavedAddress() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.clickAction(CheckoutObjects.defaultAddressRadioButton());	
		Thread.sleep(2000);
		Assert.assertTrue(CheckoutObjects.defaultAddressRadioButton().isSelected());
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());
		WebdriverUtils.swipeUpUntillElement(CheckoutObjects.shippingAddressEdit());
		WebdriverUtils.clickAction(CheckoutObjects.shippingAddressEdit());
		BrowserUtils.waitFor(CheckoutObjects.enterNewAddressText(), 10);
		Assert.assertTrue(CheckoutObjects.enterNewAddressText().isDisplayed());
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.enterNewAddressTextRadioButton());
		Thread.sleep(1000);
		//	Assert.assertTrue(CheckoutObjects.enterNewAddressTextRadioButton().isSelected());
		Thread.sleep(2000);
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		Thread.sleep(1000);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());
	}




	public static void AddCreditCardFromCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.clickAction(CheckoutObjects.defaultAddressRadioButton());	
		Thread.sleep(2000);
		Assert.assertTrue(CheckoutObjects.defaultAddressRadioButton().isSelected());
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		Thread.sleep(2000);
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardType(), pro.getProperty("Cardtype"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardNumber(), pro.getProperty("Cardnumber"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
		WebdriverUtils.selectByIndex(CheckoutObjects.cardExpirationMonth(), 2);
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardExpirationYear(), pro.getProperty("Year"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
		Thread.sleep(2000);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		Thread.sleep(2000);
		WebdriverUtils.clickElementActions(CheckoutObjects.copyBillingToShipping());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.reviewOrderDescription(), 10);
		Assert.assertTrue(CheckoutObjects.paymentEdit().isDisplayed());
		Assert.assertTrue(CheckoutObjects.reviewOrderDescription().isDisplayed());			
	}

	public static void EditCardForGuestUser() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());			
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardType(), pro.getProperty("Cardtype"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardNumber(), pro.getProperty("Cardnumber"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
		WebdriverUtils.selectByIndex(CheckoutObjects.cardExpirationMonth(), 2);
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardExpirationYear(), pro.getProperty("Year"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
		Thread.sleep(1000);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		Thread.sleep(1000);
		WebdriverUtils.clickElementActions(CheckoutObjects.copyBillingToShipping());
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
		BrowserUtils.waitFor(CheckoutObjects.reviewOrderDescription(), 10);
		Assert.assertTrue(CheckoutObjects.paymentEdit().isDisplayed());
		WebdriverUtils.swipeUpUntillElement(CheckoutObjects.paymentEdit());
		WebdriverUtils.clickAction(CheckoutObjects.paymentEdit());
		Thread.sleep(3000);
		BrowserUtils.waitFor(CheckoutObjects.cardName(), 10);
		Assert.assertEquals(CheckoutObjects.cardName().getAttribute("value"),pro.getProperty("Nameoncard"));
		CheckoutObjects.cardName().clear();
		WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("ChangedNameoncard"));
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
		BrowserUtils.waitFor(CheckoutObjects.reviewOrderDescription(), 10);
		Assert.assertTrue(CheckoutObjects.paymentEdit().isDisplayed());
		WebdriverUtils.swipeUpUntillElement(CheckoutObjects.paymentEdit());
		WebdriverUtils.clickAction(CheckoutObjects.paymentEdit());
		BrowserUtils.waitFor(CheckoutObjects.cardName(), 10);
		Assert.assertEquals(CheckoutObjects.cardName().getAttribute("value"),pro.getProperty("ChangedNameoncard"));
		CheckoutObjects.cardName().clear();
		WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
		BrowserUtils.waitFor(CheckoutObjects.reviewOrderDescription(), 10);
		Assert.assertTrue(CheckoutObjects.paymentEdit().isDisplayed());
		WebdriverUtils.swipeUpUntillElement(CheckoutObjects.paymentEdit());
		WebdriverUtils.clickAction(CheckoutObjects.paymentEdit());
		BrowserUtils.waitFor(CheckoutObjects.cardName(), 10);
		Assert.assertEquals(CheckoutObjects.cardName().getAttribute("value"),pro.getProperty("Nameoncard"));
	}


	public static void ErrorMessageForEmptyCardDetails() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		if(CheckoutObjects.iframeBlocks().size()>0){

			Thread.sleep(1000);
			WebdriverUtils.switchToiframe(CheckoutObjects.iframeName());

			Thread.sleep(1000);
			System.out.println(CheckoutObjects.iframeBackdrop().getText());
			WebdriverUtils.clickAction(CheckoutObjects.iframeBackdrop());
			DriverFactory.getInstance().getDriver().switchTo().defaultContent();
		}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		WebdriverUtils.clickAction(CheckoutObjects.copyBillingToShipping());
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
		BrowserUtils.waitFor(CheckoutObjects.emptyCardTypeError(), 10);
		Assert.assertEquals(CheckoutObjects.emptyCardTypeError().getText().trim(), "Error: Please select your Card Type.");
		Assert.assertEquals(CheckoutObjects.emptyCardNumberError().getText().trim(), "Error: Please enter your card number");
		Assert.assertEquals(CheckoutObjects.emptyCardNameError().getText().trim(), "Error: Please enter the name shown on your card.");
		Assert.assertEquals(CheckoutObjects.emptyCardExpiryError().getText().trim(), "Error: Please enter an expiration date in the future.");
		Assert.assertEquals(CheckoutObjects.emptyCardSecurityError().getText().trim(), "Error: Please enter your card's security code");
		Assert.assertFalse(CheckoutObjects.paymentEdit().isDisplayed());
	}


	public static void CheckoutFromSavedCard() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.clickAction(CheckoutObjects.defaultAddressRadioButton());	
		Thread.sleep(2000);
		Assert.assertTrue(CheckoutObjects.defaultAddressRadioButton().isSelected());
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		Thread.sleep(1500);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		Thread.sleep(1500);
		if(CheckoutObjects.savedCreditCards()!=null) {
			WebdriverUtils.selectByIndex(CheckoutObjects.savedCreditCards(), 1);
			Thread.sleep(1500);
			WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
			Thread.sleep(1500);
			if(CheckoutObjects.iframefirst().isDisplayed()) {
				Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
			}
		}
		else{
			WebdriverUtils.selectByVisibleText(CheckoutObjects.cardType(), pro.getProperty("Cardtype"));
			WebdriverUtils.sendKeys(CheckoutObjects.cardNumber(), pro.getProperty("Cardnumber"));
			WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
			WebdriverUtils.selectByIndex(CheckoutObjects.cardExpirationMonth(), 2);
			WebdriverUtils.selectByVisibleText(CheckoutObjects.cardExpirationYear(), pro.getProperty("Year"));
			WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
			Thread.sleep(1000);
		}
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		WebdriverUtils.clickElementActions(CheckoutObjects.copyBillingToShipping());
		Thread.sleep(1500);
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		Thread.sleep(1500);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
		Thread.sleep(1500);
		BrowserUtils.waitFor(CheckoutObjects.reviewOrderDescription(), 10);
		Assert.assertTrue(CheckoutObjects.paymentEdit().isDisplayed());
		Assert.assertTrue(CheckoutObjects.reviewOrderDescription().isDisplayed());

	}

	public static void ErrorMessageForEmptySavedCardCCV() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.clickAction(CheckoutObjects.defaultAddressRadioButton());	
		Thread.sleep(2000);
		Assert.assertTrue(CheckoutObjects.defaultAddressRadioButton().isSelected());
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		Thread.sleep(2000);
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		Thread.sleep(2000);
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		if(CheckoutObjects.savedCreditCards()!=null) {
			WebdriverUtils.selectByIndex(CheckoutObjects.savedCreditCards(), 1);
			Thread.sleep(1500);
			WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
			Thread.sleep(1500);
			if(CheckoutObjects.iframefirst().isDisplayed()) {
				Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
			}
		}
		else{
			WebdriverUtils.selectByVisibleText(CheckoutObjects.cardType(), pro.getProperty("Cardtype"));
			WebdriverUtils.sendKeys(CheckoutObjects.cardNumber(), pro.getProperty("Cardnumber"));
			WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
			WebdriverUtils.selectByIndex(CheckoutObjects.cardExpirationMonth(), 2);
			WebdriverUtils.selectByVisibleText(CheckoutObjects.cardExpirationYear(), pro.getProperty("Year"));
			Thread.sleep(1000);
		}
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		Thread.sleep(2000);
		WebdriverUtils.clickElementActions(CheckoutObjects.copyBillingToShipping());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.nextReviewButton());
		Assert.assertEquals(CheckoutObjects.emptyCardSecurityError().getText().trim(), "Error: Please enter your card's security code");
		Assert.assertFalse(CheckoutObjects.paymentEdit().isDisplayed());	
	}

	public static void VerifyPaypalCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.clickAction(CheckoutObjects.defaultAddressRadioButton());	
		Thread.sleep(2000);
		Assert.assertTrue(CheckoutObjects.defaultAddressRadioButton().isSelected());
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		Assert.assertTrue(CheckoutObjects.shippingAddressEdit().isDisplayed());
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		Thread.sleep(2000);
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		Thread.sleep(2000);
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		WebdriverUtils.clickAction(CheckoutObjects.paypalTab());
		Thread.sleep(2000);
		WebdriverUtils.clickAction(CheckoutObjects.nextPaypalButton());
		Thread.sleep(2000);
		WebdriverUtils.switchBetweenWindows();
		BrowserUtils.waitFor(pro.getProperty("PaypalPageTitle"),10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(),pro.getProperty("PaypalPageTitle"));		
	}

	public static void LoginFromPaymentSection() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		//				if(CheckoutObjects.iframeBlocks().size()>0){
		//				
		//					Thread.sleep(1000);
		//					WebdriverUtils.switchToiframe(CheckoutObjects.iframeName());
		//					
		//					Thread.sleep(1000);
		//					System.out.println(CheckoutObjects.iframeBackdrop().getText());
		//					WebdriverUtils.clickAction(CheckoutObjects.iframeBackdrop());
		//					DriverFactory.getInstance().getDriver().switchTo().defaultContent();
		//				}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		Thread.sleep(2000);
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		WebdriverUtils.clickAction(CheckoutObjects.loginLinkInPaymentSection());
		Thread.sleep(2000);
		BrowserUtils.waitFor(ShoppingCartObjects.paymentLoginPopUp(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInPaymentLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInPaymentLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.paymentLoginNextButton());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.savedCreditCards(), 10);
		Assert.assertTrue(CheckoutObjects.ShippingMethodLabel().isDisplayed());	    
	}

	public static void GiftMessageInCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.defaultShippingAddress(), 20);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		WebdriverUtils.sendKeys(CheckoutObjects.giftMessageTextField(), pro.getProperty("GiftMessage"));
		Thread.sleep(2000);
		Assert.assertEquals(CheckoutObjects.giftMessageTextField().getAttribute("value").trim(),pro.getProperty("GiftMessage"));
		Assert.assertEquals(CheckoutObjects.giftDisplayTextField().getText().trim(),pro.getProperty("GiftMessage"));
	}

	public static void ModifyCartCheckout() throws IOException, Exception{
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));

			}
		}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 10);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(0));
		WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
		Thread.sleep(2000);
		BrowserUtils.waitFor(CheckoutObjects.paymentSection(), 10);
		Thread.sleep(3000);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.cardType());
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardType(), pro.getProperty("Cardtype"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardNumber(), pro.getProperty("Cardnumber"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardName(), pro.getProperty("Nameoncard"));
		WebdriverUtils.selectByIndex(CheckoutObjects.cardExpirationMonth(), 2);
		WebdriverUtils.selectByVisibleText(CheckoutObjects.cardExpirationYear(), pro.getProperty("Year"));
		WebdriverUtils.sendKeys(CheckoutObjects.cardCVV(), pro.getProperty("CVV"));
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.copyBillingToShipping());
		WebdriverUtils.clickElementActions(CheckoutObjects.copyBillingToShipping());
		BrowserUtils.waitFor(CheckoutObjects.editBilingInfo(), 10);
		WebdriverUtils.swipeUpUntillElement(CheckoutObjects.backToCart());
		//			    Assert.assertEquals(CheckoutObjects.productPrice().getText().replace("$", "").trim(), Price);
		Assert.assertEquals(CheckoutObjects.productName().getText().trim(), expProductName);
		WebdriverUtils.clickAction(CheckoutObjects.backToCart());
		Thread.sleep(2000);
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		// Assert.assertEquals(Double.parseDouble(ShoppingCartObjects.ProductPrice(pro.getProperty("ProductName")).getText().replace("$", "").trim()), Price);
		Assert.assertEquals(ShoppingCartObjects.ProductInformation().getText().trim(), expProductName);
		ShoppingCartObjects.Quantity().clear();
		WebdriverUtils.sendKeys(ShoppingCartObjects.Quantity(), "2");
		WebdriverUtils.sendKeys(ShoppingCartObjects.Quantity(), Keys.TAB);
		Thread.sleep(12000);
		// Assert.assertEquals(Double.parseDouble(ShoppingCartObjects.ProductPrice(pro.getProperty("ProductName")).getText().replace("$", "").trim()), Price);
		//			    Assert.assertEquals(Double.parseDouble(ShoppingCartObjects.ItemTotal().getText().replace("$", "").trim()), Price*2);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 15);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		Assert.assertEquals(CheckoutObjects.productName().getText().trim(), expProductName);
		//			    Assert.assertEquals(Double.parseDouble(CheckoutObjects.productPrice().getText().replace("$", "").trim()), Price*2);
	}

	public static void ContinueShopButton() throws Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.loginContinueTab());		
		WebdriverUtils.sendKeys(ShoppingCartObjects.emailFieldInLoginPopUp(),pro.getProperty("Email"));
		WebdriverUtils.sendKeys(ShoppingCartObjects.passwordFieldInLoginPopUp(),pro.getProperty("Password"));
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.loginNextButton());	
		BrowserUtils.waitFor(CheckoutObjects.ContinueShoppingButton(), 10);
		assertTrue(CheckoutObjects.ContinueShoppingButton().isDisplayed());
		WebdriverUtils.clickAction(CheckoutObjects.ContinueShoppingButton());
		Thread.sleep(1000);
		assertEquals(WebdriverUtils.currentURL(), pro.getProperty("testURL"));
	}

	public static void ErrorMessageShipping() throws Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		String expProductName = PLPObjects.PLPFirstProductNameInStock().getText().toLowerCase();
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);				
		PDPActions.disableEasterPopup();
		assertEquals(FlavourpageObjects.quantityinpopup().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(5000);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));							
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), expProductName);
		WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		WebdriverUtils.clickAction(ShoppingCartObjects.checkoutButtonTop());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);				
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());			
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.termsAndConditionsCheck());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());				
		Thread.sleep(2000);
		if(CheckoutObjects.iframefirst().isDisplayed()) {
			Thread.sleep(1000);
			WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
		}
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(1000);
		assertTrue(CheckoutObjects.ErrorMessageFirstName().isDisplayed());
		assertTrue(CheckoutObjects.ErrorMessageLastName().isDisplayed());
		assertTrue(CheckoutObjects.ErrorMessageAddress1().isDisplayed());
		assertTrue(CheckoutObjects.ErrorMessageCity().isDisplayed());
		assertTrue(CheckoutObjects.ErrorMessageState().isDisplayed());
		assertTrue(CheckoutObjects.ErrorMessageZip().isDisplayed());
		assertTrue(CheckoutObjects.ErrorMessagePhone().isDisplayed());
		assertTrue(CheckoutObjects.ErrorMessageAddressType().isDisplayed());

	}

	public static void ShippingPriceChangeMethod() throws Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);		
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());				
		WebdriverUtils.sendKeys(CheckoutObjects.companyName(), pro.getProperty("CompanyName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingFirstName(), pro.getProperty("ShippingFirstName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingLastName(), pro.getProperty("ShippingLastName"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineFirst(), pro.getProperty("ShippingAddressFirst"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressLineSecond(), pro.getProperty("ShippingAddressSecond"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressCity(), pro.getProperty("ShippingCity"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressState(), pro.getProperty("ShippingState"));
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(2000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));		
			}
		}
		/*if(CheckoutObjects.iframefirst().isDisplayed()) {
					Thread.sleep(1000);
					WebdriverUtils.clickAction(CheckoutObjects.iframefirst());
				}*/
		WebdriverUtils.sendKeys(CheckoutObjects.shippingAddressZipCode(), pro.getProperty("ShippingZipcode"));
		WebdriverUtils.sendKeys(CheckoutObjects.shippingPhoneNumber(), pro.getProperty("ShippingPhoneNumber"));
		WebdriverUtils.selectByValue(CheckoutObjects.shippingAddressType(), pro.getProperty("ShippingAddresstype"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
					Thread.sleep(1000);
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));	
			}
		}
		Thread.sleep(2000);
		WebdriverUtils.clickActionWithSwipe(CheckoutObjects.continueShippingMethods());
		Thread.sleep(4000);
		BrowserUtils.waitFor(CheckoutObjects.shippingAddressEdit(), 15);
		WebdriverUtils.swipeDownUntillElement(CheckoutObjects.ShippingMethodLabel());
		int size=CheckoutObjects.TotalShippingMethods();
		for(int i=0; i<size; i++){
			WebdriverUtils.clickAction(CheckoutObjects.ShippingMethods().get(i));
			Thread.sleep(1000);
			Assert.assertTrue(CheckoutObjects.ShippingMethods().get(i).isSelected());
			String act= CheckoutObjects.ShippingMethodsPrice().get(i).getText();
			WebdriverUtils.clickAction(CheckoutObjects.continueToPaymentOptions());
			Thread.sleep(2000);

			if(act.equalsIgnoreCase("FREE")){
				Assert.assertEquals(("$0.00"), CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
			}
			else{
				Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				if(CheckoutObjects.Groundshipping().isDisplayed()){
					act="$0.00";
					Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				}
				else{
					Assert.assertEquals(act, CheckoutObjects.ShippingMethodsPriceInOrderSummary().getText());
				}
			}

			BrowserUtils.waitFor(CheckoutObjects.ShippingMethodsEdit(), 10);
			WebdriverUtils.clickAction(CheckoutObjects.ShippingMethodsEdit());
			Thread.sleep(1000);					
		}

	}
}
