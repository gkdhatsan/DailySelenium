package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesProgramm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/products/jewelry-earrings?sort=plrty");

	/*	WebElement username = driver.findElement(By.xpath("//button[@name='login']//parent::div[@class='_6ltg']//preceding-sibling::div//child::div[@class='_6lux']//child::input[@id='email']"));
		username.sendKeys("ganesh");
		
		WebElement buttonlogin = driver.findElement(By.xpath("//button[@name='login']//parent::div[@class='_6ltg']//preceding-sibling::div//child::div[@class='_6lux']//child::input[@id='email']//parent::div[@class='_6lux']//parent::div//following-sibling::div[@class='_6ltg']//child::button[text()='Log in']"));
		buttonlogin.click();*/
		
		Thread.sleep(10000);
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		//WebElement stud = driver.findElement(By.xpath("(((//h1[@class='category-name']//parent::div[@class='category-name-wrapper clearfix ']//following-sibling::div[@id='products']//child::section[@class='js-section clearfix dp-widget dp-fired'])[2]//child::div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[3]//child::div[@class='product-tuple-description ']//child::div[@class='product-desc-rating ']//child::a[@class='dp-widget-link noUdLine hashAdded']//child::div[contains(@class,'clearfix')])[1]"));
		//WebElement stud = driver.findElement(By.xpath("((//h1[@class='category-name']//parent::div[@class='category-name-wrapper clearfix ']//following-sibling::div[@id='products']//child::section[@class='js-section clearfix dp-widget dp-fired'])[2]//child::div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[3]//child::div[@class='product-tuple-description ']//child::div[@class='product-desc-rating ']//child::a[@class='dp-widget-link noUdLine hashAdded']//child::div[@class='product-price-row clearfix']"));
		//WebElement stud = driver.findElement(By.xpath("((//h1[@class='category-name']//parent::div[@class='category-name-wrapper clearfix ']//following-sibling::div[@id='products']//child::section[@class='js-section clearfix dp-widget dp-fired'])[2]//child::div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[3]//child::div[@class='product-tuple-description ']//child::div[@class='product-desc-rating ']//child::a[@class='dp-widget-link noUdLine hashAdded']//p[@class='product-title ']"));
		//WebElement stud = driver.findElement(By.linkText("Nakabh - Black Danglers Earrings ( Pack of 1 )"));
		//wait.until(ExpectedConditions.elementToBeClickable(stud));
		
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", stud);
	
		
		WebElement findElement = driver.findElement(By.xpath("//a//p[contains(text(),'Golden Traditional Earrings')][@class='product-title ']"));
		
		findElement.click();
		
		
		
		
		
		
		
		
	}
	
	
}
