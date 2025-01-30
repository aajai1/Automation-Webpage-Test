package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class RadioButton {
	@Test
	public static void radioButton() throws InterruptedException  {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "male").click();
		for (int i=0;i<2;i++) {
			LocatorsForElement.IdLocator(driver, "sunday").click();
			LocatorsForElement.IdLocator(driver, "monday").click();
			LocatorsForElement.IdLocator(driver, "tuesday").click();
			LocatorsForElement.IdLocator(driver, "wednesday").click();
			LocatorsForElement.IdLocator(driver, "thursday").click();
			LocatorsForElement.IdLocator(driver, "friday").click();
			LocatorsForElement.IdLocator(driver, "saturday").click();
			Thread.sleep(3000);
		}
		driver.close();
	}

}
