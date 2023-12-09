package testNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	void xyz()
	{
		System.out.println("this is xyz method");
	}
    
	@AfterMethod
	void n()
	{
		System.out.println("this is after method");
	}
}
