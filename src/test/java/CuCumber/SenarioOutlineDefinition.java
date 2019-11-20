package CuCumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SenarioOutlineDefinition {


@Given("^User must be in login page$")
public void user_must_be_in_login_page() throws Throwable {
	System.out.println("User is in Login page");
    // Write code here that turns the phrase above into concrete actions
}

@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2) throws Throwable {
	System.out.println("Login using "+arg1+" and "+arg2);
    // Write code here that turns the phrase above into concrete actions
}

@When("^performs login$")
public void performs_login() throws Throwable {
	System.out.println("Click on the login button");
    // Write code here that turns the phrase above into concrete actions
}

@Then("^User must be in home page$")
public void user_must_be_in_home_page() throws Throwable {
	System.out.println("User is in the home page");
	System.out.println("*************************");
    // Write code here that turns the phrase above into concrete actions
}
	
}
