package Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pensionsPage {
	
	
	public WebDriver driver;
	
	By ChoosingIncomeoptions = By.xpath("//a[@class='tier-three-link '][contains(text(),'Choosing income options')]");
	
	
	
	
	
	
	public pensionsPage(WebDriver driver) {
		
		this.driver = driver;
	}






	public WebElement ChoosingIncomeoptions()
	{
		
		
		return driver.findElement(ChoosingIncomeoptions);
	}
	
	
	
	
	

}
