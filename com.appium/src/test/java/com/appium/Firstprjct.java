package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Firstprjct {

static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Myphone");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
		caps.setCapability("appPackage", "com.swaglabsmobileapp");
		caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity"); 
		caps.setCapability("noReset", "True");
		 driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		System.out.println("Launch the Application");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("test-Username").sendKeys("standard_user");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("test-Password").sendKeys("secret_sauce");
		driver.findElementByAccessibilityId("test-LOGIN").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("closed the application");
		//driver.quit();
		
		

	}

}
