package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.pageObjects.HelpObjects;
import com.pageObjects.LoginObjects;
import com.pageObjects.MyAccountObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class HelpActions {
	public static void ElementsDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
	//	WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(HelpObjects.Help(), 10);
		WebdriverUtils.clickAction(HelpObjects.Help());
		BrowserUtils.waitFor(HelpObjects.ShippingInfoSection(), 15);
		Thread.sleep(2500);
        Assert.assertTrue(HelpObjects.ShippingInfoSection().isDisplayed());
        Assert.assertTrue(HelpObjects.ReturnsAndRefundSection().isDisplayed());
       // Assert.assertTrue(HelpObjects.FAQSection().isDisplayed());        
	}
	
	public static void ReturnPolicyNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(HelpObjects.Help(), 15);
		WebdriverUtils.clickAction(HelpObjects.Help());
		Thread.sleep(2000);
		HelpObjects.ReturnsAndRefundLink().click();
		BrowserUtils.waitFor("Returns and Refunds", 15);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Returns and Refunds");
	}
	
	public static void FAQStaticContentDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(HelpObjects.Help(), 10);
		WebdriverUtils.clickAction(HelpObjects.Help());
		BrowserUtils.waitFor(HelpObjects.FAQSection(), 10);
		//WebdriverUtils.clickAction(HelpObjects.FAQSection());
		//Assert.assertTrue(HelpObjects.FAQ().isDisplayed());
		//Assert.assertTrue(HelpObjects.FAQSection().isDisplayed());
	}
	
	public static void FAQNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		/*BrowserUtils.waitFor(HelpObjects.Help(), 15);
		WebdriverUtils.clickAction(HelpObjects.Help());
		BrowserUtils.waitFor(HelpObjects.FAQSection(), 10);
		WebdriverUtils.clickAction(HelpObjects.FAQSection());
		BrowserUtils.waitFor(HelpObjects.FAQLink(), 15);
		Thread.sleep(2000);
		HelpObjects.FAQLink().click();
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Jelly Belly Shipping Information");
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		BrowserUtils.waitFor(HelpObjects.Help(), 15);
		WebdriverUtils.clickAction(HelpObjects.Help());
		BrowserUtils.waitFor(HelpObjects.FAQSection1(), 10);
		WebdriverUtils.clickAction(HelpObjects.FAQSection1());
		BrowserUtils.waitFor(HelpObjects.FAQLink1(), 10);
		HelpObjects.FAQLink1().click();
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Jelly Belly Shipping Information");
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		BrowserUtils.waitFor(HelpObjects.Help(), 15);
		WebdriverUtils.clickAction(HelpObjects.Help());
		BrowserUtils.waitFor(HelpObjects.FAQSection2(), 10);
		WebdriverUtils.clickAction(HelpObjects.FAQSection2());
		BrowserUtils.waitFor(HelpObjects.FAQLink2(), 10);
		HelpObjects.FAQLink2().click();
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Jelly Belly Shipping Information");
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		BrowserUtils.waitFor(HelpObjects.Help(), 15);
		WebdriverUtils.clickAction(HelpObjects.Help());
		BrowserUtils.waitFor(HelpObjects.FAQSection(), 10);
		BrowserUtils.waitFor(HelpObjects.FAQSection3(), 10);
		HelpObjects.FAQSection3().click();
		BrowserUtils.waitFor(HelpObjects.FAQLink3(), 10);
		HelpObjects.FAQLink3().click();
		BrowserUtils.waitFor("Online Candy Store", 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Jelly Belly Candy | Online Candy Store by Category");*/
		BrowserUtils.waitFor(HelpObjects.Help(), 10);
		WebdriverUtils.clickAction(HelpObjects.Help());
		//BrowserUtils.waitFor(HelpObjects.FAQSection(), 10);
		//Assert.assertTrue(HelpObjects.FAQSection().isDisplayed());
	}
	
	public static void ShippingInfoNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Thread.sleep(2000);
		PDPActions.disableEasterPopup();
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(HelpObjects.Help(), 10);
		WebdriverUtils.clickAction(HelpObjects.Help());
		BrowserUtils.waitFor(HelpObjects.ShippingLink(), 10);
		WebdriverUtils.clickAction(HelpObjects.ShippingLink());
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Jelly Belly Shipping Information");
	}
}
