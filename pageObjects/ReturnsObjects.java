package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class ReturnsObjects {
	public static WebElement Returns() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='returnhistory-panel']"));
	}
	public static WebElement ReturnsContent() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id=\"x-account-returnhistory\"]/div"));
	}
	public static WebElement ReturnsLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//p[@class='mz-accountaddressbook-empty']/a"));
	}
	

}
