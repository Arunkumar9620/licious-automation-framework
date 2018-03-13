package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage 
{ 
    WebDriver driver ;
	
	public Homepage(WebDriver driver)
	  {
	    this.driver = driver;
	  }
	
	@FindBy(how=How.XPATH, using="(//img[@src = 'https://d2407na1z3fc0t.cloudfront.net/Banner/web_licious_logo.png'])[1]") WebElement Liciouslogo;
	@FindBy(how=How.XPATH, using= "//a[@data-slug='delicious-deals']" ) WebElement todaydealscat ;
	@FindBy(how=How.XPATH, using= "//a[@data-slug='chicken']" ) WebElement chickencat ;
	@FindBy(how=How.XPATH, using= "//a[@data-slug='seafood']" ) WebElement  seafoodcat;
	
	
	public void catclick (WebDriver driver)
	{
		Liciouslogo.click();
		todaydealscat.click();
		
		
		
	}
	
	
	
	
	
	
	}
