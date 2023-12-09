package mouceaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickdemo {

	public static void main(String[] args) {
		
		//Click demo 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html\r\n");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.linkText("Agile Project"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(click).click().perform();
		
		

	}

}
