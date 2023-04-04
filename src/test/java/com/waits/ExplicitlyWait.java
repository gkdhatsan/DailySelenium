package com.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		
		WebDriverWait driverwait = new WebDriverWait(driver,5);
		WebElement until = driverwait.until(ExpectedConditions.elementToBeClickable((driver.findElement(By.name("username")))));
		until.sendKeys("ganesh");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("kumar");
		
		
		
		
		
		
	}
	
	
	
	
}
