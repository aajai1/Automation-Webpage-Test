package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DetailsFill {
	public static void fillDetails() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "name").sendKeys("My Name");
		LocatorsForElement.IdLocator(driver, "email").sendKeys("namenum13@gmail.com");
		LocatorsForElement.IdLocator(driver, "phone").sendKeys("1573962840");
		LocatorsForElement.IdLocator(driver, "textarea").sendKeys("no 87, This street,\n That area,This City \n257498");
		Thread.sleep(3000);
		
		
	}

}
