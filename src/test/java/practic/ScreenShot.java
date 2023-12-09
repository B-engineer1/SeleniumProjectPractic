package practic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// How to take ScreenShots 
		
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	File dest = new File("C:\\Users\\ias28\\eclipse-workspace\\seleniumproject\\ScreenShots\\fullpage.png");
	FileHandler.copy(src,dest);
	


	}

}
