package com.xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTypes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// 1.//tagname[@id='attributevalue'] == By using id

		/*	WebElement txtuser= driver.findElement(By.xpath("//input[@id='searchbar']"));
		txtuser.sendKeys("Iphone 13 pro max"); */

		// 2.//tagname[@name='attributevalue']==By using name

		/*	WebElement txtusernameloc= driver.findElement(By.xpath("//input[@name='keywords']"));
		txtusernameloc.sendKeys("Iphone 13 pro max"); */

		// 3.//tagname[@class='attributevalue']==By using class
		/*		
		WebElement txtuserclassloc= driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']"));
		txtuserclassloc.sendKeys("Iphone 13 pro max"); */

		// 4.//tagname[text()='fulltext'] ==== By using text

		/*WebElement login= driver.findElement(By.xpath("//button[text()='Log in']"));

		login.click();
		 */
		// 5.//tagname[contains(text(),'partial text')] === no need to take full text,
		// we can use single word out of total text for using partial text.

		/* WebElement text= driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the areash in your life.']"));
        String text2 = text.getText();
        System.out.println(text2);
		 */
		/* WebElement text1= driver.findElement(By.xpath("//h2[@class='_8eso']"));
        String text3 = text1.getText();
        System.out.println(text3);*/

		//button[@name='login']

		/*WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		String text = login.getText();
		System.out.println(text);*/

		/*WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println(login);
		String attribute = login.getAttribute("name");
		System.out.println(attribute);

		String attribute2 = login.getAttribute("id");
		System.out.println(attribute2);
		 */
		/*WebElement login4 = driver.findElement(By.xpath("//button[text()='Log in']"));

		String text = login4.getText();
		System.out.println(text);*/


		/*	WebElement login = driver.findElement(By.xpath("//h2[contains(text(),'helps')]"));

		String text = login.getText();
		System.out.println(text);*/

		//dyanamic xpath
		/*Actions act = new Actions(driver);
		WebElement mouseoverwomen = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		act.moveToElement(mouseoverwomen).perform();
		WebElement earing = driver.findElement(By.xpath("//span[text()='Earrings']"));
		earing.click();
		WebElement earing1 = driver.findElement(By.xpath("//p[text()='Nakabh - Turquoise Drop Earrings ( Pack of 1 )']"));
		String text = earing1.getText();
		System.out.println(text);
		//earing1.click();
		 */		
		// 6.//tagname[contains(@attribute name,'partial attribute value')]=== no need
		// to take full partial attribute value ,we can use single word out of total value.
		/*
		WebElement earing1 = driver.findElement(By.xpath("//input[contains(@placeholder,'address')]"));
		earing1.sendKeys("ganesh");*/


		// 7.//tagname[starts-with(text(),'starting text')]=== no need to take full
		// text,we can use only starting text from total text

		/*	WebElement startsWith = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook')]"));
		String text = startsWith.getText();
		System.out.println(text);
		 */



		// 8.//tagname[ends-with(text(),'end text')] ==== no need to take full text,we
		// can use only end text from total text

		/*WebElement endsWith = driver.findElement(By.xpath("//h2[ends-with(text(),'life.')]"));
		String text1 = endsWith.getText();
		System.out.println(text1);*/

		// 9.//tagname[starts-with(@attribute name,'starting value')]==== no need to
		// take full attribute value ,we can use only starting value from total value.

		/*WebElement startwithattributevalue = driver.findElement(By.xpath("//input[starts-with(@aria-label,'Email')]"));
		String attribute = startwithattributevalue.getAttribute("aria-label");
		System.out.println(attribute);
		 */
		// 10.//tagname[ends-with(@attribute name,'end value')]==== no need to take full
		// attribute value ,we can use only ending value from total value.

		/*WebElement endswithattributevalue = driver.findElement(By.xpath("//input[ends-with(@placeholder,'number')]"));
		String attribute1 = endswithattributevalue.getAttribute("placeholder");
		System.out.println(attribute1);*/


		// 11.(//tagname[@class='attribute value'])[2]====when using index can find
		// exact element

		/*WebElement txtUser = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy _9npi'])[1]"));
		txtUser.sendKeys("ganesh");*/

		// 12.//tagname[@class='attributevalue'][text()='fulltext'] ====when we use
		// double xpath we can find accurate element.
		
		/*WebElement doublexpath = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy'][@placeholder='Email address or phone number']"));
		doublexpath.sendKeys("ganesh");
		*/

		// 13.//tagname[@class='attributevalue'andtext()='fulltext'] // both condition
		// should be satisfied
		
		/*WebElement andoperator = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.'and@class='_8eso']"));
		String text = andoperator.getText();
		System.out.println(text);
		String attribute = andoperator.getAttribute("class");
		System.out.println(attribute);*/
		
		//14.//tagname[@class='attributevalue'ortext()='fulltext'] // any of one condition should be satisfied
        
		WebElement oroperator = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.'or@class='_8eso']"));
		String text1 = oroperator.getText();
		System.out.println(text1);
		String attribute1 = oroperator.getAttribute("class");
		System.out.println(attribute1);
		
		
	}

}
