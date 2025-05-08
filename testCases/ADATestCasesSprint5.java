package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.ADAActions;
import com.utility.TestBase;

public class ADATestCasesSprint5 extends TestBase{
	
	//Sprint 5
		@Test(priority=73,description="# 150 - Verify the images should not have arial attribute")
		 public void pdpImages() throws IOException, Exception{
			ADAActions.pdpImages();
		}
		//On Hold till ADA audit get completed
		@Test(priority=74,description="# 153 - Verify the enlarge image icon should display as button")
		 public void enlargeImage() throws IOException, Exception{
			ADAActions.enlargeImage();
		}
		@Test(priority=75,description="# 154 - Verify the thumbnail images should display as button")
		 public void thumbnailImages() throws IOException, Exception{
			ADAActions.thumbnailImages();
		}
		@Test(priority=76,description="# 156 - Verify the thumbnails are under div")
		 public void thumbnailImageInside() throws IOException, Exception{
			ADAActions.thumbnailImageInside();
		}
		@Test(priority=77,description="# 165 - Verify the click here link should be button")
		 public void clickHere() throws IOException, Exception{
			ADAActions.clickHere();
		}
		@Test(priority=78,description="# 169 - Verify free ground text is h1")
		 public void freeGroundtext() throws IOException, Exception{
			ADAActions.freeGroundtext();
		}
		@Test(priority=79,description="# 170 - Verify the dialog should be labeled properly")
		 public void freeGroundModal() throws IOException, Exception{
			ADAActions.freeGroundModal();
		}
		@Test(priority=80,description="# 171 - Verify the dialog should not have unnecessary label")
		 public void freeGroundModal1() throws IOException, Exception{
			ADAActions.freeGroundModal1();
		}
		//uncomment @Test(priority=81,description="# 174 - Verify headings should be h2")
		 public void relatedHeading() throws IOException, Exception{
			ADAActions.relatedHeading();
		}
		@Test(priority=82,description="# 177 - Verify the carousel should be button")
		 public void carousel() throws IOException, Exception{
			ADAActions.carousel();
		}
		@Test(priority=83,description="# 178 - Verify related product section should be labeled properly")
		 public void relatedSectionlabel() throws IOException, Exception{
			ADAActions.relatedSectionlabel();
		}
		@Test(priority=84,description="# 179 - Verify related product section should not have unnecessary attribute")
		 public void relatedSection() throws IOException, Exception{
			ADAActions.relatedSection();
		}
		@Test(priority=85,description="# 181 - Verify the carousel should be labeled properly")
		 public void carouselLabel() throws IOException, Exception{
			ADAActions.carouselLabel();
		}
		@Test(priority=86,description="# 184 - Verify product info should be under list")
		 public void prodInfo() throws IOException, Exception{
			ADAActions.prodInfo();
		}
		@Test(priority=87,description="# 186 - Verify JellyBelly recommends section in h2")
		 public void jbrecommends() throws IOException, Exception{
			ADAActions.jbrecommends();
		}
		@Test(priority=88,description="# 190 - Verify quantity fields are label properly")
		 public void qtyfieldLabel() throws IOException, Exception{
			ADAActions.qtyfieldLabel();
		}
		@Test(priority=89,description="# 191 - Verify quantity fields are displayed as buttons")
		 public void qtyfieldLabelbuttons() throws IOException, Exception{
			ADAActions.qtyfieldLabelbuttons();
		}
		@Test(priority=90,description="# 213 - Verify related product names should be h3")
		 public void relatedprodNames() throws IOException, Exception{
			ADAActions.relatedprodNames();
		}
		//uncomment @Test(priority=91,description="# 223 - Verify login popup buttons are not having unnecessary attribute")
		 public void loginpopupButtons() throws IOException, Exception{
			ADAActions.loginpopupButtons();
		}
		@Test(priority=92,description="# 224 - Verify all flavor should be as headings")
		 public void allFlavorHeading() throws IOException, Exception{
			ADAActions.allFlavorHeading();
		}
		//uncomment @Test(priority=93,description="# 227 - Verify Item added popup heading is labeled properly")
		 public void itemaddedpopup() throws IOException, Exception{
			ADAActions.itemaddedpopup();
		}
		
//New Release
		@Test(priority=124,description="# 158 - PDP - The modal container is not labeled as such.")
		 public void productimagemodal() throws IOException, Exception{
			ADAActions.validateproductimagemodal();
		}
		//Descoped in redesign site @Test(priority=124,description="# 183 - PDP - This is semantically a list of multiple items, but it is marked up as a single item.")
		 public void productinfolist() throws IOException, Exception{
			ADAActions.validateproductinfolist();
		}
		
}
