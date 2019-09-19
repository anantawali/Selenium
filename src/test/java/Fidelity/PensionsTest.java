package Fidelity;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PensionsTest extends Base {
	
	@Test
	public void login() throws IOException
	{
		driver = intializedriver();
		Homepage hp = new Homepage(driver);
		hp.Continue().click();
		hp.pensionsandRetirement().click();
		
		}

	@Test
	public void validateincomeoptions()
	{
		
		pensionsPage pp = new pensionsPage(driver);
		pp.ChoosingIncomeoptions().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		
	}
	@AfterTest
	public void validateclosewindow()
	{
		driver.close();
		
	}
	
	
	
	
}
