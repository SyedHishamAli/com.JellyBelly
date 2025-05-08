package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import com.pageObjects.CheckoutObjects;
import com.pageObjects.LoginObjects;
import com.pageObjects.MyAccountObjects;
import com.pageObjects.SavedCardObjects;
import com.utility.BrowserUtils;
import com.utility.DriverFactory;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class SavedCardActions {
	
	public static void editSavedCardFunctionality() throws IOException, Exception {
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
		WebdriverUtils.clickAction(MyAccountObjects.savedCardSection());
		BrowserUtils.waitFor(SavedCardObjects.savedCardsHeader(), 10);
		Thread.sleep(4000);
		PDPActions.disableEasterPopup();
		if(SavedCardObjects.newlyAddedSavedCardSections(pro.getProperty("newAddressFirstName")).size()>0){
			for(int i=0 ; i<SavedCardObjects.newlyAddedSavedCardSections(pro.getProperty("newAddressFirstName")).size() ; i++){
				Thread.sleep(2000);
				WebdriverUtils.clickAction(SavedCardObjects.newlyAddedSavedCardDeleteButton(pro.getProperty("newAddressFirstName")));
				Thread.sleep(2000);
				DriverFactory.getInstance().getDriver().switchTo().alert().accept();
				Thread.sleep(2000);
			}
		}
		WebdriverUtils.clickAction(SavedCardObjects.addNewCardLink());
		BrowserUtils.waitFor(SavedCardObjects.addNewCardHeader(), 10);
		WebdriverUtils.selectByValue(SavedCardObjects.cardType(),  pro.getProperty("NewAddedCardtype"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(SavedCardObjects.addNewCardName(), pro.getProperty("NewAddedNameoncard"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(SavedCardObjects.addNewCardNumber(), pro.getProperty("NewAddedCardnumber"));
		Thread.sleep(500);
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryMonth(),  pro.getProperty("NewAddedMonth"));
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryYear(),  pro.getProperty("NewAddedYear"));
		//WebdriverUtils.sendKeys(SavedCardObjects.addNewCardCVVNumber(), pro.getProperty("NewAddedCVV"));
		Thread.sleep(4000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));
					
			}
		}
		WebdriverUtils.scrollToElement("200");
		Thread.sleep(3000);
		WebdriverUtils.clickAction(SavedCardObjects.selectFirstBillingAddress());
		Thread.sleep(2000);
		WebdriverUtils.scrollToElement("300");
		WebdriverUtils.swipeDownUntillElement(SavedCardObjects.addNewCardSaveButton());
		WebdriverUtils.clickAction(SavedCardObjects.addNewCardSaveButton());
		Thread.sleep(4000);
		WebdriverUtils.scrollToElement("-300");
		Assert.assertTrue(SavedCardObjects.newlyAddedSavedCardSection(pro.getProperty("newAddressFirstName")).isDisplayed());
		Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardType(pro.getProperty("newAddressFirstName")).getText().trim(), "Card Type :"+pro.getProperty("NewAddedCardtype"));
		Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardName(pro.getProperty("newAddressFirstName")).getText().trim(), "Name on Card :"+pro.getProperty("NewAddedNameoncard"));
		Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardNumber(pro.getProperty("newAddressFirstName")).getText().trim(), "Card No :"+pro.getProperty("EncryptedCardNumber"));
		//Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardExpiryDate(pro.getProperty("newAddressFirstName")).getText().trim(), "Expiry Date :"+pro.getProperty("NewAddedMonth").replace("0", "").trim()+"/"+pro.getProperty("NewAddedYear"));
		Thread.sleep(8000);
		try{
			WebdriverUtils.clickAction(SavedCardObjects.newlyAddedSavedCardEditButton(pro.getProperty("newAddressFirstName")));
		}
		catch(Exception e){
			WebdriverUtils.moveToElementByActions(SavedCardObjects.newlyAddedSavedCardEditButton(pro.getProperty("newAddressFirstName")));
		}
		Thread.sleep(2000);
		//SavedCardObjects.addNewCardNumber().clear();
		//WebdriverUtils.sendKeys(SavedCardObjects.addNewCardNumber(), pro.getProperty("EditedNewAddedCardnumber"));
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryMonth(),  pro.getProperty("EditedNewAddedMonth"));
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryYear(),  pro.getProperty("EditedNewAddedYear"));
		//WebdriverUtils.sendKeys(SavedCardObjects.addNewCardCVVNumber(), pro.getProperty("NewAddedCVV"));
		Thread.sleep(2000);
		WebdriverUtils.scrollToElement("300");
		WebdriverUtils.swipeDownUntillElement(SavedCardObjects.addNewCardSaveButton());
		WebdriverUtils.clickAction(SavedCardObjects.addNewCardSaveButton());
		Thread.sleep(4000);
		WebdriverUtils.scrollToElement("-300");
		Assert.assertTrue(SavedCardObjects.newlyAddedSavedCardSection(pro.getProperty("newAddressFirstName")).isDisplayed());
		Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardType(pro.getProperty("newAddressFirstName")).getText().trim(), "Card Type :"+pro.getProperty("NewAddedCardtype"));
		Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardName(pro.getProperty("newAddressFirstName")).getText().trim(), "Name on Card :"+pro.getProperty("NewAddedNameoncard"));
		//Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardNumber(pro.getProperty("newAddressFirstName")).getText().trim(), "Card No :"+pro.getProperty("EditedEncryptedCardNumber"));
		//Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardExpiryDate(pro.getProperty("newAddressFirstName")).getText().trim(), "Expiry Date :"+pro.getProperty("EditedNewAddedMonth").replace("0", "").trim()+"/"+pro.getProperty("EditedNewAddedYear"));
		WebdriverUtils.clickAction(SavedCardObjects.newlyAddedSavedCardEditButton(pro.getProperty("newAddressFirstName")));
		Thread.sleep(2000);
		//SavedCardObjects.addNewCardNumber().clear();
		//WebdriverUtils.sendKeys(SavedCardObjects.addNewCardNumber(), pro.getProperty("NewAddedCardnumber"));
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryMonth(),  pro.getProperty("NewAddedMonth"));
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryYear(),  pro.getProperty("NewAddedYear"));
		//WebdriverUtils.sendKeys(SavedCardObjects.addNewCardCVVNumber(), pro.getProperty("NewAddedCVV"));
		Thread.sleep(2000);
		WebdriverUtils.scrollToElement("300");
		WebdriverUtils.swipeDownUntillElement(SavedCardObjects.addNewCardSaveButton());
		WebdriverUtils.clickAction(SavedCardObjects.addNewCardSaveButton());
		Thread.sleep(4000);
		WebdriverUtils.scrollToElement("-300");
		Assert.assertTrue(SavedCardObjects.newlyAddedSavedCardSection(pro.getProperty("newAddressFirstName")).isDisplayed());
		Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardType(pro.getProperty("newAddressFirstName")).getText().trim(), "Card Type :"+pro.getProperty("NewAddedCardtype"));
		Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardName(pro.getProperty("newAddressFirstName")).getText().trim(), "Name on Card :"+pro.getProperty("NewAddedNameoncard"));
		//Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardNumber(pro.getProperty("newAddressFirstName")).getText().trim(), "Card No :"+pro.getProperty("EncryptedCardNumber"));
		//Assert.assertEquals(SavedCardObjects.newlyAddedSavedCardExpiryDate(pro.getProperty("newAddressFirstName")).getText().trim(), "Expiry Date :"+pro.getProperty("NewAddedMonth").replace("0", "").trim()+"/"+pro.getProperty("NewAddedYear"));
		WebdriverUtils.clickAction(SavedCardObjects.newlyAddedSavedCardDeleteButton(pro.getProperty("newAddressFirstName")));
		try{DriverFactory.getInstance().getDriver().switchTo().alert().accept();
		Thread.sleep(2000);}
		catch(Exception e){
			System.out.println(e);
		}
	}

	
	public static void ErrorMessageForMandatoryFields() throws IOException, Exception {
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
		WebdriverUtils.clickAction(MyAccountObjects.savedCardSection());
		BrowserUtils.waitFor(SavedCardObjects.savedCardsHeader(), 10);
		if(SavedCardObjects.newlyAddedSavedCardSections(pro.getProperty("newAddressFirstName")).size()>0){
			for(int i=0 ; i<SavedCardObjects.newlyAddedSavedCardSections(pro.getProperty("newAddressFirstName")).size() ; i++){
				Thread.sleep(2000);
				WebdriverUtils.clickAction(SavedCardObjects.newlyAddedSavedCardDeleteButton(pro.getProperty("newAddressFirstName")));
				Thread.sleep(2000);
				DriverFactory.getInstance().getDriver().switchTo().alert().accept();
				Thread.sleep(2000);
			}
		}
		WebdriverUtils.clickAction(SavedCardObjects.addNewCardLink());
		BrowserUtils.waitFor(SavedCardObjects.addNewCardHeader(), 10);
		//WebdriverUtils.selectByValue(SavedCardObjects.cardType(),  pro.getProperty("NewAddedCardtype"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(SavedCardObjects.addNewCardName(), pro.getProperty("NewAddedNameoncard"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(SavedCardObjects.addNewCardNumber(), pro.getProperty("NewAddedCardnumber"));
		Thread.sleep(500);
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryMonth(),  pro.getProperty("NewAddedMonth"));
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryYear(),  pro.getProperty("NewAddedYear"));
	//	WebdriverUtils.sendKeys(SavedCardObjects.addNewCardCVVNumber(), pro.getProperty("NewAddedCVV"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));
					
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.clickAction(SavedCardObjects.selectFirstBillingAddress());
		Thread.sleep(2000);
		WebdriverUtils.scrollToElement("300");
		WebdriverUtils.clickAction(SavedCardObjects.addNewCardSaveButton());
		BrowserUtils.waitFor(SavedCardObjects.emptyCardTypeErrorMessage(), 10);
		Assert.assertEquals(SavedCardObjects.emptyCardTypeErrorMessage().getText().trim(), "Error: Please select your Card Type.");
		
	}
	
	public static void SavedAddressDisplay() throws IOException, Exception {
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
		WebdriverUtils.clickAction(MyAccountObjects.savedCardSection());
		BrowserUtils.waitFor(SavedCardObjects.savedCardsHeader(), 10);
		if(SavedCardObjects.newlyAddedSavedCardSections(pro.getProperty("newAddressFirstName")).size()>0){
			for(int i=0 ; i<SavedCardObjects.newlyAddedSavedCardSections(pro.getProperty("newAddressFirstName")).size() ; i++){
				Thread.sleep(2000);
				WebdriverUtils.clickAction(SavedCardObjects.newlyAddedSavedCardDeleteButton(pro.getProperty("newAddressFirstName")));
				Thread.sleep(2000);
				DriverFactory.getInstance().getDriver().switchTo().alert().accept();
				Thread.sleep(2000);
			}
		}
		WebdriverUtils.clickAction(SavedCardObjects.addNewCardLink());
		BrowserUtils.waitFor(SavedCardObjects.addNewCardHeader(), 10);
		WebdriverUtils.selectByValue(SavedCardObjects.cardType(),  pro.getProperty("NewAddedCardtype"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(SavedCardObjects.addNewCardName(), pro.getProperty("NewAddedNameoncard"));
		Thread.sleep(500);
		WebdriverUtils.sendKeys(SavedCardObjects.addNewCardNumber(), pro.getProperty("NewAddedCardnumber"));
		Thread.sleep(500);
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryMonth(),  pro.getProperty("NewAddedMonth"));
		WebdriverUtils.selectByValue(SavedCardObjects.addNewCardExpiryYear(),  pro.getProperty("NewAddedYear"));
		//WebdriverUtils.sendKeys(SavedCardObjects.addNewCardCVVNumber(), pro.getProperty("NewAddedCVV"));
		Thread.sleep(2000);
		if(CheckoutObjects.iframeBlocks().size()>0){
			for(int i=0;i<CheckoutObjects.iframeCloseButton().size();i++){
				if(CheckoutObjects.iframeCloseButton().get(i).isDisplayed())
				WebdriverUtils.clickAction(CheckoutObjects.iframeCloseButton().get(i));
					
			}
		}
		Thread.sleep(1000);
		WebdriverUtils.clickAction(SavedCardObjects.selectFirstBillingAddress());
		Assert.assertTrue(SavedCardObjects.defaultSavedAddress().isDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(SavedCardObjects.addNewAddressSection().isDisplayed());
		Assert.assertTrue(SavedCardObjects.addNewAddressRadioButton().isDisplayed());
		WebdriverUtils.clickAction(SavedCardObjects.addNewAddressRadioButton());
		BrowserUtils.waitFor(SavedCardObjects.addNewAddressCompanyName(), 10);
		Assert.assertTrue(SavedCardObjects.addNewAddressCompanyName().isDisplayed());
		
		
	}
}
