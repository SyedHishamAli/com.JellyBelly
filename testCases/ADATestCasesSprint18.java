package com.testCases;


import com.utility.TestBase;
import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.ADAActions;


public class ADATestCasesSprint18 extends TestBase{


	@Test(priority=295,description="#57: This region requires additional ARIA markup to assist screen reader users in understanding what this section is for, and where it begins and ends.")
	public void verifyModalAttrib() throws IOException, Exception{
		ADAActions.verifyModalAttrib();
	}
	@Test(priority=296,description="#64: This element provides information visually that is not available to screen reader users.")
	public void verifyCartCount() throws IOException, Exception{
		ADAActions.verifyCartCount();
	}
	@Test(priority=297,description="#66: These elements have an unnecessary ARIA attribute.")
	public void verifyMainMenuAriaLabel() throws IOException, Exception{
		ADAActions.verifyMainMenuAriaLabel();
	}
	@Test(priority=298,description="#67: All pages with more than just a few links should have a \"Skip to Main Content\" link.")
	public void verifySkipTagname() throws IOException, Exception{
		ADAActions.verifySkipTagname();
	}
	@Test(priority=299,description="#72: This element has an unnecessary ARIA attribute.")
	public void verifyAccountTag() throws IOException, Exception{
		ADAActions.verifyAccountTag();
	}
	@Test(priority=300,description="#78: When placeholder text is used as the label for a form field, the label must remain visible when the user enters text.")
	public void verifyZipCodeLabel() throws IOException, Exception{
		ADAActions.verifyZipCodeLabel();
	}
	@Test(priority=301,description="#102: Keyboard and screen reader users do not have their focus moved to this modal dialog when it opens.")
	public void verifyEmailPopup() throws IOException, Exception{
		ADAActions.verifyEmailPopup();
	}
	@Test(priority=302,description="#103: The modal dialog container is not labeled as such.")
	public void verifyEmailPopup1() throws IOException, Exception{
		ADAActions.verifyEmailPopup1();
	}
	@Test(priority=303,description="#106: This modal dialog closes visually, but screen readers still read its content.")
	public void verifyEmailPopup2() throws IOException, Exception{
		ADAActions.verifyEmailPopup2();
	}
	@Test(priority=304,description="#107: This modal dialog is missing necessary ARIA attributes.")
	public void verifyEmailPopup3() throws IOException, Exception{
		ADAActions.verifyEmailPopup3();
	}
	@Test(priority=305,description="#108: Content within non-visible slides can receive keyboard focus and is visible to screen reader users at all times.")
	public void verifyFlavour() throws IOException, Exception{
		ADAActions.verifyFlavour();
	}
	@Test(priority=306,description="#70: Input fields must allow autofill via a valid autocomplete attribute, which helps users properly fill in the required information.")
	public void verifyLoginAttrib() throws IOException, Exception{
		ADAActions.verifyLoginAttrib();
	}
	@Test(priority=307,description="#71: The required form field is not indicated as such.")
	public void verifyLoginReq() throws IOException, Exception{
		ADAActions.verifyLoginReq();
	}
	@Test(priority=308,description="#73: This element has an unnecessary ARIA attribute.")
	public void verifycreateAccBtn() throws IOException, Exception{
		ADAActions.verifycreateAccBtn();
	}
	@Test(priority=309,description="#90: When placeholder text is used as the label for a form field, the label must remain visible when the user enters text.")
	public void verifyPDPZipLabel() throws IOException, Exception{
		ADAActions.verifyPDPZipLabel();
	}
	@Test(priority=310,description="#99: The tabs in this tabset are not wrapped in a tablist.")
	public void verifyTablistAttrib() throws IOException, Exception{
		ADAActions.verifyTablistAttrib();
	}
	@Test(priority=311,description="#101: Pages must be scalable.")
	public void verifyPDPMaxScale() throws IOException, Exception{
		ADAActions.verifyPDPMaxScale();
	}
	@Test(priority=312, description="#115: These elements have an unnecessary ARIA attribute.")
	public void verifyPDPrelatedSection() throws IOException, Exception{
		ADAActions.verifyPDPrelatedSection(); 
		}
	@Test(priority=313, description="#118: Unnecessary ARIA attributes can cause unexpected behavior for screen reader users.")
	public void verifyFilterattrib() throws IOException, Exception{
		ADAActions.verifyFilterattrib(); 
		}
	@Test(priority=314, description="#119: Text that functions as a heading should be marked up as such.")
	public void verifyFilterheaderTag() throws IOException, Exception{
		ADAActions.verifyFilterheaderTag(); 
		}
	@Test(priority=315, description="#121: Select dropdowns require labels.")
	public void verifysortBy() throws IOException, Exception{
		ADAActions.verifysortBy(); 
		}
	@Test(priority=316, description="#123: Accessible names of elements should properly match the visible labels.")
	public void verifyBtnAria() throws IOException, Exception{
		ADAActions.verifyBtnAria(); 
		}
	@Test(priority=317, description="#124: The modal dialog container is not labeled as such.")
	public void verifyFilterAria() throws IOException, Exception{
		ADAActions.verifyFilterAria(); 
		}
	@Test(priority=318, description="#126: This modal dialog is missing necessary ARIA attributes.")
	public void verifyFilterAttrib() throws IOException, Exception{
		ADAActions.verifyFilterAttrib(); 
		}
	@Test(priority=319, description="#128: Pages must be scalable.")
	public void verifyPLPMaxScale() throws IOException, Exception{
		ADAActions.verifyPLPMaxScale(); 
		}
}
