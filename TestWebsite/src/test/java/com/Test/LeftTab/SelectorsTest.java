package com.Test.LeftTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class SelectorsTest {
	@Test
	public  void selectortest() {
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"colors\"]/option[6]").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"animals\"]/option[10]").click();
	}
	

}
