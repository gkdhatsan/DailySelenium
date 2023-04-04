package com.framesconcept;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		String pageSource = driver.getPageSource();// to get dom structure
		boolean contains = pageSource.contains("frame");
		System.out.println(contains);
		boolean contains1 = pageSource.contains("frameset");
		System.out.println(contains1);
		boolean contains2 = pageSource.contains("iframe");
		System.out.println(contains2);
		
		/*WebElement userid = driver.findElement(By.name("fldLoginUserId"));
		userid.sendKeys("ganesh");*/
		
		//WebElement frameelement = driver.findElement(By.xpath("//frame[@noresize='true']"));
		//driver.switchTo().frame("login_page");
		
		//driver.switchTo().frame(frameelement);
		
        driver.switchTo().frame(0);
		
		WebElement userid = driver.findElement(By.name("fldLoginUserId"));
		userid.sendKeys("ganesh");
		driver.switchTo().parentFrame();
		System.out.println("userid passed success");
	
		//driver.switchTo().defaultContent();
		//System.out.println("i came out from frame");
		driver.switchTo().parentFrame();
		System.out.println("i came to parent frame");
		
		WebElement userid1 = driver.findElement(By.name("fldLoginUserId"));
		userid1.sendKeys("ganesh");
	
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
