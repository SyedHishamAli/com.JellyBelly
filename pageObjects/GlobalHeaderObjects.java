package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class GlobalHeaderObjects {
	
	public static WebElement jellyBellyLogo() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='nav-header']//*[@class='head-list-item-li-new jb-logo-AB-test']//*[@class='mz-utilitynav-content-logo']/a"));
	}
	
	
	public static WebElement exploreLearnLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='mz-sitenav-link'][contains(text(),'Explore & Learn')]"));
	}
	
	public static WebElement exploreLearnPageHeader() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h1[@class='mz-l-titleh1'][contains(text(),'Explore Our Products ')]"));
	}
	public static WebElement prodName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='mz-pagetitle']"));
	}
	
	public static WebElement searchTextBox() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//form[@id='searchbox']//input[@placeholder='Search for Jelly Belly Products']"));
	}
	
	public static WebElement searchSubmitButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//form[@id='searchbox']//button[@title='Submit Search']"));
	}
	public static WebElement searchSubmitButton1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//form[@id='searchbox']//button[@title='Search']"));
	}
	public static WebElement searchResultForCode() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='mz-pagetitle']"));
	}
	
	public static WebElement searchResultForName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='heading-jb-result']"));
	}
	
	
	public static WebElement noSearchResultText() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='sorry-message']/strong"));
	}
	
	public static WebElement cartCount() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//span[@class='cartcount']"));
	}
	
	
	public static WebElement productNameAddedToMiniCart() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='item-shop-details']//h4"));
	}
	
	
}
