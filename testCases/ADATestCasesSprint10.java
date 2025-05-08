package com.testCases;

import com.utility.TestBase;
import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.ADAActions;


public class ADATestCasesSprint10 extends TestBase{

	//Descoped in redesign site @Test(priority=163,description="#295: The structure of this content makes it difficult for screen reader users to understand the item totals displayed for each item.")
	 public void MinicartAriaLabel() throws IOException, Exception{
		ADAActions.MinicartAriaLabelAction();
	}
	
	@Test(priority=164,description="#460: This is marked up as a list item, but it is not semantically a list item.")
	 public void megaMenuPresentation() throws IOException, Exception{
		ADAActions.megaMenuPresentationTag();
	}
	@Test(priority=165,description="#352: These images are decorative and provide no information to users.")
	 public void decorativeImage() throws IOException, Exception{
		ADAActions.decorativeImageTag();
	}
	//uncomment @Test(priority=166,description="#327: This icon is read to screen reader users as an unidentified character.")
	 public void weddinTheme() throws IOException, Exception{
		ADAActions.weddingThemeCenter();
	}
	//uncomment @Test(priority=167,description="#328: This image is decorative and provides no information to users.")
	 public void WelcomeImage() throws IOException, Exception{
		ADAActions.WelcomeImageTag();
	}
	@Test(priority=168,description="#137: This is marked up as a heading, but it is not semantically a heading.")
	 public void SignUpPage() throws IOException, Exception{
		ADAActions.TextInSignUpPage();
	}
	@Test(priority=169,description="#140: The meaning of the asterisk (*) is defined at the bottom of the form.")
	 public void SignUpPageMandatory() throws IOException, Exception{
		ADAActions.mandatory();
	}
	//Descoped in redesign site @Test(priority=170,description="#199: This image is decorative and provides no information to users.")
	 public void JellyBellyCategoryImage() throws IOException, Exception{
		ADAActions.CategoryImage();
	}
	//uncomment @Test(priority=171,description="#226: This icon is read to screen reader users as an unnecessary character.")
	 public void movieNight1() throws IOException, Exception{
		ADAActions.movieNightTag();
	}
	@Test(priority=172,description="#152: There are multiple separate and adjacent buttons which perform the same function, which creates an extra tabstop for keyboard users and additional noise for screen reader users.")
	 public void sizzling() throws IOException, Exception{
		ADAActions.sizzlingCinnamon();
	}
	//descoped in redeisgn site @Test(priority=173,description="#172: This <svg> tag is decorative and provides no information to users.")
	 public void svgicon() throws IOException, Exception{
		ADAActions.svgTag();
	}
	@Test(priority=174,description="#166: This image is decorative and provides no information to users.")
	 public void freetruck() throws IOException, Exception{
		ADAActions.freetruck();
	}
	@Test(priority=175,description="#189:This element has an unnecessary ARIA attribute.")
	 public void removeAriaLabel() throws IOException, Exception{
		ADAActions.removeAriaLabelTab();
	}
	@Test(priority=176,description="#265: This button is contained in a heading tag, but it is not semantically part of the heading.")
	 public void shippingEditTag() throws IOException, Exception{
		ADAActions.shippingEditTag();
	}
	@Test(priority=177,description="#232: This image is decorative and provides no information to users.")
	 public void altProductImage() throws IOException, Exception{
		ADAActions.altProductImage();
	}
	@Test(priority=178,description="#236: The strike-through typography used on this price is not conveyed to screen reader users.")
	 public void visuallyHidden() throws IOException, Exception{
		ADAActions.visuallyHidden();
	}
	//CHANGES DONE AS PER NEW ADA TICKET #298@Test(priority=179,description="#266: These elements have unnecessary ARIA attributes.")
	 public void paymentTypeTags() throws IOException, Exception{
		ADAActions.paymentTypeTags();
	}
	@Test(priority=180,description="#33: This link does not move the user's focus to the targeted location on the page.")
	 public void skipToMainTag() throws IOException, Exception{
		ADAActions.skipToMainTag();
	}
	@Test(priority=181,description="#400: These are buttons, but they are not marked up as such; screen readers will not identify them as actionable and they will not be usable by keyboard users.")
	 public void quantityBtn() throws IOException, Exception{
		ADAActions.quantityBtnTag();
	}
	@Test(priority=182,description="#217: These elements have unnecessary ARIA attributes.")
	 public void removeRoleOrigPrice() throws IOException, Exception{
		ADAActions.removeRoleOrigPrice();
	}
	@Test(priority=183,description="#216: The strike-through typography used on this price is not conveyed to screen reader users.")
	 public void spanPrice() throws IOException, Exception{
		ADAActions.spanPrice();
	}
	@Test(priority=184,description="#213: This is semantically a heading, but it is not marked up as such.")
	 public void productHeadRecommed() throws IOException, Exception{
		ADAActions.productHeadRecommed();
	}
	@Test(priority=185,description="#375: When submitting the form with errors, the first form field with an error is not automatically focused.")
	 public void notifyMeEmailTag() throws IOException, Exception{
		ADAActions.notifyMeEmailTag();
	}
	@Test(priority=186,description="#374: The error message is not associated with its form field.")
	 public void notifyMeAttrib() throws IOException, Exception{
		ADAActions.notifyMeAttrib();
	}
	@Test(priority=187,description="#190: This form field is not labeled.")
	 public void quantityTag() throws IOException, Exception{
		ADAActions.quantityTag();
	}
	@Test(priority=188,description="#373: This modal lacks an h1 heading")
	 public void notifyMeOverlay() throws IOException, Exception{
		ADAActions.notifyMeOverlayTag();
	}
	@Test(priority=189,description="#371: The aria-label for this text field should not contain the words \"text field\", as it is redundant for screen reader users.")
	 public void notifyMetextField() throws IOException, Exception{
		ADAActions.notifyMetextField();
	}
	@Test(priority=190,description="#194: The modal container is not labeled as such.")
	 public void notifyModalContainer() throws IOException, Exception{
		ADAActions.notifyModalContainer();
	}
	@Test(priority=191,description="#192: The escape key does not close the modal.")
	 public void notifyMePopup() throws IOException, Exception{
		ADAActions.notifyMePopupStyle();
	}
}
