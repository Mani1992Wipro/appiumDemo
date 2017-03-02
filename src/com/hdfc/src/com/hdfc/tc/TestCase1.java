package com.hdfc.tc;

import org.testng.annotations.Test;

public class TestCase1 extends BusinessLogic {
	
	@Test
	public void AccountSummaryValidation() throws InterruptedException{
		verifyHomeScreen();

		login("TC01");		
		clickAccountSummary();		
		clickBackBtn();		
		verifyAccountBalance("SavingsAccNum","SavingsBalance","TC01");
		logout();
	}

}
