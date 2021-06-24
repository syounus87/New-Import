package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenYoutube {
	static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Myphone");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		// caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
		caps.setCapability("appPackage", "com.google.android.youtube");
		caps.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");
		caps.setCapability("noReset", "true");
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("com.google.android.youtube:id/menu_item_0").click();
		System.out.println("Launch the Application");
	}

}
