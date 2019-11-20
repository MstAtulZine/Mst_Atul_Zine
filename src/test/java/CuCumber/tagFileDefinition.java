package CuCumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class tagFileDefinition {

@Given("^User is testing for login functionalityn$")
public void user_is_testing_for_login_functionalityn() throws Throwable {
	System.out.println("Login...!!!");
    // Write code here that turns the phrase above into concrete actions
}

@Then("^User is able to login Successfully$")
public void user_is_able_to_login_Successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Login Successfully...!!!");
}

@Given("^User is testing the search functionality$")
public void user_is_testing_the_search_functionality() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Search for Product");
}

@Then("^Search works successfully$")
public void search_works_successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("search is successfull");
}
@Then("^\"([^\"]*)\" is the tester on TestME$")
public void is_the_tester_on_TestME(String arg1) throws Throwable {
	System.out.println(arg1+" is the tester on TestME");
    // Write code here that turns the phrase above into concrete actions
}

}
