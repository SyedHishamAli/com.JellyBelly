package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class DSDObjects {
	
	public static WebElement email() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@name='email-login']"));
	}
	
	public static WebElement password() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@name='password-login']"));
	}
	
	public static WebElement login() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@class='mz-button mz-button-large']"));
	}
	
	
	
	
	
	

}
