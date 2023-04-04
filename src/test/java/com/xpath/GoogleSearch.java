package com.xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement txtsearch = driver.findElement(By.name("q"));
		txtsearch.sendKeys("Ponniyin Selvan");

		List<WebElement> searchAll = driver.findElements(By.xpath("//div[@class='aajZCb']"));

		for (int i = 0; i < searchAll.size(); i++) {

			WebElement webElement = searchAll.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
		WebElement clickcast = driver.findElement(By.xpath("//b[text()=' cast']"));
		clickcast.click();












	}}
