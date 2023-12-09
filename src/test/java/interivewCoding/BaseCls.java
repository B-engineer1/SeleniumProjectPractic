package interivewCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCls {

	static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://newshop.order-line.co.uk/");
		driver.manage().window().maximize();
		return driver;
		
	}

	
	
	
	
	
}
