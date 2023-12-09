package testNG3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NopCommerceTest {

	WebDriver driver;
	
	@BeforeClass
	void Setup()
	{
		
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void Testlogo()
	{
		
		driver.findElement(By.xpath("//*[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		Assert.assertEquals(true, true);
	}
	
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.xpath("//*[@class=\"ico-login\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"email\"]")).sendKeys("Abhi.s@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("test@123");
		driver.findElement(By.xpath("//*[@class=\"button-1 login-button\"]")).click();
		
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Register")).isDisplayed();
	}
	
	@AfterClass
	void Completed()
	{
		
		driver.quit();
	}
	
}
