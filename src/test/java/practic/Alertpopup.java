package practic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php\r\n");
		driver.manage().window().maximize();		
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("4321");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        
        Alert alt = driver.switchTo().alert(); 
        
        String text = alt.getText(); 
        System.out.println(text);
        alt.dismiss();
        
	}

}
