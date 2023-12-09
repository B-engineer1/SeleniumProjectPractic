package dyanimicXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Honda {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.findElement(By.name("q")).sendKeys("honda");
        
        Thread.sleep(1000);
        
     // For get text in console window follow below process :
     // Store your xpath in a WebElement variable 
     // perform action on that variable 
        
      WebElement ak = driver.findElement(By.xpath("((//ul[@class='G43f7e'])[1]/li[@class='sbct'])[9]"));
      System.out.println(ak.getText());
      ak.click();
      
       
        		
        
        
      
        
	}

}
