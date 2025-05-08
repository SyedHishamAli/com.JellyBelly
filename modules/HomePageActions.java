package com.modules;

import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.HomePageObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class HomePageActions {
	public static void verifyPLPNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLPLINK(), 10);
		WebdriverUtils.clickAction(HomePageObjects.PLPLINK());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Assert.assertTrue(HomePageObjects.PLP().isDisplayed());
	}
	public static void verifyBannerFunctionality() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(5000);
		System.out.println("Tittle of the page is -- "+WebdriverUtils.getPageTitle());
		//Assert.assertTrue(title.contains(WebdriverUtils.getPageTitle()));
		WebdriverUtils.clickButtonThroughJS(GlobalHeaderObjects.jellyBellyLogo(),"logo");
		BrowserUtils.waitFor(HomePageObjects.Banner1(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Banner1());
		Thread.sleep(8000);
		BrowserUtils.waitFor(HomePageObjects.Banner1breadcrumb(), 20);
		System.out.println("Banner 1 "+WebdriverUtils.getPageTitle());
		Thread.sleep(5000);
		Assert.assertEquals(HomePageObjects.PLP().getText(), pro.getProperty("Banner1"));
		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
		BrowserUtils.waitFor(HomePageObjects.Banner2(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Banner2());
		Thread.sleep(8000);
		System.out.println("Banner 2 "+WebdriverUtils.getPageTitle());
		Assert.assertEquals(HomePageObjects.PLP().getText().toLowerCase(), pro.getProperty("Banner2"));
		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
		BrowserUtils.waitFor(HomePageObjects.Banner3(), 18);
		WebdriverUtils.clickAction(HomePageObjects.Banner3());
		Thread.sleep(8000);
		System.out.println("Banner 3 "+WebdriverUtils.getPageTitle());
		Assert.assertEquals(HomePageObjects.PLP().getText(), pro.getProperty("Banner3"));
		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
		BrowserUtils.waitFor(HomePageObjects.Banner4(), 18);
		WebdriverUtils.clickAction(HomePageObjects.Banner4());
		Thread.sleep(8000);
		System.out.println("Banner 4 "+WebdriverUtils.getPageTitle());
		Assert.assertEquals(HomePageObjects.PLP().getText().toUpperCase(), pro.getProperty("Banner4"));
		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
		BrowserUtils.waitFor(HomePageObjects.Banner5(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Banner5());
		Thread.sleep(8000);
		System.out.println("Banner 5 "+WebdriverUtils.getPageTitle());
		Assert.assertEquals(HomePageObjects.PLP().getText(), pro.getProperty("Banner5"));
		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
		BrowserUtils.waitFor(HomePageObjects.Banner6(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Banner6());
		Thread.sleep(8000);
		System.out.println("Banner 6 "+WebdriverUtils.getPageTitle());
		Assert.assertEquals(HomePageObjects.PLP().getText(), pro.getProperty("Banner6"));
//		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
//		BrowserUtils.waitFor(HomePageObjects.Banner7(), 10);
//		WebdriverUtils.clickButtonThroughJS(HomePageObjects.Banner7(), "click");
//		Thread.sleep(8000);
//		System.out.println("Banner 7 "+WebdriverUtils.getPageTitle());
//		Assert.assertEquals(HomePageObjects.PLP().getText(), pro.getProperty("Banner7"));
//		WebdriverUtils.clickAction(GlobalHeaderObjects.jellyBellyLogo());
//		BrowserUtils.waitFor(HomePageObjects.Banner8(), 10);
//		WebdriverUtils.clickButtonThroughJS(HomePageObjects.Banner8(), "click");
//		Thread.sleep(8000);
//		System.out.println("Banner 8 "+WebdriverUtils.getPageTitle());
//		Assert.assertEquals(HomePageObjects.PLP().getText(), pro.getProperty("Banner8"));
	}
	public static void verifyBLPLinksnavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Brand());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("BLPName"));
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand1(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Brand1());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("BLPName1"));
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand2(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Brand2());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("BLPName2"));
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand3(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Brand3());
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("BLPName3"));		
	}	
	public static void verifyFlavorpagesNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.Flavorandmorelink(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Flavorandmorelink());
		BrowserUtils.waitFor(HomePageObjects.Flavorlink1(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Flavorlink1());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.Flavorexpand(), 10);
		String expansion =HomePageObjects.Flavorexpand().getAttribute("aria-expanded");
		System.out.println(expansion);
		WebdriverUtils.swipeUpUntillElement(HomePageObjects.Flavorexpand());
		Thread.sleep(2000);
		assertEquals(HomePageObjects.Flavorexpand().getText(), pro.getProperty("Flavor1"));
		Thread.sleep(2000);
		WebdriverUtils.swipeUpUntillElement(HomePageObjects.Flavorandmorelink());
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Flavorandmorelink());
		BrowserUtils.waitFor(HomePageObjects.Flavorlink2(), 10);
		LoginActions.waitAndProceedWhenItemdisplayed(HomePageObjects.Flavorlink2(), "Flavor link 2");
		WebdriverUtils.clickAction(HomePageObjects.Flavorlink2());
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.Flavorexpand(), 10);
		String expansion1=HomePageObjects.Flavorexpand().getAttribute("aria-expanded");
		System.out.println(expansion1);
		/*WebdriverUtils.swipeUpUntillElement(HomePageObjects.Flavorexpand());
		Thread.sleep(2000);
		assertEquals(flovorExpand, pro.getProperty("Flavor2"));*/
		String pageTitle=WebdriverUtils.getPageTitle();
		Thread.sleep(2000);
		assertEquals(pageTitle, pro.getProperty("Flavor2"));
		WebdriverUtils.swipeUpUntillElement(HomePageObjects.Flavorandmorelink());
		Thread.sleep(2000);
		WebdriverUtils.moveToElementByActions(HomePageObjects.Flavorandmorelink());
		BrowserUtils.waitFor(HomePageObjects.Flavorlink3(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Flavorlink3());
		Thread.sleep(4000);
		WebdriverUtils.refreshPage();
		Thread.sleep(4000);
		BrowserUtils.waitFor(HomePageObjects.Flavorexpand(), 10);
		String expansion2=HomePageObjects.Flavorexpand().getAttribute("aria-expanded");
		System.out.println(expansion2);
		WebdriverUtils.swipeUpUntillElement(HomePageObjects.Flavorexpand());
		Thread.sleep(2000);
		assertEquals(HomePageObjects.Flavorexpand().getText(), pro.getProperty("Flavor3"));
	}
}
