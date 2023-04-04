package com.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageModel {
	
	public PageModel() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="searchbar")
	private WebElement searchBar;
    public WebElement getSearchBar() {
		return searchBar;
	}
	@FindBy(xpath="//a[@class='menu__item-content'][text()='Sign in']")
	private WebElement signIn;
	@FindBy(id="email_address")
	private WebElement email;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement login;
	@FindBy(xpath="//a[@class='menu__item-content menu-item-cart']")
	private WebElement cart;
	
	public  WebElement getSignIn() {
		return signIn;
	}
	
	public WebElement getEmail() {
		return email;
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
