package Fidelity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;

	
	public WebDriver intializedriver() throws IOException
	{
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("//Users//anantawali//Frameworkmaven//URL");
	prop.load(fis);
	String URL = prop.getProperty("browser");
	if(URL.equalsIgnoreCase("Chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/anantawali/Desktop/Selenium/chromedriver 5");
		driver = new ChromeDriver();
	}
		driver.get(prop.getProperty("URL"));
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    return driver;
	
	}
}
