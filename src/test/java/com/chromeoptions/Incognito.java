package com.chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognito {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		// configure options parameter to Chrome driver
	      ChromeOptions options= new ChromeOptions();
	      // add Incognito parameter
	      options.addArguments("--incognito");
	      // DesiredCapabilities object
	      DesiredCapabilities capablities = DesiredCapabilities.chrome();
	      //set capability to browser
	      capablities.setCapability(ChromeOptions.CAPABILITY, options);
	      WebDriver driver = new ChromeDriver(options);
	      driver.get("https://adactinhotelapp.com/");
	      
	      
	      
	      
	     
	}
	
	

}
