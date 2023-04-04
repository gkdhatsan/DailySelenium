package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {
	
	

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();//to make a connection between concern browser driver and browser
		 WebDriver driver=new ChromeDriver();//ChromeBrowser launch 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//to avoid Asynchronisation
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//To delete cookies 
		
		/*driver.get("https://adactinhotelapp.com/");
		
		//WebDriverWait wait= new WebDriverWait(driver,20);
		//WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		//element.click();
		driver.findElement(By.id("username")).sendKeys("najimunisab");
		
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		WebElement attribute = driver.findElement(By.id("username_show"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		//js.executeScript("arguments[0].setAttribute('value','najimunisab')", element);
		js.executeScript("arguments[0].setAttribute('value','Naji@123')", passWord);
		js.executeScript("arguments[0].click()", login);
		js.executeScript(" return arguments[0].getAttribute('value')", attribute);*/
		
		 //URL launch
	      driver.get("https://www.amazon.in/");

	      // identify element and click
	     // driver.findElement(By.id("hide-textbox")).click();
	      
	      WebElement findElement = driver.findElement(By.xpath("//img[@style='display:none;visibility:hidden;']"));
	      
	      String attribute = findElement.getAttribute("height");
	      System.out.println(attribute);

	      // Javascript executor class with executeScript method
	      JavascriptExecutor j = (JavascriptExecutor) driver;

	      // identify element and set value
	     // Object executeScript = j.executeScript("document.getElementById('displayed-text').value='Selenium';");
	      
	      Object executeScript = j.executeScript("return arguments[0].getAttribute('height')", findElement);
	      System.out.println(executeScript);
	      
	     /* String s = (String) j.executeScript("returndocument.getElementById('displayed-text').value");
	      System.out.print("Value entered in hidden field: " +s);*/

		
	
		// driver.get("https://www.fishpond.co.in/");// to launch url

		 
		/*TC01_Signin pom = new TC01_Signin();
		
		pom.getSignIn().click();
		pom.getEmmail().sendKeys("test.ganeshji@gmail.com");
		pom.getPassword().sendKeys("Pass3779");
		pom.getLogin().click();
		pom.getCart().click();
*/


		/*//sendkeys by javascriptExecutor

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//WebElement searchBar = driver.findElement(By.id("searchbar"));

		//js.executeScript("arguments[0].setAttribute('value','mobile')", searchBar);

		//click by javascriptExecutor

		//WebElement click = driver.findElement(By.xpath("//span[@class='search__button-icon flat-icon']"));

		//js.executeScript("arguments[0].click()", click);

		//get attribute by javascript

		WebDriverWait wait= new WebDriverWait(driver,20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[text()='Sign in'])[3]"))));
		element.click();


		WebElement signInClick = driver.findElement(By.xpath("(//a[text()='Sign in'])[3]"));
		WebElement username = driver.findElement(By.id("email_address"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginclick = driver.findElement(By.xpath("//span[@class='flat-text']"));
		
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		WebElement cartElement = wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Cart']"))));
		cartElement.click();
		
		//WebElement clickCart = driver.findElement(By.xpath("//a[text()='Cart']"));
		//WebElement bag = driver.findElement(By.xpath("(//input[@value='Update'])[1]"));

		//js.executeScript("arguments[0].click()", element);
		js.executeScript("arguments[0].setAttribute('value','test.ganeshji@gmail.com')", username);
		js.executeScript("arguments[0].setAttribute('value','Pass3779')", passWord);
		js.executeScript("arguments[0].click()", loginclick);
	//	js.executeScript("arguments[0].click()", cartElement);
		//js.executeScript("arguments[0].getAttribute('value','Update')", bag);

		//js.executeScript("arguments[0].setAttribute('value','mobile'),arguments[1].click()", searchBar,click);

		Thread.sleep(5000);
		driver.close();


		// sendkeys 
		WebDriverWait driverwait = new WebDriverWait(driver, 20);
				WebElement element = driverwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("consent_prompt_submit"))));
				element.click();



				driver.findElement(By.id("searchTerm")).sendKeys("mobile");		
				driver.findElement(By.xpath("//button[@type='submit']")).click();


*/

	}



}
