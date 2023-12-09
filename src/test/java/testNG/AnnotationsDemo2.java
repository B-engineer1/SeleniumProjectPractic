package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {

	@BeforeClass // this will execute Only one time before Starting All test method
	void Login() // Pre-requisit(First you have to login the app)
	{
		System.out.println("Login...");
	}
	
    @Test(priority=1)// Actual test method 
	void Search()
	{
		System.out.println("Search...");
	}
    
    @Test(priority=2)// Actual test method
	void AdvancedSearch()
	{
		System.out.println("AdvancedSearch.....");
	}
	
    @AfterClass //this will execute Only one time After executing every all test method
	void Logout()
	{
		System.out.println("Logout....");
	}
}
