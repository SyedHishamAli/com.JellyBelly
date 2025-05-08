package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.pageObjects.GlobalFooterObjects;
import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.HomePageObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class GlobalFooterActions {
	public static void footerLinksDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		Assert.assertTrue(GlobalFooterObjects.ContactUsLink().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.PromotionsLink().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.SpecialtyWholesaleCustomersLink().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.NewsroomLink().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.AffiliateProgramLink().isDisplayed());
	}

	public static void footerLinksNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		Thread.sleep(11000);
		WebdriverUtils.clickButtonThroughJS(GlobalFooterObjects.ContactUsLink(),"click");
		Thread.sleep(12000);
		Assert.assertTrue(WebdriverUtils.getPageTitle().contains(pro.getProperty("ContactUsTitle")));
		Thread.sleep(6000);
		LoginActions.waitAndProceedWhenItemdisplayed(GlobalFooterObjects.PromotionsLink(), "Promotional Link");
		WebdriverUtils.clickButtonThroughJS(GlobalFooterObjects.PromotionsLink(),"click");
		Thread.sleep(6000);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("PromotionsLinkTitle"));
		Thread.sleep(4000);
		PDPActions.disableEasterPopup();
		LoginActions.waitAndProceedWhenItemdisplayed(GlobalFooterObjects.SpecialtyWholesaleCustomersLink(), "Specialty Wholesale Customers Link");
		WebdriverUtils.clickButtonThroughJS(GlobalFooterObjects.SpecialtyWholesaleCustomersLink(),"click");
		Thread.sleep(5000);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("SpecialtyWholesaleCustomersLinkTitle"));
		Thread.sleep(4000);
		LoginActions.waitAndProceedWhenItemdisplayed(GlobalFooterObjects.NewsroomLink(), "Newsroom Link");
		WebdriverUtils.clickButtonThroughJS(GlobalFooterObjects.NewsroomLink(),"click");
		Thread.sleep(5000);
		WebdriverUtils.switchBetweenWindowsForTitle(pro.getProperty("NewsroomLinkTitle"));
		//WebdriverUtils.switchToNewTab(2);
		Thread.sleep(3000);
	    Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("NewsroomLinkTitle"));  
      	Thread.sleep(4000);
		LoginActions.waitAndProceedWhenItemdisplayed(GlobalFooterObjects.AffiliateProgramLink(), "Affiliated Program Link");
		Thread.sleep(3000);
        WebdriverUtils.clickButtonThroughJS(GlobalFooterObjects.AffiliateProgramLink(),"click");
        Thread.sleep(3000);
        WebdriverUtils.switchBetweenWindowsForTitle(pro.getProperty("AffiliateProgramTitle"));
        //WebdriverUtils.switchToNewTab(3);
        Thread.sleep(3000);
        Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("AffiliateProgramTitle"));
      
	}	

	public static void socialShareLinkFunctionality() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalFooterObjects.Pinterest(), 10);
		WebdriverUtils.swipeDownUntillElement(GlobalFooterObjects.Pinterest());
		WebdriverUtils.clickAction(GlobalFooterObjects.Pinterest());
		Thread.sleep(3000);
		WebdriverUtils.switchToNewTab(1);
		BrowserUtils.waitFor(pro.getProperty("PinterestTitle"), 15);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("PinterestTitle"));
		Thread.sleep(3000);
		WebdriverUtils.closeBrowser();
		WebdriverUtils.switchTodefaultTab();
		BrowserUtils.waitFor(GlobalFooterObjects.Facebook(), 10);
		WebdriverUtils.swipeDownUntillElement(GlobalFooterObjects.Facebook());
		WebdriverUtils.clickAction(GlobalFooterObjects.Facebook());
		Thread.sleep(10000);
		WebdriverUtils.switchtoNewTab();
		//BrowserUtils.waitFor(pro.getProperty("FacebookTitle"), 45);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("FacebookTitle"));
		Thread.sleep(3000);
		WebdriverUtils.closeBrowser();
		WebdriverUtils.switchTodefaultTab();
		BrowserUtils.waitFor(GlobalFooterObjects.Youtube(), 10);
		WebdriverUtils.swipeDownUntillElement(GlobalFooterObjects.Youtube());
		WebdriverUtils.clickAction(GlobalFooterObjects.Youtube());
		Thread.sleep(3000);
		WebdriverUtils.switchtoNewTab();
		Thread.sleep(5000);
		BrowserUtils.waitFor(GlobalFooterObjects.YoutubeText(), 15);
		Assert.assertEquals(WebdriverUtils.getWindowURL(), pro.getProperty("YoutubeURL"));
		Thread.sleep(3000);
		WebdriverUtils.closeBrowser();
		WebdriverUtils.switchTodefaultTab();	    
		BrowserUtils.waitFor(GlobalFooterObjects.Instagram(), 10);
		WebdriverUtils.swipeDownUntillElement(GlobalFooterObjects.Instagram());
		WebdriverUtils.clickAction(GlobalFooterObjects.Instagram());
		Thread.sleep(5000);
		WebdriverUtils.switchtoNewTab();
		Thread.sleep(5000);
		BrowserUtils.waitFor(pro.getProperty("InstagramTitle"), 15);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("InstagramTitle"));
		Thread.sleep(5000);
		WebdriverUtils.closeBrowser();
		WebdriverUtils.switchTodefaultTab();	    
		BrowserUtils.waitFor(GlobalFooterObjects.Linkedin(), 10);
		WebdriverUtils.swipeDownUntillElement(GlobalFooterObjects.Linkedin());
		WebdriverUtils.clickAction(GlobalFooterObjects.Linkedin());
		Thread.sleep(7000);
		WebdriverUtils.switchtoNewTab();
		Thread.sleep(6000);
		BrowserUtils.waitFor(pro.getProperty("LinkedinTitle"), 20);
		Assert.assertEquals(WebdriverUtils.getPageTitle(), pro.getProperty("LinkedinTitle"));
		Thread.sleep(3000);
		WebdriverUtils.switchTodefaultTab(); 
	}

	public static void newsLetterSectionDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalFooterObjects.NewsLetterText(), 10);
		Assert.assertTrue(GlobalFooterObjects.NewsLetterText().isDisplayed());
	}

	public static void newsLetterSectionElementsDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalFooterObjects.NewsLetterText(), 10);
		Assert.assertTrue(GlobalFooterObjects.NewsLetterText().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.EmailAddressText().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.EmailAddressField().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.Checkbox().isDisplayed());
		Assert.assertTrue(GlobalFooterObjects.SubmitButton().isDisplayed());
	}	

	public static void newsLetterSubscription() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalFooterObjects.NewsLetterText(), 10);
		WebdriverUtils.scrollToElement(GlobalFooterObjects.NewsLetterText());
		Thread.sleep(1000);
		WebdriverUtils.sendKeys(GlobalFooterObjects.EmailAddressField(), pro.getProperty("Email"));
		WebdriverUtils.clickAction(GlobalFooterObjects.Checkbox());
		Thread.sleep(1000);
		Assert.assertTrue(GlobalFooterObjects.SubmitButtonenable().isEnabled());
	}		

	public static void submitButtonfunctionality() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalFooterObjects.NewsLetterText(), 10);
		WebdriverUtils.scrollToElement(GlobalFooterObjects.NewsLetterText());
		Thread.sleep(1000);
		Assert.assertFalse(GlobalFooterObjects.SubmitButton().isEnabled());
		Thread.sleep(2000);
		WebdriverUtils.sendKeys(GlobalFooterObjects.EmailAddressField(), pro.getProperty("Email"));
		WebdriverUtils.clickAction(GlobalFooterObjects.Checkbox());
		Thread.sleep(2000);
		Assert.assertTrue(GlobalFooterObjects.SubmitButtonenable().isEnabled());
	}

	public static void navTofreeTours() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalFooterObjects.NewsLetterText(), 10);
		WebdriverUtils.swipeDownUntillElement(GlobalFooterObjects.Freetours());
		WebdriverUtils.clickAction(GlobalFooterObjects.Freetours());
		Thread.sleep(3000);
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Assert.assertEquals(HomePageObjects.PLP().getText(), pro.getProperty("Freetourtext"));
	}
}


