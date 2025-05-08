package com.modules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.pageObjects.GlobalHeaderObjects;
import com.pageObjects.SignUpObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class OrderStatusActions {
	
	
	public static void logoDisplay() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(GlobalHeaderObjects.jellyBellyLogo(), 10);
		WebdriverUtils.clickAction(SignUpObjects.signUpLink());
		BrowserUtils.waitFor(SignUpObjects.signUpFirstName(), 10);
		WebdriverUtils.clickAction(SignUpObjects.signUpFirstName());
		WebdriverUtils.sendKeys(SignUpObjects.signUpFirstName(), pro.getProperty("signUpFirstName"));
		WebdriverUtils.clickAction(SignUpObjects.signUpLastName());
		WebdriverUtils.sendKeys(SignUpObjects.signUpLastName(), pro.getProperty("signUpLastName"));
		WebdriverUtils.clickAction(SignUpObjects.signUpEmailAddress());
		String email=WebdriverUtils.generateRandomEmail();
		System.out.println(email);
		WebdriverUtils.sendKeys(SignUpObjects.signUpEmailAddress(),email );
		WebdriverUtils.clickAction(SignUpObjects.signUpPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpPassword(), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpConfirmPassword());
		WebdriverUtils.sendKeys(SignUpObjects.signUpConfirmPassword(), pro.getProperty("signUpPassword"));
		WebdriverUtils.clickAction(SignUpObjects.signUpRegisterButton());
		BrowserUtils.waitFor(SignUpObjects.myAccountEmail(), 18);
		
		
	}

}
