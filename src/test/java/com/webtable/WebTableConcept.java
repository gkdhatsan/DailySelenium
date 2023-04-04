package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");

		WebElement table = driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']"));

		WebElement thead = table.findElement(By.tagName("thead"));

		WebElement tr = thead.findElement(By.tagName("tr"));
		
		/*WebElement findElement2 = tr.findElement(By.xpath("(//tr[1]//th[1])[1]"));
		String text2 = findElement2.getText();
		System.out.println(text2);*/

	    List<WebElement> findElements = tr.findElements(By.tagName("th"));
		WebElement pts = tr.findElement(By.xpath("//th[text()='Pts']"));
		String text = pts.getText();
		System.out.println(text);
	
	
		
		

		for (int i = 0; i<findElements.size(); i++) {

			WebElement webElement = findElements.get(i);
			String text1 = webElement.getText();
			System.out.println(text1);
		}

		List<WebElement> td = tr.findElements(By.tagName("td"));
		for (int i = 0; i < td.size(); i++) {
			WebElement webElement = td.get(i);
			String text2 = webElement.getText();
			System.out.print(text2);

		}
	
		/*WebElement tbody = table.findElement(By.tagName("tbody"));
		
		List<WebElement> tr1 = tbody.findElements(By.tagName("tr"));
		
		for (int i = 0; i <tr1.size(); i++) {
			
			WebElement webElement = tr1.get(i);
			
		List<WebElement> td2 = webElement.findElements(By.tagName("td"));
		for (int j = 0; j < td2.size(); j++) {
			
			WebElement webElement2 = td2.get(j);
			String text = webElement2.getText();
			System.out.print(text);
			
		}	
}	
			*/
	
	}




}
