package com.mindree.reusableComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static WebDriver driver; // so that we can use driver anywhere by creating driver object only once.
	public Properties prop; //so that prop can be used in other class also to access properties files.
	
	public WebDriver Initialize() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Debjeet\\eclipse-workspace\\Comprehensive\\src\\main\\resources\\config.properties");
		prop.load(fis);
		
		//String driver_path = prop.getProperty("driver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Debjeet\\eclipse-workspace\\Comprehensive\\Driver\\chromedriver96.exe" );
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);
			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	

}
