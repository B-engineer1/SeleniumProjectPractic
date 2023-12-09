package interivewCoding;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SpaceStem {

	public static void main(String[] args) throws InterruptedException {
			
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				 
	// Lunch the website
	driver.get("https://newshop.order-line.co.uk/");
	driver.manage().window().maximize();
				 
	 // Sing In button
    driver.findElement(By.xpath("(//fa-icon[@class=\"ng-fa-icon\"])[2]")).click();
    driver.findElement(By.xpath("//a[text()='Sign In']")).click();
				
	 // Email Faild 
	driver.findElement(By.xpath("//input[@type='email']")).click();
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@spacestem.com");
				 
	 // Password
	driver.findElement(By.xpath("//input[@type='password']")).click();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				 
    // Close the popup 
	 driver.findElement(By.xpath("(//button[@type=\"button\"])[14]")).click();
				 
    // Search for "cli" and select last product from the list
	 driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
	 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("cli");
	 driver.findElement(By.xpath("//button[@class='ais-SearchBox-submit']")).click();
			
	// Click Add to basket button
     driver.findElement(By.xpath("(//ais-highlight[@attribute=\"name\"])[19]"));
	 driver.findElement(By.xpath("(//button[@class=\"btn btn-action ng-star-inserted\"])[19]")).click();
			     
	 Thread.sleep(5000);
	// Add it under Signed Order
    driver.findElement(By.xpath("(//fa-icon[@class=\"ng-fa-icon text-primary ng-star-inserted\"])[1]")).click();
    driver.findElement(By.xpath("(//input[@type='number'])[1]")).click();
    driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("2");
			     
    //Accept the checkbox “Do not show again” and click Close button
    driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-block btn-sm py-2 mt-0 mh-40 mr-0 ng-star-inserted\"]")).click();
    driver.findElement(By.xpath("//input[@data-testing-id='confirmationChecked']"));
    driver.findElement(By.xpath("//button[@class='btn btn-primary w-auto']")).click();
			     
			     
			     
			     
			
				
				 
				 
				 
				 
				 
			}
			
		

			
	}


