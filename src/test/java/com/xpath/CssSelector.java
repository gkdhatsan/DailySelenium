package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//By using id locator(#)
		
		/*WebElement txtUsername3 = driver.findElement(By.cssSelector("input[id=email]"));
		txtUsername3.sendKeys("ganesh");*/
		
		/*WebElement txtUsername = driver.findElement(By.cssSelector("input#email"));
		txtUsername.sendKeys("ganesh");*/
		
		/*WebElement txtUsername2 = driver.findElement(By.cssSelector("#email"));
		txtUsername2.sendKeys("ganesh");*/
		
		


		//By using class locator(.)
		
		

		/*WebElement txtUsername = driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']"));
		txtUsername.sendKeys("ganesh");*/
		
		/*WebElement txtUsername = driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy"));
		txtUsername.sendKeys("ganesh");*/
		
		/*WebElement txtUsername = driver.findElement(By.cssSelector(".inputtext _55r1 _6luy"));
		txtUsername.sendKeys("ganesh");*/
		
	
		//By using Starting (^)attribute value
		//WebElement startingattributevalue = driver.findElement(By.cssSelector("input[placeholder^='Email']"));
		/*WebElement startingattributevalue = driver.findElement(By.cssSelector("input[placeholder^='E']"));
		String attribute = startingattributevalue.getAttribute("Placeholder");
		System.out.println(attribute);
		startingattributevalue.sendKeys("ganesh");	*/
				
/*
		//By using Ending ($)attribute value
	    //WebElement endingattributevalue = driver.findElement(By.cssSelector("input[placeholder$='number']")); 	
		WebElement endingattributevalue = driver.findElement(By.cssSelector("input[placeholder$='r']"));
		String attribute = endingattributevalue.getAttribute("Placeholder");
		System.out.println(attribute);
		endingattributevalue.sendKeys("ganesh");*/


		//By using partial (*)attribute value
		//WebElement partialattributevalue = driver.findElement(By.cssSelector("input[placeholder*='address']"));
		/*WebElement partialattributevalue = driver.findElement(By.cssSelector("input[placeholder*='d']"));
		String attribute = partialattributevalue.getAttribute("Placeholder");
		System.out.println(attribute);
		partialattributevalue.sendKeys("ganesh");*/
		
		//by using multiple css selector
		
		WebElement multipleCssselector = driver.findElement(By.cssSelector("input[id='email'][class='inputtext _55r1 _6luy']"));
		String attribute = multipleCssselector.getAttribute("Placeholder");
		System.out.println(attribute);
		multipleCssselector.sendKeys("ganesh");
		

	}

}
