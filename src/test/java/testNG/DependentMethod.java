package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethod {

	@Test(priority=1)
	void Openapp()
	{
		
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"Openapp"})
	void Login()
	{
		
		Assert.assertTrue(false);// true
	}
	
	@Test(priority=3, dependsOnMethods= {"Login"})
	void Search()
	{
		
		Assert.assertTrue(true);
	}
	
	@Test(priority=4, dependsOnMethods= {"Login","Search"})
	void Advancedsearch()
	{
		
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods= {"Login"})
	void Logout()
	{
		
		Assert.assertTrue(true);
	}
}
