package com.javascriptexecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));

		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement attribute = driver.findElement(By.id("username_show"));
		Object attriValue = js.executeScript("return arguments[0].getAttribute('value')", attribute);
		System.out.println(attriValue);
		
		driver.get("https://www.argos.co.uk/");
		
		WebElement findElement = driver.findElement(By.xpath("(//strong[@class='Footerstyles__Title-sc-1ins9hy-12 hsyoOo'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)", findElement);
		
		Thread.sleep(20);
		
		WebElement findElement1 = driver.findElement(By.xpath("//strong[@class='HomepageComponentsstyles__CTA-iptobs-6 jRUnOd']"));
		js.executeScript("arguments[0].scrollIntoView(false)", findElement1);
		
		
		
		
		
	}
	
	
	
}
