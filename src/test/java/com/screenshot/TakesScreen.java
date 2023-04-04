package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreen {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.fishpond.co.in/");
		
		
		/*Thread.sleep(3000);
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File soucre = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(soucre, new File("C:\\Users\\User\\eclipse-workspace\\DailySelenium\\target\\screen.jpeg"));
		
		*/
		
		WebElement buyOnline = driver.findElement(By.xpath("(//h4[@class='link-list__header xs-small-d-none'])[1]"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", buyOnline);
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red')", buyOnline);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\User\\eclipse-workspace\\DailySelenium\\target\\New Screen.jpeg"));
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
