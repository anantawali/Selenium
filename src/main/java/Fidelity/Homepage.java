package Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	
	

	By Login = By.id("public-login");
	By RegisterforOnlineAccess = By.xpath("//a[@class='link'][contains(text(),'Register for online access')]");
	By Continue = By.xpath("//button[@class='button primary button--accept']");
	By HelpandSupport = By.xpath("//a[@class='link'][contains(text(),'Help & support')]");
	By pensionsandRetirement = By.xpath(("//a[@class='tier-one None'][contains(text(),'Pensions & retirement')]"));
	By Shares = By.xpath("//a[@class='tier-one None'][contains(text(),'Shares')]");
	
	
public Homepage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	
	



public WebElement Login()
{
	
	return driver.findElement(Login);
}
public WebElement RegisterforOnlineAccess()
{
	
	return driver.findElement(RegisterforOnlineAccess);
}
public WebElement Continue()
{
	
	return driver.findElement(Continue);
}
public WebElement HelpandSupport()
{
	
	return driver.findElement(HelpandSupport);
}
public WebElement pensionsandRetirement()
{
	
	return driver.findElement(pensionsandRetirement);
}
public WebElement Shares()
{
	
	return driver.findElement(Shares);
}
}
