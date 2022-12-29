package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Echotraklogin {
	WebDriver driver;
	@Given("Open Echo Track  Applicationsss")
    public void open_echo_track_applicationsss13() {
      System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
      driver =new FirefoxDriver();
      driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
    }

    @When("I enters corrective username {string} and password {string}")
    public void i_enters_corrective_username_and_password(String uname, String passwd) {
      driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys(uname);
      driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
    }

    @Then("Login should be Successfully")
    public void login_should_be_successfully() {
      driver.findElement(By.xpath("//input[@id='Butsub']")).click();
    }

    @Given("Open Echo Track Applicationsss")
    public void open_echo_track_applicationsss() {
      System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
      driver =new FirefoxDriver();
      driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
    }

    @When("I enters corrective email address {string} and password {string}")
    public void i_enters_corrective_email_address_and_password(String email, String passwd) {
      driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys(email);
      driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
    }
    

    @When("I enters corrective phone {string} number and password {string}")
    public void i_enters_corrective_phone_number_and_password(String phno, String passwd) {
      driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys(phno);
      driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
    }

}
