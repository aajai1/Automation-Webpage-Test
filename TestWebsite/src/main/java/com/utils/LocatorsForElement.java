package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsForElement {
	
	public static WebElement IdLocator(WebDriver driver,String path) {
		return driver.findElement(By.id(path));
	}

}
