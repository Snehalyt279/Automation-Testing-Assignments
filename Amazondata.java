package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazondata {
  WebDriver driver;
  @Given("User can Open Amazone")
  public void user_can_open_amazone() {
    System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
    driver =new FirefoxDriver();
    driver.get("https://www.amazon.in/");
  }

  @When("User can Search following product in Search texbox")
  public void user_can_search_following_product_in_search_texbox(DataTable dataTable) {
    List<List<String>> data = dataTable.cells();
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data.get(1).get(1));
    

  }

  @Then("User should get view result of Mobile")
  public void user_should_get_view_result_of_mobile() {
    driver.findElement(By.xpath("//input[@type='submit']")).click();
  }

}
