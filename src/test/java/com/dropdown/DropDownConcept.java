package com.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");

		/*
		WebElement txtuser = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript(script, args)
		js.executeScript("arguments[0].setAttribute('value','najimunisab'),"
				+ "arguments[0].setAttribute('style','background:green;border:solid red'),"
				+ "arguments[1].setAttribute('value','Naji@123'),arguments[2].click()", txtuser,pass,login);



		//11.isMultiple();//to check whether element having multiselect option or not

		WebElement location = driver.findElement(By.id("location"));

		Select select = new Select(location);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);

		//10.getOptions();  // to find the options available in the specific elements

		List<WebElement> options = select.getOptions();


		for (int i = 0; i <options.size() ; i++) {

			WebElement webElement = options.get(i);

			//System.out.println(webElement);

			String text = webElement.getText();

			System.out.println(text);
		}

		//1.selectByIndex(indexNo);

		select.selectByIndex(2);

		//2.selectByVisibleText(text);

		select.selectByVisibleText("London");

		//3.selectByValue(attributeValue);

		WebElement adi = driver.findElement(By.xpath("//option[text()='Adelaide']"));

		String text = adi.getText();
		select.selectByValue(text);*/

		//4.deselectByIndex(indexNo);

		driver.get("https://www.ironspider.ca/forms/dropdowns.htm#example2");

		//WebElement multiborder = driver.findElement(By.name("coffee2"));

		/*Select select1 = new Select(multiborder); 

		boolean multiple = select1.isMultiple();
		System.out.println(multiple);
		 */
		/*		select1.selectByIndex(2);
		//select1.selectByIndex(3);
		select1.selectByIndex(4);
		select1.deselectByVisibleText("Sugar");
		WebElement valuecream = driver.findElement(By.xpath("//option[text()='Cream']"));
		//String text = valuecream.getText();

		String attribute = valuecream.getAttribute("value");
		select1.selectByValue(attribute);
		select1.deselectByValue(attribute);

		//5.deselectByVisibleText(text);
		WebElement valuecream1 = driver.findElement(By.xpath("//option[text()='Cream']"));
		String text = valuecream1.getText();
		select1.deselectByVisibleText(text);


		//select.deselectByVisibleText("London");//only can be deselect for multiselect
		//6.deselectByValue(attributeValue);
		WebElement valuecream2 = driver.findElement(By.xpath("//option[text()='Cream']"));
		String attribute2 = valuecream2.getAttribute("value");
		select1.selectByValue(attribute2);*/

		//7.deSelectAll();

/*
		WebElement multiborder = driver.findElement(By.name("coffee2"));
		Select select1 = new Select(multiborder); 
		select1.selectByIndex(0);
		WebElement txtmilkvalue = driver.findElement(By.xpath("//option[text()='Milk (2%)']"));
		String attribute3 = txtmilkvalue.getAttribute("value");
		select1.selectByValue(attribute3);
		WebElement txtcrea = driver.findElement(By.xpath("//option[text()='Cream']"));
		String text2 = txtcrea.getText();
		select1.selectByVisibleText(text2);

		//8.getFirstselected();

		WebElement firstSelectedOption = select1.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);

		//9.getAllSelected();

		List<WebElement> allSelectedOptions = select1.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement webElement = allSelectedOptions.get(i);
			String text3 = webElement.getText();
			System.out.println(text3);

		}


		//select1.deselectAll();	

		select1.deselectAll();






*/









	}




}
