package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.DriverFactory;
import com.utility.WebdriverUtils;

public class AddressBookObjects {
	
	public static WebElement addressBookHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='x-account-addressbook']//h3[@class='mz-l-stack-sectiontitle']"));
	}
	
	public static WebElement addNewAddress() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='add-new' and contains(text(),'Add new address')]"));
	}
	
	
	public static WebElement addressFormHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h4[@class='mz-l-stack-subtitle'][contains(text(),'ADD NEW ADDRESS')]"));
	}
	
	public static WebElement addressFormEditHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h4[@class='mz-l-stack-subtitle'][contains(text(),'EDIT ADDRESS')]"));
	}
	
	
	
	public static WebElement newAddresscompanyName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='companyname']"));
	}
	
	public static WebElement newAddressFirstName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='firstname']"));
	}
	
	public static WebElement newAddressLastName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='lastname']"));
	}
	
	public static WebElement newAddressLineFirst() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='address-line-1']"));
	}
	
	public static WebElement newAddressLineSecond() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='address-line-2']"));
	}
	
	public static WebElement newAddressLineCity() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='city']"));
	}
	
	public static WebElement newAddressLineState() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='stateprov']"));
	}
	
	public static WebElement newAddressZipCode() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='postal-code']"));
	}
	
	public static WebElement newAddressPhoneNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='shippingphone']"));
	}
	
	public static WebElement newAddressAddressType() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='addresstype']"));
	}
	
	public static WebElement newAddressSaveButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button mz-contact-save']"));
	}
	
	public static WebElement newlySavedAddress(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]"));
	} 

	public static List<WebElement> newlySavedAddresses(String FirstName) throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]"));
	}
	
	public static WebElement newlySavedAddressName(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/span[1]"));
	}
	
	public static WebElement newlySavedAddressAddressLine1(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/span[2]"));
	}
	
	public static WebElement newlySavedAddressAddressLine2(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/span[3]"));
	}
	
	public static WebElement newlySavedAddressStateCityZipCode(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/span[4]"));
	}
	
	
	public static WebElement newlySavedAddressPhoneNumber(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/span[6]"));
	}
	
	
	public static List<WebElement> newlySavedAddressDeleteButtons(String FirstName) throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/ancestor::li[@class='mz-accountaddressbook-contact']//a[@class='mz-accountaddressbook-delete']"));
	}
	
	
	public static WebElement newlySavedAddressDeleteButton(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/ancestor::li[@class='mz-accountaddressbook-contact']//a[@class='mz-accountaddressbook-delete']"));
	}
	
	public static WebElement newlySavedAddressEditButton(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary' and ./span[contains(text(),'"+FirstName+"')]]/ancestor::li[@class='mz-accountaddressbook-contact']//a[@class='mz-accountaddressbook-edit']"));
	}

	
	public static WebElement emptyLastNameError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_lastname2']"));
	}
	
	
	public static WebElement emptyStreetAddressError() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_address3']"));
	}
	
	
	
}
