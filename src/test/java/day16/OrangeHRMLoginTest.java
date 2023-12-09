package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//1) Launch browser
		
		WebDriver driver = new EdgeDriver();
		
		//2) open url on the browser
		
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
      //3) Provide username  - Admin
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        
      //4) Provide password  - admin123
        
        driver.findElement(By.name("password")).sendKeys("admin123");
        
      //5) Click on Login button
        
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
      //6) Verify the title of dashboard page   
      		//Title validation
      		String act_title=driver.getTitle();
      		String exp_title="OrangeHRM";
      		
      		if(act_title.equals(exp_title))
      		{
      			System.out.println("Test passed");
      		}
      		else
      		{
      			System.out.println("failed");
      		}
        
        
      
      		
        
     
		
	}


		
	}




