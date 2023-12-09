package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SecondTest {

	WebDriver driver;
	
	@Test(priority=1)
	void Urlopen() 
	{  
	    driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
	}
	
	@Test(priority=2)
	void Applogin()
	{  
	   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	
	@Test(priority=3)
	void Applogout()
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
	}
}
