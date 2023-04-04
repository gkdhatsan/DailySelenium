package com.chromeoptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidBrowserBaseNotifications {

	public static void main(String[] args) {
		
		//For New Chrome Version (>50):
		// Step 1 :

		// Create a map to store preferences
		Map<String, Object> map = new HashMap<String, Object>();

		// Step 2 :

		// Pass the argument 1 to allow and 2 to block
		// add key and value to map as follow to switch off browser notification
		map.put("profile.default_content_setting_values.notifications", 2);

		// Step 3 :

		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// Step 4 :

		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", map);
		

		// Step 5 :

		/*
		 * Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize
		 * chrome driver which will switch off this browser notification on the chrome
		 * browser
		 */

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("");
		
		
		/*
		 * For Old Chrome Version (<50):
		 * 
		// Create an instance of ChromeOptions class
				ChromeOptions options = new ChromeOptions();
				// Add chrome switch to disable notification - "--disable-notifications"
				options.addArguments("--disable-notifications");

				// Pass ChromeOptions instance to ChromeDriver Constructor

				WebDriver driver = new ChromeDriver(options);
				driver.get("");*/
		
		
		
		
	}

}
