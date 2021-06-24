package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.pages.LoginPage;
import com.qa.utilities.ReadConfig;
import com.qa.utilities.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCases {
	protected AppiumDriver<MobileElement> driver;
	LoginPage loginpage;
	Utilities utils;
	ReadConfig config = new ReadConfig();
	
	
	@Before
	public void setup() throws MalformedURLException, InterruptedException {
		config = new ReadConfig();
		String path = System.getProperty("user.dir"); // project path
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel3");
		caps.setCapability("platformName", "Android");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability("app", path + config.getapppath());
		caps.setCapability("appPackage", "com.swaglabsmobileapp");
		caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
		driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
		Thread.sleep(5000); // 5 seconds
	}
	@Test
	public void incorrectpassword() {
		loginpage = new LoginPage(driver);
		loginpage.enterusername("standard_user");
		loginpage.enterpassword("2345");
		loginpage.clickloginBtn();
		System.out.println("Login Error");
		Assert.assertTrue(true);
		String err = loginpage.validateErr(); // Actual Error Message
		String errExpected = ("Username and Password do not match any user in this service");
		Assert.assertEquals(errExpected, err);
	}
	@Test
	public void incorrectusername() {
		loginpage = new LoginPage(driver);
		loginpage.enterusername("standard_user22");
		loginpage.enterpassword("2345");
		loginpage.clickloginBtn();
		System.out.println("Login Error");
		Assert.assertTrue(true);
		String err = loginpage.validateErr(); // Actual Error Message
		String errExpected = ("Username and Password do not match any user in this service");
		Assert.assertEquals(errExpected, err);
	}
	@Test
	public void incorrectusernamepassword() {
		loginpage = new LoginPage(driver);
		loginpage.enterusername("standard_user22");
		loginpage.enterpassword("2345");
		loginpage.clickloginBtn();
		System.out.println("Login Error");
		Assert.assertTrue(true);
		String err = loginpage.validateErr(); // Actual Error Message
		String errExpected = ("Username and Password do not match any user in this service");
		Assert.assertEquals(errExpected, err);
	}
	@Test
	public void blankusernamepassword() {
		loginpage = new LoginPage(driver);
		loginpage.enterusername("");
		loginpage.enterpassword("");
		loginpage.clickloginBtn();
		System.out.println("Login Error");
		Assert.assertTrue(true);
		String err = loginpage.validateErr(); // Actual Error Message
		String errExpected = ("Username and Password do not match any user in this service");
		Assert.assertEquals(errExpected, err);
	}
	@Test
	public void successfulLogin() {
		loginpage = new LoginPage(driver);
		loginpage.enterusername("standard_user");
		loginpage.enterpassword("secret_sauce");
		loginpage.clickloginBtn();
		System.out.println("Successful Login");
		
	}
	@After
	public void cleanup() {
		driver.quit();

	}
}
