package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import lib.ClickElement;


public class Singinorlogin 

{
	
	WebDriver driver ;
	
	
	public Singinorlogin(WebDriver driver)
	  {
	    this.driver = driver;
	  }
 
	
	
//	@FindBy(how=How.XPATH, using="/signin/profile']") WebElement loginlinktop;
	
	@FindBy(xpath="//a[@href = '/signin/profile']")
	private WebElement loginlinktop ;
	
	// Sign Up Fields
	@FindBy(name="name")
	private WebElement Name ;
	
	@FindBy(name="email")
	private WebElement Email ;
	
	@FindBy (name="number")
	private WebElement number ;
	
	@FindBy(name = "password")
	private WebElement signuppassword ;
	
	@FindBy(xpath="//button[@class='btn lec-red-bg signup submitForm h-lato-bold']")
	private WebElement signupbutton ;
	
	@FindBy(xpath="(//a[@href = 'https://web.licious.info/auth/facebook'])[1]")
	private WebElement Facebook ;
	
	@FindBy(xpath = "(//a[@href = 'https://web.licious.info/auth/google'])[1]")
	private WebElement Google ;
	
	@FindBy(xpath="(//span[contains (text(),'Login')])[2]")
	private WebElement Loginlink ;
	
	
	@FindBy(xpath="//span[contains (text(),'Easy Checkout')]")
	private WebElement Easycheckout ;
	
	
	// Login fields
	
	@FindBy(name="login")
	private WebElement usernametextbox ;
	
	@FindBy(name="password")
	private WebElement passwordtextbox;
	
	@FindBy(xpath="(//button[contains (text(),'Login')])")
	private WebElement Loginbutton ;
	
	@FindBy(xpath="(//a[contains (text() , ' Forgot Password? ')])")
	private WebElement forgotpasswordlink ;
	
	@FindBy(xpath="//span[contains (text(),'Signup')]")
	private WebElement singup ;
	
	
	@FindBy(xpath ="(//img[@src = 'https://d2407na1z3fc0t.cloudfront.net/Banner/web_licious_logo.png'])[1]" )
	private WebElement LiciousLogo;
	
	
	@FindBy(linkText ="Chicken")
	private WebElement chickencat;
	
	
	@FindBy(xpath = "//button[@data-text='Chicken Thigh (Skinless, Boneless)']")
	private WebElement firstproductaddtocart;
	
	@FindBy(xpath = "//a[@class = 'cart  loaded']")
	private WebElement Cartbutton;
	
	@FindBy(xpath = "//button[contains (text() , 'Checkout')]")
	private WebElement checkoutbutton;
	
	@FindBy(xpath = "//button[@class = 'btn checkout-shipment-summary']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//button[contains (text(),'Proceed to payment')]")
	private WebElement proceedtopaymentbutton;
	
	
	@FindBy(linkText = "Cash On Delivery")
	private WebElement cashondelivery;
	
	
	@FindBy(xpath=".//*[@id='codform']/div/button")
	private WebElement placeorderbutton;
	
	
	
	
	
	
	
	
	public void licioussingin()
	{
		
	}
	
 
	public void facebooksingin()
	{
		
	}
	
	public void googlesignin()
	{
		
	}
	
	public void login(WebDriver driver) throws InterruptedException
	{
	
		System.out.println(" WebDriver is coming inside ");


        Thread.sleep(3000);		
		loginlinktop.click();
		Thread.sleep(2000);
		Loginlink.click();
		Thread.sleep(4000);
		usernametextbox.sendKeys("arun.kumar@licious.in");
		passwordtextbox.sendKeys("arun@123");
		Loginbutton.click();
	    Thread.sleep(2000);
		LiciousLogo.click();
	    
	
		Thread.sleep(2000);
	
		chickencat.click();
	    
	    Thread.sleep(2000);
	    
	    firstproductaddtocart.click();
	    Thread.sleep(2000);
	    Cartbutton.click();
	    Thread.sleep(2000);
	    
	    checkoutbutton.click();
	    
	    Thread.sleep(2000);
	    
	    continuebutton.click();
	    
	    Thread.sleep(2000);
	    
	    proceedtopaymentbutton.click();
	   
	    Thread.sleep(2000);
	    
	    cashondelivery.click();
	    
	    Thread.sleep(1000);
	    
	    placeorderbutton.click();

	}
	

	
}