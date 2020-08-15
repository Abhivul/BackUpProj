package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	
	ChromeDriver d;
	Properties pr;
	
	public Logout(ChromeDriver d,Properties pr)
	{
		this.d=d;
		this.pr=pr;
	}
	public void Signout() throws InterruptedException {
	
		d.findElement(By.id(pr.getProperty("ImageButton"))).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Sign out")).click();
		Thread.sleep(2000);
}
}