package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkartpopup {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        // we are handiling the popup of flipkart login 
        
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        
        
        
	}
	

}
