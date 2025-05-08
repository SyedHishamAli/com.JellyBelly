package com.modules;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Properties;

import org.openqa.selenium.JavascriptException;
import org.testng.Assert;

import com.pageObjects.ADAObjects;
import com.pageObjects.CheckoutObjects;
import com.pageObjects.FlavourpageObjects;
import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.LoginObjects;
import com.pageObjects.MiniCartObjects;
import com.pageObjects.PLPObjects;
import com.pageObjects.ShoppingCartObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;


public class MiniCartActions {
	
	public static int count=0;
	public static void EmptyCartNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(PLPObjects.CartIcon(), 30);
		WebdriverUtils.HoverOnElement(PLPObjects.CartIcon());
		Assert.assertTrue(PLPObjects.EmptyCart().isDisplayed());
		
	}
	public static void MinicartNameInfo() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickButtonThroughJS(HomePageObjects.PLPLINK(), "PLPLINK");
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductNameInStock(), "First product name in stock");
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 18);
		String PLPProductName=PLPObjects.PLPFirstProductNameInStock().getText().trim();
		String PLPPrice=PLPObjects.PriceForFirstInstockProduct().getText().trim();
		//String PLPQuantity=PLPObjects.QuantityForFirstInstockProduct().getText();
		Thread.sleep(15000);
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductATC(), "First product ATC");
		WebdriverUtils.clickButtonThroughJS(PLPObjects.PLPFirstProductATC(), "PLPFirstProductATC");
		Thread.sleep(2000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);
		//String t=ADAObjects.minicarth5().getTagName();
		//Assert.assertTrue(t.contains("h1"));
		
	}
	public static void MinicartNameInfo1() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductNameInStock(), "First product name in stock");
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 18);
		String PLPProductName=PLPObjects.PLPFirstProductNameInStock().getText().trim();
		String PLPPrice=PLPObjects.PriceForFirstInstockProduct().getText().trim();
		//String PLPQuantity=PLPObjects.QuantityForFirstInstockProduct().getText();
		Thread.sleep(15000);
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductATC(), "First product ATC");
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);
		//String t=ADAObjects.minicarth5().getTagName();
		//Assert.assertTrue(t.contains("h1"));
		
	}
	public static void MinicartProductInfo() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		try{
			WebdriverUtils.clickAction(HomePageObjects.closeIcon());
		}
		catch (Exception e) {
			System.out.println("bubbleWrapperDiscount is not displayed");
		}
		WebdriverUtils.fluentWait(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.HoverOnElement(HomePageObjects.MegaMenu());
		Thread.sleep(8000);
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		Thread.sleep(15000);
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductNameInStock(), "First product name in stock");
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 18);
		String PLPProductName=PLPObjects.PLPFirstProductNameInStock().getText().trim().toLowerCase();
		System.out.println("Product name is" +PLPProductName);
		String PLPPrice=PLPObjects.PriceForFirstInstockProduct().getText().trim();
		System.out.println("Price name is" +PLPPrice);
	//	String PLPQuantity=PLPObjects.QuantityForFirstInstockProduct().getText();
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductATC(), "First product ATC");
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(10000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 30);	
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(4000);
		PDPActions.disableEasterPopup();
		BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
		Thread.sleep(1000);
		WebdriverUtils.HoverOnElement(PLPObjects.CartIcon());
		Thread.sleep(8000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		WebdriverUtils.moveToElement(PLPObjects.CartProduct());
		WebdriverUtils.switchToiframe(PLPObjects.CartProduct());
		try {
			Assert.assertEquals(PLPObjects.CartProduct().getText().toLowerCase(), PLPProductName.toLowerCase());
			
		}
		catch (Exception e) {
			System.out.println("Product is not available");
		}

		try {
		
		Assert.assertTrue(MiniCartObjects.MinicartPrice().getText().trim().contains(PLPPrice));
		}
		catch (Exception e) {
			System.out.println("Price is not available");
		}
	}
		
	
	public static void MinicartProductInfo1() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
				Properties pro = new Properties();
				pro.load(fs);
				WebdriverUtils.goToURL(Environments.getURL());
				BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
				WebdriverUtils.HoverOnElement(HomePageObjects.MegaMenu());
				BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
