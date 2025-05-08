package com.modules;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.pageObjects.FlavourpageObjects;
import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.LoginObjects;
import com.pageObjects.MyAccountObjects;
import com.pageObjects.MyWislistObjects;
import com.pageObjects.PLPObjects;
import com.pageObjects.QuickViewObjects;
import com.pageObjects.ShoppingCartObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class MyWishlistActions {
	
	public static void wishlistAddToCart() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
		Thread.sleep(2000);
		if(!GlobalHeaderObjects.cartCount().getText().trim().equals("0")){
			WebdriverUtils.clickAction(GlobalHeaderObjects.cartCount());
			BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 20);
			for(int i=0 ; i<MyWislistObjects.removeItems().size() ; i++){
				WebdriverUtils.clickAction(MyWislistObjects.removeItems().get(0));
				Thread.sleep(2000);
			}
		}
		Thread.sleep(5000);
		Assert.assertEquals(GlobalHeaderObjects.cartCount().getText().trim(), "0");
		BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.clickAction(MyAccountObjects.wishlistLink());
		BrowserUtils.waitFor(MyAccountObjects.wishlistHeader(), 10);
		if(MyAccountObjects.wishlistRemoveAllSize()>0){
		WebdriverUtils.clickAction(MyAccountObjects.wishlistRemoveAll());
		BrowserUtils.waitFor(MyAccountObjects.conatinerPopUp(), 10);
		WebdriverUtils.clickAction(MyAccountObjects.yesButtonInPopUp());
		}
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Brand());
		Thread.sleep(2000);
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		WebdriverUtils.swipeDownUntillElement(FlavourpageObjects.WishlistButton());
		String Productcode = FlavourpageObjects.WishlistButton().getAttribute("data-mz-prdcode");
		System.out.println("Productcode before is "+Productcode);
		WebdriverUtils.clickAction(FlavourpageObjects.WishlistButton());
		WebdriverUtils.waitUntilValuePresentInElement(FlavourpageObjects.productcode(Productcode), "ADDED TO WISHLIST");
		WebdriverUtils.moveToElement(FlavourpageObjects.productcode(Productcode));
		String ProductcodeActual = FlavourpageObjects.productcode(Productcode).getAttribute("data-mz-prdcode");
		String Text = FlavourpageObjects.productcode(Productcode).getText();
		System.out.println("Productcode after is "+ProductcodeActual);
		assertEquals(ProductcodeActual, Productcode);
		assertEquals(Text.toUpperCase(), "ADDED TO WISHLIST");
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.clickAction(MyAccountObjects.wishlistLink());
		BrowserUtils.waitFor(MyAccountObjects.wishlistHeader(), 10);
		Thread.sleep(2000);
		WebdriverUtils.clickAction(MyWislistObjects.addToCartButton());
		Thread.sleep(2000);
		Assert.assertEquals(GlobalHeaderObjects.cartCount().getText().trim(), "1");
		
	}

	
	
	public static void WishlistNoProducts() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(LoginObjects.LogInLink(), 10);
		WebdriverUtils.clickAction(LoginObjects.LogInLink());
		BrowserUtils.waitFor(LoginObjects.EmailField(), 10);
		WebdriverUtils.sendKeys(LoginObjects.EmailField(), pro.getProperty("Email"));
		WebdriverUtils.sendKeys(LoginObjects.PasswordField(), pro.getProperty("Password"));
		WebdriverUtils.clickAction(LoginObjects.LogInButton());
		BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
		if(!GlobalHeaderObjects.cartCount().getText().trim().equals("0")){
			WebdriverUtils.clickAction(GlobalHeaderObjects.cartCount());
			BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 20);
			for(int i=0 ; i<MyWislistObjects.removeItems().size() ; i++){
				WebdriverUtils.clickAction(MyWislistObjects.removeItems().get(0));
				Thread.sleep(2000);
			}
			
		}
		Assert.assertEquals(GlobalHeaderObjects.cartCount().getText().trim(), "0");
		BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
		WebdriverUtils.clickAction(MyAccountObjects.myAccountLink());
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.clickAction(MyAccountObjects.wishlistLink());
		BrowserUtils.waitFor(MyAccountObjects.wishlistHeader(), 10);
		if(MyAccountObjects.wishlistRemoveAllSize()>0){
		WebdriverUtils.clickAction(MyAccountObjects.wishlistRemoveAll());
		BrowserUtils.waitFor(MyAccountObjects.conatinerPopUp(), 10);
		WebdriverUtils.clickAction(MyAccountObjects.yesButtonInPopUp());
		}
		BrowserUtils.waitFor(MyWislistObjects.emptyWishlist(), 10);
		Assert.assertEquals(MyWislistObjects.emptyWishlist().getText().trim(), pro.getProperty("emptyText"));
	}
	public static void WishlistRemoveButton() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
				Properties pro = new Properties();
				pro.load(fs);
				WebdriverUtils.goToURL(Environments.getURL());
				BrowserUtils.waitFor(LoginObjects.LogInLink(), 10);
				WebdriverUtils.clickAction(LoginObjects.LogInLink());
				BrowserUtils.waitFor(LoginObjects.EmailField(), 10);
				WebdriverUtils.sendKeys(LoginObjects.EmailField(), pro.getProperty("Email"));
				WebdriverUtils.sendKeys(LoginObjects.PasswordField(), pro.getProperty("Password"));
				WebdriverUtils.clickAction(LoginObjects.LogInButton());
				BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
				if(!GlobalHeaderObjects.cartCount().getText().trim().equals("0")){
					WebdriverUtils.clickAction(GlobalHeaderObjects.cartCount());
					BrowserUtils.waitFor(ShoppingCartObjects.shoppingCartHeader(), 20);
					for(int i=0 ; i<MyWislistObjects.removeItems().size() ; i++){
						WebdriverUtils.clickAction(MyWislistObjects.removeItems().get(0));
						Thread.sleep(2000);
					}
				}
				Thread.sleep(2000);
				Assert.assertEquals(GlobalHeaderObjects.cartCount().getText().trim(), "0");
				BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
				WebdriverUtils.clickAction(MyAccountObjects.myAccountLink());
				BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
				WebdriverUtils.clickAction(MyAccountObjects.wishlistLink());
				BrowserUtils.waitFor(MyAccountObjects.wishlistHeader(), 10);
				if(MyAccountObjects.wishlistRemoveAllSize()>0){
				WebdriverUtils.clickAction(MyAccountObjects.wishlistRemoveAll());
				BrowserUtils.waitFor(MyAccountObjects.conatinerPopUp(), 10);
				WebdriverUtils.clickAction(MyAccountObjects.yesButtonInPopUp());
				}
				BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
				WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
				BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
				WebdriverUtils.clickAction(PLPObjects.MenuLink(pro.getProperty("CategoryName")));
				BrowserUtils.waitFor(PLPObjects.showAll(), 10);
				WebdriverUtils.clickAction(PLPObjects.showAll());
				Thread.sleep(2000);
				BrowserUtils.waitFor(QuickViewObjects.Quickview(pro.getProperty("ProductName")), 10);
				WebdriverUtils.swipeUpUntillElement(QuickViewObjects.Title());
				WebdriverUtils.swipeDownUntillElement(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
				WebdriverUtils.moveToElementByActions(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
				WebdriverUtils.clickAction(QuickViewObjects.Quickview(pro.getProperty("ProductName")));
				BrowserUtils.waitFor(QuickViewObjects.SeeMoreLink(pro.getProperty("ProductName")), 10);
				System.out.println(QuickViewObjects.quickViewAddToWishlist(pro.getProperty("ProductName")).getText().trim());
				Assert.assertEquals(QuickViewObjects.quickViewAddToWishlist(pro.getProperty("ProductName")).getText().trim(), "ADD TO WISHLIST");
				WebdriverUtils.clickAction(QuickViewObjects.quickViewAddToWishlist(pro.getProperty("ProductName")));
				Thread.sleep(10000);
				System.out.println(QuickViewObjects.quickViewAddToWishlist(pro.getProperty("ProductName")).getText().trim());
				Thread.sleep(10000);
				Assert.assertEquals(QuickViewObjects.quickViewAddToWishlist(pro.getProperty("ProductName")).getText().trim(), "ADDED TO WISHLIST");
				WebdriverUtils.clickAction(MyAccountObjects.myAccountLink());
				BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
				WebdriverUtils.clickAction(MyAccountObjects.wishlistLink());
				BrowserUtils.waitFor(MyAccountObjects.wishlistHeader(), 10);
				System.out.println(MyAccountObjects.wishlistItemTitle().getText().trim());
				Assert.assertFalse(MyWislistObjects.emptyWishlists()>0);
				WebdriverUtils.clickAction(MyWislistObjects.removeButton());
				BrowserUtils.waitFor(MyWislistObjects.emptyWishlist(), 10);
				Assert.assertTrue(MyWislistObjects.emptyWishlist().isDisplayed());
				Assert.assertEquals(MyWislistObjects.emptyWishlist().getText().trim(), pro.getProperty("emptyText"));	          
	}
	public static void ShippingInfoNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
				Properties pro = new Properties();
				pro.load(fs);
				WebdriverUtils.goToURL(Environments.getURL());
				BrowserUtils.waitFor(LoginObjects.LogInLink(), 10);
				WebdriverUtils.clickAction(LoginObjects.LogInLink());
				BrowserUtils.waitFor(LoginObjects.EmailField(), 10);
				WebdriverUtils.sendKeys(LoginObjects.EmailField(), pro.getProperty("Email"));
				WebdriverUtils.sendKeys(LoginObjects.PasswordField(), pro.getProperty("Password"));
				WebdriverUtils.clickAction(LoginObjects.LogInButton());
				BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
				WebdriverUtils.clickAction(MyAccountObjects.myAccountLink());
				BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
				WebdriverUtils.clickAction(MyAccountObjects.wishlistLink());
				BrowserUtils.waitFor(MyAccountObjects.wishlistHeader(), 10);
				WebdriverUtils.clickAction(MyWislistObjects.shippingPageLink());
				BrowserUtils.waitFor(pro.getProperty("ShippingPageTitle"),10);
				Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("ShippingPageTitle"));
		        
		          
	}
	
	
}
