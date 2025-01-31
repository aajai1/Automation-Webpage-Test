package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class WikipediaTest {
	@Test
	public void wikiSearch() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "Wikipedia1_wikipedia-search-input").sendKeys("2012");
		LocatorsForElement.ClassNameLocator(driver, "wikipedia-search-button").click();
		WebElement seacrchButton=LocatorsForElement.IdLocator(driver, "Wikipedia1_wikipedia-search-results");
	System.out.println(	seacrchButton.getText());
		if(seacrchButton.isDisplayed()) {
			System.out.println("Button Test  case Passed😍");
		} else System.out.println("Button Test case Failed😒");
		Thread.sleep(3000);
		driver.close();
			
		
	}

}
