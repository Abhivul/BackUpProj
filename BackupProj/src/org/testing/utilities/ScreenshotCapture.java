package org.testing.utilities;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {
	
	public static void takescreenshot(ChromeDriver d,String filename,String extension) throws Exception {
		
		
	
			File f=d.getScreenshotAs(OutputType.FILE);
					
			String timestamp=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	
			FileUtils.copyFile(f, new File("G://SS//Screenshot//" +filename+" "+timestamp+extension));
			


}}