package com.mouseactions;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		 driver.get("https://www.lntinfotech.com/"); WebElement findElement = driver.findElement(By.xpath("(//span[text()='Industries'])[2]"));
		 
		 Actions act = new Actions (driver);
		  act.moveToElement(findElement).build().perform();
		  act.click(findElement).build().perform();
		  act.moveToElement(findElement).doubleClick().build().perform();
		  act.doubleClick(findElement).build().perform();
		  act.moveToElement(findElement).click().build().perform();
		  act.contextClick(findElement).build().perform();
		  act.moveToElement(findElement).contextClick().build().perform();
		  act.doubleClick(findElement).build().perform();
		  act.moveToElement(findElement).doubleClick().build().perform();
		  act.clickAndHold(findElement).build().perform();
		  act.dragAndDrop(findElement, findElement).build().perform();
		  
		  
		  
		 /// child::li

		driver.get("https://www.zigwheels.com/");

		List<WebElement> cars = driver.findElements(By.xpath(
				"//img[@class='sl-img clr']//following::a[@data-track-label='popular-cars-car']"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(argements[0]., args)
		
		int size = cars.size();
		System.out.println(size);

		for (WebElement namecar : cars) {
			String names = namecar.getAttribute("title");
			System.out.println(names);
		}
		
		 
		 
		 
		/*
		 * List<WebElement> findElements =
		 * driver.findElements(By.xpath("(//ul[@class='sub-menu'])[14]"));
		 * 
		 * for (int i = 0; i < findElements.size(); i++) {
		 * 
		 * WebElement webElement = findElements.get(i); String text =
		 * webElement.getText(); System.out.println(text);
		 */

	}

	/*
	 * Actions act= new Actions(driver); WebElement findElement =
	 * driver.findElement(By.xpath("(//span[text()='Industries'])[2]"));
	 * act.moveToElement(findElement).build().perform();
	 */

	/*
	 * driver.get("http://www.greenstechnologys.com/"); WebElement course =
	 * driver.findElement(By.xpath("//a[text()='COURSES']"));
	 * 
	 * //mouseHover Actions act = new Actions(driver);
	 * act.moveToElement(course).perform();
	 * 
	 * //Rightclick
	 * 
	 * WebElement contactus =
	 * driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	 * 
	 * act.contextClick(contactus).perform();
	 */

	// DoubleClick

	/*
	 * Actions act = new Actions(driver);
	 * driver.get("https://adactinhotelapp.com/"); WebElement txtusername =
	 * driver.findElement(By.id("username")); txtusername.sendKeys("najimunisab");
	 * act.doubleClick(txtusername).perform();
	 */

	// To type in uppercase in element by using mouse actions

	/*
	 * Actions act = new Actions(driver);
	 * driver.get("https://adactinhotelapp.com/"); WebElement txtusername =
	 * driver.findElement(By.id("username")); //txtusername.sendKeys("NAJIMUNISAB");
	 * act.keyDown(txtusername,
	 * Keys.SHIFT).sendKeys("najimunisab").keyUp(txtusername, Keys.SHIFT).perform();
	 */
	// DragandDrop

	/*
	 * driver.get("https://demo.guru99.com/test/drag_drop.html");
	 * 
	 * Actions act = new Actions(driver);
	 * 
	 * 
	 * WebElement SourcedragBank =
	 * driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	 * 
	 * WebElement TargetdrapAccount =
	 * driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"
	 * ));
	 * 
	 * WebElement SoucedrapAmount =
	 * driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	 * 
	 * WebElement TargetdropAmount = driver.findElement(By.id("amt7"));
	 * 
	 * act.dragAndDrop(SourcedragBank, TargetdrapAccount).perform();
	 * act.dragAndDrop(SoucedrapAmount, TargetdropAmount).perform();
	 * 
	 * 
	 * 
	 * }
	 */

}
