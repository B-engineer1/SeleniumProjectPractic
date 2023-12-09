  package day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Methods1 {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new EdgeDriver();   
	 
	 // Get Method 
	 
	 driver.get("https://www.google.co.in/");
	
	 
	 // Maximize Method 
	 
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 // Navigate Method 
	 
     driver.navigate().to("https://www.flipkart.com/"); 
 //	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 Thread.sleep(2000);

	 // Navigate = back 
	 
	 driver.navigate().back();
	 Thread.sleep(2000);
	 
	// Navigate = forward 
	 
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 
	// Navigate = refresh 
	 
	 driver.navigate().refresh();
	 
	 // Get Title 
	 
	// driver.getTitle();
	 
 //	 System.out.println("title of the page:"+driver.getTitle());
	
	 System.out.println("title of the page:"+driver.getTitle());

	 // Get Currenturl
	 
	// driver.getCurrentUrl();
	 
	 System.out.println("Current URL :" + driver.getCurrentUrl());
	 
	
	 
	
	 
	 
	 // Close Method 
	 
	// driver.close();
	 
	 // 
     
	}

}
