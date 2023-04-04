package com.desiredcapabilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredClass {

	public String username = "YOUR USERNAME";
    public String accesskey = "YOUR ACCESSKEY";
   // public static RemoteWebDriver driver = null;
    public static WebDriver driver;
   // public String gridURL = "@hub.lambdatest.com/wd/hub";
 
    @BeforeClass
    public void setUp() throws Exception {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "95.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "CaptchaInSelenium");
        capabilities.setCapability("name", "TCaptchaInSeleniumSample");
        try {
        	driver.get("https://old.reddit.com/login");
           // driver = new ChromeDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
 
 
    }
 
 
    @Test
    public void clickOnRecaptchaCheckBoxInSelenium() {
        try {
            System.out.println("Let's start with fresh registration");
            WebElement username=driver.findElement(By.xpath("//input[@name='user']"));
            username.sendKeys("some_username_200");
 
            WebElement password=driver.findElement(By.xpath("//input[@name='passwd']"));
            password.sendKeys("SuperStrongP@ssw0rd");
 
            WebElement verifyPassword=driver.findElement(By.xpath("//input[@name='passwd2']"));
            verifyPassword.sendKeys("SuperStrongP@ssw0rd");
 
            WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
            email.sendKeys("xyz@gmail.com");
 
            WebDriverWait wait = new WebDriverWait(driver, 25);
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                    By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
           
            wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
 
            System.out.println("Clicked the checkbox");
 
        } catch (Exception e) {
        	System.out.println(e.getMessage());
 
        }
 
    }
 
 
    @AfterClass
    public void closeBrowser() {
        driver.close();
       Reporter.log("Closing the browser", true);

    }
 
	
	
}
