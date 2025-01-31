package com.Test.LeftTab.UploalFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class UploadFile {
@Test
public void uploadFile() throws InterruptedException {
	WebDriver driver = DriverKit.driverTool();
	SourceLink.source(driver);
	WebElement upload=LocatorsForElement.XpathLocator(driver, "//*[@id=\"singleFileInput\"]");
	Thread.sleep(3000);
	//String path = "/TestWebsite/Images/GOT.jpg";
	String path = "C:\\Users\\acer\\Pictures\\15126-2700x1800-desktop-hd-game-of-thrones-background-photo.jpg";

	System.out.println(	path);
	upload.sendKeys(path);
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"singleFileForm\"]/button").click();
	
	WebElement pathSelect = LocatorsForElement.IdLocator(driver, "singleFileStatus");
	System.out.println(pathSelect.getText());
	Thread.sleep(3000);
	if(pathSelect.isDisplayed()) {
		System.out.println("Tess case Passed😍");
	} else System.out.println("Tess case Failed😒");
	driver.quit();
}

}
