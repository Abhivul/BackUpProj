package org.testing.TestingScripts;

import org.Base.Testing.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC8 extends Baseclass {

	
	
	@Test
	public void Click8() throws Exception {
		
		Login l=new Login(d,pr);
	    l.Signin("juluse6666@gmail.com","Sel@2400");
	    Thread.sleep(3000);
	    LogsCapture.takelogs("TC8", "Logged in sucessfully");

	    VideoPlay vp=new VideoPlay(d,pr);
	    vp.VPlay1();
	
	JavascriptExecutor js = (JavascriptExecutor) d;
    js.executeScript("window.scrollBy(0,600)", "");
    Thread.sleep(3000);
	
	d.findElement(By.xpath(pr.getProperty("CommentBox"))).click();
	Thread.sleep(4000);
	
	d.findElement(By.id(pr.getProperty("EnterComments"))).sendKeys("Good");
	Thread.sleep(3000);
	
	d.findElement(By.id(pr.getProperty("CommentButtonClick"))).click();
	Thread.sleep(4000);
	
	Logout l1=new Logout(d,pr);
	l1.Signout();
	
	 LogsCapture.takelogs("TC8", "Test case pass");
	 ScreenshotCapture.takescreenshot(d,"test",".png");	
	
	}
	
	

}
