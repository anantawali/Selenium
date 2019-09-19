package Fidelity;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HelpandSupportTest extends Base {
	
	@Test
	public void login() throws IOException
	{
		driver = intializedriver();
		Homepage hp = new Homepage(driver);
		hp.Continue().click();
		hp.HelpandSupport().click();
		
		}
	
	
	
	@Test
	public void validatehelpandSupport()
	{
		
		HelpandSupport hs = new HelpandSupport(driver);
		hs.searchbox().sendKeys("Pension Scheme");
		hs.searchbox().sendKeys(Keys.ENTER);
		
		
	}
	@AfterTest
	public void validateclosewindow()
	{
		driver.close();
	}

}
