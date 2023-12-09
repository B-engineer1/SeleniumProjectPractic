package interivewCoding;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilCls {

	public static WebElement explecitwait(WebDriver driver, WebElement Element)
	{
		WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement newElement = wait.until(ExpectedConditions.visibilityOf(Element));
		
		return newElement;
		
	}
	
}
