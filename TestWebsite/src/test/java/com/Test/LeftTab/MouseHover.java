package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class MouseHover {
	@Test
	public void mouseHover() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement hover=LocatorsForElement.XpathLocator(driver, "//*[@id=\"HTML3\"]/div[1]/div");
		WebElement scroll=LocatorsForElement.XpathLocator(driver, "//*[@id=\"HTML3\"]/h2");
		System.out.println(hover.getLocation());
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 1176);
		action.moveToElement(hover).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
