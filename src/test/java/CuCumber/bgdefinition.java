package CuCumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bgdefinition {

	int a,b,s,p;
@Given("^user must enter two values$")
public void user_must_enter_two_values() throws Throwable {
	System.out.println("Users enters input");
	a=10;
	b=20;
    // Write code here that turns the phrase above into concrete actions
}

@Then("^assign the variables to a & b$")
public void assign_the_variables_to_a_b() throws Throwable {
    System.out.println(a+" "+b);
	
	// Write code here that turns the phrase above into concrete actions
}

@When("^add two numbers$")
public void add_two_numbers() throws Throwable {
    s=a+b;
	// Write code here that turns the phrase above into concrete actions
}

@Then("^display the sum$")
public void display_the_sum() throws Throwable {
    System.out.println("Sum is "+s);
	// Write code here that turns the phrase above into concrete actions
}

@When("^multiply two numbers$")
public void multiply_two_numbers() throws Throwable {
	p=a*b;
	// Write code here that turns the phrase above into concrete actions
}

@Then("^display the product$")
public void display_the_product() throws Throwable {
    System.out.println("Product is "+p);
	// Write code here that turns the phrase above into concrete actions
}

}
