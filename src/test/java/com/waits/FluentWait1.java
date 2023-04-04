package com.waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait1 {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement until = wait.until(new Function<WebDriver,WebElement>(){

		public WebElement apply(WebDriver driver){

		return driver.findElement(By.id("username"));
		}
		});
		
	    until.sendKeys("najimunisab");
	
		
	    Thread.sleep(5000); 

	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	    WebDriverWait wait1 = new WebDriverWait(driver,20);
	    WebElement until1 = wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	    until1.click();

	    Wait <WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	    WebElement element = wait.until(new Function<WebDriver,WebElement>(){

	    public WebElement apply(WebDriver driver){


	    return driver.findElement(By.xpath(""));
	    }

	    });
	    element.click();
		
	}
		
}
 