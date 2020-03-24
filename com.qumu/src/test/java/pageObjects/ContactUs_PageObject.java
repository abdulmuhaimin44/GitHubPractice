package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUs_PageObject extends BasePage {

	Select select = null;

	public ContactUs_PageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input_19_2_3")
	public WebElement firstName;

	@FindBy(id = "input_19_2_6")
	public WebElement lastname;

	@FindBy(id = "input_19_3")
	public WebElement email;

	@FindBy(id = "input_19_4")
	public WebElement company;

	@FindBy(name = "input_5")
	public WebElement phoneNumber;

	@FindBy(id = "input_19_17")
	public WebElement country;

	@FindBy(id = "input_19_30")
	public WebElement enquiry_dropdown;

	@FindBy(css = "#input_19_8")
	public WebElement comment_box;

	@FindBy(css = "#gform_submit_button_19")
	public WebElement submit_button;

	@FindBy(xpath = "//*[@id=\"map-london\"]/a/span")
	public WebElement directions;

	//******* Methods are in the same order as the locators

	public void enterFirstName(String FirstName) {
		firstName.sendKeys(FirstName);
	}

	public void enterSecondName(String LastName) {
		lastname.sendKeys(LastName);
	}

	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}

	public void enterCompany(String CompanyName) {
		company.sendKeys(CompanyName);
	}

	public void enterPhoneNumber(String string) {
		phoneNumber.sendKeys(string);
	}

	public void selectCountryBR(String CountryName) {
		select = new Select(country);
		select.selectByVisibleText(CountryName);
	}

	public void selectEnquiry(String Enquiry) {
		select = new Select(enquiry_dropdown); 	
		select.selectByVisibleText(Enquiry);
	}

	public void enterComment(String Enter_Comment) {
		comment_box.sendKeys(Enter_Comment);
	}

	public void clickOnSubmit(){
		submit_button.click();
	}
	public void clickOnDirections() {
		directions.click();
	}


}



