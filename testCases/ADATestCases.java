package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.modules.LoginActions;
import com.modules.MiniCartActions;
import com.modules.PDPActions;
import com.utility.TestBase;

public class ADATestCases extends TestBase{
	
	//Sprint 1
	@Test(priority=1,description="# 40 - \"Log In or Register\" button should be marked properly")
	 public void loginRegister() throws IOException, Exception{
		ADAActions.loginRegister();
	}
	@Test(priority=2,description="# 52 - Hero image should be marked with alt attribute")
	 public void heroTittle() throws IOException, Exception{
		ADAActions.heroTittle();
	}
	@Test(priority=3,description="# 55 - Page should have h1 heading and should be marked properly")
	 public void heroTittleAlt() throws IOException, Exception{
		ADAActions.heroTittleAlt();
	}
	@Test(priority=4,description="# 260 - Viewcart should be link not button")
	 public void viewcart() throws IOException, Exception{
		ADAActions.viewcart();
	}
	@Test(priority=5,description="#83 - pTag should be contain Aria attribute")
	 public void ptag() throws IOException, Exception{
		ADAActions.ptag();
	}
	@Test(priority=6,description="# 91 - Alt atrribute should not contain Image text in it")
	 public void image() throws IOException, Exception{
		ADAActions.image();
	}
	@Test(priority=7,description="# 17 - Beanboozled PLP should contain h1 heading and should be marked properly")
	 public void h1() throws IOException, Exception{
		ADAActions.h1();
	}
	@Test(priority=8,description="# 90 - Beanboozled PLP should not contain Article tag")
	 public void extraArticle() throws IOException, Exception{
		ADAActions.extraArticle();
	}
	@Test(priority=9,description="# 106 - Birthday party page should contain h1 heading and should be marked properly")
	 public void candyh1() throws IOException, Exception{
		ADAActions.candyh1();
	}
	@Test(priority=10,description="# 107 - Birthday party page get started button should be marked properly")
	 public void candyButton() throws IOException, Exception{
		ADAActions.candyButton();
	}
	@Test(priority=11,description="# 145 - Password field should be associated to relevant field")
	 public void password() throws IOException, Exception{
		ADAActions.password();
	}
	@Test(priority=12,description="# 146 - Email field should be associated to relevant field")
	 public void email() throws IOException, Exception{
		ADAActions.email();
	}
	@Test(priority=13,description="# 345 - Comapny history page Breadcrumb should be marked properly")
	 public void breadcrumb() throws IOException, Exception{
		ADAActions.breadcrumb();
	}
	@Test(priority=14,description="# 349 - Comapny history page Prev button should be marked properly")
	 public void prevButton() throws IOException, Exception{
		ADAActions.prevButton();
	}
	@Test(priority=15,description="# 350 - Comapny history page Next button should be marked properly")
	 public void nextButton() throws IOException, Exception{
		ADAActions.nextButton();
	}
	@Test(priority=16,description="# 325 - Wedding centre page Breadcrumb should be marked properly")
	 public void breadcrumb1() throws IOException, Exception{
		ADAActions.breadcrumb1();
	}
	@Test(priority=17,description="# 198 - JellyBelly bean page Breadcrumb should be marked properly")
	 public void jbOfficialFlavor() throws IOException, Exception{
		ADAActions.jbOfficialFlavor();
	}
	@Test(priority=18,description="# 200 - JellyBelly bean page Button should be marked properly")
	 public void jbOfficialFlavor1() throws IOException, Exception{
		ADAActions.jbOfficialFlavor1();
	}
	@Test(priority=19,description="# 209 - JellyBelly bean page Sort by should be labeled properly")
	 public void sortBy() throws IOException, Exception{
		ADAActions.sortBy();
	}
	@Test(priority=20,description="# 18 - PDP page should contain h1 heading and should be marked properly")
	 public void pdph1() throws IOException, Exception{
		ADAActions.pdph1();
	}
	@Test(priority=21,description="# 24 - Shipping info table should be marked as column")
	 public void col() throws IOException, Exception{
		ADAActions.col();
	}
	@Test(priority=22,description="# 24 - Shipping info table should be marked as row")
	 public void row() throws IOException, Exception{
		ADAActions.row();
	}
	@Test(priority=23,description="# 148 - PDP page Breadcrumb should be marked properly")
	 public void breadcrumb2() throws IOException, Exception{
		ADAActions.breadcrumb2();
	}
	
