package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class commonlib {

	 public static WebDriver driver;
	 public static String Url;
	 public static String Browser;
	 public static String Username;
	 public static String Password;

	static {
		
		
//		String fileName = "Environment.properties";
//        ClassLoader classLoader = new commonlib().getClass().getClassLoader();
		
		
     Properties prop;
	try {
		FileInputStream resourceStream = new FileInputStream("C:\\Users\\Pras\\skillsproj\\src\\main\\java\\utils\\Environment.properties");
			
				
		   prop = new Properties();
			prop.load(resourceStream);
			
			
	} catch (Exception e) {
		
		System.out.println("Error is:"+ e);
		
		
		
	} 
       
        		
//	Url =prop.getProperty("url");
//	
//	Username=prop.getProperty("username");
//	Password=prop.getProperty("password");
       
	
	}
	}
