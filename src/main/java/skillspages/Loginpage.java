package skillspages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.commonlib;

public class Loginpage extends commonlib{
	

    @Test(priority=1)
	public void navigateUrl()
	{
    	//open Chrome browser...//navigate to Url.
		
    	
		//driver=new ChromeDriver();
		
		if(Browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
		}
		else if(Browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		}
		else 
		{
		WebDriverManager.iedriver().setup();
		}
		driver.get(Url);
		
		
	}
	
	@Test
	public void ValidLogin() {
		
		//Click on Signin button
		//Enter Valid Login username and password.
		//Click on Login button.
		System.out.println("login Username ="+Username);
	
	}
	
   @Test
   public void InValidLogin() {
		
		//Click on Signin button
		//Enter InValid Login Username and password.
		//Click on Login button.
		System.out.println("login Password ="+Password);
	}
}
