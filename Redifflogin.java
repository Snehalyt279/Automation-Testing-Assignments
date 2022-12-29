package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Redifflogin {
	WebDriver driver;
	 @Given("Open Rediff Applicationss")
	  public void open_rediff_applicationss11() {
	    System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
	    driver =new FirefoxDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  }

	  @When("I enters correct username {string} and password {string}")
	  public void i_enters_correct_username_and_password(String uname, String passwd) {
	    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passwd);
	  }

	  @Then("Loin should be Successfully")
	  public void loin_should_be_successfully() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	  }

	  @Given("Open Rediff  Applicationss")
	  public void open_rediff_applicationss() {
	    System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
	    driver =new FirefoxDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  }

	  @When("I enters correct email address {string} and password {string}")
	  public void i_enters_correct_email_address_and_password(String email, String passwd) {
	    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passwd);
	  }

	  @When("I enters correct phone {string} number and password {string}")
	  public void i_enters_correct_phone_number_and_password(String phno, String passwd) {
	    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(phno);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passwd);
	  }

	}