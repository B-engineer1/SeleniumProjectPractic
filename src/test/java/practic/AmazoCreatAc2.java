package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazoCreatAc2 {

	public static void main(String[] args) {

      WebDriver driver = new EdgeDriver();
      
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      
      driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
      driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
      
      driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Shete Abhishek");
      driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("8087164496");
      
      driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Shete#@12");
      driver.findElement(By.xpath("//input[@id='continue']")).click();
      
      // Account is created 

	}

}
