package TestCase;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Flipkart.base.BaseConfig;
import Flipkart.pageObjects.HomePage;
import Flipkart.pageObjects.MobilesPage;


public class TestCase1 extends BaseConfig {
	public HomePage homepage;
	public MobilesPage mobilepage;
	public WebDriver driver;
	
	

	
	@Parameters({"Port"})
	@BeforeMethod
	public void Setup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		homepage = new HomePage(driver);
        mobilepage = new MobilesPage(driver);
		
		
	}
	
	@Test
	public void Test2() {
		
		mobilepage.Verify();
		
		homepage.Click();
		mobilepage.Click1();
		mobilepage.Remove();
		//desktoppage.Verify2();
	}
	
	

}
