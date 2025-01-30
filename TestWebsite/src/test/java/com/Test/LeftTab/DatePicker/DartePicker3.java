package com.Test.LeftTab.DatePicker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DartePicker3 {
	@Test
	public void datepick3() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement startDate=LocatorsForElement.IdLocator(driver, "start-date");
		startDate.sendKeys("12-11-2001");
		WebElement endDate=LocatorsForElement.IdLocator(driver, "end-date");
		endDate.sendKeys("12-11-2025");
		LocatorsForElement.ClassNameLocator(driver, "submit-btn").click();
		System.out.println(startDate.getDomProperty("value"));
		if(startDate.getDomProperty("value").equals("2001-11-12")&&endDate.getDomProperty("value").equals("2025-11-12")) {
			System.out.println("Tess case Passed😍");
		} else System.out.println("Tess case Failed😒");
		Thread.sleep(3000);
		driver.quit();
	}

}
