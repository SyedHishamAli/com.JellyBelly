package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.WebdriverUtils;

public class PLPObjects {
	public static WebElement ContactUsLink() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
	}
	public static WebElement PLPsort() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//select[@class='page-sort-sel']"));
	}
	public static WebElement Price(String ProductName) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='mz-productlisting']//a[@class='jb-quickprice ']"));
	}
//	public static WebElement PriceForFirstInstockProduct() throws Exception{
//		return WebdriverUtils.findElement(By.xpath("((//*[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1])//ancestor::div[@class='jb-quickviewdetails']//preceding-sibling::div[@class='jb-product-prize']//*[@class='jb-quickcsale']"));
//	}
	
	public static WebElement PriceForFirstInstockProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("((//*[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1])/../../../../..//ancestor::div[@class='jb-product-min-details']/div[2]/div[2]/span[2]"));
	}
		
	public static WebElement PriceForFirstInstockProductSale() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-productlisting withsale-new-label ']//div[@class='jb-quickviewdetails']//div[@class='jb-product-prize']//a[@class='jb-quickcsale'])[1]"));
	}
	public static WebElement PriceForSecondInstockProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//button[@type='submit']//ancestor::div[@class='jb-quickviewdetails']//a[@class='jb-quickprice '])[2]"));
	}
	public static WebElement SortPrice() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//ul[@id='mz-productlist-list']/li[1]//div[@class='jb-product-prize']//span[2]"));
	}
	public static WebElement SortPrice1() throws Exception{
	//	return WebdriverUtils.findElement(By.xpath("//ul[@id='mz-productlist-list']/li[1]//div[@class='jb-product-prize']//span[4]"));
	//	return WebdriverUtils.findElement(By.xpath("//ul[@id='mz-productlist-list']/li[2]//div[@class='jb-product-prize']//span[4]"));
		return WebdriverUtils.findElement(By.xpath("//ul[@id='mz-productlist-list']/li[3]//div[@class='jb-product-prize']//span[4]"));
	}
	public static WebElement Price1(String ProductName1) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName1+"']/ancestor::div[@class='mz-productlisting']//a[@class='jb-quickprice ']"));
	}
	public static WebElement Price1inminicart() throws Exception{
		//return WebdriverUtils.findElement(By.xpath("(//h4[@class='total-sub'])[1]"));
		return WebdriverUtils.findElement(By.xpath("(//span[@class='total-sub'])[1]"));
	}
	public static WebElement Price2inminicart() throws Exception{
		//return WebdriverUtils.findElement(By.xpath("(//h4[@class='total-sub'])[2]"));
		return WebdriverUtils.findElement(By.xpath("(//span[@class='total-sub'])[2]"));
    }
	public static WebElement MenuLink(String CategoryName) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='flex-container micromenu-title']//h2[contains(text(),'"+CategoryName+"')]/ancestor-or-self::a"));
	}
	public static WebElement RecomendedProductName() throws Exception {
		//return WebdriverUtils.findElement(By.xpath("//*[@class='isDesktop pdp-desktop-header']//h1"));
		return WebdriverUtils.findElement(By.xpath("(//*[@class=\"mz-pagetitle\"])[1]"));
	}
	public static WebElement PLPProductName(String ProductName) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@id='mz-productlist-list']//*[@class='mz-productlisting-title']//*[contains(text(),'"+ProductName+"')]"));
		//return WebdriverUtils.findElement(By.xpath("//*[@title='"+ProductName+"']/ancestor::div[@class='mz-productlisting-info']//a[contains(@class, 'mz-productlisting-title')]"));
		
	}
	public static WebElement PLPProductName() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='mz-productlisting-title'])[1]"));
		//return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-product-min-details']//a[@class='mz-productlisting-title'])[1]"));
		
	}
	public static WebElement PLPProductName4() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='mz-productlisting-title'])[1]"));
		//return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-product-min-details']//a[@class='mz-productlisting-title'])[1]"));
		
	}
	public static WebElement PLPProductName1(String ProductName1) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'"+ProductName1+"')]/ancestor::div[@class='mz-productlisting-info']//a[@class='mz-productlisting-title']"));
	}
	public static WebElement PLPProductName2(String ProductName2) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'"+ProductName2+"')]/ancestor::div[@class='mz-productlisting-info']//a[@class='mz-productlisting-title']"));
	}
	public static WebElement PDPProductName() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='mz-productlisting-title'])[1]"));
	}
	public static WebElement PDPProductName1() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='isDesktop pdp-desktop-header']/h1"));
	}
	
	public static WebElement addToCart() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//button[@id='add-to-cart']"));
	}
