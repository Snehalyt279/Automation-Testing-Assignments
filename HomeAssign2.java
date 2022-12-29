package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeAssign2 {

	
		WebDriver driver;
		 @Given("Open Rediff Application1")
		  public void Open_Rediff_Application1() {
		      System.setProperty("webdriver.gecko.driver","D:\\jar files\\geckodriver.exe");
		    driver =new FirefoxDriver();
		    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		     
		  }
		  @When("Signup To Page Invalid data1")
		  public void Signup_To_Page_Invalid_data1() {
			  driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("SnehalYTawar");
			    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("snehal9");
			    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
		  }
		  @Then("Get SignUp1")
		  public void Get_SignUp1() {
			  WebElement we = driver.findElement(By.xpath("//b[contains(text(),'Temporary Issue. Please try again later. [#5002]')]"));
			    String actmessage = we.getText();
			    WebElement we1=driver.findElement(By.xpath("//input[@id='login1']"));
			    System.out.println(we1.getAttribute("id"));
			    assertEquals("Username and password did not match", actmessage);
		  }
		}
