package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.pageObjects.LoginObjects;
import com.pageObjects.MyAccountObjects;
import com.pageObjects.ReturnsObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class ReturnsActions {
	public static void ReturnsContentDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Thread.sleep(5000);
		WebdriverUtils.waitForElementToBeClickable(MyAccountObjects.myAccountLink(), "MyaccountLink");
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(10000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.clickButtonThroughJS(ReturnsObjects.Returns(),"click");
		BrowserUtils.waitFor(ReturnsObjects.ReturnsContent(), 30);
		Assert.assertTrue(ReturnsObjects.ReturnsContent().isDisplayed());
		
	}
	
	public static void ReturnLinkNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.waitForElementToBeClickable(MyAccountObjects.myAccountLink(), "MyaccountLink");
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.clickAction(ReturnsObjects.Returns());
		BrowserUtils.waitFor(ReturnsObjects.ReturnsContent(), 10);
		WebdriverUtils.clickAction(ReturnsObjects.ReturnsLink());
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), "Returns and Refunds");
	}

}
