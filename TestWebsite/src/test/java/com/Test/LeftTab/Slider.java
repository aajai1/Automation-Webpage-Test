package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class Slider {
	@Test
	public void slider() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement slider1=LocatorsForElement.XpathLocator(driver, "//*[@id=\"slider-range\"]/span[1]");
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider1, 20, 0).perform();
		WebElement slider2=LocatorsForElement.XpathLocator(driver, "//*[@id=\"slider-range\"]/span[2]");
		action.dragAndDropBy(slider2, 80, 0).perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
