package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseCucumber {

	WebDriver driver;
	
	@Given("Open Google Application")
public void open_firefox_and_start_application() {
		System.setProperty("webdriver.gecko.driver", "D:\\jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
    
}
@When("Capture Title")
public void i_enter_valid_user_name_and_password() {
   System.out.println("hi welcome to Cucumber world  when");
}
@Then("I should get valid title as Google1")
public void user_should_be_able_to_login() {
	System.out.println("hi welcome to Cucumber world   then");
}




}
