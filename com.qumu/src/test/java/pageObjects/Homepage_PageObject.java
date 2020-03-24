package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PageObject extends BasePage {

	public Homepage_PageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"colophon\"]/div[1]/div/div/div/div/div/div/div/div/div/div/div[6]/div/div/div/div/span[7]/a")
	public WebElement bottomOfPageContactus;
	//locator for contact us link from the bottom of the page 
	
	public void clickOnContactUs() {
		bottomOfPageContactus.click();
		//method for clicking on contact us from the bottom of the page 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
