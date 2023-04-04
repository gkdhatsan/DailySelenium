    package com.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		//driver.get("https://www.instagram.com/");
		
		//Thread.sleep(2000);
		
		/*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("ganesh");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("kumar");*/
		
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
	
		WebElement simple = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		simple.click();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirm.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		
		
		
		
	}
	
	
	
	
}
