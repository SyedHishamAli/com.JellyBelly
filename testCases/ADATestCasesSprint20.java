package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.utility.TestBase;

public class ADATestCasesSprint20 extends TestBase {
	
	@Test(priority=320, description="#180: All form fields must be properly labeled.")
	public void verfiyLabelTagOnZipCode() throws IOException, Exception{
		ADAActions.verfiyLabelTagOnZipCode(); 
	}
	@Test(priority=321, description="#188: The modal dialog container is not labeled as such.")
	public void verfiySpinnerDialogRole() throws IOException, Exception{
		ADAActions.verfiySpinnerDialogRole(); 
	}
	@Test(priority=322, description="#195: Pages must be scalable.")
	public void verfiyPageScalable() throws IOException, Exception{
		ADAActions.verfiyPageScalable(); 
	}
	
	@Test(priority=323, description="#4: Elements that are marked up as buttons but function as links can cause confusion for screen reader users.")
	public void verfiyRoleOnSearchIcon() throws IOException, Exception{
		ADAActions.verfiyRoleOnSearchIcon(); 
	}
	
	@Test(priority=324, description="#10: Alt attribute text for decorative images is redundant and/or unnecessary.")
	public void verfiyAltAttributeForDecorativeImages() throws IOException, Exception{
		ADAActions.verfiyAltAttributeForDecorativeImages(); 
	}
	
	@Test(priority=325, description="#15: Alt attribute text for decorative images is redundant and/or unnecessary.")
	public void verfiyAltAttributeForProductImages() throws IOException, Exception{
		ADAActions.verfiyAltAttributeForProductImages(); 
	}
	
	@Test(priority=326, description="#25: Alt attribute text for decorative images is redundant and/or unnecessary.")
	public void verfiyAltAttributeForFooterImages() throws IOException, Exception{
		ADAActions.verfiyAltAttributeForFooterImages(); 
	}
	
	@Test(priority=327, description="#59: This unactionable element has a tabindex = 0 attribute on it.")
	public void verfiyTabIndexOnLoginTab() throws IOException, Exception{
		ADAActions.verfiyTabIndexOnLoginTab(); 
	}
	
	@Test(priority=327, description="#65: When content is marked up as a list, but is not semantically a list, it can be confusing for screen reader users.")
	public void verfiyRoleOnMiniCart() throws IOException, Exception{
		ADAActions.verfiyRoleOnMiniCart(); 
	}
	//On Hold until ADA audit and fixes complete
	//@Test(priority=328, description="#68: Elements that are marked up as links but function as buttons can cause confusion for screen reader users.")
	public void verfiyRoleOnMoreLink() throws IOException, Exception{
		ADAActions.verfiyRoleOnMoreLink(); 
	}
	@Test(priority=329, description="#74: The meaning of the asterisk (*) is not defined.")
	public void verfiyAsteriskOnLoginPopUp() throws IOException, Exception{
		ADAActions.verfiyAsteriskOnLoginPopUp(); 
	}
	@Test(priority=330, description="#80: Alt attribute text for decorative images is redundant and/or unnecessary.")
	public void verfiyAltOnTruckImage() throws IOException, Exception{
		ADAActions.verfiyAltOnTruckImage(); 
	}
	@Test(priority=331, description="#88: Content that functions as a list should be indicated as such to screen reader users.")
	public void verfiyUITagOnPDPPage() throws IOException, Exception{
		ADAActions.verfiyUITagOnPDPPage(); 
	}
	@Test(priority=332, description="#91: This unactionable element has a tabindex=\"0\" attribute on it.")
	public void verfiyTabIndexOnSearch() throws IOException, Exception{
		ADAActions.verfiyTabIndexOnSearch(); 
	}
	@Test(priority=333, description="#97: This nutrition information is an image, and is inaccessible to screen reader and magnification users.")
	public void verfiyTagsOnNutritionInformation() throws IOException, Exception{
		ADAActions.verfiyTagsOnNutritionInformation(); 
	}


}
