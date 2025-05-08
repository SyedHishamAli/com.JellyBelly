package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.pageObjects.ADAObjects;
import com.pageObjects.LoginObjects;
import com.pageObjects.MyAccountObjects;
import com.pageObjects.UATObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class StoreCreditActions {
	public static void StoreCreditStaticContentDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		//WebdriverUtils.goToURL("https://www.jellybelly.com/myaccount");
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		Thread.sleep(2000);
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(UATObjects.StorecreditLink(), 10);
		WebdriverUtils.clickButtonThroughJS(UATObjects.StorecreditLink(),"click");
		Thread.sleep(5000);
		BrowserUtils.waitFor(UATObjects.StorecreditStaticContent(), 25);
		Thread.sleep(3500);
		Assert.assertTrue(UATObjects.StorecreditStaticContent().getText().trim().contains("CLAIMING YOUR GIFT CERTIFICATE IS EASY!"));
		Assert.assertTrue(UATObjects.StorecreditStaticContent1().getText().trim().contains("You currently have a gift certificate balance"));
	}
	
	public static void StoreCreditDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(UATObjects.StorecreditLink(), 10);
		WebdriverUtils.clickButtonThroughJS(UATObjects.StorecreditLink(),"click");
		Thread.sleep(3000);
		BrowserUtils.waitFor(UATObjects.GiftCardTextField(), 25);
		Assert.assertTrue(UATObjects.GiftCardTextField().isDisplayed());
		Assert.assertEquals(UATObjects.ApplyButton().getText().trim().toUpperCase(),"APPLY");
	}
	
	public static void GiftCardErrorMessageDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Thread.sleep(4000);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4500);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 15);
		WebdriverUtils.waitForElementToBeClickable(MyAccountObjects.myAccountPageHeader(), 25);
		//WebdriverUtils.refreshPage();
		//Thread.sleep(3000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 15);
		BrowserUtils.waitFor(UATObjects.StorecreditLink(), 15);
		WebdriverUtils.clickAction(UATObjects.StorecreditLink());
		Thread.sleep(3000);
        WebdriverUtils.waitForElementToBeClickable(UATObjects.ApplyButton(), 20);
		BrowserUtils.waitFor(UATObjects.GiftCardTextField(), 10);
		WebdriverUtils.sendKeys(UATObjects.GiftCardTextField(), "Testing");
		Thread.sleep(2000);
		WebdriverUtils.clickButtonThroughJS(UATObjects.ApplyButton(),"click");
		Thread.sleep(3500);
		BrowserUtils.waitFor(UATObjects.GiftCardErrorMessage(), 15);
		Assert.assertTrue(UATObjects.GiftCardErrorMessage().getText().trim().contains("Error: Sorry, but 'Testing' does not appear to qualify as a valid coupon code. Please be sure that you're using the correct code (copy-and-paste may help), that it hasn't expired and that you have met any required threshold."));
	}
	
	public static void NavigationFromStoreCredit() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(UATObjects.StorecreditLink(), 15);
		WebdriverUtils.clickButtonThroughJS(UATObjects.StorecreditLink(),"click");
		Thread.sleep(4500);
		BrowserUtils.waitFor(UATObjects.Link(), 15);
		WebdriverUtils.clickAction(UATObjects.Link());
		
		int i=0;
		while(i<5) {
			try {
				if(LoginObjects.JBHomeLink().isDisplayed()) {
					WebdriverUtils.clickButtonThroughJS(LoginObjects.JBHomeLink(),"click");
					System.out.println("Clicked on JellyBelly US link on International Home screen");
					Thread.sleep(6000);
					WebdriverUtils.switchToNewTab(i+1);
					Thread.sleep(6500);	
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
		BrowserUtils.waitFor(LoginObjects.LogInLink(),10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Official Site of Jelly Belly Candies and Confections");

	}
}
