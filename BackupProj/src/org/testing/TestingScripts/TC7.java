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

public class TC7 extends Baseclass{

	@Test
	public void Click7() throws Exception {
		 Login l=new Login(d,pr);
		    l.Signin("juluse6666@gmail.com","Sel@2400");
		    Thread.sleep(3000);
	//d.findElement(By.id(pr.getProperty("videoplay"))).click();
	//Thread.sleep(3000);
		    
		    LogsCapture.takelogs("TC7", "Logged in sucessfully");
		  
		    VideoPlay vp=new VideoPlay(d,pr);
		    vp.VPlay1();
	JavascriptExecutor js = (JavascriptExecutor) d;
    js.executeScript("window.scrollBy(0,100)");
    Thread.sleep(3000);	
    d.findElement(By.xpath(pr.getProperty("vsc"))).click();
	Thread.sleep(6000);
	Logout l1=new Logout(d,pr);
	l1.Signout();
	
	  LogsCapture.takelogs("TC7", "Test case pass");
	  ScreenshotCapture.takescreenshot(d,"test",".png");	
	
	}



}
