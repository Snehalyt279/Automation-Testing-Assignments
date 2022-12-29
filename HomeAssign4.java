package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class HomeAssign4 {

	WebDriver driver;
	  String acttitle = null;
	  @Given("Open Google Application3")
	  public void open_google_application3() {
		  System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
		  driver =new FirefoxDriver();
		  driver.get("https://www.google.com");
	  }

	  @When("Capture Title1")
	  public void capture_title1() {
		  acttitle =driver.getTitle();
		  System.out.println("Title of the page is "+acttitle);
	  }

	  @Then("I should get valid title as Google")
	  public void i_should_get_valid_title_as_google() {
	    String exctitle ="Google";
	    Assert.assertEquals(acttitle , exctitle);
	    driver.close();
	  }

	  @Given("Open Google Application4")
	  public void open_google_application4() {
		  System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
		  driver =new FirefoxDriver();
		  driver.get("https://www.google.com");
		  System.out.println("In GIven");
	  }

	  @When("I search keyword and go for search1")
	  public void i_search_keyword_and_go_for_search1() {
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cucumber",Keys.ENTER);
		  System.out.println("In When");
	  }

	  @Then("I should get valid search result1")
	  public void i_should_get_valid_search_result1() {
		  String exptext = "Cucumber";
		  String acttext= driver.getPageSource();
		   System.out.println(exptext);
		   if(acttext.contains(exptext))
		   {
		     System.out.println("TestCase Passes");
		   }
		   else
		   {
		     System.out.println("TestCase Fails");
		   }
		     
		  
		  System.out.println("In Then");
		    
	  }

	}


