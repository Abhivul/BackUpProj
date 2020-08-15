package org.testing.TestingScripts;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.Base.Testing.Baseclass;
import org.openqa.selenium.By;
import org.testing.Assertions.Assert1;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC1 extends Baseclass{

	@Test
	public void Click1() throws Exception {
		
		
    Login l=new Login(d,pr);
    l.Signin("juluse6666@gmail.com","Sel@2400");
    Thread.sleep(3000);
    
    LogsCapture.takelogs("TC1", "Logged in sucessfully");
    
   String expectedURL="https://www.youtube.com/feed/trending";
    
	d.findElement(By.linkText(pr.getProperty("Trendingclick"))).click();
	Thread.sleep(1000);
	 String URL=d.getCurrentUrl();
	    System.out.println(URL);
	   // Assert.assertEquals(URL,expectedURL,"Asserttionfailed");//Executes the failed statement)
	   // Assert1.Assertion(URL, expectedURL);//calling soft assertion
	    Assert.assertTrue( Assert1.Assertion(URL, expectedURL));//hard+ soft assertion
	
	Logout l1=new Logout(d,pr);
	l1.Signout();
	
	 LogsCapture.takelogs("TC1", "Test case pass");
	 ScreenshotCapture.takescreenshot(d,"test",".png");	 
	

	
	}
	
	}
	
	

