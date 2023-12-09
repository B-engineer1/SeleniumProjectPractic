package testNG;

import org.testng.annotations.*;

public class AllAnotations {
	
	@BeforeSuite
	void BeforeSuite()
	{
		
		System.out.println("this is before suit method");
	}
	@AfterSuite
	void AfterSuite()
	{
		
		System.out.println("This is after suit method");
	}
	@BeforeMethod
	void BeforeMethod()
	{
		
		System.out.println("This is before method");
	}
	@AfterMethod
	void AfterMethod()
	{
		
		System.out.println("This is after method");
	}
	@BeforeClass
	void BeforeClass()
	{
		
		System.out.println("This is before class");
	}
	@AfterClass
	void AfterClass()
	{
		
		System.out.println("This is after class");
	}
	@BeforeTest
	void BeforeTest()
	{
		
		System.out.println("This is before test method");
	}
	@AfterTest
	void AfterTest()
	{
		
		System.out.println("This is after test method");
	}
	
	@Test(priority=1)
	void Test1()
	{
		
		System.out.println("This is test 1 method");
	}
	
	@Test(priority=2)
	void Test2()
	{
		
		System.out.println("This is test 2 method");
	}
}