//	public static WebElement relatedProductAddToCart() throws Exception {
//		return WebdriverUtils.findElement(By.xpath("(//*[@class='prod-cart-lower-section']//button[@class='monetate-add-to-cart'])[1]"));
//	}
	public static WebElement relatedProductAddToCart() throws Exception {
		return WebdriverUtils.findElement(By.xpath("(//*[@id='monetate-recommendations']//button[@class='monetate-add-to-cart'])[1]"));
	}
		
	public static WebElement PDPProductNameV() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='varient']//span[@itemprop='name']"));
	}
	public static WebElement PLPFirstProductNameInStock() throws Exception{
		return WebdriverUtils.findElement(By.xpath("((//*[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1])/../../../../..//ancestor::div[@class='mz-productlisting-image']//div[@class='mz-productlisting-title']/h2"));
		//return WebdriverUtils.findElement(By.xpath("((//*[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1])//ancestor::div[@class='jb-quickviewdetails']//preceding-sibling::div[@class='mz-productlisting-info']/a/h2[text()]"));
	}
	public static WebElement PLPFirstProductNameInStockSale() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-productlisting withsale-new-label ']//h2[@class='prod-title-heading'])[1]"));
	}
	public static WebElement PLPFirstProductATC() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1]"));
	}
	public static WebElement PLPFirstProductATCSale() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-productlisting withsale-new-label ']//div[@class='cardMobCTAcontainer']//button[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1]"));
	}
	public static WebElement PLPFirstProductATCPrice() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//button[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp']/ancestor::div[@class='jb-buy-product quickview-jb']//preceding-sibling::div[@class='jb-product-prize']//a)[1]"));
	}
	public static WebElement PLPFirstProductquantity() throws Exception{
		return WebdriverUtils.findElement(By.xpath("((//button[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1])/preceding::div[@class='qty']"));
	}
	public static WebElement PLPSecondProductNameInStock() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//button[@type='submit']/ancestor::div[@class='jb-quickviewdetails']//preceding-sibling::div[@class='mz-productlisting-info']/a)[2]"));
	}
	public static WebElement PLPFirstProductInStockATC() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[1]"));
	}
	public static WebElement PLPSecondProductInStockATC() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[2]"));
	}	
	public static WebElement PLPAddToCart(String ProductName) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'"+ProductName+"')]/ancestor::div[@data-mz-product='98767']/div[@class='jb-product-min-details']//button[@type='submit']"));
	//	return WebdriverUtils.findElement(By.xpath("//*[@title='"+ProductName+"']/ancestor::div[@class='jb-product-min-details']//button[@type='submit']"));
	}
	public static WebElement PLPAddToCart1(String ProductName2) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName2+"']/ancestor::div[@class='mz-productlisting']//a[@class='jb-add-to-cart jb-tealium-trigger']"));
	}
	public static WebElement Quantity(String ProductName) throws Exception{
		return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='mz-productlisting-info']//following-sibling::div[@class='jb-quickviewdetails']//input"));
	}	
	public static WebElement QuantityForFirstInstockProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//button[text()='Add to Cart ']//ancestor::div[@class='jb-buy-product quickview-jb']//preceding-sibling::div[@class='qty']/input[@value='1'])[1]"));
	}
	public static WebElement QuantityForSecondtInstockProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//button[text()='Add to Cart ']//ancestor::div[@class='jb-buy-product quickview-jb']//preceding-sibling::div[@class='qty']/input[@value='1'])[2]"));
	}
	public static WebElement CartCount() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//span[@class='cartcount']"));
	}
	public static WebElement CartCount1() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//span[@class='shoping-cart']"));
	}
	public static WebElement EmptyCart() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//p[@class='no-items-found-message']"));
	}
	public static WebElement CartIcon() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//button[@id='header-cart-menue']//*[@class='cart-icon black-ico']"));
	}
	public static WebElement adaCartIcon() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='isDesktop']//*[@class='mini-cart-header isDesktop']//a[contains(@href,'/cart') and //span[@class='shoping-cart']]"));
	}
	public static WebElement CartProduct() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='jb-minicart-items-container']//*[@class='item-shop-details']/h2)[1]"));
	}
	
	public static WebElement miniCartContainer() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='jb-minicart-items-container']"));
	}
	
	
	public static WebElement LoadMoreButton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='load-more-prod text-center  ']//*[@id='load-more']"));
	}
	public static WebElement ProductCount() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='heading-jb-result']"));
	}
	public static WebElement FlavorpageProductCount() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='jb-result-details']"));
	}
	public static WebElement recommendationOutOfStockProductName(){
		try {
		return WebdriverUtils.findElement(By.xpath("//*[@class='upper tns-item tns-slide-active']//following::*[@class='monetate-notify-me jb-out-of-stock-cur']/../../../../div/div/a/div[@class='product-title']"));
		//(//div[@id='mz-drop-zone-cateoryplpdropzone-below-mbz']//following-sibling::div[@id='mz-drop-zone-rti-category']//button[text()=' Notify Me ']//ancestor::div[@class='jb-buy-product quickview-jb']//preceding-sibling::div[@class='productTitle']/a)[1]
		}
		catch (Exception e) {
			return null;
		}
	}
	public static WebElement recommendationOutOfStockProduct() throws Exception{
		try {
		return WebdriverUtils.findElement(By.xpath("//*[@class='upper tns-item tns-slide-active']//following::*[@class='monetate-notify-me jb-out-of-stock-cur']"));
		//(//div[@id='mz-drop-zone-cateoryplpdropzone-below-mbz']//following-sibling::div[@id='mz-drop-zone-rti-category']//button[text()=' Notify Me '])[1]
		}
		catch (Exception e) {
			return null;
		}
		}
	public static WebElement RecommendationSection() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='monetate-block-title'])[2]")); //div[@class='recommended-prod-head']
	}
	public static WebElement recommendationProductFirstName() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='upper tns-item tns-slide-active']//following::a[@class='mt-productlisting-title']/div)[1]"));
		//(//div[@id='mz-drop-zone-rti-category']//div[@class='row product-listing-row-content']//h3)[1]
	}
	public static WebElement recommendationProductFirstNametext() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//div[@id='mz-drop-zone-rti-category']//div[@class='row product-listing-row-content']//h3/text())[1]"));
	}
	public static WebElement recommendationProductFirstPrice() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//div[@class='mz-productlist mz-productlist-tiled']//div[@class='mz-productlisting  ']//div[@class='jb-quickviewdetails']//a[@class='jb-quickprice '])[2]"));
	}
	public static WebElement recommendationAddToCartFirst() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='upper tns-item tns-slide-active']//following::*[@class='monetate-add-to-cart']"));
		//(//div[@class='mz-productlist mz-productlist-tiled']//div[@class='mz-productlisting  ']//div[@class='cardMobCTAcontainer']//button[@class='jb-add-to-cart jb-tealium-trigger add-to-cart-btn-plp'])[2]
	}	
	public static WebElement RecommendationAddToCart(String RecommendationProduct) throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//a[text()='"+RecommendationProduct+"']/ancestor::div[@class='row product-listing-row-content']//a[@id='add-to-cart-cur'])[1]"));
	}
	public static WebElement RecommendationQuanity(String RecommendationProduct) throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//a[text()='"+RecommendationProduct+"']/ancestor::div[@class='row product-listing-row-content']//select[contains(@class,'mz-productdetail-qty quantity')])[1]"));
	}
	public static WebElement RecommendationProductName(String RecommendationProduct) throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//a[text()='"+RecommendationProduct+"']/ancestor::div[@class='row product-listing-row-content']//a[@class='mz-productlisting-title'])[1]"));
	}
	public static WebElement RecommendationPdtname() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='owl-item active']//a[@class='mz-productlisting-title'])[1]"));
	}
	public static WebElement RecommendationNotifyButton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//p[@class='jb-out-of-stock-cur']"));
	}
	public static WebElement RecommendationNotifyEmail() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//input[@class='notify-me-email']"));
	}
	public static WebElement RecommendationNotifymeButton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//button[@class='notify-me-button']"));
	}
	public static WebElement SuccessMsg() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//div[@class='success-msg']"));
	}
	public static WebElement Filter() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//div[contains(@class,'container-filter')])[1]"));
	}
	public static WebElement FilterPrice() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@class='mz-l-sidebaritem-main']/h3)[2]")); //span[contains(text(),'Price')]
	}
	public static WebElement PriceRange() throws Exception{
		return WebdriverUtils.findElement(By.xpath("(//*[@data-mz-facet='Price'])[1]"));
	}
	public static WebElement Apply() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[contains(@class,'mz-facetingform-shop apply-filter-button')]"));
	}
	public static WebElement FilterStrip() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//*[@class='item-name li_price selected-facet-value  mz-facetform-selected ']"));
	}
	public static WebElement ResetButton() throws Exception{
		return WebdriverUtils.findElement(By.xpath("//a[contains(@class,'mz-facetingform-clearall clear-all-outer-btn active')]"));
	}
	public static WebElement Image(String PDPProductName1) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//img[@alt='"+PDPProductName1+"']"));
	}
	public static WebElement PLPImage(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'"+ProductName+"')]/ancestor::div[@class='mz-productlisting']//div[@class='mz-productlisting-image']"));
	}
	public static WebElement Ratings(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[text()='"+ProductName+"']/ancestor::div[@class='mz-productlisting']//div[@class='jb-stars-rating']"));
	}
	public static WebElement Reviews(String ProductName) throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//a[contains(text(),'"+ProductName+"')]/ancestor::div[@class='mz-productlisting']//span//p"));
	}
	public static List<WebElement> Products() throws Exception{
		 // return WebdriverUtils.findElements(By.xpath("//*[@id=\"shop-all\"]//following-sibling::div[contains(@class, 'mz-productlisting  ') or contains(@class, 'mz-productlisting withsale-new-label ')]"));
		 // return WebdriverUtils.findElements(By.xpath("//*[@id='mz-productlist-list']//following-sibling::li"));
		return WebdriverUtils.findElements(By.xpath("//h2[@class=\"prod-title-heading\"]"));
	}
	
	public static WebElement totalProduct() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@class='jb-result-details']"));
	}
	public static WebElement viewCart() throws Exception {
		return WebdriverUtils.findElement(By.xpath("//*[@id='jb-minicart-popup']//*[@class='view-cart-btn']"));
	}
	
	public static WebElement showAll() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[@id='load-all']"));
	}
	
	public static WebElement shopAll() throws Exception{
		  return WebdriverUtils.findElement(By.xpath("//*[contains(text(),'Shop All') and (@href='/sport-beans-jelly-beans/c/336#shop-all')]"));
	}	
	
}
