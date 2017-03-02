package com.hdfc.driverPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.hdfc.utils.ConstantClass;
import com.hdfc.utils.ExcelUtils;
import com.hdfc.utils.PropertyReader;

public class TestRunner extends PropertyReader {
	String Udata;

	DesiredCapabilities mobileCapablities = new DesiredCapabilities();
	public static AppiumDriver nativeDriver = null;

	public void initializeDriver() throws MalformedURLException {

		mobileCapablities.setCapability(ConstantClass.App_Package,
				getConfigProperty("appPackage"));
		mobileCapablities.setCapability(ConstantClass.App_Activity,
				getConfigProperty("appActivity"));
		mobileCapablities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				getConfigProperty("PlatformVersion"));
		mobileCapablities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				getConfigProperty("PlatformName"));
		mobileCapablities.setCapability(MobileCapabilityType.UDID,
				getConfigProperty("DeviceUDID"));
		mobileCapablities.setCapability(MobileCapabilityType.DEVICE_NAME,
				getConfigProperty("DeviceName"));
		// mobileCapablities.setCapability(MobileCapabilityType.APP, "D:");

		nativeDriver = new AndroidDriver<MobileElement>(new URL(
				ConstantClass.Address_Port), mobileCapablities);
		nativeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public String getTestData(String Uname, String TCID) {

		ExcelUtils readr = new ExcelUtils();

		int ColumnIndex = readr.readHeaderIndex(
				"D:\\Appium\\Workspace\\appiumDemo1\\MasterTestData1.xlsx",
				"Data", Uname);
		Udata = readr.readXLatIndex(
				"D:\\Appium\\Workspace\\appiumDemo1\\MasterTestData1.xlsx",
				"Data", TCID, ColumnIndex);
		return Udata;

	}

	@BeforeClass
	public void preconfig() {
		PropertyReader.loadPropertyFiles();

	}

	@BeforeMethod
	public void SetUp() {
		try {
			initializeDriver();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterMethod
	public void terminate() {

	}
}
