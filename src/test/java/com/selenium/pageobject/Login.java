package com.selenium.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.base.BaseClass;

public class Login extends BaseClass {

	Login(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = (""))
	WebElement UserName;

	public void username(String name) {
		UserName.sendKeys(name);
	}
}
