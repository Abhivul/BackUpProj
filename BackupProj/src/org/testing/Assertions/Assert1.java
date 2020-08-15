package org.testing.Assertions;

public class Assert1 {

	public static Boolean Assertion(String exp,String actual) {
		if(actual.equals (exp))
		{
			System.out.println("Assertion Pass");
			return true;
			
		}
		else
		{
			System.out.println("Assertion Failed");
		}
		return false;
		
	}
}
