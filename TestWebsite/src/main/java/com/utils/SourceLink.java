package com.utils;

import org.openqa.selenium.WebDriver;

public class SourceLink {
	
	public static void source(WebDriver driver) {
		 String sourceLink = "https://testautomationpractice.blogspot.com/";
		 driver.get(sourceLink);
		 driver.manage().window().maximize();
		 
	}
}
