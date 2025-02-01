package com.Test.LeftTab;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.CaptureThis;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class CountrySelector {
	@Test
	public static void FillForm() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		WebElement countryIndia=LocatorsForElement.IdLocator(driver, "country");
		Actions action = new Actions(driver);
		action.sendKeys(countryIndia, "I").sendKeys(Keys.ENTER).perform();
		CaptureThis.scrnShot(driver);
		Thread.sleep(3000);
		driver.quit();
	}

}
