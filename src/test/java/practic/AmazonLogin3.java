package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLogin3 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8087164496");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shete#@12");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();

	}

}
