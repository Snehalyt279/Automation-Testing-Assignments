package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Yelpsearch {
	 WebDriver driver;
	 @Given("Open Yelp Website")
	 public void open_yelp_website() {
		 System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
		    driver =new FirefoxDriver();
		    driver.get("https://www.yelp.com");
	 }

	 @Given("I select filter and sort categories")
	 public void i_select_filter_and_sort_categories() {
		 driver.findElement(By.xpath("//span[contains(text(),'Restaurants')]")).click();
		 
	 }

	 @When("I click on filter sort")
	 public void i_click_on_filter_sort() {
		 driver.findElement(By.xpath("//button[contains(@class,'filterToggle__09f24__XF_eF growFilter__09f24__SJOGc isSelected__09f24__TLfOn')]")).click();
		 driver.findElement(By.xpath("//input[contains(@value,'breakfast_brunch')]")).click();
		 driver.findElement(By.xpath("//span[contains(@class,'css-qgunke')]//a[@class='css-4mfze4']")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Highest Rated')]")).click();
	 }

	 @Then("I should get filtered and sorted search")
	 public void i_should_get_filtered_and_sorted_search() {
		 driver.getTitle();
	 }
}
