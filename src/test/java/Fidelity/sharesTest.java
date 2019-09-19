package Fidelity;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class sharesTest extends Base {
	
	
	
	
	@Test
	public void login() throws IOException
	{
		driver = intializedriver();
		Homepage hp = new Homepage(driver);
		hp.Continue().click();
		hp.Shares().click();
		
		}
	
	@Test
	public void validatesharespage()
	{
		Shares s1 = new Shares(driver);
		s1.sharepricesandmarketData().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
}
	@AfterTest
	public void validateclosewindow()
	{
		driver.close();
	}

}
