package com.hdfc.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;

import com.hdfc.driverPackage.TestRunner;

public class BusinessLogic extends TestRunner {

	public BusinessLogic() {

	}

	/**
	 * This method is used to verify whether the home screen is present or not
	 * 
	 * @throws NoSuchElementException
	 * 
	 */
	public void verifyHomeScreen() {
		try {
			if (nativeDriver.findElement(
					By.xpath(getObject("home_ScreenHeader"))).isDisplayed()) {
				System.out.println("Main screen Header");
			}
		} catch (NoSuchElementException e)

		{
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to verify after login the Menu screen is present or
	 * not
	 * 
	 * @throws NoSuchElementException
	 * 
	 */

	public void verifyMyMenuScreen() {
		try {
			if (nativeDriver.findElement(
					By.xpath("//*[@content-desc='My Menu']")).isDisplayed()) {
				System.out.println("My Menu screen Validated");
			}
		} catch (NoSuchElementException e)

		{
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to login the APP not
	 * 
	 * @throws NoSuchElementException
	 * 
	 */

	public void login(String TCID) {
		try {
			nativeDriver.findElement(By.xpath(getObject("home_customerID")))
					.click();
			String usenamr = getTestData("Username", TCID);
			String password = getTestData("Password", TCID);
			System.out.println(usenamr + password);
			nativeDriver
					.findElement(By.xpath(getObject("login_UserNameField")))
					.sendKeys(usenamr);
			nativeDriver.findElement(By.xpath(getObject("login_ContinueBtn")))
					.click();

			nativeDriver.manage().timeouts()
					.implicitlyWait(14, TimeUnit.SECONDS);

			nativeDriver
					.findElement(By.xpath(getObject("login_PasswordField")))
					.sendKeys(password);
			if(nativeDriver.findElement(By.xpath("//*[@resource-id='chkLogin']")).isDisplayed()==true){
			nativeDriver.findElement(
					By.xpath("//*[@resource-id='chkLogin']")).click();
			}
			nativeDriver.findElement(By.xpath(getObject("login_LoginBtn")))
					.click();
			System.out.println("Login Clicked");
			nativeDriver.manage().timeouts()
					.implicitlyWait(14, TimeUnit.SECONDS);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	/* Common method to tap the Back Button */

	public void clickBackBtn() throws InterruptedException {
		nativeDriver.findElement(By.xpath(getObject("backButton"))).click();
		nativeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	/*
	 * Method to tap the Account Summary Option
	 */

	public void clickAccountSummary() throws InterruptedException {
		nativeDriver.findElement(By.xpath(getObject("accountSummaryLabel")))
				.click();
		nativeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	/*
	 * Method to verify the Account Balance in the Account Summary Dashboard
	 * Screen
	 */

	public void verifyAccountBalance(String Account, String Balance, String TCID)
			throws InterruptedException {
		String accnum = getTestData(Account, TCID);
		System.out.println("Account Number : " + accnum);
		String accbal = getTestData(Balance, TCID);
		System.out.println("Account Balance : " + accbal);
		if (nativeDriver.findElement(
				By.xpath("//*[@content-desc='" + accnum + "']")).isDisplayed()) {
			try {
				nativeDriver.findElement(By.xpath("//*[@content-desc='"
						+ accbal + "']"));
				System.out
						.println("Account Balance Validated, Verified Balance : "
								+ accbal);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method is used to click the fund Transfer
	 * 
	 * If the fund button object is not present
	 * 
	 * @throws NoSuchElementException
	 * 
	 */

	public void clickFundTransfer() {
		nativeDriver.findElement(By.xpath(getObject("menu_FundTransfer")))
				.click();
		System.out.println("Fund Transfer Clicked");
	}

	/**
	 * This method is used to click and view List of beneficiaries Accounts.
	 * 
	 * If the fund button object is not present
	 * 
	 * @throws NoSuchElementException
	 * 
	 */

	public void clickViewListOfBeneficiaries() {
		Dimension size = nativeDriver.manage().window().getSize();
		int startx = size.width;
		int starty = size.height;

		nativeDriver.swipe(startx / 2, starty - starty / 4, startx / 2,
				starty / 4, 600);
		nativeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// nativeDriver.swipe(540, 1536, 540, 384, 3000);
		nativeDriver.findElement(
				By.xpath(getObject("transfer_viewLstofBeneficiary"))).click();
	}

	/**
	 * This method is used to Select the beneficiaries type
	 * 
	 * 
	 * 
	 * @throws NoSuchElementException
	 * 
	 */

	public void selectBeneficiaryType(String TCID) throws InterruptedException {

		try {

			String BeneficiaryType = getTestData("BeneficiaryType", TCID);
			System.out.println(BeneficiaryType);
			nativeDriver.findElement(
					By.xpath(getObject("list_BeneficiaryType"))).click();
			nativeDriver.findElement(
					By.xpath("//*[@text='" + BeneficiaryType + "']")).click();
			nativeDriver.findElement(By.xpath(getObject("viewBeneficiaryBtn")))
					.click();
			nativeDriver.manage().timeouts()
					.implicitlyWait(14, TimeUnit.SECONDS);
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

	/**
	 * This method is used to Verify the list of beneficiaries
	 * 
	 * 
	 * 
	 * @throws NoSuchElementException
	 * 
	 */

	public void verifyBeneficiaryDetails(String TCID) {
		try {
			String[] accNoXL = getTestData("BeneficiaryAccounts", TCID).split(
					":");
			String[] accNameXL = getTestData("BeneficiaryName", TCID)
					.split(":");
			System.out.println(accNameXL);

			for (int i = 0; i < accNoXL.length; i++) {
				String accountNumber = "//android.view.View[@content-desc='"
						+ accNoXL[i] + "']";
				System.out.println(accNoXL[i]);
				System.out.println(accountNumber);
				String accountName = "//android.view.View[@content-desc='"
						+ accNameXL[i] + "']";
				System.out.println(accNameXL[i]);
				System.out.println(nativeDriver.findElement(
						By.xpath(accountNumber)).isDisplayed());
				System.out.println(nativeDriver.findElement(
						By.xpath(accountName)).isDisplayed());
				i++;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	/*
	 * for (int j = 0; j <= accountName.length; j++) { if (i == j) { if
	 * (accountName[j].equals(valueofAccountname)) { System.out
	 * .println("Benificiary Account Number and Name is dispalyed Properly"); }
	 * else { System.out
	 * .println("Benificiary Account Number and Name displayed wrongly"); }
	 */

	/**
	 * This method is used to logout the app
	 * 
	 * 
	 * 
	 * @throws NoSuchElementException
	 * 
	 */
	public void logout() {

		try {
			nativeDriver.findElement(By.xpath(getObject("logout"))).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
