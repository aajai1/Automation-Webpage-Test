package com.Test.LeftTab.DatePicker;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class DatePicker1 {
	@Test
	public void pickDate1() throws InterruptedException {
		WebDriver driver = DriverKit.driverTool();
		SourceLink.source(driver);
		LocatorsForElement.IdLocator(driver, "datepicker").click();
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOf());
		 */
		
		while(true){
			String month =LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/span[1]").getText();
			String year =LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/span[2]").getText();
			
			 if(month.equals("November")&& year.equals("2001"))
			 { 
				
				 break; 
				 }
			 
			System.out.println(month+ " " + year);
			LocatorsForElement.XpathLocator(driver, "//*[@id=\"ui-datepicker-div\"]/div/a[1]").click();
			
		}
		
		
		LocatorsForElement.XpathLocator(driver, "//a[text()='12']").click();
		Thread.sleep(3000);
		driver.quit();
		
}

}