//				WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
				BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
				WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
				BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
				LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductNameInStock(), "First product name in stock");
				BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 18);
				try {
					if(FlavourpageObjects.closeButton1().isDisplayed()) 
					{
						WebdriverUtils.clickAction(FlavourpageObjects.closeButton1());
						Thread.sleep(1000);
						}
					}
					catch (Exception e) {
						System.out.println("Pop-up not displayed");
					}
				Thread.sleep(2000);
				WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
				BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);
				try {
					if(FlavourpageObjects.closeButton().isDisplayed()) {
					WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
					}
				}
				catch (Exception e) {
					System.out.println("Pop-up not displayed");
				}
				PDPActions.disableEasterPopup();
				WebdriverUtils.HoverOnElement(PLPObjects.CartIcon());
				Thread.sleep(5000);
				WebdriverUtils.moveToElement(PLPObjects.miniCartContainer());
				BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
				Thread.sleep(1000);
				
	}
	public static void MultipleQuantityInMinicart() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		LoginActions.waitAndProceedWhenItemdisplayed(FlavourpageObjects.productnameinpopup(), "Product name in popup");
		Double PLPPrice1=Double.parseDouble(PLPObjects.PriceForFirstInstockProduct().getText().replace("$", "").trim());
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);
		LoginActions.waitAndProceedWhenItemdisplayed(FlavourpageObjects.productnameinpopup(), "Product name in popup");
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
		Thread.sleep(3000);		
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Double PLPPrice2=Double.parseDouble(PLPObjects.PriceForSecondInstockProduct().getText().replace("$", "").trim());
		WebdriverUtils.clickAction(PLPObjects.PLPSecondProductInStockATC());
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Double Productprice = PLPPrice1+PLPPrice2;
		System.out.println("Total product price is "+Productprice);
		WebdriverUtils.swipeUpUntillElement(GlobalHeaderObjects.jellyBellyLogo());
		WebdriverUtils.refreshPage();
		WebdriverUtils.waitForElementToBeClickable(PLPObjects.CartCount(), "Minicart");
		WebdriverUtils.HoverOnElement(PLPObjects.CartIcon());
		Thread.sleep(5000);
		WebdriverUtils.switchToiframe(PLPObjects.Price1inminicart());
		Double MiniPrice1=Double.parseDouble(PLPObjects.Price1inminicart().getText().replace("$", "").trim());
		Double MiniPrice2=Double.parseDouble(PLPObjects.Price2inminicart().getText().replace("$", "").trim());
		Double productpricefinal =MiniPrice1+MiniPrice2;
		System.out.println("Product price in mincart"+productpricefinal);
		Assert.assertEquals(Productprice, productpricefinal);
		Assert.assertEquals(PLPObjects.CartCount().getText(), "2");
	}
	
	public static void NavToCartPage() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		WebdriverUtils.maximizeWindow();
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductNameInStock(), "First product name in stock");
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);
		PDPActions.disableEasterPopup();
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		Thread.sleep(2000);
		WebdriverUtils.goToURL("https://www.jellybelly.com/cart");
		Thread.sleep(2000);
		BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
		Assert.assertEquals(ShoppingCartObjects.shoppingCartHeader().getText(), pro.getProperty("ShoppingCartText"));
		
	}
	public static void NavigationToCartPage1() throws IOException, Exception {
		
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
				Properties pro = new Properties();
				pro.load(fs);
				WebdriverUtils.goToURL(Environments.getURL());
				BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
				WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
//				BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
//				WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
				BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
				WebdriverUtils.clickButtonThroughJS(HomePageObjects.PLPLINK(), "PLPLINK");
				BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
				BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
				WebdriverUtils.clickButtonThroughJS(PLPObjects.PLPFirstProductATC(), "PLPFirstProductATC");
				Thread.sleep(4000);
				BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
				WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.closeButton(), "closeButton");
				WebdriverUtils.clickButtonThroughJS(PLPObjects.PLPSecondProductInStockATC(), "PLPSecondProductATC");
				Thread.sleep(4000);
				BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
				WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.closeButton(), "closeButton");
				BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
				Thread.sleep(5000);
				WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
				Thread.sleep(5000);
				BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
				WebdriverUtils.switchToiframe(MiniCartObjects.ViewCartButton());
				WebdriverUtils.moveToElement(MiniCartObjects.ViewCartButton());
				try {
				    // Attempt to click on the element using JavaScript
				    WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
				} catch (Exception e) {
				    System.out.println(" exception occurred: " + e.getMessage());
				    // Handle the exception or add additional logging
				}
				Thread.sleep(8000);
				BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
				try {
					String cart = ShoppingCartObjects.shoppingCartHeader().getText().toLowerCase();
					System.out.println("Cart text "+cart);
					if(cart.contains(pro.getProperty("ShoppingCartText1").toLowerCase()))
					{
						Assert.assertEquals(ShoppingCartObjects.shoppingCartHeader().getText().toLowerCase(), pro.getProperty("ShoppingCartText1").toLowerCase());	
					}
					else {
						Assert.assertEquals(ShoppingCartObjects.shoppingCartHeader().getText().toLowerCase(), pro.getProperty("ShoppingCartText2").toLowerCase());
					}
													
				}
				catch (Exception e) 
				{
					
					System.out.println("Shopping cart page not displayed");
				}
		
	}
	public static void NavigationToCartPage() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		WebdriverUtils.maximizeWindow();
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		LoginActions.waitAndProceedWhenItemdisplayed(PLPObjects.PLPFirstProductNameInStock(), "First product name in stock");
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
		try {
			WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
			BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
			Thread.sleep(1000);
			WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
			Thread.sleep(1000);
			BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
			WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
			BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
			
			String url=WebdriverUtils.currentURL();
			if(url.contains("cart")) {
				System.out.println("Navigated to cart page");
				Assert.assertEquals(ShoppingCartObjects.shoppingCartHeader().getText(), pro.getProperty("ShoppingCartText"));
			}
			else {
				WebdriverUtils.swipeUpUntillElement(GlobalHeaderObjects.jellyBellyLogo());
				WebdriverUtils.refreshPage();
				WebdriverUtils.waitForElementToBeClickable(PLPObjects.CartIcon(), "Cart Icon");
				WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
				Thread.sleep(1000);
				BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
				WebdriverUtils.clickAction(MiniCartObjects.ViewCartButton());
				BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 10);
				Assert.assertEquals(ShoppingCartObjects.shoppingCartHeader().getText(), pro.getProperty("ShoppingCartText"));
			}
		}
		catch(Exception e) {
		WebdriverUtils.refreshPage();
		WebdriverUtils.clickAction(PLPObjects.CartCount());
		System.out.println(e);
		}
		
	}
	
	public static void NavigationToCheckoutPage() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		try {
			BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
			Thread.sleep(1000);
			WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
			Thread.sleep(1000);
			BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
			WebdriverUtils.clickAction(MiniCartObjects.CheckoutButton());
			String url=WebdriverUtils.currentURL();
			if(url.contains("Checkout")) {
				System.out.println("Navigated to Checkout page");
			}
			else {
				WebdriverUtils.swipeUpUntillElement(GlobalHeaderObjects.jellyBellyLogo());
				WebdriverUtils.refreshPage();
				WebdriverUtils.waitForElementToBeClickable(PLPObjects.CartIcon(), "Cart Icon");
				WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
				Thread.sleep(1000);
				BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
				WebdriverUtils.clickAction(MiniCartObjects.CheckoutButton());
			}
		}
		catch(Exception e) {
			WebdriverUtils.refreshPage();
			WebdriverUtils.clickAction(PLPObjects.CartCount());
			}
		
		//WebdriverUtils.clickButtonThroughJS(MiniCartObjects.CheckoutButton(),"click");
		Thread.sleep(8000);
		BrowserUtils.waitFor(MiniCartObjects.CheckoutTitle(), 15);
		BrowserUtils.waitFor(ShoppingCartObjects.emailPopUP(), 10);
		WebdriverUtils.sendKeys(ShoppingCartObjects.guestEmail(), WebdriverUtils.generateRandomEmail());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters());
		WebdriverUtils.clickAction(ShoppingCartObjects.checkBoxForNewsletters1());
		WebdriverUtils.clickAction(ShoppingCartObjects.nextButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		Assert.assertEquals(MiniCartObjects.CheckoutTitle().getText(), pro.getProperty("CheckoutTitle"));
		
	}
	public static void NavigationToCheckoutPage1() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		//WebdriverUtils.maximizeWindow();
		//PDPActions.disableEasterPopup();
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickButtonThroughJS(HomePageObjects.PLPLINK(), "PLPLINK");
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.clickButtonThroughJS(PLPObjects.PLPFirstProductATC(), "PLPFirstProductATC");
		Thread.sleep(2000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
		WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.closeButton(), "closeButton");
		BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
		Thread.sleep(5000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(5000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		WebdriverUtils.clickButtonThroughJS(MiniCartObjects.CheckoutButton1(),"click");
		Thread.sleep(5000);
		BrowserUtils.waitFor(MiniCartObjects.CheckoutTitle(), 10);
		Assert.assertTrue(MiniCartObjects.CheckoutTitle().isDisplayed());
		Assert.assertEquals(MiniCartObjects.CheckoutTitle().getText().toLowerCase(), pro.getProperty("CheckoutTitle").toLowerCase());
	}
	
	public static void NavigationToCartByProceedToCheckout() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
				Properties pro = new Properties();
				pro.load(fs);
				WebdriverUtils.goToURL(Environments.getURL());
				BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
				WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
				BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
				WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
				BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
				WebdriverUtils.clickButtonThroughJS(HomePageObjects.PLPLINK(), "PLPLINK");
				BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
				BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
				WebdriverUtils.clickButtonThroughJS(PLPObjects.PLPFirstProductATC(), "PLPFirstProductATC");
				Thread.sleep(2000);
				BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
				WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.closeButton(), "closeButton");
				WebdriverUtils.clickButtonThroughJS(PLPObjects.PLPSecondProductInStockATC(), "PLPSecondProductATC");
				Thread.sleep(2000);
				BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
				WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.closeButton(), "closeButton");
				BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
				Thread.sleep(5000);
				WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
				Thread.sleep(5000);
				BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
				WebdriverUtils.clickButtonThroughJS(MiniCartObjects.CheckoutButton1(),"click");
				Thread.sleep(2000);
				BrowserUtils.waitFor(MiniCartObjects.CheckoutTitle(), 10);
				Assert.assertTrue(MiniCartObjects.CheckoutTitle().isDisplayed());
				Assert.assertEquals(MiniCartObjects.CheckoutTitle().getText().toLowerCase(), pro.getProperty("CheckoutTitle").toLowerCase());
				
	}
	public static void HeatSensitiveToCheckout() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		PDPActions.disableEasterPopup();
		WebdriverUtils.goToURL("https://www.jellybelly.com/heat-sensitive/c/365");
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		WebdriverUtils.clickAction(MiniCartObjects.CheckoutButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
	}
	
	public static void NavigationToCheckoutPageHeatSensitive() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		BrowserUtils.waitFor(PLPObjects.PLPFirstProductNameInStock(), 10);
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductATC());
		Thread.sleep(2000);
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);	
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		WebdriverUtils.clickAction(MiniCartObjects.CheckoutButton());
		BrowserUtils.waitFor(CheckoutObjects.CheckoutPageHeader(), 10);
		Thread.sleep(3000);
		Assert.assertTrue(CheckoutObjects.CheckoutPageHeader().isDisplayed());
		Assert.assertEquals(MiniCartObjects.CheckoutTitle().getText(), pro.getProperty("CheckoutTitle"));
	}
	
	public static void NoProductsTextDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(PLPObjects.CartIcon(), 30);
		WebdriverUtils.HoverOnElement(PLPObjects.CartIcon());
		Assert.assertEquals(PLPObjects.EmptyCart().getText().trim(), "No products in Cart");
	}
	
	public static void VerfiySubtotal() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickButtonThroughJS(PLPObjects.MenuLink(pro.getProperty("CategoryName")),"Category");
		//BrowserUtils.waitFor(PLPObjects.showAll(), 10);
