package stepDefinition;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import pageObjects.ContactUs_PageObject;

public class ContactUs_stepDefinition extends BasePage {
	
	@Before
	public void setUpBrowser() {
		BasePage.initialiseBrowser();
	}
	
	@Given("^user navigates to the qumu contact us page$")
	public void user_navigates_to_the_qumu_contact_us_page() throws Throwable {
		driver.get("https://qumu.com/en/contact-us/");
	}
	@When("^user fills out all personal information and comments on the contact us page and submits$")
	public void user_fills_out_all_personal_information_and_comments_on_the_contact_us_page_and_submits() throws Throwable {
		ContactUs_PageObject filloutforum = new ContactUs_PageObject();
		filloutforum.enterFirstName("John");
		filloutforum.enterSecondName("Smith");
		filloutforum.enterEmail("randomemail@qumu.com");
		filloutforum.enterCompany("QUMU");
		filloutforum.enterPhoneNumber("07912345678");
		filloutforum.selectCountryBR("BR");
		filloutforum.selectEnquiry("Talk to an Expert");
		filloutforum.enterComment("The quick brown fox jumps over the lazy dog");
		filloutforum.clickOnSubmit();
		// info can be changed here
	}
	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		Thread.sleep(4000);
		driver.close();
		driver.quit();
	}


}
