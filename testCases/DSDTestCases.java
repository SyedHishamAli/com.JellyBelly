package com.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.modules.DSDActions;

public class DSDTestCases {
	
	@Test(groups = {"Smoke"},priority=1,description="Adding more than 10 products to cart through Rapid order")
	 public void verifyRapidOrderFunctionality() throws IOException, Exception{
		DSDActions.RapidOrderFunctionality();
	}
	
	
	
	

}
