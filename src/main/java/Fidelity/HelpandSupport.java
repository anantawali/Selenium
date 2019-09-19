package Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpandSupport {
	
	public WebDriver driver;
	
	
	By searchbox = By.id("nlpq");
	
	
public HelpandSupport(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	public WebElement searchbox()
	{
		
		return driver.findElement(searchbox);
		
	}
	
	
	
	

}
