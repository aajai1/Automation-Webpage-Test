package com.Test.LeftTabFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class LeftTab {
	@Test
	public static void FillForm() {
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "name").click();
		
	}

}
