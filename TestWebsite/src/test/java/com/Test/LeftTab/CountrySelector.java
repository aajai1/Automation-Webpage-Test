package com.Test.LeftTab;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class CountrySelector {
	@Test
	public static void FillForm() {
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		WebElement countryIndia=LocatorsForElement.IdLocator(driver, "country");
		Actions action = new Actions(driver);
		action.sendKeys(countryIndia, "I").sendKeys(Keys.ENTER).perform();
		LocatorsForElement.IdLocator(driver, "colors");
	}

}
