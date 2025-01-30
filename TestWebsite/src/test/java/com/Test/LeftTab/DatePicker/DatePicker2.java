package com.Test.LeftTab.DatePicker;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DatePicker2 {
	@Test
	public void datePick2() {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "txtDate").click();
		//year
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[1]").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[1]").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[7]").click();
		//month
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[11]").click();
		//date
		LocatorsForElement.XpathLocator(driver, "//a[text()='12']").click();
		String  dob=LocatorsForElement.IdLocator(driver, "txtDate").getDomProperty("value");
		if(dob.equals("12/11/2001")) {
			System.out.println("Tess case Passed😍");
		} else System.out.println("Tess case Failed😒");
		driver.quit();
	}

}
