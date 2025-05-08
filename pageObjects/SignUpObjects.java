package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class SignUpObjects {
	
	public static WebElement signUpLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Register')]"));
	}
	public static WebElement signUpFirstName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@class='mz-signup-firstname']"));
	}
	public static WebElement signUpLastName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@class='mz-signup-lastname']"));
	}	
	public static WebElement signUpEmailAddress() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@class='mz-signup-email']"));
	}	
	public static WebElement signUpPassword() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@class='mz-signup-password']"));
	}
	public static WebElement signUpConfirmPassword() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@class='mz-signup-confirmpassword']"));
	}
	public static WebElement signUpRegisterButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@id='signup-submit']"));
	}
	public static WebElement signedUpName() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	}
	public static WebElement myAccountEmail() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-accountsettings-user']//span)[1]"));
	}
	public static WebElement errorMessage() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//p[@id='error-inventory']"));
	}
	
	public static WebElement signupcheckbox() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='signup-cpp-checkbox']"));
				
	}
}