//		WebdriverUtils.clickAction(PLPObjects.showAll());
//		Thread.sleep(2000);
//		BrowserUtils.waitFor(QuickViewObjects.Quickview(pro.getProperty("ProductName")), 10);
//		WebdriverUtils.swipeUpUntillElement(QuickViewObjects.Title());
//		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductNameInStock());
		WebdriverUtils.swipeDownUntillElement(PLPObjects.PLPFirstProductNameInStock());
		Double PLPPrice1=Double.parseDouble(PLPObjects.PriceForFirstInstockProduct().getText().replace("$", "").trim());
		Double PLPPrice2=Double.parseDouble(PLPObjects.PriceForSecondInstockProduct().getText().replace("$", "").trim());
		WebdriverUtils.clickAction(PLPObjects.PLPFirstProductInStockATC());
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);			
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		Thread.sleep(2000);
		PDPActions.disableEasterPopup();
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		BrowserUtils.waitFor(PLPObjects.PLPSecondProductInStockATC(), 10);
		WebdriverUtils.clickAction(PLPObjects.PLPSecondProductInStockATC());
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);			
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "Item Added to Cart!");
		PDPActions.disableEasterPopup();
		WebdriverUtils.clickAction(FlavourpageObjects.closeButton());
		BrowserUtils.waitFor(PLPObjects.CartIcon(), 10);
		Thread.sleep(1000);
		WebdriverUtils.moveToElementByActions(PLPObjects.CartIcon());
		Thread.sleep(1000);
		BrowserUtils.waitFor(PLPObjects.CartProduct(), 10);
		BrowserUtils.waitFor(MiniCartObjects.EstimatedTotal(), 10);
		System.out.println(MiniCartObjects.EstimatedTotal().getText().trim());
		String trim=MiniCartObjects.EstimatedTotal().getText().replace("Estimated Total:", "").replace("$", "").trim();
		System.out.println(MiniCartObjects.EstimatedTotal().getText().replace("Estimated Total:", "").replace("$", "").trim());			
		Thread.sleep(5000);
	    WebdriverUtils.moveToElementByActions(PLPObjects.CartCount());
		BrowserUtils.waitFor(MiniCartObjects.EstimatedTotal(), 30);
		DecimalFormat df2 = new DecimalFormat("#.##");
		String SubTotal=df2.format(PLPPrice1+PLPPrice2);
		System.out.println(SubTotal);
		Double Total=Double.parseDouble(MiniCartObjects.EstimatedTotal().getText().replace("Estimated Total:", "").replace("$", "").trim());
		String Total1=df2.format(Total);
		System.out.println(Total1);
		Assert.assertEquals(Total1, SubTotal);
	}
	
}	

