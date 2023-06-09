package Flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[text()='Mobiles'])[1]")
	public WebElement Mobiles;
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2doB4z']")
	public WebElement Alert;
	
	public void Click() {
		Alert.click();
		Mobiles.click();
	}
	
	

}
