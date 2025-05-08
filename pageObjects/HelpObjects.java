package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class HelpObjects {
	public static WebElement Help() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='help-panel']"));
	}
	public static WebElement ShippingInfoSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h4[contains(text(),'SHIPPING INFORMATION')]"));
	}
	public static WebElement ReturnsAndRefundSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h4[contains(text(),'RETURNS & REFUNDS')]"));
	}
	public static WebElement FAQSection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='imgCell'])[1]"));
	}
	public static WebElement FAQSection1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='imgCell'])[2]"));
	}
	public static WebElement FAQSection2() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='imgCell'])[3]"));
	}
	public static WebElement FAQSection3() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='imgCell'])[4]"));
	}
	public static WebElement ShippingLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//a[contains(text(),'click here')]/ancestor::div[@class='jelly-belly-help-box']//a)[1]"));
	}
	public static WebElement ReturnsAndRefundLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//a[contains(text(),'click here')]/ancestor::div[@class='jelly-belly-help-box']//a)[2]"));
	}
	public static WebElement FAQ() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='faq-a'])[1]"));
	}
	public static WebElement FAQLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@href='/shipping-info#ShipGround']"));
	}
	public static WebElement FAQLink1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@href='/shipping-info#ShipOrder']"));
	}
	public static WebElement FAQLink2() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@href='/shipping-info#ShipRefunds']"));
	}
	public static WebElement FAQLink3() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@href='/jelly-belly-email-preference-center']"));
	}
	
	
	

}
