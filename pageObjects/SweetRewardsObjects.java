package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class SweetRewardsObjects {
	public static WebElement SweetRewards() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='sweetrewards-panel']"));
	}
	public static WebElement SweetRewardsTitle() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h3[contains(text(),'SWEET REWARDS')]"));
	}
	public static WebElement CheckPointsExpiryLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h6[@id='znpoints_expiry']/u"));
	}
	public static WebElement PointsExpirySection() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//h2[@class='zn-item-box-header zn-xsf']"));
	}
	public static WebElement Iframe() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='zrl_iframe']"));
	}
	

}
