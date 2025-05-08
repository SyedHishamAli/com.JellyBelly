package com.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.DriverFactory;
import com.utility.WebdriverUtils;

public class MyAccountObjects {

	public static WebElement myAccountLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='login-register-btn']"));
	}
	public static WebElement myProfileLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id=\"myaccount-or-logout\"]/ul/li[2]/a"));
	}
	public static WebElement myAccountPageHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h1[@class='mz-pagetitle']"));
	}
	
	public static WebElement savedCardSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='paymentmethods-panel']"));
	}
	
	public static WebElement addressBookLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='addressbook-panel']"));
	}
	
	public static WebElement wishlistLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='wishlist-panel']"));
	}
	
	public static WebElement wishlistHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h3[contains(text(),'MY WISHLIST')]"));
	}
	
	public static WebElement wishlistRemoveAll() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='remove-all']"));
	}
	
	public static int wishlistRemoveAllSize() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("//button[@class='remove-all']")).size();
	}
	
	public static WebElement conatinerPopUp() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='cointainer-popup']"));
	}
	
	public static WebElement yesButtonInPopUp() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='remove']"));
	}
	
	public static WebElement wishlistItemTitle() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='itemlisting-title']"));
	}
	
	
	
	
	
	public static WebElement editButonForName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@data-mz-action='startEdit']"));
	}
	
	public static WebElement FirstNameEditField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='accountSettingsFirstName']"));
	}
	public static WebElement lastNameEditField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='accountSettingsLastName']"));
	}
	
	public static WebElement saveButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button mz-button-small mz-accountsettings-namedone']"));
	}
	
	public static WebElement accountUserName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-accountsettings-user']//label[contains(text(),'Name:')]/following-sibling::*)[1]"));
	}
	
	public static WebElement emailEditField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='mz-accountsettings-section mz-accountsettings-email-edit']//input[@placeholder='Email Address']"));
	}
	public static WebElement cancelbutton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button mz-button-small mz-accountsettings-namecancel']"));
	}
	
	public static WebElement emptyEmailError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='msgalertemail']"));
	}
	
	public static WebElement changePasswordLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Change Password')]"));
	}
	
	public static WebElement oldPasswordField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='account-password-old']"));
	}
	
	public static WebElement changePasswordField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='account-password']"));
	}
	
	public static WebElement confirmChangePasswordField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='account-confirmpassword']"));
	}
	
	public static WebElement cancelChangePassword() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button mz-button-small mz-accountsettings-passwordcancel']"));
	}
	
	public static WebElement logoutLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
	}
	
	public static WebElement passwordChangedSuccessMessage() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='err_4']"));
	}
	
	public static WebElement passwordChangeSaveButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button mz-button-small mz-accountsettings-passworddone']"));
	}
	
	public static WebElement emptyConfirmPasswordErrorMessage() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='err_3']"));
	}
	
	public static WebElement emailPreferenceLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@title='Email preference center']"));
	}
	
	
}
