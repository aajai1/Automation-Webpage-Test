package com.Test.LeftTab;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DoubleClick {
	@Test
	public void doubleClick() {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement dc=LocatorsForElement.XpathLocator(driver, "//*[@id=\"HTML10\"]/div[1]/button");
		Actions action = new Actions(driver);
		action.doubleClick(dc).perform();
		driver.quit();
		
	}

}
