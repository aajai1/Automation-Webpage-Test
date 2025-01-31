package com.Test.LeftTab.AlertsTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class PromptAlert {
	@Test
	public static void PromptAlert()  {
		String path="Hey There!";
		WebDriver driver = new ChromeDriver();
		SourceLink.source(driver);
		WebElement prompt =LocatorsForElement.IdLocator(driver, "promptBtn");
		prompt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(path);
		alert.accept();
		
		WebElement demo=LocatorsForElement.IdLocator(driver, "demo");
		if(demo.equals(path)) {
			System.out.println("Test  case Passed😍");
		} else System.out.println("Test case Failed😒");
		
		driver.close();
	}

}
