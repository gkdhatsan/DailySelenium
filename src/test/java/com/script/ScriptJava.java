package com.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptJava {

	
	public static void main(String[] args) throws InterruptedException {
		
		PageModel model = new PageModel();
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.fishpond.co.in/");
		
		
        
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scrolldown = driver.findElement(By.xpath("//div[@class='b-popular-brands__header']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		
		WebElement scrollUp = driver.findElement(By.xpath("//div[@class='b-bestsellers__header']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
		
		//js.executeScript("arguments[0].setAttribute('value','test.ganeshji@gmail.com')", email);
		
		//highlight the element
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid red')", scrollUp);
		
		//js.executeScript("arguments[0].setAttribute('style','background:yellow')", scrollUp);
		
		//make border
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red')", scrollUp);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='menu__item-content'][text()='Sign in']"))));
		
		js.executeScript("arguments[0].click()", until);
		WebElement email = driver.findElement(By.id("email_address"));
		js.executeScript("arguments[0].setAttribute('value','test.ganeshji@gmail.com')", email);
		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','Pass3779')", pass);
		WebElement login = driver.findElement(By.xpath("//span[@class='flat-text'][text()='Sign In']"));
		js.executeScript("arguments[0].click()", login);
		
		WebElement cartClick = driver.findElement(By.xpath("//a[@class='menu__item-content menu-item-cart']"));
		js.executeScript("arguments[0].click()", cartClick);
		
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", cartClick);
		System.out.println(executeScript);
		
		
		
		
		
		
		
		
	}
	
	
}
