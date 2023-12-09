package mouceaction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		/* Radiobutton 
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		// Single checkbox
	//	driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//total number of checkboxes
		
      List<WebElement> checkboxes =driver.findElements
     (By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total number of checkboxes: " + checkboxes.size());
	
		//Select all the checkboxes
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		// By using Enhanced forloop 
		for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}
		
		//clear/Uncheck checkboxes
		
	/*	for(int i=0;i<7;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
			}
		}
		
		for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
		}
		*/

	}

}
