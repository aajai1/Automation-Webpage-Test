package com.Test.LeftTab.Tables;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class StaticTables {
	@Test
	public void staticTables() {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		WebElement statictable=LocatorsForElement.XpathLocator(driver, "//*[@id=\"HTML1\"]/div[1]/table");
		List<WebElement> listStatic =statictable.findElements(By.tagName("tr"));
		
		List<WebElement> rows=listStatic.get(5).findElements(By.tagName("td"));
		
		
		for(int times=0;times<listStatic.size();times++) {
			List<WebElement> timesList=listStatic.get(times).findElements(By.tagName("td"));
			for(WebElement element : timesList) {
				System.out.print(element.getText()+"\t");
			}
			System.out.println();
		}
		
		System.err.println("particular value : "+rows.get(2).getText());
			
		
		driver.quit();
		
		
	}

}
