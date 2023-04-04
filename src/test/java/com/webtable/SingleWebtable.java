package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleWebtable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> trs = driver.findElements(By.tagName("tr"));
		for (int i = 0; i <trs.size(); i++) {
			
			WebElement webElement = trs.get(i);
			List<WebElement> tds = webElement.findElements(By.tagName("td"));
			
			for (int j = 0; j < tds.size(); j++) {
				
				WebElement webElement2 = tds.get(j);
				String text = webElement2.getText();
				System.out.println(text);
				
			}
				
			}
			
		}
		
		
		
	}
	

