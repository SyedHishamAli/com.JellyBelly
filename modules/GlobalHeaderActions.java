package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.PLPObjects;
import com.pageObjects.QuickViewObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;


public class GlobalHeaderActions {

	public static void logoDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		Thread.sleep(4000);
		Assert.assertTrue(GlobalHeaderObjects.jellyBellyLogo().isDisplayed());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(PLPObjects.MenuLink(pro.getProperty("CategoryName")), 10);
		WebdriverUtils.clickButtonThroughJS(PLPObjects.MenuLink(pro.getProperty("CategoryName")),"Category");
		Thread.sleep(5000);
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Assert.assertTrue(GlobalHeaderObjects.jellyBellyLogo().isDisplayed());
		Thread.sleep(5000);
		//Assert.assertEquals(HomePageObjects.PLP().getText(), "Sport Beans Jelly Beans");
		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
		System.out.println(WebdriverUtils.getPageTitle());
		System.out.println(pro.getProperty("homePageTitle"));
		Assert.assertTrue(WebdriverUtils.getPageTitle().contains(pro.getProperty("homePageTitle")));
	}


	public static void searchFunctionlityForProductCode() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.searchTextBox(),"click");
		WebdriverUtils.sendKeys(GlobalHeaderObjects.searchTextBox(), pro.getProperty("productCode"));
		Thread.sleep(1500);
		//WebdriverUtils.waitForElementToBeClickable(GlobalHeaderObjects.searchSubmitButton(), "Search icon");
		try {
			WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.searchSubmitButton(),"click");
		}catch (Exception e) {
			WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.searchSubmitButton1(),"click");
		}
		Thread.sleep(5000);
		PDPActions.disableEasterPopup();
		BrowserUtils.waitFor(GlobalHeaderObjects.searchResultForCode(), 10);
		System.out.println(GlobalHeaderObjects.searchResultForCode().getText().trim());
		String url=WebdriverUtils.currentURL();
		Assert.assertTrue(url.contains(pro.getProperty("productCode")));
	}


	public static void searchFunctionlityForProductName() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 20);
		WebdriverUtils.clickAction(GlobalHeaderObjects.searchTextBox());
		//WebdriverUtils.sendKeys(GlobalHeaderObjects.searchTextBox(), pro.getProperty("productName"));
		WebdriverUtils.sendKeys(GlobalHeaderObjects.searchTextBox(), "Extreme Sport Beans� Jelly Beans with CAFFEINE -  Assorted Smoothie");
	//	WebdriverUtils.waitForElementToBeClickable(GlobalHeaderObjects.searchSubmitButton(), "Search icon");
		try {
			WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.searchSubmitButton(),"click");
		}catch (Exception e) {
			WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.searchSubmitButton1(),"click");
		}
		Thread.sleep(5000);
		PDPActions.disableEasterPopup();
		BrowserUtils.waitFor(GlobalHeaderObjects.searchResultForName(), 20);
		String text=GlobalHeaderObjects.searchResultForName().getText().trim().toLowerCase();
		System.out.println(text);
		//String textexp=pro.getProperty("productName");
		String textexp="Extreme Sport Beans� Jelly Beans with CAFFEINE -  Assorted Smoothie";
		textexp = textexp.replaceAll("[^a-zA-Z0-9]", "");
		text = text.replaceAll("[^a-zA-Z0-9]", "");
		Assert.assertTrue(text.toLowerCase().contains(textexp.toLowerCase()));
	}


	public static void searchFunctionlityForInvalidKey() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		WebdriverUtils.clickAction(GlobalHeaderObjects.searchTextBox());
		WebdriverUtils.sendKeys(GlobalHeaderObjects.searchTextBox(), pro.getProperty("invlaidSearchKey"));
		try {
			WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.searchSubmitButton(),"click");
		}catch (Exception e) {
			WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.searchSubmitButton1(),"click");
		}
		Thread.sleep(3000);
		BrowserUtils.waitFor(GlobalHeaderObjects.noSearchResultText(), 20);
		String text=GlobalHeaderObjects.noSearchResultText().getText().trim();
		Assert.assertTrue(text.contains(pro.getProperty("invlaidSearchKey")));
	}

}
