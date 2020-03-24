package stepDefinition;

import org.testng.annotations.Test;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import pageObjects.Homepage_PageObject;

public class FillOutContactUsFromHomePage_stepDefinition extends BasePage {

	  
		@When("^user opens browser and navigates to the QUMU homepage$")
		public void user_opens_browser_and_navigates_to_the_QUMU_homepage() throws Throwable {
		   driver.get("https://qumu.com/en/");
		  
		}
        
		@Then("^user clicks on contact us from the bottom of the homepage$")
		public void user_clicks_on_contact_us_from_the_bottom_of_the_homepage() throws Throwable {
			Homepage_PageObject homepage =  new Homepage_PageObject();
			homepage.clickOnContactUs();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
