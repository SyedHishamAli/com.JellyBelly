package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.modules.GlobalHeaderActions;
import com.utility.TestBase;

public class GlobalHeaderTestCases extends TestBase {
	
	@Test(groups = {"Smoke"},priority=1,description="Verify Display and Click of logo in all pages")
	public void verifyJellyBellyLogoDisplay() throws IOException, Exception{
		GlobalHeaderActions.logoDisplay();
		}
	
	@Test(priority=2,description="Verify Search Functionality with Product Code")
	public void verifySearchWithProductCode() throws IOException, Exception{
		GlobalHeaderActions.searchFunctionlityForProductCode();
		}
	
	@Test(groups = {"Smoke"},priority=3,description="Verify Search Functionality with Product Name")
	public void verifySearchWithProductName() throws IOException, Exception{
		GlobalHeaderActions.searchFunctionlityForProductName();
		}
	
	@Test(priority=4,description="Verify Search Functionality with invalid Keyword")
	public void verifySearchWithInvalidKey() throws IOException, Exception{
		GlobalHeaderActions.searchFunctionlityForInvalidKey();
		}
	
}
