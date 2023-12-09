package interivewCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass extends UtilCls{

	// Webelements 
	
	@FindBy(xpath="(//fa-icon[@class=\\\"ng-fa-icon\\\"])[2]")
	private WebElement SignIn;
	
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement SignInClick;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Submitbtn;
	
	@FindBy(xpath="(//button[@type=\"button\"])[14]")
	private WebElement Popup;

	 WebDriver driver;
	
	//Constructor
	Pomclass(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
	//Action methods
	
	public void loginmethods()
	{
		SignIn.click();
		SignInClick.click();
		Email.click();
		Email.sendKeys("test@spacestem.com");
		Password.click();
		Password.sendKeys("Test@123");
		Submitbtn.click();
		Popup.click();		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
