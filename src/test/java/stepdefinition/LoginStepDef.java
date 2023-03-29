package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef {

	@Given("I navigate to the Application")
	public void i_navigate_to_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I enter the username and password")
	public void i_enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I enter the username and password");
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on login button");
	}

	@Then("I navigate to the Application and check the page title {string}")
	public void i_navigate_to_the_application_and_check_the_page_title(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I navigate to the applicaiton and check the page title");
	}
	
	
}
