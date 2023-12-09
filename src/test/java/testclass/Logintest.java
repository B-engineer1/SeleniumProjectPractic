package testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Logintest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
	    driver = new ChromeDriver();// if you use WebDriver driver = new ChromeDriver(); You will get error 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://iemodemoindia.meditab.com/");
		driver.manage().window().maximize();
	}
	
	

}
