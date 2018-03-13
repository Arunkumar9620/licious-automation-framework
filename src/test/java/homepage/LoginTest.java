package homepage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class LoginTest 

     { 
	
/*       	private WebDriver driver;
       	private Singinorlogin login ;
*/       	

	private static final WebDriver WebDriver = null;
	Singinorlogin sl = new Singinorlogin(WebDriver);
	WebDriver driver ;
 
	
    
//	 @BeforeSuite
	@Test(priority =1) 
	 public void beforeMethod() throws InterruptedException 
	  {
	    
		System.setProperty("webdriver.gecko.driver", "E:\\Licious1\\licious\\BrowserDrivers\\geckodriver.exe") ;
		driver = new FirefoxDriver();
		
		 System.out.println("Launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soumyaranjan\\Desktop\\Chromedriver\\chromedriver.exe");
		
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://web.licious.info/");
//			driver.manage().window().maximize();
		    WebElement LocationpopupTextbox = driver.findElement(By.id("location_pop"));

		    LocationpopupTextbox.sendKeys("Tubarahalli Bangalore");
			Thread.sleep(3000);
			LocationpopupTextbox.sendKeys(Keys.ARROW_DOWN , Keys.ENTER);
			
	    }
	
	
	@Test(priority = 2)
	public void verifyhomepagetitle()
	{
		String expected ="Buy meat online |Shop for tender and fresh meat online |Licious.in" ;
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
  @Test(priority = 3)
  public void verifylogin() throws InterruptedException 
  { 
	  Singinorlogin loginpage = PageFactory.initElements(driver, Singinorlogin.class);
	  loginpage.login(WebDriver);
	  
	  Assert.assertEquals(driver.getCurrentUrl(), "https://web.licious.info/user/profile");
	  
  }
  
  
  
  

  @AfterSuite
  public void afterMethod() 
  {
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  driver.close();
  }

}
