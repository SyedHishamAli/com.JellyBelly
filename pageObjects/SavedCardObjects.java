package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.DriverFactory;
import com.utility.WebdriverUtils;

public class SavedCardObjects {
	
	
	public static WebElement addNewCardLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Add new card')]"));
	}
	
	
	public static WebElement savedCardsHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='x-account-paymentmethods']//h3[contains(@class,'mz-l-stack-sectiontitle')][contains(text(),'SAVED CARDS')]"));
	}
	
	
	public static WebElement cardType() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='mz-payment-credit-card-type']"));
	}
	
	
	public static WebElement addNewCardHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h4[contains(text(),'ADD NEW CARD')]"));
	}
	
	
	public static WebElement addNewCardNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='mz-payment-credit-card-number']"));
	}
	
	
	public static WebElement addNewCardName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='mz-payment-credit-card-name']"));
	}
	
	
	public static WebElement addNewCardExpiryMonth() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@id='mz-payment-expiration-month']"));
	}

	
	public static WebElement addNewCardExpiryYear() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@name='mz-payment-expiration-year']"));
	}
	
	public static WebElement addNewCardCVVNumber() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='mz-payment-security-code']"));
	}
	
	public static WebElement selectFirstBillingAddress() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//input[@data-mz-value='editingCard.contactId'])[1]"));
	}
	
	
	public static WebElement addNewCardSaveButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[contains(@class,'mz-button mz-creditcard-save')]"));
	}
	
	
	public static WebElement newlyAddedSavedCardSection(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']"));
	}
	
	public static List<WebElement> newlyAddedSavedCardSections(String FirstName) throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']"));
	}
	
	public static WebElement newlyAddedSavedCardType(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']/span[1]"));
	}
	
	public static WebElement newlyAddedSavedCardName(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']/span[2]"));
	}
	
	public static WebElement newlyAddedSavedCardNumber(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']/span[3]"));
	}
	
	public static WebElement newlyAddedSavedCardExpiryDate(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']/span[4]"));
	}
	
	
	public static WebElement newlyAddedSavedCardEditButton(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']//a[@class='mz-paymentmethod-edit']"));
	}
	
	public static WebElement newlyAddedSavedCardDeleteButton(String FirstName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[contains(text(),'Name on Card :"+FirstName+"')]/ancestor::li[@class='jb-each-card']//a[@class='mz-paymentmethod-delete']"));
	}
	
	
	public static WebElement defaultSavedAddress() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//label[@class='mz-contactselector-contact']//div[@class='mz-addresssummary']"));
	}
	
	public static WebElement addNewAddressSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//label[@class='mz-contactselector-contact mz-contactselector-new']//div[@class='mz-addresssummary']"));
	}
	
	public static WebElement addNewAddressRadioButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//label[@class='mz-contactselector-contact mz-contactselector-new']//input"));
	}
	
	
	public static WebElement addNewAddressCompanyName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@name='companyname']"));
	}
	
	
	public static WebElement emptyCardTypeErrorMessage() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='err_1']"));
	}
	
	
}
