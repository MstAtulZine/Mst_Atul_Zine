package CuCumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	String str;
	@Given("^Type Hello World$")
	public void type_Hello_World() throws Throwable {
		str="Hello World";
	}

	@When("^Execute the coden$")
	public void execute_the_coden() throws Throwable {
		System.out.println(str);
	}

	@Then("^Hello World must be displayed in console$")
	public void hello_World_must_be_displayed_in_console() throws Throwable {
	   System.out.println("Displayed Successfully");
	   
	}

}
