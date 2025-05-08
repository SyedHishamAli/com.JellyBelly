package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.utility.TestBase;

public class ADATestCasesSprint9 extends TestBase{

	@Test(priority=150,description="#39: These images are decorative and provide no information to users.")
	 public void DecorativeImages() throws IOException, Exception{
		ADAActions.AltTextUnderHome();
	}
	@Test(priority=151,description="#44: There are multiple navigation regions on the page, but they are not differentiated from one another.")
	 public void NavigatioRegions() throws IOException, Exception{
			ADAActions.NavigatioLinksHomepage();
	}
	//Descoped in redesign site @Test(priority=152,description="#51: These elements have unnecessary ARIA attributes.")
	 public void ShopTopCategoriImage() throws IOException, Exception{
			ADAActions.ShopTopCategoriImageHomepage();
	}
	
	@Test(priority=153,description="#68: This content appears to semantically be a description list (<dl>), but it is not marked up as such.")
	 public void descriptionlist() throws IOException, Exception{
			//ADAActions.descriptionListTag();
	}
	@Test(priority=154,description="#69: This modal contains a header tag, which may be confusing for screen reader users.")
	 public void headerTagFooterLogo() throws IOException, Exception{
			//ADAActions.UserDetailsModelActive();
	}
	@Test(priority=155,description="#301: This image is decorative and provides no information to users.")
	 public void decorativeImageAltTag() throws IOException, Exception{
			ADAActions.AltTagdecorativeImage();
	}
	
	//uncomment @Test(priority=156,description="#101: This is marked up as a heading, but it is not semantically a heading..")
	 public void bithdayParty() throws IOException, Exception{
			ADAActions.bithdayPartyTag();
	}
	
	//uncomment @Test(priority=157,description="#115: This is marked up as a heading, but it is not semantically a heading.")
	 public void calcilatorModal() throws IOException, Exception{
			ADAActions.calcilatorModalTag();
	}
	
	//uncomment @Test(priority=158,description="#117: This is marked up as a link, but it functions like a button.")
	 public void LinkButton() throws IOException, Exception{
			ADAActions.ImagePartyPage();
	}
	//uncomment @Test(priority=159,description="#122: These icons are read to screen reader users as an unnecessary character.")
	 public void LinkMoreText() throws IOException, Exception{
			ADAActions.LinkMoreArrow();
	}
	
	@Test(priority=160,description="#122: These icons are read to screen reader users as an unnecessary character.")
	 public void PaymentLogin() throws IOException, Exception{
			ADAActions.PaymentLoginLink();
	}
	
	@Test(priority=161,description="#363: This heading level appears in an illogical order.")
	 public void Accessiblity() throws IOException, Exception{
			ADAActions.AccessiblityTag();
	}
	
	@Test(priority=162,description="#237: Screen reader users are not informed as this progress bar is updated.")
	 public void headermessage() throws IOException, Exception{
	//		ADAActions.headerMessageTag();
	}
}
