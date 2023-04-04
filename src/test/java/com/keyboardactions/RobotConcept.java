package com.keyboardactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotConcept {
         
	public static void main(String[] args) throws AWTException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions act = new Actions(driver);
		act.moveToElement(course).perform();
		Robot robo = new Robot();*/
		/*robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);*/
		
		//for multiple same robo actions we can use for loop
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("najimunisab");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Naji@123");
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
			
		
	}
	
	
}
