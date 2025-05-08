package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environments {

	public static String getURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("testURL");

		return url;
	}
	
	public static String accessibityURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("accessibityURL");

		return url;
	}
	
	public static String getDSDURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("DSDURL");

		return url;
	}
	
		public static String getUAT_URL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("UAT_URL");

		return url;
	}
	
	public static String PDPURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("PDPURL");

		return url;
	}
	
	public static String PLPURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("PLPURL");

		return url;
	}
	
	public static String PLPRecomendationURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("PLPRecomendationURL");

		return url;
	}
	
	
	public static String SRPURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("SRPURL");

		return url;
	}
	public static String PDPPackageURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("PDPPackageURL");

		return url;
	}
	
	
	public static String PDPAddOnURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("PDPAddOnURL");

		return url;
	}
	
	
	public static String PlanPDPURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("PlanPDPURL");

		return url;
	}
	
	
	public static String EmailAddress() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("Email");

		return url;
	}
	public static String ConfigPDPURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("ConfigPDPURL");

		return url;
	} 
	public static String verifyname() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String name = pro.getProperty("verifyname");

		return name;
	}
	public static String verifyText() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String name = pro.getProperty("verifytext");

		return name;
	}
	public static String VerifyTextinButton() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String name = pro.getProperty("verifytextinbutton");

		return name;
	}
	public static String Searchcompare() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String name = pro.getProperty("Searchcompare");

		return name;
	}

	public static String ClaimMissingIssuePage() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("ClaimMissingIssuePage");

		return ClaimText;
	}

	public static String SearchKeyword() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("Productname");

		return ClaimText;
	}
	public static String Searchwithcode() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("Productcode");

		return ClaimText;
	}

	public static String SearchKeywordSuggestion() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("productsuggeted");

		return ClaimText;
	}

	public static String SearchISBN() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("ISBN");

		return ClaimText;
	}

	public static String ValuesToRead() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("NumberOfUserToBeTested");

		return ClaimText;
	}

	public static String Username() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("UserName");

		return ClaimText;
	}

	public static String Password() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("PassWord");

		return ClaimText;
	}

	public static String NewWishListName() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("WishListName");

		return ClaimText;
	}

	public static String ExistingWishListName() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("WishListNameExisting");

		return ClaimText;
	}

	public static String CLPTitle() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("PageTitleCLP");

		return ClaimText;
	}

	public static String ItemCountIncart() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("ItemCount");

		return ClaimText;
	}

	public static String PLPPageIdentifier() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("PLPFacetName");

		return ClaimText;
	}

	public static String PDPPageIdentifierViaCLP() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("PDPHeaderNameCLP");

		return ClaimText;
	}

	public static String PDPPageIdentifierViaPLP() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("PDPHeaderNamePLP");

		return ClaimText;
	}

	public static String QuantityFieldValue() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("Quantity");
		return ClaimText;
	}

	public static String EmptyCartPageValue() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("EmptyCartMessageInShoppingCartPage");

		return ClaimText;
	}

	public static String PromoValue() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("PromoCode");

		return ClaimText;
	}

	public static String FirstName() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("FirstName");

		return ClaimText;
	}

	public static String LastName() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("LastName");

		return ClaimText;
	}

	public static String Address() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("Address");

		return ClaimText;
	}

	public static String City() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("City");

		return ClaimText;
	}

	public static String ZipCode() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("ZipCode");

		return ClaimText;
	}

	public static String PhoneNumber() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("PhoneNumber");

		return ClaimText;
	}

	public static String CardNumber() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("CardNumber");

		return ClaimText;
	}

	public static String NameOnCard() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("NameOnCard");

		return ClaimText;
	}

	public static String CVV() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("CVV");

		return ClaimText;
	}

	public static String BillingEmailId() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("BillingEmailId");

		return ClaimText;
	}

	public static String SearchKeywordForCheckout() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("searchkeyword");

		return ClaimText;
	}

	public static String SearchDropDownOption() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("dropdownoption");

		return ClaimText;
	}

	public static String stateName() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("stateName");

		return ClaimText;
	}

	public static String cardType() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("cardType");

		return ClaimText;
	}

	public static String expiryMonth() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("expiryMonth");

		return ClaimText;
	}

	public static String expiryYear() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("expiryYear");

		return ClaimText;
	}

	public static String countryName() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("countryName");
		return ClaimText;
	}

	public static String SearchForEbook() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("dropdownoption2");

		return ClaimText;
	}

	public static String MyOrdersInhover() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//com//config//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String ClaimText = pro.getProperty("MyAccountLink");

		return ClaimText;
	}
}