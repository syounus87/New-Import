package appiumBasics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass{
	
	
public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{

		
		//To install the app
		File f = new File("//com.appium//src//main//java//appiumBasics");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Myphone" );
		caps.setCapability("platformName", "Android");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		return driver;
}
		
	}

