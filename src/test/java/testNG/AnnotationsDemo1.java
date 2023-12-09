package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	
	@BeforeMethod // this will execute multipal times before executing every test method
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
	
    @AfterMethod //this will execute multipal times After executing every test method
	void Logout()
	{
		System.out.println("Logout....");
	}
}
