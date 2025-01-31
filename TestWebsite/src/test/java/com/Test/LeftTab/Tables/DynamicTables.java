package com.Test.LeftTab.Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DynamicTables {
@Test
public void dynamicTable() {
	WebDriver driver = DriverKit.driverTool();
	SourceLink.source(driver);
	WebElement dynamicTable=LocatorsForElement.IdLocator(driver, "rows");
	List <WebElement> trTags=dynamicTable.findElements(By.tagName("tr"));
	List <WebElement> tdTags=trTags.get(3).findElements(By.tagName("td"));
	System.out.println(tdTags.get(4).getText());
	driver.quit();
}
}
