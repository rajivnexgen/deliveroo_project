package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import deliveroo.TestBase;

public class Home extends TestBase {
	@FindBy(xpath="//input[@id='location-search']")
	WebElement searchField;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	WebElement searchButton;
	
	@FindBy(xpath="//div[@id='location-search-container']/descendant::ul[2]")
	WebElement dropDown;
	
	public Home(WebDriver driver ) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterProduct() {
		searchField.sendKeys("Pizza");
	}
	
	public void dropDownClick() {
		dropDown.click();
	}
	
	public void searchClick() {
		searchButton.click();
	}
}
