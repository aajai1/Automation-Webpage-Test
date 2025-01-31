package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DynamicButtonTest {
	@Test
	public void dynamicButton() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement start=LocatorsForElement.XpathLocator(driver, "//*[@id=\"HTML5\"]/div[1]/button");
		start.click();
		System.out.println(start.getAccessibleName());
		if(start.getAccessibleName().equals("STOP")) {
			System.out.println("Test  case Passed😍");
		} else System.out.println("Test case Failed😒");
		Thread.sleep(3000);
		driver.close();
		
		
}
}
