package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	
	public void DDVisibleText(WebElement E ,String s)
	{
		Select b=new Select(E);
		b.selectByVisibleText(s);
		System.out.println("Visibletext");
	}

	public void DDValue(WebElement E ,String s) 
	{
		Select b=new Select(E);
		b.selectByValue(s);
	}

	public void DDIndex(WebElement E ,int s) 
	{
		Select b=new Select(E);
		b.selectByIndex(s);
	}

}
