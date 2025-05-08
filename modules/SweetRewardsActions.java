package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.pageObjects.LoginObjects;
import com.pageObjects.MyAccountObjects;
import com.pageObjects.SweetRewardsObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class SweetRewardsActions {
	public static void SweetRewardsNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		Thread.sleep(4000);
		BrowserUtils.waitFor(SweetRewardsObjects.SweetRewards(), 10);
		WebdriverUtils.waitForElementpresent(SweetRewardsObjects.SweetRewardsTitle(), 20);
		WebdriverUtils.clickAction(SweetRewardsObjects.SweetRewards());
		Assert.assertEquals(SweetRewardsObjects.SweetRewardsTitle().getText().trim(),"SWEET REWARDS");
	}
	
	public static void SweetRewardsTitleDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(SweetRewardsObjects.SweetRewards(), 10);
		WebdriverUtils.waitForElementpresent(SweetRewardsObjects.SweetRewardsTitle(), 20);
		WebdriverUtils.clickButtonThroughJS(SweetRewardsObjects.SweetRewards(),"click");
		Thread.sleep(6500);
		Assert.assertTrue(SweetRewardsObjects.SweetRewardsTitle().isDisplayed());
	}
	
	public static void PointsExpirySectionDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.moveToElementByActions(MyAccountObjects.myAccountLink());
		WebdriverUtils.clickAction(MyAccountObjects.myProfileLink());
		Thread.sleep(4000);
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.refreshPage();
		BrowserUtils.waitFor(SweetRewardsObjects.SweetRewards(), 10);
		WebdriverUtils.clickAction(SweetRewardsObjects.SweetRewards());
		WebdriverUtils.switchToiframe(SweetRewardsObjects.Iframe());
		BrowserUtils.waitFor(SweetRewardsObjects.CheckPointsExpiryLink(), 10);
		Thread.sleep(4000);
		WebdriverUtils.clickAction(SweetRewardsObjects.CheckPointsExpiryLink());
		Thread.sleep(8000);
		BrowserUtils.waitFor(SweetRewardsObjects.PointsExpirySection(), 15);
		Assert.assertEquals(SweetRewardsObjects.PointsExpirySection().getText().trim(), "POINTS EXPIRATION");
	}
}
