package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameters {
	WebDriver driver;
	@Given("Open OrangeHRM Website")
	public void open_orange_hrm_website() {
		 System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
		    driver =new FirefoxDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
	}

	@Given("I enter valid username {string} and valid password {string}")
	public void i_enter_valid_username_and_valid_password(String string, String string2) throws InterruptedException {
	   Thread.sleep(6000);
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
	   
	}

	@When("I click on login buttons")
	public void i_click_on_login_buttons() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("I should get access of applications")
	public void i_should_get_access_of_applications() {
	    driver.getTitle();
	    
	}

	@Given("I enter Invalid username {string} and valid password {string}")
	public void i_enter_invalid_username_and_valid_password(String string, String string2) throws InterruptedException {
			Thread.sleep(6000);
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("adminxyz");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234xyz");
	   
	}

	@When("I click on buttons")
	public void i_click_on_buttons() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("I should not get access of applications")
	public void i_should_not_get_access_of_applications() {
		driver.getTitle();
	}

}
