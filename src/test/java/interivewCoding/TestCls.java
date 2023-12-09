package interivewCoding;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCls {

	static WebDriver driver;
	Pomclass pom;
	
	@BeforeClass()
	public void launchDriver()
	{
		driver = BaseCls.getDriver();
	}
	
	@BeforeMethod()
	public void beforemethod()
	{
		pom = new Pomclass(driver);
	}
	
	@Test()
	public void testmethod()
	{
	  
		pom.loginmethods();
	}
	
	@AfterMethod()
	public void aftermethod()
	{
		
		
	}
	
	@AfterClass()
	public void afterclass()
	{
		driver.quit();
	}
	
	
	
	
}
