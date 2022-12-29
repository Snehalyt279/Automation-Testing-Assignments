package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeAssign1 {

  WebDriver driver;
  @Given("Open Rediff Application")
  public void Open_Rediff_Application() {
      System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
    driver =new FirefoxDriver();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
     
  }
  @When("Signup To Page valid data")
  public void Signup_To_Page_valid_data() {
    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("SnehalTawar");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("snehalyt279");
    
  }
  @Then("Get SignUp")
  public void Get_SignUp() {
    driver.findElement(By.xpath("//input[@type='submit']")).click();
  }
}