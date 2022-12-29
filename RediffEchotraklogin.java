package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class RediffEchotraklogin {
    WebDriver driver;
    @Given("User can open Rediff")
    public void user_can_open_rediff() {
      System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
      driver =new FirefoxDriver();
      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @When("User enters Username and Password in Rediff Login page")
    public void user_enters_username_and_password_in_rediff_login_page( DataTable dataTable) {
      List<List<String>> data = dataTable.cells();
      driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(data.get(1).get(0));
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(1).get(1));
      
    }

    @Then("User should Rediff Login successfully")
    public void user_should_rediff_login_successfully() {
      driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Given("User can open Echo Track")
    public void user_can_open_echo_track() {
      System.setProperty("webdriver.gecko.driver","D:\\jarfiles\\geckodriver.exe");
      driver =new FirefoxDriver();
      driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
    }

    @When("User enters Username and Password in Echo Track Login page")
    public void user_enters_username_and_password_in_echo_track_login_page(DataTable dataTable) {
        List<List<String>> data = dataTable.cells();
        driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys(data.get(1).get(0));
      driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(data.get(1).get(1));
    }

    @Then("User should Echo Track Login successfully")
    public void user_should_echo_track_login_successfully() {
      driver.findElement(By.xpath("//input[@id='Butsub']")).click();
    }

}