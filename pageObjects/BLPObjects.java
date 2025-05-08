package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class BLPObjects {
//	public static WebElement Aspotimg() throws Exception{
//		  return WebdriverUtils.findElement(By.xpath("//*[contains(@class,'a-spot-cointainer opacity')]"));
//	}
//	
	public static WebElement Aspotimg() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[contains(@class,'a-spot-container-section')]"));
	}
		
	public static String cookiebutton() throws Exception{
		  return "//*[@id='cookie-consent']";
	}
	public static List<WebElement> Recommendedproduct() throws Exception{
		  return WebdriverUtils.findElements(By.xpath("//*[@class='upper tns-item tns-slide-active']//following::*[@class='monetate-add-to-cart']")); 
	}
	public static WebElement Recommendedatcproduct() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='monetate-recommendations']//*[@class='upper tns-item tns-slide-active']//following::*[@class='monetate-add-to-cart']"));  
	}
	public static WebElement Recommendedproductname() throws Exception{
		//  return WebdriverUtils.findElement(By.xpath("//*[@id='monetate-recommendations']//*[@class='upper tns-item tns-slide-active']//following::a[@class='mt-productlisting-title']/div")); 
		  return WebdriverUtils.findElement(By.xpath("//*[@id='monetate-recommendations']//*[@class='upper tns-item tns-slide-active']//following::*[@class='monetate-add-to-cart']/../../../../..//a[@class='mt-productlisting-title']/div")); 
	}
	public static WebElement notifymeproduct() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-out-of-stock-cur notify-me-plp-rti'])[1]"));
	}
	public static WebElement Recommendedtitle() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//*[@class='monetate-block-title'])[2]")); 
	}
}
