package testNG1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	void abc()
	{
		System.out.println("this is abc method");
	}
    
	@BeforeMethod
	void m()
	{
		System.out.println("this is before method");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suit");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is after suit");
	}

}
