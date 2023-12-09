package practic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		// Screen shot of specific part of web page by using xpath
		
		TakesScreenshot screenshot1 = ((TakesScreenshot)driver);
		WebElement loginSection = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		File src = loginSection.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ias28\\eclipse-workspace\\seleniumproject\\ScreenShots\\Section2.png");
		FileHandler.copy(src,dest);
	

	}

}
