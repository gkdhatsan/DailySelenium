package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Caratlane {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.caratlane.com/our-story");
		WebElement findElement = driver.findElement(By.xpath("//p[@class='css-1ddfen5 e2q8aix18']"));
		Actions act = new Actions (driver);
		act.moveToElement(findElement).build().perform();
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='css-qnhxbx ebw7e5r10']"));
		int size = findElements.size();
		System.out.println(size);
		for (int i = 0; i <findElements.size(); i++) {
			
			WebElement webElement = findElements.get(i);		
			String text = webElement.getText();
			System.out.println(text);
			
		}
	}

}
