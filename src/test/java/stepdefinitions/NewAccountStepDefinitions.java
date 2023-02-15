package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.NewAccountPage;

public class NewAccountStepDefinitions {
	WebDriver driver;
	LoginPage loginPage;
	NewAccountPage naPage;
	
	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page(){
	    
	}

	@When("^User enters the \"([^\"]*)\" in \"([^\"]*)\" field$")
	public void user_enters_the_in_field(String arg1, String arg2){
	    if(arg1.equalsIgnoreCase("username"))
	    {
	    	
	    }
	    else if(arg1.equalsIgnoreCase("password"))
	    {
	    	
	    }
	}

	
	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1){
	   
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page(){
	    
	}

	@Then("^User enters \"([^\"]*)\" in accounts page$")
	public void user_enters_in_accounts_page(String arg1){
	    
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully(){
	    
	}


}
