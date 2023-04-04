package com.windowshandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {

	
	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*driver.get("https://adactinhotelapp.com/");
		
		String currentUrl = driver.getCurrentUrl();//to get current url
        System.out.println(currentUrl);
		
		String title = driver.getTitle();//to get tittle
		System.out.println(title);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);//to get id
*/		
		
		driver.get("https://www.amazon.in/");
		/*String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		*/
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("applewatch");
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement watch1click = driver.findElement(By.xpath("(//img[@class='s-image'])[6]"));
		watch1click.click();
		
		
		/*WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		addCart.click();*/
		
		/*String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window id :"+parentWindow);
		
		Set<String> allWindows = driver.getWindowHandles();
		*/
		
		
		// 1St way  --- to switch from one to another window
		// 1st iteration
		
		/*int count =1;
		
		for (String switchWin : allWindows) {
			
			if(count==2) { 
				
			driver.switchTo().window(switchWin);	//to change the control to second window
			}
			
			count++;
		}
		
		WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		addCart.click();
		
	}*/
	
	//2nd way ----- to switch from one to another window
		
        Set<String> allWindows = driver.getWindowHandles();
        
        System.out.println(allWindows);
		
		List <String> list = new ArrayList<String>();
		
		list.addAll(allWindows);
		
		System.out.println(list);
	
	for (int i = 0; i <list.size(); i++) {
		
		String string = list.get(1);//to get window id
		
		System.out.println(string);
		
		driver.switchTo().window(string);//to change controll 
		
	}
	
	WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
	addCart.click();
for (int i = list.size()-1; i >=0; i--) {
		
		String string = list.get(0);//to get window id
		
		System.out.println(string);
		
		driver.switchTo().window(string);//to change controll 
		
	}
	
		
		
	/*//3rd way  ----- to switch from one to another window
        String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String endway : allWindows) {
			
			if(!(endway.equals(parentWindow))) {
				
				driver.switchTo().window(endway);	
			}	}
		
		WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		addCart.click();		
		
}*/
	
}}
