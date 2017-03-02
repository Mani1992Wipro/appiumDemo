package com.hdfc.tc;

import org.testng.annotations.Test;

public class TestCase2 extends BusinessLogic{
	
	@Test
	public void verifyBenficiaryAccounts() throws InterruptedException{
		verifyHomeScreen();
		login("TC02");	
		clickFundTransfer();
		clickViewListOfBeneficiaries();
		selectBeneficiaryType("TC02");
		verifyBeneficiaryDetails("TC02");
		logout();
				
		
			
		
	}

}



