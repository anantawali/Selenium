package Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Loginpage 
{
	public WebDriver driver;
	
	By Registerforonlineaccess = By.xpath("//a[@id='lnkRegister']");  
	By startregistration = By.xpath("//button[@id='register_button']");
	By Firstname = By.name("firstName");
	By lastname = By.name("lastName");
	By Emailaddress = By.name("emailAddress");
	By Phonenumber = By.name("mobilePhone");
	By day = By.name("day");
	By year = By.name("year");
	By CRN = By.name("crn");
	By NIN1 = By.id("ei-registration-nino-first-view14");
	By NIN2 = By.id("ei-registration-nino-second-view14");
	By NIN3 = By.id("ei-registration-nino-third-view14");
	By NIN4 = By.id("ei-registration-nino-fourth-view14");
	By NIN5 = By.id("ei-registration-nino-fifth-view14");
	By Name = By.name("username");
	By checkbox = By.xpath("//input[@type='checkbox']");
	By createapassword = By.id("ei-registration-password");
	By confirmpassword = By.id("ei-registration-ConfirmPass");
	By Register = By.id("ei-registration-BtnRegister");
	By correcthighlightedfieldmessage = By.xpath("//span[contains(text(),'Please correct the highlighted fields below.')]");
	

	
    public Loginpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
    public WebElement Registerforonlineaccess()
    {
    	
    	return driver.findElement(Registerforonlineaccess);
    }
    public WebElement startregistration()
    {
    	
    	return driver.findElement(startregistration);
    }
    public WebElement Firstname()
    {
    	
    	return driver.findElement(Firstname);
    }
    public WebElement lastname()
    {
    	
    	return driver.findElement(lastname);
    }
    public WebElement Emailaddress()
    {
    	
    	return driver.findElement(Emailaddress);
    }
    public WebElement Phonenumber()
    {
    	
    	return driver.findElement(Phonenumber);
    }
    public WebElement day()
    {
    	
    	return driver.findElement(day);
    }
    public WebElement year()
    {
    	
    	return driver.findElement(year);
    }
    public WebElement CRN()
    {
    	
    	return driver.findElement(CRN);
    }
    public WebElement NIN1()
    {
    	
    	return driver.findElement(NIN1);
    }
    public WebElement NIN2()
    {
    	
    	return driver.findElement(NIN2);
    }
    public WebElement NIN3()
    {
    	
    	return driver.findElement(NIN3);
    }
    public WebElement NIN4()
    {
    	
    	return driver.findElement(NIN4);
    }
    public WebElement NIN5()
    {
    	
    	return driver.findElement(NIN5);
    }
    public WebElement Name()
    {
    	
    	return driver.findElement(Name);
    }
    public WebElement checkbox()
    {
    	
    	return driver.findElement(checkbox);
    }
    public WebElement createapassword()
    {
    	
    	return driver.findElement(createapassword);
    }
    public WebElement confirmpassword()
    {
    	
    	return driver.findElement(confirmpassword);
    }
    public WebElement Register()
    {
    	
    	return driver.findElement(Register);
    }
    public WebElement correcthighlightedfieldmessage()
    {
    	
    	return driver.findElement(correcthighlightedfieldmessage);
    }
  
	

}
