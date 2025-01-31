package com.Test.LeftTab.AlertsTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class ConfirmationAlert {
	@Test
	public static void confirmationAlertAccept() throws InterruptedException  {
		//Accept
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "confirmBtn").click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@Test
	public static void confirmationAlertDismiss() throws InterruptedException  {
		//Dismiss
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "confirmBtn").click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	
		driver.close();
	}

}
