package Flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilesPage {
	
WebDriver driver;
	
	public MobilesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='SAMSUNG']")
	public WebElement Samsung;
	
	@FindBy(xpath="//*[text()='APPLE']")
	public WebElement Apple;
	
	@FindBy(xpath="//*[text()='realme']")
	public WebElement Realme ;
	
	@FindBy(xpath="//*[text()='Filters']")
	public WebElement filters;
	
	public void Verify() {
		Assert.assertTrue(filters.isDisplayed());
	}
	
	public void Click1() {
		Samsung.click();
		Apple.click();
		Realme.click();
	}
	
	public void Remove() {
		Samsung.click();
		Apple.click();
		Realme.click();
		
	}

}
