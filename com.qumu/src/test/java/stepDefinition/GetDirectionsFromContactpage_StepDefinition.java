package stepDefinition;



import cucumber.api.java.en.Then;
import pageObjects.BasePage;
import pageObjects.ContactUs_PageObject;

public class GetDirectionsFromContactpage_StepDefinition extends BasePage {


@Then("^user should click on get directions for london office$")
public void user_should_click_on_get_directions_for_london_office() throws Throwable {
	ContactUs_PageObject directions = new ContactUs_PageObject();
	directions.clickOnDirections();
}
	
	
	
}
