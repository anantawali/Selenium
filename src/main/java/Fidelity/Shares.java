package Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shares {

	public WebDriver driver;
	

	By sharepricesandmarketData = By.xpath("//a[@class='tier-three-link '][contains(text(),'Share prices and market data')]");
	
	
	public Shares(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public WebElement sharepricesandmarketData()
	{
		
		return driver.findElement(sharepricesandmarketData);
	}
	
	
	
}
