package com.Test.LeftTab.UploalFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.LocatorsForElement;
import com.utils.SourceLink;

public class UploadFiles {
@Test
public void uploadFiles() throws InterruptedException {
	WebDriver driver = DriverKit.driverTool();
	SourceLink.source(driver);
	WebElement upload=LocatorsForElement.IdLocator(driver, "multipleFilesInput");
	Thread.sleep(3000);
	//String path = "/TestWebsite/Images/GOT.jpg";
	String path = "C:\\Users\\acer\\Pictures\\15126-2700x1800-desktop-hd-game-of-thrones-background-photo.jpg"
	+"\nC:\\Users\\acer\\Pictures\\279243_front.jpg";

	System.out.println(	path);
	upload.sendKeys(path);
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"multipleFilesForm\"]/button").click();
	WebElement multiUpload = LocatorsForElement.IdLocator(driver, "multipleFilesStatus");
	if(multiUpload.isDisplayed()) {
		System.out.println("Tess case Passed😍");
	} else System.out.println("Tess case Failed😒");
	driver.quit();
}

}
