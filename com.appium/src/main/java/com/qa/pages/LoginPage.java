package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	protected AppiumDriver<MobileElement>driver;
	protected Utilities utils;

	public LoginPage(AppiumDriver<MobileElement> idriver) {

		this.driver = idriver;
		PageFactory.initElements(new AppiumFieldDecorator(idriver), this);
		utils = new Utilities(driver);
	}

	@AndroidFindBy(accessibility = "test-Username")
	private MobileElement usernameTxtFld;

	@AndroidFindBy(accessibility = "test-Password")
	private MobileElement passwordTxtFld;

	@AndroidFindBy(accessibility = "test-LOGIN")
	private MobileElement loginBtn;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Error message']/android.widget.TextView")
	private MobileElement errTxt;

	public void enterusername(String username) {
		utils.enterText(usernameTxtFld, username);
	}

	public void enterpassword(String password) {
		utils.enterText(passwordTxtFld, password);
	}
		
		public String validateErr() {
			return errTxt.getText();
	}

	public void clickloginBtn() {
		utils.Click(loginBtn);
		loginBtn.click();

	}

}
