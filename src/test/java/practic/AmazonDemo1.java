package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("tshirt for men");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(1000);
		
		// driver.findElement(By.linkText("Men's Regular Fit Polo")).click();
		driver.findElement(By.partialLinkText("Regular Fit")).click();

	}

}
