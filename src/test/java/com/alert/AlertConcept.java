  package com.alert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		/*driver.get("https://demo.automationtesting.in/Alerts.html");

		//simple alert -- only ok button

			 driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	 Alert alert = driver.switchTo().alert();
	 alert.accept();

		//confirm alert --- ok and cancell

		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();

		//prompt alert -- conditions to be passed as sendkeys

		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();	
		Alert alert3 = driver.switchTo().alert();
		//alert.sendKeys("Hi Ganesh");
		String text = alert3.getText();
		alert3.sendKeys(text);
		alert.accept();

		java.util.Date date = new java.util.Date();
		System.out.println(date);
		
		//to add microseconds
		
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		*/
		
		driver.get("https://www.guru99.com/alert-popup-handling-selenium.html");
		
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List <String> list = new ArrayList<>();
		list.addAll(windowHandles);
		
		for (int i = 0; i < list.size(); i++) {
			
			String string = list.get(1);
			driver.switchTo().window(string);
			WebElement findElement = driver.findElement(By.xpath("//input[@type='email']"));
			findElement.sendKeys("ganesh");
			driver.findElement(By.xpath("//span//b[text()='Join Now']"));	
		}
	
		
			
	}

}
