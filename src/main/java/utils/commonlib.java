package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class commonlib {

	 public static WebDriver driver;
	 public static String Url;
	 public static String Browser;
	 public static String Username;
	 public static String Password;
	
	static {
		
		Properties prop=new Properties();
		
		
		FileInputStream objfile = null;
		try {
			objfile = new FileInputStream(System.getProperty("user.dir")+"C:\\Users\\Pras\\skillsproj\\src\\main\\java\\utils\\Environment.properties");
			
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
	
			try {
				prop.load(objfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Url =prop.getProperty("url");
		Browser=prop.getProperty("browser");
		Username=prop.getProperty("username");
		Password=prop.getProperty("password");
		
	
		
		
	}
	
	
	
	
}
