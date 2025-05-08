package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.LoginObjects;
import com.pageObjects.SignUpObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class SignUpActions {
	public static void signUpFunctionality() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getUAT_URL());
		BrowserUtils.waitFor(LoginObjects.LogInLink(), 10);
		WebdriverUtils.moveToElementByActions(LoginObjects.LogInLink());
		WebdriverUtils.clickAction(SignUpObjects.signUpLink());
		Thread.sleep(20000);
		WebdriverUtils.refreshPage();
		Thread.sleep(3000);
		BrowserUtils.waitFor(SignUpObjects.signUpFirstName(), 10);
		WebdriverUtils.clickAction(SignUpObjects.signUpFirstName());
		WebdriverUtils.sendKeys(SignUpObjects.signUpFirstName(), pro.getProperty("signUpFirstName"));
		Assert.assertEquals(SignUpObjects.signUpFirstName().getAttribute("value"), pro.getProperty("signUpFirstName"));
		WebdriverUtils.clickAction(SignUpObjects.signUpEmailAddress());
		String email=WebdriverUtils.generateRandomEmail();
		WebdriverUtils.sendKeys(SignUpObjects.signUpEmailAddress(),email );
		Assert.assertEquals(SignUpObjects.signUpEmailAddress().getAttribute("value"), email);
		WebdriverUtils.clickAction(SignUpObjects.signUpPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpConfirmPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpConfirmPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpConfirmPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpConfirmPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpConfirmPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpConfirmPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpConfirmPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpConfirmPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpRegisterButton());
		BrowserUtils.waitFor(SignUpObjects.myAccountEmail(), 18);
		Assert.assertEquals(SignUpObjects.myAccountEmail().getText().trim(), email);
	}
	public static String CreateNewAccount() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getUAT_URL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		WebdriverUtils.clickAction(SignUpObjects.signUpLink());
		Thread.sleep(20000);
		WebdriverUtils.refreshPage();
		Thread.sleep(3000);
		BrowserUtils.waitFor(SignUpObjects.signUpFirstName(), 10);
		WebdriverUtils.clickAction(SignUpObjects.signUpFirstName());
		WebdriverUtils.sendKeys(SignUpObjects.signUpFirstName(), pro.getProperty("signUpFirstName"));
		Assert.assertEquals(SignUpObjects.signUpFirstName().getAttribute("value"), pro.getProperty("signUpFirstName"));
		WebdriverUtils.clickAction(SignUpObjects.signUpLastName());
		WebdriverUtils.sendKeys(SignUpObjects.signUpLastName(), pro.getProperty("signUpLastName"));
		Assert.assertEquals(SignUpObjects.signUpLastName().getAttribute("value"), pro.getProperty("signUpLastName"));
		WebdriverUtils.clickAction(SignUpObjects.signUpEmailAddress());
		String email=WebdriverUtils.generateRandomEmail();
		System.out.println(email);
		WebdriverUtils.sendKeys(SignUpObjects.signUpEmailAddress(),email );
		Assert.assertEquals(SignUpObjects.signUpEmailAddress().getAttribute("value"), email);
		WebdriverUtils.clickAction(SignUpObjects.signUpPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpConfirmPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpConfirmPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpConfirmPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpConfirmPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpRegisterButton());
		BrowserUtils.waitFor(SignUpObjects.myAccountEmail(), 18);
		Assert.assertEquals(SignUpObjects.myAccountEmail().getText().trim(), email);
		return email;
	}
	
	
	public static void signUpFunctionalityWithoutmandatoryFields() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());	
		BrowserUtils.waitFor(HomePageObjects.myAccount(), 10);
		WebdriverUtils.moveToElement(HomePageObjects.myAccount());
		BrowserUtils.waitFor(LoginObjects.LogInLink(), 20);
		WebdriverUtils.moveToElementByActions(LoginObjects.LogInLink());
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpLink(),"click");
		Thread.sleep(20000);
		WebdriverUtils.refreshPage();
		Thread.sleep(3000);
		BrowserUtils.waitFor(SignUpObjects.signUpFirstName(), 10);
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpFirstName(),"click");
		WebdriverUtils.sendKeys(SignUpObjects.signUpFirstName(), pro.getProperty("signUpFirstName"));
		Assert.assertEquals(SignUpObjects.signUpFirstName().getAttribute("value"), pro.getProperty("signUpFirstName"));
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpEmailAddress(),"click");
		String email=WebdriverUtils.generateRandomEmail();
		WebdriverUtils.sendKeys(SignUpObjects.signUpEmailAddress(),email );
		Assert.assertEquals(SignUpObjects.signUpEmailAddress().getAttribute("value"), email);
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpPassword(),"click");
		WebdriverUtils.sendKeys(SignUpObjects.signUpPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpConfirmPassword(),"click");
		WebdriverUtils.sendKeys(SignUpObjects.signUpConfirmPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpConfirmPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpConfirmPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		Thread.sleep(7000);
		//WebdriverUtils.scrollToElement(SignUpObjects.signupcheckbox());
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signupcheckbox(),"Checkbox");
		Thread.sleep(7000);
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpRegisterButton(),"click");
		BrowserUtils.waitFor(SignUpObjects.errorMessage(), 18);
		Assert.assertEquals(SignUpObjects.errorMessage().getText().trim(),pro.getProperty("errorMsgLastName"));
	}
	
	public static void signUpFunctionalityWithExistingEmail() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		BrowserUtils.waitFor(HomePageObjects.myAccount(), 10);
		WebdriverUtils.moveToElement(HomePageObjects.myAccount());
		//WebdriverUtils.moveToElementByActions(LoginObjects.LogInLink());
		WebdriverUtils.clickAction(SignUpObjects.signUpLink());
		Thread.sleep(20000);
		WebdriverUtils.refreshPage();
		Thread.sleep(5000);
		BrowserUtils.waitFor(SignUpObjects.signUpFirstName(), 10);
		WebdriverUtils.clickAction(SignUpObjects.signUpFirstName());
		WebdriverUtils.sendKeys(SignUpObjects.signUpFirstName(), pro.getProperty("signUpFirstName"));
		Assert.assertEquals(SignUpObjects.signUpFirstName().getAttribute("value"), pro.getProperty("signUpFirstName"));
		WebdriverUtils.clickAction(SignUpObjects.signUpLastName());
		WebdriverUtils.sendKeys(SignUpObjects.signUpLastName(), pro.getProperty("signUpLastName"));
		Assert.assertEquals(SignUpObjects.signUpLastName().getAttribute("value"), pro.getProperty("signUpLastName"));
		WebdriverUtils.clickAction(SignUpObjects.signUpEmailAddress());
		String email=pro.getProperty("existingMailId");
		System.out.println(email);
		WebdriverUtils.sendKeys(SignUpObjects.signUpEmailAddress(),email);
		Assert.assertEquals(SignUpObjects.signUpEmailAddress().getAttribute("value"), email);
		WebdriverUtils.clickAction(SignUpObjects.signUpPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpConfirmPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpConfirmPassword(), pro.getProperty("signUpPassword"));
		System.out.println(SignUpObjects.signUpConfirmPassword().getAttribute("value"));
		Assert.assertEquals(SignUpObjects.signUpConfirmPassword().getAttribute("value"), pro.getProperty("signUpPassword"));
		Thread.sleep(10000);
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signupcheckbox(),"Checkbox");
		Thread.sleep(4000);
		//WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpRegisterButton(),"Click");
		//BrowserUtils.waitFor(SignUpObjects.errorMessage(), 18);
		//Assert.assertEquals(SignUpObjects.errorMessage().getText().trim(),pro.getProperty("errorMsgMail"));
	}
	public static void errormessagewithemptyfileds() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		BrowserUtils.waitFor(HomePageObjects.myAccount(), 10);
		WebdriverUtils.moveToElement(HomePageObjects.myAccount());
		WebdriverUtils.moveToElementByActions(LoginObjects.LogInLink());
		WebdriverUtils.clickAction(SignUpObjects.signUpLink());
		BrowserUtils.waitFor(SignUpObjects.signUpFirstName(), 10);
		Thread.sleep(2000);
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signupcheckbox(),"Checkbox");
		Thread.sleep(2000);
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpRegisterButton(),"Click");
		BrowserUtils.waitFor(SignUpObjects.errorMessage(), 20);
		Assert.assertEquals(SignUpObjects.errorMessage().getText().trim(),pro.getProperty("errorMsgFirstName"));
		WebdriverUtils.sendKeys(SignUpObjects.signUpFirstName(), pro.getProperty("signUpFirstName"));
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpRegisterButton(),"Click");
		BrowserUtils.waitFor(SignUpObjects.errorMessage(), 20);
		Assert.assertEquals(SignUpObjects.errorMessage().getText().trim(),pro.getProperty("errorMsgLastName"));
		WebdriverUtils.sendKeys(SignUpObjects.signUpLastName(), pro.getProperty("signUpLastName"));
		WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpRegisterButton(),"Click");
		BrowserUtils.waitFor(SignUpObjects.errorMessage(), 20);
		Assert.assertEquals(SignUpObjects.errorMessage().getText().trim(),pro.getProperty("errorMsgEmail"));
		WebdriverUtils.sendKeys(SignUpObjects.signUpEmailAddress(),pro.getProperty("existingMailId"));
		//WebdriverUtils.clickButtonThroughJS(SignUpObjects.signUpRegisterButton(),"Click");
		//BrowserUtils.waitFor(SignUpObjects.errorMessage(), 25);
		//Assert.assertEquals(SignUpObjects.errorMessage().getText().trim(),pro.getProperty("errorMsgPassword"));
	}
	
}
