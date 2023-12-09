package mouceaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
	WebElement country =driver.findElement(By.id("country-list"));
		
		Select s = new Select(country);
		
		// s.selectByIndex(1);
		
		s.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
//		s.deselectByVisibleText("India");
		

	}

}
