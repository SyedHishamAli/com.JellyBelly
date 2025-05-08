package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class MiniCartObjects {
	public static WebElement EmptyCartText() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//td[@colspan='5']"));
	}
	public static WebElement Image() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='item-image']"));
	}
	public static WebElement Quantity() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//ul//li[1]//div[2]//p[2]"));
	}
	public static WebElement SubTotal() throws Exception{
	//	return WebdriverUtils.findElement(By.xpath("//div[@class='sub-total']/p"));
		return WebdriverUtils.findElement(By.xpath("//span[text()='SubTotal:']/..//following-sibling::dd"));
	}
	public static WebElement Shipping() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='shipping-details']"));
		//return WebdriverUtils.findElement(By.xpath("//span[text()='Shipping:']/.."));
	}
	public static WebElement Cartcount() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='cart-icon black-ico'])[1]"));
	}
	public static WebElement ViewCartButton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@id='jb-minicart-popup']//*[@class='view-cart-btn']"));
	}
	public static WebElement ViewCartinpopup() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='view-cart']"));
	}
	public static WebElement CheckoutButton() throws Exception{
		//return WebdriverUtils.findElement(By.xpath("//input[@value='PROCEED TO CHECKOUT']"));
		return WebdriverUtils.findElement(By.xpath("//*[@id='cart-checkout']"));
	}
	public static WebElement CheckoutButton1() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//input[@value='Proceed to Checkout']"));
	}
	public static WebElement EstimatedTotal() throws Exception{
	//	return WebdriverUtils.findElement(By.xpath("//div[@class='estimated-total']"));
		return WebdriverUtils.findElement(By.xpath("//*[@id='mz-carttable-estimated-total']/strong"));
	}
	public static WebElement PLPAddToCart() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'ADD TO CART')])[2]"));
	}
	public static WebElement CheckoutTitle() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//h1[@class='mz-pagetitle']"));
	}
	public static WebElement MinicartProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='item-shop-details']//h2"));
	}
	public static WebElement MinicartPrice() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='item-shop-details']//p[contains(text(),'Price')]"));
	}
	public static WebElement MinicartQuantity() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='item-shop-details']//p[contains(text(),'Quantity')]"));
	}
	public static WebElement NoProductsText() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//p[@class='no-items-found-message']"));
	}	
	public static WebElement ShippingLabel() throws Exception{
		//return WebdriverUtils.findElement(By.xpath("//div[@class='hide-when-heat-sensitive']"));
		return WebdriverUtils.findElement(By.xpath("//span[@id='mz-carttable-freeshipping']"));
	}
	public static List<WebElement> minicartitems() throws Exception{
		return WebdriverUtils.findElements(By.xpath("//*[@class='jb-minicart-items-container']//li"));
	}
	public static WebElement cartitemcode() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='mz-carttable-item ']"));
	}
	public static WebElement cartitemcode2() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='item-table desktop-cart-table']//tr[@class='mz-carttable-item '])[2]"));
	}
	public static WebElement cartitemcode3() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='mz-carttable-item-title'])[2]"));
	}
	
	
	public static WebElement TBDtax() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='jb-minicart-total-container']/div[2]/p[1]"));
	}
	public static WebElement congratsmessage() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='jb-minicart-total-container']/div[4]"));
	}
	public static WebElement closeButton() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@class='cross-close-popup']"));
	}
}
