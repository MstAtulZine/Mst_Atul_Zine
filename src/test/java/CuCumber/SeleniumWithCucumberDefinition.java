package CuCumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import CuCumber.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SeleniumWithCucumberDefinition {
	WebDriver driver;
	@Given("^User has launched testme app in browser$")
	public void user_has_launched_testme_app_in_browser() throws Throwable {
		driver= UtilityClass.openBrowser("chrome");
	  	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	  	driver.findElement(By.name("password")).sendKeys(arg2	);
	}
	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
	}
	@Then("^user must be logged in successfully$")
	public void user_must_be_logged_in_successfully() throws Throwable {
		Assert.assertEquals("Home", driver.getTitle());
	}
}