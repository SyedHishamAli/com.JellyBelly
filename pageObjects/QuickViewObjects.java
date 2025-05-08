package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class QuickViewObjects {
	public static WebElement Image(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//img[@alt='"+ProductName+"']"));
	}
	public static WebElement Image1() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//img[@class='img-quick'])[2]"));
	}
	public static WebElement Quickviews(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='mz-productlisting']//*[@title='quckview']"));
	}
	public static WebElement Quickview(String productName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//img[@alt='"+productName+"']"));
	}
	public static WebElement Title() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@class='mz-pagetitle']"));
	}
	public static WebElement SeeMoreLink(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-expanded-content']//a[@class='mz-quick-see-more']"));
	}
	public static WebElement ViewDetailsLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='gridder-expanded-content']//p//a"));
	}
	public static WebElement quickViewAddToCart(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-expanded-content']//a[contains(text(),'ADD TO CART')]"));
	}
	public static WebElement quickViewAddToWishlist(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-expanded-content']//a[@class='add-to-wishlist']"));
	}
	public static WebElement quickViewAddedToWishlist(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-expanded-content']//*[@class='add-to-wishlist-c']//a"));
	}
	
	public static WebElement quickviewProductName(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-show']//a[contains(@class,'mz-productlisting-title')]"));
	}
	public static WebElement ProductDetails(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-show']//p[@class='jb-product-description multiline']"));
	}
	public static WebElement Ratings(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-show']//img[@title='zero stars'])[1]"));
	}
	public static WebElement ProductPrice(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='gridder-show']//a[@class='jb-quickprice ']"));
	}
	public static WebElement PLPNotifyButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-out-of-stock'])[1]"));
	}
	public static WebElement NotifyEmail() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='notify-me-email']"));
	}
	public static WebElement NotifyMeButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[@id='notify-me-button']"));
	}
	public static WebElement SuccessMsg() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='success-msg']"));
	}
	public static WebElement NotifyClosebutton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//button[@id='cboxClose']"));
	}
	public static WebElement QuickviewNotifyButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@class='gridder-expanded-content']//a[contains(text(),'Notify Me')]"));
	}
	public static WebElement OOSQuickview() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='mz-productlist-list']/li[2]/div/a/img"));
	}
	public static WebElement WishlistEmail() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='email']"));
	}
	public static WebElement WishlistPassword() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='password']"));
	}
	public static WebElement WishlistLogin() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='addbutton']"));
	}
	public static WebElement Email() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='email']"));
	}
	public static WebElement Password() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//input[@id='password']"));
	}
	public static WebElement LoginButton() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//div[@id='email-dialog']//input[@id='addbutton']"));
	}
	
}
