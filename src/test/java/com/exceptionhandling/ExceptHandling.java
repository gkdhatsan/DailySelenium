package com.exceptionhandling;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptHandling {

	public static void main(String[] args) throws InterruptedException   {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.get("https://adactinhotelapp.com/");
	
	try {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("najimunisab");
		System.out.println("userfilled");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Naji@123");
		System.out.println("passwordfilled");
		WebElement login = driver.findElement(By.id("sword"));
		login.click();   
		System.out.println("loginfilled");
		
	} 
	
	
	catch (Exception e) {
		
		System.out.println(e);
	}
	System.out.println("catchblock crossed");
	driver.close();
	
	
	
	
	}	
}
