package com.modules;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.pageObjects.BLPObjects;
import com.pageObjects.FlavourpageObjects;
import com.pageObjects.HomePageObjects;
import com.pageObjects.PLPObjects;
import com.pageObjects.QuickViewObjects;
import com.utility.BrowserUtils;
import com.utility.Environments;
import com.utility.WebdriverUtils;

public class BLPActions {

	public static void Aspotverification() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		WebdriverUtils.goToURL(Environments.getURL());
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.clickAction(HomePageObjects.MegaMenu());
		Thread.sleep(3000);
		WebdriverUtils.clickButtonThroughJS(HomePageObjects.Brand(),"click");
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		Thread.sleep(3000);
		Assert.assertTrue(BLPObjects.Aspotimg().isDisplayed());
	}

	public static void Shoponlineandfindstore() throws Exception {
		Aspotverification();
		WebdriverUtils.swipeDownUntillElement(FlavourpageObjects.Shoponline());
		WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.Shoponline(),"click");
		Thread.sleep(3000);
		WebdriverUtils.isVisibleInViewport(FlavourpageObjects.filtersection());
		Thread.sleep(2000);
		WebdriverUtils.swipeUpUntillElement(FlavourpageObjects.Shoponline());
		WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.findastore(),"click");
		Thread.sleep(2000);
		BrowserUtils.waitFor(HomePageObjects.PLP_title(), 10);
		Assert.assertTrue(HomePageObjects.PLP_title().isDisplayed());

	}

	public static void Subcategorynavigation() throws Exception {
		Aspotverification();
		String URLbefore = FlavourpageObjects.Shopbulklink().getAttribute("href");
		WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.Shopbulklink(),"click");
		BrowserUtils.waitFor(HomePageObjects.PLP(), 10);
		Thread.sleep(2000);
		String URLafter =WebdriverUtils.getWindowURL();
		assertEquals(URLafter, URLbefore);

	}
	public static void sortfunctionality() throws Exception {
		Aspotverification();
		Thread.sleep(4000);
		Double AfterSort=0.00;
		try{
			AfterSort=Double.parseDouble(PLPObjects.SortPrice().getText().replace("$", "").trim());
			System.out.println(AfterSort);
		}
		catch(Exception e){
			AfterSort=Double.parseDouble(PLPObjects.SortPrice1().getText().replace("$", "").replace("SALE:", "").replace(" ", "").trim());
			System.out.println(AfterSort);
		}
		WebdriverUtils.selectByIndex(PLPObjects.PLPsort(), 2);
		Thread.sleep(1000);
		WebdriverUtils.waitForElementToBeClickable(PLPObjects.PLPsort(), 30);
		BrowserUtils.waitFor(PLPObjects.SortPrice(), 10);
		Thread.sleep(20000);
		Double Sort2=0.00;
		try{
			Sort2=Double.parseDouble(PLPObjects.SortPrice().getText().replace("$", "").trim());
			System.out.println(Sort2);
		}
		catch(Exception e){
			Sort2=Double.parseDouble(PLPObjects.SortPrice1().getText().replace("$", "").replace("SALE:", "").replace(" ", "").trim());
			System.out.println(Sort2);
		}
		Assert.assertTrue(Sort2>AfterSort);
	}
	public static void filterfunctionality() throws Exception {
		Aspotverification();
		WebdriverUtils.clickButtonThroughJS(PLPObjects.Filter(),"click");
		Thread.sleep(4000);
		WebdriverUtils.clickButtonThroughJS(PLPObjects.FilterPrice(),"click");
		Thread.sleep(4000);
		WebdriverUtils.clickButtonThroughJS(PLPObjects.PriceRange(),"click");
		WebdriverUtils.waitForVisibilityOfElementLocated(PLPObjects.Apply());
		WebdriverUtils.clickButtonThroughJS(PLPObjects.Apply(),"click");
		BrowserUtils.waitFor(PLPObjects.FilterStrip(), 15);
		Thread.sleep(6500);
		Assert.assertEquals(PLPObjects.FilterStrip().getAttribute("aria-label").toLowerCase(), "0 To 10 $".toLowerCase());
		Assert.assertEquals(PLPObjects.ResetButton().getAttribute("aria-label"), "Reset");
	}

	public static void BLPtoPDPNavigation() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Aspotverification();
		BrowserUtils.waitFor(FlavourpageObjects.Shopbulklink(), 10);
		WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.Shopbulklink(),"click");
		Thread.sleep(2000);
		BrowserUtils.waitFor(PLPObjects.PLPProductName(), 10);
		Thread.sleep(2000);
		Assert.assertTrue(PLPObjects.PDPProductName().isDisplayed());
	}
	public static void BLPLoadMoreandshowmore() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Aspotverification();
		BrowserUtils.waitFor(PLPObjects.LoadMoreButton(), 20);
		WebdriverUtils.clickButtonThroughJS(PLPObjects.LoadMoreButton(),"click");
		Thread.sleep(6000);
		BrowserUtils.waitFor(PLPObjects.ProductCount(), 20);
		String[] totalcount =PLPObjects.ProductCount().getText().trim().split(" ");
		int Products=PLPObjects.Products().size();		
		Assert.assertEquals(PLPObjects.ProductCount().getText().trim(),"Showing 1 - "+Products+" of "+totalcount[5]+" products");
		BrowserUtils.waitFor(PLPObjects.PLPProductName(), 10);
		Assert.assertEquals(PLPObjects.ProductCount().getText().trim(),"Showing 1 - "+totalcount[3]+" of "+totalcount[5]+" products");
	}
	public static void ATCandelementsinpopup() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Aspotverification();
		BrowserUtils.waitFor(FlavourpageObjects.productnameinFLP(), 20);
		WebdriverUtils.swipeDownUntillElement(FlavourpageObjects.productnameinFLP());
		String productname=FlavourpageObjects.productnameinFLP().getText();
		WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.ATCProduct(),"click");
		BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);
		Thread.sleep(4000);
		assertEquals(FlavourpageObjects.productnameinpopup().getText(), productname);
		assertEquals(FlavourpageObjects.quantityinpopup1().getText(), "1");
		assertEquals(FlavourpageObjects.ATCtextinpopup().getText(), "ADDED TO CART!");
	}
	public static void NotifyFunctionality() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Aspotverification();
		try {
			if(FlavourpageObjects.notifyme()!=null) {
				WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.notifymebutton(), "click");
				Thread.sleep(2500);
				String Newemail = BrowserUtils.Emailidgenerator(pro.getProperty("InvalidEmail"));
				System.out.println(Newemail);
				WebdriverUtils.sendKeys(FlavourpageObjects.notifymeemail(), Newemail);
				Thread.sleep(1000);
				WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.notifymebut(),"click");
				BrowserUtils.waitFor(FlavourpageObjects.SuccessMsg(), 20);
				Assert.assertTrue(FlavourpageObjects.SuccessMsg().isDisplayed());
			}
		} catch (Exception e) {		

			System.out.println("Notify me product is not available");
		}
	}
	public static void WishlistFunctionality() throws IOException, Exception {
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Thread.sleep(5000);
		BrowserUtils.waitFor(HomePageObjects.MegaMenu(), 10);
		WebdriverUtils.moveToElementByActions(HomePageObjects.MegaMenu());
		BrowserUtils.waitFor(HomePageObjects.Brand(), 10);
		WebdriverUtils.clickAction(HomePageObjects.Brand());
		Thread.sleep(2000);
		BrowserUtils.waitFor(WebdriverUtils.getPageTitle(), 10);
		WebdriverUtils.swipeDownUntillElement(FlavourpageObjects.WishlistButton());
		String Productcode = FlavourpageObjects.WishlistButton().getAttribute("data-mz-prdcode");
		System.out.println("Productcode before is "+Productcode);
		WebdriverUtils.clickAction(FlavourpageObjects.WishlistButton());
		WebdriverUtils.waitUntilValuePresentInElement(FlavourpageObjects.productcode(Productcode), "ADDED TO WISHLIST");
		WebdriverUtils.moveToElement(FlavourpageObjects.productcode(Productcode));
		String ProductcodeActual = FlavourpageObjects.productcode(Productcode).getAttribute("data-mz-prdcode");
		String Text = FlavourpageObjects.productcode(Productcode).getText();
		System.out.println("Productcode after is "+ProductcodeActual);
		assertEquals(ProductcodeActual, Productcode);
		assertEquals(Text.toUpperCase(), "ADDED TO WISHLIST");
	}

	public static void RecommendationATCFun() throws Exception {
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		Aspotverification();
		BrowserUtils.waitFor(BLPObjects.Recommendedtitle(), 20);
		WebdriverUtils.swipeDownUntillElement(BLPObjects.Recommendedtitle());
		Thread.sleep(1000);
		try {
			if(BLPObjects.Recommendedproduct()!=null) {
				Thread.sleep(1000);
				String productname = BLPObjects.Recommendedproductname().getText();
				WebdriverUtils.clickButtonThroughJS(BLPObjects.Recommendedatcproduct(), "click");
				Thread.sleep(1000);
				BrowserUtils.waitFor(FlavourpageObjects.productnameinpopup(), 20);
				assertEquals(FlavourpageObjects.productnameinpopup().getText().trim(), productname.trim());
				assertEquals(FlavourpageObjects.quantityinpopup1().getText().trim(), "1");
				assertEquals(FlavourpageObjects.ATCtextinpopup().getText().trim().toLowerCase(), "ADDED TO CART!".toLowerCase());
			}
			else if(BLPObjects.notifymeproduct()!=null) {
				WebdriverUtils.clickButtonThroughJS(BLPObjects.notifymeproduct(),"click");
				String Newemail = BrowserUtils.Emailidgenerator(pro.getProperty("InvalidEmail"));
				System.out.println(Newemail);
				WebdriverUtils.sendKeys(FlavourpageObjects.notifymeemail(), Newemail);
				Thread.sleep(1000);
				WebdriverUtils.clickButtonThroughJS(FlavourpageObjects.notifymebut(),"click");
				Thread.sleep(1000);
				BrowserUtils.waitFor(FlavourpageObjects.SuccessMsg(), 20);
				Assert.assertTrue(FlavourpageObjects.SuccessMsg().isDisplayed());
			}
		} catch (Exception e) {		

			System.out.println("Recommended Products are not available");
		}			
	}

}
