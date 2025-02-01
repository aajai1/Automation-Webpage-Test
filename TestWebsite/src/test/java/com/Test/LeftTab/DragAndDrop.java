package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DragAndDrop {
	@Test
	public void dragAndDrop() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement drag=LocatorsForElement.IdLocator(driver, "draggable");
		WebElement drop=LocatorsForElement.IdLocator(driver, "droppable");
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
