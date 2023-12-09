package mouceaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
     WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
     
     Actions act = new Actions(driver);
     
     act.doubleClick(button).perform();
		

	}

}
