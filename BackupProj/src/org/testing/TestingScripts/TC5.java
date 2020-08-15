package org.testing.TestingScripts;

import org.Base.Testing.Baseclass;
import org.openqa.selenium.By;
import org.testing.Assertions.Assert1;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5 extends Baseclass {
	
	
	@Test
	public void Click5() throws Exception {
		  Login l=new Login(d,pr);
		    l.Signin("juluse6666@gmail.com","Sel@2400");
		    Thread.sleep(3000);
		    
		    LogsCapture.takelogs("TC5", "Logged in sucessfully");
		    
		    String expectedURL="https://www.youtube.com/feed/library";
		    
		d.findElement(By.linkText(pr.getProperty("LibraryLink"))).click();
		Thread.sleep(3000);
	    String URL=d.getCurrentUrl();
	    System.out.println(URL);
	    Assert.assertTrue(Assert1.Assertion(URL, expectedURL));
		
		Logout l1=new Logout(d,pr);
		   l1.Signout();
		   
		   LogsCapture.takelogs("TC5", "Test case pass");
		   ScreenshotCapture.takescreenshot(d,"test",".png");	
	
	}
	



}