	//Sprint 2
	@Test(priority=24,description="# 3 - Verify the header in Item added popup")
	 public void itemAddedPopup() throws IOException, Exception{
		ADAActions.itemAddedPopup();
	}
	@Test(priority=25,description="# 5 - Verify role attribute should not be present in Campany retail")
	 public void companyRetail() throws IOException, Exception{
		ADAActions.companyRetail();
	}
	@Test(priority=26,description="# 9 - Verify footer email singup lable should be proper")
	 public void footerEmailSignup() throws IOException, Exception{
		ADAActions.footerEmailSignup();
	}
	@Test(priority=27,description="# 13 - Verify the category ID should be unique")
	 public void uniqueCategoryID() throws IOException, Exception{
		ADAActions.uniqueCategoryID();
	}
	@Test(priority=28,description="# 38 - Verify the Header links should not have aria label")
	 public void headerLinksAriaLabel() throws IOException, Exception{
		ADAActions.headerLinksAriaLabel();
	}
	@Test(priority=29,description="# 257 - Verify the Minicart product name should have h2 tag")
	 public void miniCartProductName() throws IOException, Exception{
	 	MiniCartActions.MinicartProductInfo();
		ADAActions.miniCartProductName();
	}
	@Test(priority=30,description="# 258 - Verify the Minicart price should not have h4 tag")
	 public void miniCartPrice() throws IOException, Exception{
		MiniCartActions.MinicartProductInfo();
		ADAActions.miniCartPrice();
	}
	@Test(priority=31,description="# 81 - Verify the content should not have aria label")
	 public void contentCaliforniaFactoryPage() throws IOException, Exception{
		ADAActions.contentCaliforniaFactoryPage();
	}
	@Test(priority=32,description="# 90 - Verify the page should not contain article tag")
	 public void contentCaliforniaFactoryPageArticle() throws IOException, Exception{
		ADAActions.contentCaliforniaFactoryPageArticle();
	}
	@Test(priority=33,description="# 110 - Verify the dropdown should be labeled properly")
	 public void birthdayPartyForm() throws IOException, Exception{
		ADAActions.birthdayPartyForm();
	}
	@Test(priority=34,description="# 111 - Verify the form fields should be labeled properly")
	 public void birthdayPartyFormField() throws IOException, Exception{
		ADAActions.birthdayPartyFormField();
	}
	@Test(priority=35,description="# 244 - Verify the quantity field is labeled properly")
	 public void quantityField() throws IOException, Exception{
		 PDPActions.NavToCartPage();
		ADAActions.quantityField();
	}
	@Test(priority=36,description="# 252 - Verify the quantity field should have h2 tag")
	 public void recommendationHeading() throws IOException, Exception{
		ADAActions.recommendationHeading();
	}
	@Test(priority=37,description="# 347 - Verify the content should not have aria label")
	 public void companyHistory() throws IOException, Exception{
		ADAActions.companyHistory();
	}
	@Test(priority=38,description="# 369 - Verify the page should not have article tag")
	 public void companyHistoryArticle() throws IOException, Exception{
		ADAActions.companyHistoryArticle();
	}
	@Test(priority=39,description="# 400 - Verify the quantity field should be labeled as button")
	 public void quantityCart() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		ADAActions.quantityCart();
	}
	
	//Sprint 3
	@Test(priority=40,description="# 58 - Verify the footer tag for respective tags")
	 public void footerTag() throws IOException, Exception{
		ADAActions.footerTag();
	}
	@Test(priority=41,description="# 59 - Verify the section should have h2 tag")
	 public void footerh2() throws IOException, Exception{
		ADAActions.footerh2();
	}
	@Test(priority=42,description="# 60 - Verify the social footer section is listed")
	 public void footerTagList() throws IOException, Exception{
		ADAActions.footerTagList();
	}
	@Test(priority=43,description="# 61 - Verify the Centre logo is button")
	 public void centerLogo() throws IOException, Exception{
		ADAActions.centerLogo();
	}
	@Test(priority=44,description="# 95 - Verify the been boozled app icons should have linked properly")
	 public void beenboozledApp() throws IOException, Exception{
		ADAActions.beenboozledApp();
	}
	@Test(priority=45,description="# 103 - Verify the aria attributes are added for the Modal properly")
	 public void candyModal() throws IOException, Exception{
		ADAActions.candyModal();
	}
	@Test(priority=46,description="# 118 - Verify the Printable images is labled as list")
	 public void pritableImageList() throws IOException, Exception{
		ADAActions.pritableImageList();
	}
	@Test(priority=47,description="# 119 - Verify the Printable images have proper attribute")
	 public void printableImages() throws IOException, Exception{
		ADAActions.printableImages();
	}
	
	//Sprint 4
	@Test(priority=48,description="#10 - Verify the Phone number is listed or not")
	 public void telephoneNumberli() throws IOException, Exception{
		ADAActions.telephoneNumberli();
	}
	@Test(priority=49,description="# 11 - Verify the Phone number is having p tag or not")
	 public void telephoneNumberp() throws IOException, Exception{
		ADAActions.telephoneNumberp();
	}
	@Test(priority=50,description="# 46 - Verify the megamenu is listed with order")
	 public void megamenuNav() throws IOException, Exception{
		ADAActions.megamenuNav();
	}
	@Test(priority=51,description="# 138 - Verify the sweet reward is been displayed as heading or not")
	 public void sweetRewardHeading() throws IOException, Exception{
		ADAActions.sweetRewardHeading();
	}
	@Test(priority=52,description="# 139 - Verify the sweet reward has Aria lable or not")
	 public void sweetRewardAria() throws IOException, Exception{
		ADAActions.sweetRewardAria();
	}
	@Test(priority=53,description="# 141 - Verify the error in the login page")
	 public void loginpageError() throws IOException, Exception{
		ADAActions.loginpageError();
	}
	@Test(priority=54,description="# 202 - Verify the Jelly falvors are displaying or not")
	 public void jeelyFlavors() throws IOException, Exception{
		ADAActions.jellyFlavors();
	}
	@Test(priority=55,description="# 204 - Verify the heading is marked as h2 or not")
	 public void headingh2() throws IOException, Exception{
		ADAActions.headingh2();
	}
	@Test(priority=56,description="# 205 - Verify the description is displayed as button or not")
	 public void descriptionNbutton() throws IOException, Exception{
		ADAActions.descriptionNbutton();
	}
	@Test(priority=57,description="# 207 - Verify the text should have aria label")
	 public void textAria() throws IOException, Exception{
		ADAActions.textAria();
	}
	@Test(priority=58,description="# 210 - Verify the text is marked as heading")
	 public void textHeading() throws IOException, Exception{
		ADAActions.textHeading();
	}
	@Test(priority=59,description="# 217 - Verify the price attribute has aria label or not")
	 public void priceAria() throws IOException, Exception{
		ADAActions.priceAria();
	}
	@Test(priority=60,description="# 219 - Verify the Modal has container or not")
	 public void modalContainer() throws IOException, Exception{
		ADAActions.modalContainer();
	}
	@Test(priority=61,description="# 220 - Verify the modal will be closed on click of esc button")
	 public void modalEsc() throws IOException, Exception{
		ADAActions.modalEsc();
	}
	@Test(priority=62,description="# 324 - Verify the JB wedding centre as Heading")
	 public void jbHeading() throws IOException, Exception{
		ADAActions.jbHeading();
	}
	@Test(priority=63,description="# 326 - Verify the Image has alt attribute or not")
	 public void imageBridegroom() throws IOException, Exception{
		ADAActions.imageBridegroom();
	}
	@Test(priority=64,description="# 338 - Verify the Store image has alt attribute or not")
	 public void storeImage() throws IOException, Exception{
		ADAActions.storeImage();
	}
	@Test(priority=65,description="# 339 - Verify the Store map is accessiable or not")
	 public void storeMap() throws IOException, Exception{
		ADAActions.storeMap();
	}
	@Test(priority=66,description="# 346 - Verify the Carousel has Aria label or not")
	 public void carouselAria() throws IOException, Exception{
		ADAActions.carouselAria();
	}
	@Test(priority=67,description="# 353 - Verify the slide is marked as heading or not")
	 public void slideHeading() throws IOException, Exception{
		ADAActions.slideHeading();
	}
	@Test(priority=68,description="# 357 - Verify the links are having alt attributes or notl")
	 public void articleWrap() throws IOException, Exception{
		ADAActions.articleWrap();
	}
	@Test(priority=69,description="# 358 - Verify the listed in order or not")
	 public void headings() throws IOException, Exception{
		ADAActions.headings();
	}
	@Test(priority=70,description="# 359 - Verify the handy links are listed out correctly")
	 public void wrapList() throws IOException, Exception{
		ADAActions.wrapList();
	}
	@Test(priority=71,description="# 360 - Verify the question should be listed properly")
	 public void listQuestion() throws IOException, Exception{
		ADAActions.listQuestion();
	}
	@Test(priority=72,description="# 362 - Verify the telephone number should be marked as link")
	 public void myOrderShip() throws IOException, Exception{
		ADAActions.myOrderShip();
	}
	
	//Sprint 5
	@Test(priority=73,description="# 150 - Verify the images should not have arial attribute")
	 public void pdpImages() throws IOException, Exception{
		ADAActions.pdpImages();
	}
	@Test(priority=74,description="# 153 - Verify the enlarge image icon should display as button")
	 public void enlargeImage() throws IOException, Exception{
		ADAActions.enlargeImage();
	}
	@Test(priority=75,description="# 154 - Verify the thumbnail images should display as button")
	 public void thumbnailImages() throws IOException, Exception{
		ADAActions.thumbnailImages();
	}
	@Test(priority=76,description="# 156 - Verify the thumbnails are under div")
	 public void thumbnailImageInside() throws IOException, Exception{
		ADAActions.thumbnailImageInside();
	}
	@Test(priority=77,description="# 165 - Verify the click here link should be button")
	 public void clickHere() throws IOException, Exception{
		ADAActions.clickHere();
	}
	@Test(priority=78,description="# 169 - Verify free ground text is h1")
	 public void freeGroundtext() throws IOException, Exception{
		ADAActions.freeGroundtext();
	}
	@Test(priority=79,description="# 170 - Verify the dialog should be labeled properly")
	 public void freeGroundModal() throws IOException, Exception{
		ADAActions.freeGroundModal();
	}
	@Test(priority=80,description="# 171 - Verify the dialog should not have unnecessary label")
	 public void freeGroundModal1() throws IOException, Exception{
		ADAActions.freeGroundModal1();
	}
	@Test(priority=81,description="# 174 - Verify headings should be h2")
	 public void relatedHeading() throws IOException, Exception{
		ADAActions.relatedHeading();
	}
	@Test(priority=82,description="# 177 - Verify the carousel should be button")
	 public void carousel() throws IOException, Exception{
		ADAActions.carousel();
	}
	@Test(priority=83,description="# 178 - Verify related product section should be labeled properly")
	 public void relatedSectionlabel() throws IOException, Exception{
		ADAActions.relatedSectionlabel();
	}
	@Test(priority=84,description="# 179 - Verify related product section should not have unnecessary attribute")
	 public void relatedSection() throws IOException, Exception{
		ADAActions.relatedSection();
	}
	@Test(priority=85,description="# 181 - Verify the carousel should be labeled properly")
	 public void carouselLabel() throws IOException, Exception{
		ADAActions.carouselLabel();
	}
	@Test(priority=86,description="# 184 - Verify product info should be under list")
	 public void prodInfo() throws IOException, Exception{
		ADAActions.prodInfo();
	}
	@Test(priority=87,description="# 186 - Verify JellyBelly recommends section in h2")
	 public void jbrecommends() throws IOException, Exception{
		ADAActions.jbrecommends();
	}
	@Test(priority=88,description="# 190 - Verify quantity fields are label properly")
	 public void qtyfieldLabel() throws IOException, Exception{
		ADAActions.qtyfieldLabel();
	}
	@Test(priority=89,description="# 191 - Verify quantity fields are displayed as buttons")
	 public void qtyfieldLabelbuttons() throws IOException, Exception{
		ADAActions.qtyfieldLabelbuttons();
	}
	@Test(priority=90,description="# 213 - Verify related product names should be h3")
	 public void relatedprodNames() throws IOException, Exception{
		ADAActions.relatedprodNames();
	}
	@Test(priority=91,description="# 223 - Verify login popup buttons are not having unnecessary attribute")
	 public void loginpopupButtons() throws IOException, Exception{
		ADAActions.loginpopupButtons();
	}
	@Test(priority=92,description="# 224 - Verify all flavor should be as headings")
	 public void allFlavorHeading() throws IOException, Exception{
		ADAActions.allFlavorHeading();
	}
	@Test(priority=93,description="# 227 - Verify Item added popup heading is labeled properly")
	 public void itemaddedpopup() throws IOException, Exception{
		ADAActions.itemaddedpopup();
	}
	@Test(priority=94,description="# 230 - This heading level appears in an illogical order.")
	public void MinicartNameInfo() throws IOException, Exception{
		MiniCartActions.MinicartNameInfo();
		ADAActions.miniCartName();
	}
	@Test(priority=95,description="# 233 - Multiple elements have unnecessary ARIA attributes.")
	public void MinicartNameInfo1() throws IOException, Exception{
		MiniCartActions.MinicartNameInfo1();
		ADAActions.modalCartName();
	}
	@Test(priority=96,description="# 267 - Shipping Method, Ensure that the legend tag is the first child of the fieldset that it labels.")
	public void ShippingMethodTag() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.shippingTag();
	}
	@Test(priority=97,description="# 264 - Checkout Page, These heading levels appear in an illogical order.")
	public void verifycheckoutMethodTags() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.checkoutTags();
	}
	@Test(priority=98,description="# 293 - Checkout Page, Coupon code input field error.The error message is not associated with its form field")
	public void verifycouponcodeTag() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.couponcodetag();
	}
	@Test(priority=99,description="# 280 - Checkout Page, This is marked up as a list, but it is not semantically a list, add the attribute role=\"presentation\" to the list tag.")
	public void verifycreditcardTag() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.creditCardTagtag();
	}
	@Test(priority=100,description="# 378 - Checkout Page, Remove the tabindex attribute from this element.")
	public void verifycreditcardTag1() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.creditCardTagtag1();
	}
	@Test(priority=101,description="# 12 - Accessibility Statement, These telephone numbers and Mail are not marked up as links.")
	public void accessibitystatement() throws IOException, Exception{
		ADAActions.accessibitystatement();
		
	}
	@Test(priority=102,description="# 20 - Accessibility Statement, This page does not have an h1 heading")
	public void accessibityPageHeading() throws IOException, Exception{
		ADAActions.accessibityPageHeading();
		
	}
	@Test(priority=103,description="# 366 - Home Page, These elements have an unnecessary ARIA attribute.")
	public void megaMenuHeading() throws IOException, Exception{
		ADAActions.megaMenuHeading();
	}
	
	@Test(priority=104,description="# 309 - Checkout Page, Verify telephone Number is marked as link")
	public void phoneNumberCheckout() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.NavigationToCheckoutPage1();
		ADAActions.phoneNumberCheckout();
		
	}
	@Test(priority=105,description="# 402 - Heat Sensitive Modal, The modal dialog container is not labeled as such.")
	public void HeatSensitiveToCheckout() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.HeatSensitiveToCheckout();
		ADAActions.HeatSensitiveModal();
		
	}
	
	@Test(priority=106,description="# 403 - Heat Sensitive Modal, This modal dialog lacks a main heading.")
	public void HeatSensitiveToCheckout1() throws IOException, Exception{
		LoginActions.verifyLoginFunctionality();
		MiniCartActions.HeatSensitiveToCheckout();
		ADAActions.HeatSensitiveModalTitle();
		
	}
	
	//Sprint 7
	@Test(priority=107,description="# 37 - Home Page, This telephone number link is not marked up correctly.")
	public void HomePhone() throws IOException, Exception{
		ADAActions.HomePhone();
	}
	
	
	
	/*@Test(priority=94,description="# 12 - Verify Phone numbers are maintained as links")
	 public void phoneNumberLinks() throws IOException, Exception{
		ADAActions.phoneNumberLinks();
	}
	@Test(priority=95,description="# 20 - Verify JB accessability statement is h1")
	 public void jbaccessability() throws IOException, Exception{
		ADAActions.jbaccessability();
	}
	@Test(priority=96,description="# 230 - Verify JB recommended headings in Item added popup is with h2")
	 public void jbRecommended() throws IOException, Exception{
		ADAActions.jbRecommended();
	}
	@Test(priority=97,description="# 233 - Verify Item added popup heading shouldn't have un-necessary attribute")
	 public void itemaddedpopupHead() throws IOException, Exception{
		ADAActions.itemaddedpopupHead();
	}
	@Test(priority=98,description="# 264 - Verify Step headings are properly labled in checkout")
	 public void stepHeadingsCheckout() throws IOException, Exception{
		ADAActions.stepHeadingsCheckout();
	}
	@Test(priority=99,description="# 267 - Verify shipping methods radio buttons should have fieldset and legend")
	 public void shippingMethodRadioButton() throws IOException, Exception{
		ADAActions.shippingMethodRadioButton();
	}
	@Test(priority=100,description="# 280 - Verify Payment method information should have presentation and ul tag")
	 public void paymentMethodInfo() throws IOException, Exception{
		ADAActions.paymentMethodInfo();
	}
	@Test(priority=101,description="# 293 - Verify coupon text error message should have proper attribute ")
	 public void couponErrror() throws IOException, Exception{
		ADAActions.couponErrror();
	}
	@Test(priority=102,description="# 309 - Verify telephone Number is marked as link")
	 public void phoneNumberCheckout() throws IOException, Exception{
		ADAActions.phoneNumberCheckout();
	}
	@Test(priority=103,description="# 366 - Verify menu items should not have attributes")
	 public void menuItemsMegamenu() throws IOException, Exception{
		ADAActions.menuItemsMegamenu();
	}
	@Test(priority=104,description="# 378 - Verify Payment method information should not have Tabindex attribute")
	 public void paymentMethodAttribute() throws IOException, Exception{
		ADAActions.paymentMethodAttribute();
	}
	@Test(priority=105,description="# 402 - Verify Heat sensitve popup should be label properly")
	 public void heatSensitivepopup() throws IOException, Exception{
		ADAActions.heatSensitivepopup();
	}
	@Test(priority=106,description="# 403 - Verify Heat sensitve popup heading should be label properly")
	 public void heatSensitivepopupHeading() throws IOException, Exception{
		ADAActions.heatSensitivepopupHeading();
	}*/
	
}
