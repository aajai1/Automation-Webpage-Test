package com.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureThis {
	public static void scrnShot(WebDriver driver) throws IOException {
		TakesScreenshot scrnShot = (TakesScreenshot) driver;
		String title=driver.getTitle();
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
		String timeNow=time.format(format);
		String path ="C:\\Users\\acer\\Pictures\\Screenshots\\"+title+"_"+timeNow+".jpg";
		File scrnFile=scrnShot.getScreenshotAs(OutputType.FILE);
		Files.copy(scrnFile.toPath(), Path.of(path),StandardCopyOption.REPLACE_EXISTING);
	
	}

}
