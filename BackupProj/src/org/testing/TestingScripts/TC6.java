package org.testing.TestingScripts;

import org.Base.Testing.Baseclass;
import org.openqa.selenium.By;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC6 extends Baseclass{

	
	@Test
	public void Click6() throws Exception {
		  Login l=new Login(d,pr);
		    l.Signin("juluse6666@gmail.com","Sel@2400");
		    Thread.sleep(3000);
	//d.findElement(By.id(pr.getProperty("videoplay"))).click();
	//Thread.sleep(3000);
		    
		    LogsCapture.takelogs("TC6", "Logged in sucessfully");
		    VideoPlay vp=new VideoPlay(d,pr);
		    vp.VPlay1();
		    Thread.sleep(6000);
	       d.findElement(By.xpath(pr.getProperty("videoLike"))).click();
	          Thread.sleep(3000);
	         Logout l1=new Logout(d,pr);
	            l1.Signout();
	            LogsCapture.takelogs("TC6", "Test case pass");
	            ScreenshotCapture.takescreenshot(d,"test",".png");	
	}
	



}
