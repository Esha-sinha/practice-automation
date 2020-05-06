package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//a[contains(@class,'login')]")
	WebElement signUp;

	@FindBy(name = "email")
	WebElement emailAddress;

	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(name = "SubmitLogin")
	WebElement signIn;

	// Initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage login(String un, String pwd) {

		signUp.click();
		emailAddress.sendKeys(un);
		password.sendKeys(pwd);
		signIn.click();
		return new HomePage();

	}

}
