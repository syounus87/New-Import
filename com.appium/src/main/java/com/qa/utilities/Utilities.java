package com.qa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Utilities {
//Clicking, Scrolling, Shaking, Swiping, Longtap, Sendkeys

	protected AppiumDriver driver;

	public Utilities(AppiumDriver driver) {
		this.driver = driver;
	}

	// Click Utility
	public void Click(MobileElement element) {
		waitForVisibility(element);
		element.click();
	}

	public MobileElement waitForVisibility(MobileElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		MobileElement ele = (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
		return ele;

	}

	public void enterText(MobileElement element, String text) {
		waitForVisibility(element);
		element.clear();
		element.sendKeys(text);
	}
	public void scroll() {
		
	}
	
	
	
}