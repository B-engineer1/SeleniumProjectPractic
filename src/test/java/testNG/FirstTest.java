package testNG;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(priority=1)
	void openapp()
	{
		System.out.println("testing1");
	}
	
	@Test(priority=2)
	void loginapp() 
	{
		System.out.println("testing2");
	}
	
	@Test(priority=3)
	void logoutapp()
	{
		
		System.out.println("testing3");
	}
}
