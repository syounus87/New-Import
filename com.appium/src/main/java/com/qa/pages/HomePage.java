package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	protected AppiumDriver driver;

	public HomePage(AppiumDriver idriver) {

		this.driver = idriver;
		PageFactory.initElements(new AppiumFieldDecorator(idriver), this);
	}

}
