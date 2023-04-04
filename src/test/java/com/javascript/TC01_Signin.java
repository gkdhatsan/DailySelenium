package com.javascript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TC01_Signin  {

	WebDriver driver;

	public TC01_Signin() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[text()='Sign in'])[3]")
	private WebElement signIn;

	@FindBy(id = "email_address")
	private WebElement emmail;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//span[@class='flat-text']")
	private WebElement login;
	
	@FindBy(xpath = "//a[text()='Cart']")
	private WebElement cart;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmmail() {
		return emmail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getCart() {
		return cart;
	}
	
	
	

	
}
