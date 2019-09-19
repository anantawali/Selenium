package Fidelity;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class loginTest extends Base{
	
	@Test
	public void login() throws IOException
	{
		driver = intializedriver();
		Homepage hp = new Homepage(driver);
		hp.Continue().click();
		hp.Login().click();
		
		}
	
	@Test
	public void registration() throws InterruptedException
	{
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(3000);
		lp.Registerforonlineaccess().click();
		lp.startregistration().click();
		Select s = new Select(driver.findElement(By.name("title")));
		s.selectByVisibleText("Miss");
		lp.Firstname().sendKeys("Ananta");
		lp.lastname().sendKeys("Wali");
		lp.Emailaddress().sendKeys("ananta.wali@gmail.com");
		lp.Phonenumber().sendKeys("+4478789880");
		lp.day().sendKeys("22");
		Select s1 = new Select(driver.findElement(By.name("month")));
		s1.selectByVisibleText("June");
		lp.year().sendKeys("1997");
		lp.CRN().sendKeys("123456789");
		lp.NIN1().sendKeys("1");
		lp.NIN2().sendKeys("2");
		lp.NIN3().sendKeys("3");
		lp.NIN4().sendKeys("3");
		lp.NIN4().sendKeys("4");
		lp.NIN5().sendKeys("5");
		lp.Name().sendKeys("ananta.wali");
		lp.createapassword().sendKeys("password");
		lp.confirmpassword().sendKeys("password");
		lp.Register().click();
        AssertJUnit.assertEquals("Please correct the highlighted fields below.", "Please correct the highlighted fields below.");	
		
		
		
		
		
	}
	
	@AfterTest
	public void validateclosewindow()
	{
		driver.close();
	}

}
