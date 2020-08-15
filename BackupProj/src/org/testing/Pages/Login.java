package org.testing.Pages;

import java.util.Properties;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
	
	ChromeDriver d;
	Properties pr;
	
	public Login(ChromeDriver d,Properties pr)
	{
		this.d=d;
		this.pr=pr;
	}
	
	public void Signin(String Email,String Password) throws InterruptedException {
	
		d.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		Thread.sleep(3000);
		d.findElement(By.id(pr.getProperty("Email"))).sendKeys("juluse6666@gmail.com");
		Thread.sleep(3000);
		
		d.findElement(By.xpath(pr.getProperty("EmailNext"))).click();
		Thread.sleep(3000);
		d.findElement(By.name(pr.getProperty("Password"))).sendKeys("Sel@2400");
		Thread.sleep(3000);
		d.findElement(By.xpath(pr.getProperty("PasswordNext"))).click();
		Thread.sleep(5000);
	}

}
