package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
		
	ChromeDriver d;
		Properties pr;
		
		public VideoPlay(ChromeDriver d,Properties pr)
		{
			this.d=d;
			this.pr=pr;
		}
		public void VPlay1() throws Exception {
		
			d.findElement(By.id(pr.getProperty("videoplay"))).click();
			Thread.sleep(3000);
	}

}
