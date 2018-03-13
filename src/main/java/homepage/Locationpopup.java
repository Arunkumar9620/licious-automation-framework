package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locationpopup 
{
	WebDriver driver ;
	
	public Locationpopup(WebDriver driver)
	  {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	  }
	
	
	
	@FindBy(id="location_pop")
	private WebElement Locationtextbox;
	
	@FindBy(xpath="//span[contains(text(),'Bengaluru')]")
	private WebElement Bangalore ;
	
	@FindBy(xpath="//span[contains(text(),'NCR')]")
	private WebElement NCR ;
	
	@FindBy(xpath="//span[contains(text(),'Hyderabad')]")
	private WebElement Hyderabad;
	
	@FindBy(xpath="//div[contains(text(),' Use my location')]")
	private WebElement usemylocation;
	
	
	public void verifyserviceablelocations()
	{
		
		
	}
	

	
	
}
