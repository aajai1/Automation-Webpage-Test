package com.Test.LeftTab;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class NewTabTest {
	@Test
	public void tabTest() {
		String newTabLink ="https://demo.opencart.com/";
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"HTML4\"]/div[1]/button").click();
		String windowHs=(String)driver.getWindowHandles().toArray()[1];
		driver.switchTo().window(windowHs);
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals(newTabLink)) {
			System.out.println(" Test  case Passed😍");
		} else System.out.println(" Test case Failed😒");
		
		driver.quit();
		
	}

}
