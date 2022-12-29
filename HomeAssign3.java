package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeAssign3 {
	 WebDriver driver;
	@Given("Open Rediff Application2")
	public void open_rediff_application2() {
			System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("Forgot the Password")
	public void forgot_the_password() {
		    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("shreepad11");
	}

	@Then("Get New Password")
	public void get_new_password() throws InterruptedException{
		driver.findElement(By.xpath("//u[contains(text(),'Forgot Password?')]")).click();
	    driver.findElement(By.xpath("//input[@id='txtlogin']")).sendKeys("shree");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
