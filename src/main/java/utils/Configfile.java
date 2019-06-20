package utils;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Configfile {
	
	public static WebDriver driver;
	static Properties prop;
	public static String Browser;
	public static String Url;
	public static String Username;
	public static String Password;
	public static String InvPassword;
	{
		try {
			File src=new File("C:\\Users\\Pras\\skillsproj\\src\\main\\java\\utils\\Environment.properties");
			
			FileInputStream fis=new FileInputStream(src);
			
			prop=new Properties();
			
			prop.load(fis);
		} catch (Exception e) {
			
			System.out.println("Exception is:"+e.getMessage());
		
		}
		
		Browser=prop.getProperty("browser");
		Url=prop.getProperty("url");
		Username=prop.getProperty("username");
		Password=prop.getProperty("password");
		InvPassword=prop.getProperty("invPassword");
	}

	
	public static void enterCredentials(String MyUsername,String MyPassword) 
	{    
		// Click on the SignIn button.
		clkbtn("//*[@id=\"home\"]/div/div/div[1]/div/a");
		Wait();
		
		//Enter Username
		enterText("/html/body/div[2]/div/div/div[1]/div/div[1]/input", MyUsername);	
		
		//Enter Password
		enterText("//input[@name=\"password\"]",MyPassword);
		
		//Click Login.
		clkbtn("//button[@class=\"fluid ui teal button\"]");
		
	
		
	}
	
	
	public static void enterText(String elementName,String myText) 
	{
		driver.findElement(By.xpath(elementName)).sendKeys(myText);
		
	}
	
	public static void clkbtn(String elementName) 
	{
		driver.findElement(By.xpath(elementName)).click();
	}
	
	public static void Wait() 
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}


/*
 * driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/div[1]/div/a")).click(
 * );
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[2]/div/div/div[1]/div/div[1]/input")).sendKeys(MyUsername);
 * 
 * driver.findElement(By.name("password")).sendKeys(MyPassword);
 * 
 * driver.findElement(By.xpath("//button[@class=\"fluid ui teal button\"]")).
 * click();
 */
