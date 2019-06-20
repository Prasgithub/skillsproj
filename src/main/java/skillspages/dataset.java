package skillspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Configfile;

public class dataset extends Configfile{
	
     //WebDriver driver;
	
	@Test
	public void startBrowser() 
	{
		//Configfile confi=new Configfile();
		
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.get(Url);
		
		
	}

    @DataProvider
	public Object[][] getdata() 
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="FirstUsername";
		data[0][1]="FirstPassword";
		data[1][0]="SecondUsername";
		data[1][1]="SecondPassword";
		data[2][0]="ThirdUsername";
		data[2][1]="ThirdPassword";
		
		return data;
	
	}
	
	
    
	@Test(dataProvider="getdata")
	public void skilllogin(String username,String password) 
	{
		System.out.println(username);
		
		System.out.println(password);
		
	}
	
	
}
