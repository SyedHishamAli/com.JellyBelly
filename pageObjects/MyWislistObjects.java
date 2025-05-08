package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.DriverFactory;
import com.utility.WebdriverUtils;

public class MyWislistObjects {
	
	public static WebElement addToCartButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='action-addToCart']"));
	}
	
	public static List<WebElement> removeItems() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("//td[@class='mz-carttable-item-remove']//a[@data-mz-action='removeItem']"));
	}
	
	public static WebElement emptyWishlist() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='mz-accountwishlist-list']//p[@class='mz-accountaddressbook-empty'][contains(text(),'You do not have any wishlist items.')]"));
	}
	
	
	public static int emptyWishlists() throws Exception{
		  return DriverFactory.getInstance().getDriver().findElements(By.xpath("//div[@class='mz-accountwishlist-list']//p[@class='mz-accountaddressbook-empty'][contains(text(),'You do not have any wishlist items.')]")).size();
	}
	
	public static WebElement removeButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@data-mz-action='finishRemoveItem']"));
	}
	
	public static WebElement shippingPageLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@class='shipping-link']"));
	}
	
	
}
