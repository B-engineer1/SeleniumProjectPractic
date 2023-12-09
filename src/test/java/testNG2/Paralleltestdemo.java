package testNG2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltestdemo {
	// run through xml file 
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})// parameter name from xml 
	void Setup(String br) throws InterruptedException//parameter value from xml stored in "br" //String appurl
	{
		if(br.equals("edge"))
		{
	driver = new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//appurl
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void Testlogo()
	{
	try 
	{
	boolean status=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status, true);
	}
	catch(Exception e) 
	{
		Assert.fail();
	}
	
	}
	
	@Test(priority=2)
	void Testhomepagetitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are bot matched..");
	}
	
	@AfterClass
	 void Closeapp()
	{
		
		driver.quit();
	}
}

