package day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRMLoginChrome {

	public static void main(String[] args){
		
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");*/
		
		WebDriver driver = new ChromeDriver(
				);

	    driver.get("https://opensource-demo.orangehrmlive.com/");	
	    driver.manage().window().maximize();
	    
	    
	    
	}

}
