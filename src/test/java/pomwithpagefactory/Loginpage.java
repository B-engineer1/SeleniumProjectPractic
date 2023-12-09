package pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	 public WebDriver driver;
		
		// Constructor 
	    public Loginpage(WebDriver driver)
		{
	    	this.driver = driver;
	    	PageFactory.initElements(driver,this);
		}
	    
	    
		
	
	
	
	
}
