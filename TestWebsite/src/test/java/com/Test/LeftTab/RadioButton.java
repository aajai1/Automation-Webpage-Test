package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class RadioButton {
	@Test
	public static void radioButton() throws InterruptedException  {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement maleButton =LocatorsForElement.IdLocator(driver, "male");
		maleButton.click();
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
		if(maleButton.isSelected()) {
			System.out.println("Button Test  case Passed😍");
		} else System.out.println("Button Test case Failed😒");
		
		driver.close();
	}

}
