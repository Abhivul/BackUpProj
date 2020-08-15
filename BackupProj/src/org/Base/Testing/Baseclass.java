package org.Base.Testing;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
	
	public ChromeDriver d;
	public Properties pr;
	
	@BeforeMethod
	public void login() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
    d = new ChromeDriver();
    Thread.sleep(3000);
	d.manage().window().maximize();
	Thread.sleep(3000);
	d.get("https://www.youtube.com");
	//d.switchTo().frame(0);
	Thread.sleep(3000);
	File f= new File("../YTFramework/Locators.properties");
	FileInputStream fis=new FileInputStream(f);
	pr=new Properties();
	pr.load(fis);
	Thread.sleep(6000);
	

}
	@AfterMethod
	public void logout() throws Exception {
		
		d.quit();
		
	}

}
