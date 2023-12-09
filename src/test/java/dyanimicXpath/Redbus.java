package dyanimicXpath;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
	//	opt.addArguments("incognito");
		opt.addArguments("disable-notifications");//notifications has been handeled by Chrome options class
	//	opt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
        driver.findElement(By.id("src")).sendKeys("pune");
        Thread.sleep(2000);
        WebElement aj =  driver.findElement
      (By.xpath("(//ul[@class='sc-dnqmqq eFEVtU']/li[@class='sc-iwsKbI jTMXri'])[15]"));// by using both xpath
       System.out.println(aj.getText());
       aj.click();
    
      driver.findElement(By.id("dest")).sendKeys("ahmednagar");
      Thread.sleep(2000);
      WebElement dj =  driver.findElement
     (By.xpath("(//ul[@class='sc-dnqmqq eFEVtU']/li)[16]"));// 2nd xpath is same so we directly use indexing  
      System.out.println(dj.getText());
      dj.click(); 
      
      driver.switchTo().frame(0);
      
        
	
		
		
		
	}

}
