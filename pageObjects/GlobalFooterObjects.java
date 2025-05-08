package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class GlobalFooterObjects {
	public static WebElement ContactUsLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='mz-cms-content']//a[contains(text(),'Contact Us')]"));
	}
	public static WebElement PromotionsLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Current Promotions')]"));
	}
	public static WebElement SpecialtyWholesaleCustomersLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Specialty Wholesale Customers')]"));
	}
	public static WebElement NewsroomLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Newsroom')]"));
	}
	public static WebElement AffiliateProgramLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Affiliate Program')]"));
	}
	public static WebElement Pinterest() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='link-footer-pinterest']"));
	}
	public static WebElement Facebook() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='link-footer-facebook']"));
	}
	public static WebElement Youtube() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='link-footer-youtube']"));
	}
	public static WebElement Freetours() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='free-tour-box']"));
	}
	public static WebElement Instagram() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='link-footer-instagram']"));
	}
	public static WebElement Linkedin() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='link-footer-linkedin']"));
	}
	public static WebElement YoutubeText() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@id='channel-title']"));
	}
	public static WebElement NewsLetterText() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='footer-signup']"));
	}
	public static WebElement EmailAddressText() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='footer-info-text']"));
	}
	public static WebElement EmailAddressField() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='footer-email-box']/input"));
	}
	public static WebElement Checkbox() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='checkbox-container-footer']//following::input"));
	}
	public static WebElement SubmitButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='signup-button sign-up-btn-footer-disable']"));
	}
	public static WebElement SubmitButtonenable() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='signup-button sign-up-btn-footer']"));
	}
	public static WebElement SubscriptionConfirmation() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='cboxLoadedContent']//div[1]//span[contains(text(),'Thank you')]"));
	}
	public static WebElement Myjellybellylink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='Popup' and contains(text(),'MyJellyBelly.com')]"));
	}
	
}
