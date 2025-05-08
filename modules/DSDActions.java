package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.pageObjects.AddressBookObjects;
import com.pageObjects.CheckoutObjects;
import com.pageObjects.LoginObjects;
import com.pageObjects.MyAccountObjects;
import com.utility.BrowserUtils;
import com.utility.DriverFactory;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class DSDActions {
	
	public static void RapidOrderFunctionality() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getDSDURL());
		BrowserUtils.waitFor(LoginObjects.LogInLink(), 10);
		WebdriverUtils.clickAction(LoginObjects.LogInLink());
		BrowserUtils.waitFor(LoginObjects.EmailField(), 10);
		WebdriverUtils.sendKeys(LoginObjects.EmailField(), pro.getProperty("Email"));
		WebdriverUtils.sendKeys(LoginObjects.PasswordField(), pro.getProperty("Password"));
		WebdriverUtils.clickAction(LoginObjects.LogInButton());
		BrowserUtils.waitFor(LoginObjects.MyAccountLink(), 20);
		WebdriverUtils.clickAction(MyAccountObjects.myAccountLink());
		BrowserUtils.waitFor(MyAccountObjects.myAccountPageHeader(), 10);
		WebdriverUtils.clickAction(MyAccountObjects.addressBookLink());
		BrowserUtils.waitFor(AddressBookObjects.addressBookHeader(), 10);
		if(AddressBookObjects.newlySavedAddresses(pro.getProperty("newAddressFirstName")).size()>0){
			for(int i=0 ; i<AddressBookObjects.newlySavedAddresses(pro.getProperty("newAddressFirstName")).size() ; i++){
				WebdriverUtils.clickAction(AddressBookObjects.newlySavedAddressDeleteButtons(pro.getProperty("newAddressFirstName")).get(0));
				Thread.sleep(2000);
				DriverFactory.getInstance().getDriver().switchTo().alert().accept();
				Thread.sleep(2000);
			}
		}
		WebdriverUtils.clickAction(AddressBookObjects.addNewAddress());
		BrowserUtils.waitFor(AddressBookObjects.addressFormHeader(), 10);
		WebdriverUtils.sendKeys(AddressBookObjects.newAddresscompanyName(), pro.getProperty("newAddressCompanyName"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(AddressBookObjects.newAddressFirstName(), pro.getProperty("newAddressFirstName"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(AddressBookObjects.newAddressLastName(), pro.getProperty("newAddressLastName"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(AddressBookObjects.newAddressLineFirst(), pro.getProperty("newAddressFirst"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(AddressBookObjects.newAddressLineSecond(), pro.getProperty("newAddressSecond"));
		WebdriverUtils.sendKeys(AddressBookObjects.newAddressLineCity(), pro.getProperty("newAddressCity"));
		WebdriverUtils.selectByValue(AddressBookObjects.newAddressLineState(),  pro.getProperty("newAddressState"));
		WebdriverUtils.sendKeys(AddressBookObjects.newAddressZipCode(), pro.getProperty("newAddressZipcode"));
		WebdriverUtils.sendKeys(AddressBookObjects.newAddressPhoneNumber(), pro.getProperty("newAddressPhoneNumber"));
		WebdriverUtils.selectByValue(AddressBookObjects.newAddressAddressType(),  pro.getProperty("newAddressAddressType"));
		Thread.sleep(3000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));
					
			}
		}
		Thread.sleep(3000);
		WebdriverUtils.swipeDownUntillElement(AddressBookObjects.newAddressSaveButton());
		WebdriverUtils.clickAction(AddressBookObjects.newAddressSaveButton());
		BrowserUtils.waitFor(AddressBookObjects.addressBookHeader(), 10);
		Thread.sleep(3500);
		Assert.assertEquals(AddressBookObjects.newlySavedAddressName(pro.getProperty("newAddressFirstName")).getText().trim(), pro.getProperty("newAddressFirstName") +" "+pro.getProperty("newAddressLastName"));
		Assert.assertEquals(AddressBookObjects.newlySavedAddressAddressLine1(pro.getProperty("newAddressFirstName")).getText().trim(), pro.getProperty("newAddressFirst"));
		Assert.assertEquals(AddressBookObjects.newlySavedAddressAddressLine2(pro.getProperty("newAddressFirstName")).getText().trim(), pro.getProperty("newAddressSecond"));
		Assert.assertEquals(AddressBookObjects.newlySavedAddressStateCityZipCode(pro.getProperty("newAddressFirstName")).getText().trim(), pro.getProperty("newAddressCity") +", "+pro.getProperty("newAddressState")+" "+pro.getProperty("newAddressZipcode"));
		Assert.assertEquals(AddressBookObjects.newlySavedAddressPhoneNumber(pro.getProperty("newAddressFirstName")).getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").trim(), pro.getProperty("newAddressPhoneNumber"));
		WebdriverUtils.clickAction(AddressBookObjects.newlySavedAddressDeleteButton(pro.getProperty("newAddressFirstName")));
		Thread.sleep(2000);
		DriverFactory.getInstance().getDriver().switchTo().alert().accept();
		Thread.sleep(2000);
	}

}
