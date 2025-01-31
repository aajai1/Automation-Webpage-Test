package com.Test.LeftTab.AlertsTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class SimpleAlert {
	@Test
	public static void simpleAlert()  {
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "alertBtn").click();
		driver.switchTo().alert().accept();
		driver.close();
	}

}
