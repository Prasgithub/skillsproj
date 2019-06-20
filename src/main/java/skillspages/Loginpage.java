package skillspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Configfile;

public class Loginpage extends Configfile{
	
	//WebDriver driver;
	
	
    @BeforeMethod
	public void navigateUrl()
	{
    	if(Browser.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
		}
		else if(Browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else if (Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
    	
    	driver.get(Url);
	}
	
    
	@Test
	public void ValidLogin() 
   {
		enterCredentials(Username,Password);
			
	}
	
   @Test
   public void InValidLogin() {
		
		enterCredentials(Username,InvPassword);
	}
   
 
   @AfterMethod
   public void Close() 
   {
	   driver.close();
   }
  
}
