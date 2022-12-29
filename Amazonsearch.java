package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonsearch {
	 WebDriver driver;
	 @Given("Open Amazon Website")
	 public void open_amazon_website() {
		 System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
		    driver =new FirefoxDriver();
		    driver.get("https://www.amazon.com");
	 }

	 @Given("I select filter1 and sort1 categories")
	 public void i_select_filter1_and_sort1_categories() {
		 driver.findElement(By.xpath("//a[contains(text(),'Today's Deals')]")).click();
	 }

	 @When("I click on filter1 sort1")
	 public void i_click_on_filter1_sort1() {
		 driver.findElement(By.xpath("//a[@id='native_sorting_dropdown0_0']")).click();
		 driver.findElement(By.xpath("//a[@id='native_sorting_dropdown0_1']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorcycle')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Lightning deal')]")).click();
	 }

	 @Then("I should get filtered1 and sorted1 search")
	 public void i_should_get_filtered1_and_sorted1_search() {
		 driver.getTitle();
	 }


}
