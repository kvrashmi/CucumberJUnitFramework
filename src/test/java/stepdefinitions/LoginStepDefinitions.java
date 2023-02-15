package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDefinitions {
	WebDriver driver;
	LoginPage loginPage;
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() {
	    
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) {
		
		
	}
	
	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String arg1) {
	    
	}



}
