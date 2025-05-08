package com.testCases;

import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.TestBase;
import com.utility.WebdriverUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.modules.ADAActions;
import com.pageObjects.ADAObjects;
import com.pageObjects.FlavourpageObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.ShoppingCartObjects;

public class ADATestCasesSprint14 extends TestBase{


	@Test(priority=228,description="#254: This cominicartTBDcolorlor combination does not meet the minimum color contrast required by the WCAG.")
	public void minicartTBDcolor() throws IOException, Exception{
		ADAActions.minicartTBDcolor();
	}
	@Test(priority=229,description="#255: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void minicartCongratscolor() throws IOException, Exception{
		ADAActions.minicartCongratscolor();
	}
	@Test(priority=230,description="#256: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void minicartViewcartColor() throws IOException, Exception{
		ADAActions.minicartViewcartColor();
	}
	//uncomment @Test(priority=231,description="#102: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void recipesBGColor() throws IOException, Exception{
		ADAActions.recipesBGColor();
	}
	@Test(priority=232,description="#14: All ID attributes must be unique across each page.")
	public void addToCartAttrib() throws IOException, Exception{
		ADAActions.addToCartAttrib();
	}
	@Test(priority=233,description="#30: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void freeShippingTextColor() throws IOException, Exception{
		ADAActions.freeShippingTextColor();
	}
	@Test(priority=234,description="#342: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void eventCalCAColor() throws IOException, Exception{
		ADAActions.eventCalCAColor();
	}
	@Test(priority=235,description="#343: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void eventCalWIColor() throws IOException, Exception{
		ADAActions.eventCalWIColor();
	}
	@Test(priority=236,description="#344: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void eventCalSportsColor() throws IOException, Exception{
		ADAActions.eventCalSportsColor();
	}
	@Test(priority=237,description="#277: The required form fields are not indicated as such to screen reader users.")
	public void requiredShippingAddrs() throws IOException, Exception{
		ADAActions.requiredShippingAddrs();
	}
	@Test(priority=238,description="#286: The error messages are not associated with their form fields correctly.")
	public void createAccErrMsg() throws IOException, Exception{
		ADAActions.createAccErrMsgValidate();
	}
	@Test(priority=239,description="#287: The required form fields are not indicated as such to screen reader users.")
	public void createAccrequiredFields() throws IOException, Exception{
		ADAActions.createAccrequiredFields();
	}
	@Test(priority=240,description="#288: When submitting the form with errors, the form field with an error is not automatically focused.")
	public void createAccStyleAttrib() throws IOException, Exception{
		ADAActions.createAccStyleAttrib();
	}
	@Test(priority=241,description="#290: These elements have an unnecessary ARIA attribute.")
	public void loginModalTabs() throws IOException, Exception{
		ADAActions.loginModalTabs();
	}
	@Test(priority=242,description="#304: This table does not have column and/or row headers specified in the markup.")
	public void checoutProductSummaryTag() throws IOException, Exception{
		ADAActions.checoutProductSummaryTag();
	}
	@Test(priority=243,description="#305: This character counter is not announced by screen readers.")
	public void checoutGiftMsgAttrib() throws IOException, Exception{
		ADAActions.checoutGiftMsgAttrib();
	}
	@Test(priority=244,description="#307: These images are decorative and provide no information to users.")
	public void checkoutFAQAttrib() throws IOException, Exception{
		ADAActions.checkoutFAQAttrib();
	}
	@Test(priority=245,description="#405: These are buttons, but they are not marked up as such; screen readers will not identify them as actionable and they will not be usable by keyboard users.") 
	public void shippingMethodPopupbtn() throws IOException, Exception{
		ADAActions.shippingMethodPopupbtn();
	}
	//Descoped in redesign site @Test(priority=246,description="#26: This color combination does not meet the minimum color contrast required by the WCAG.")
	public void homepageQuestionColor() throws IOException, Exception{
		ADAActions.homepageQuestionColor();
	}
}
