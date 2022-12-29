package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoDataDriven {
	WebDriver driver;
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.setProperty("webdriver.gecko.driver", "D:\\jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	   System.out.println("in given");
	}

	@When("User enters following details")
	public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> UserList = dataTable.asLists(String.class);
		int listlen = UserList.size();
		for(int i=0;i<=listlen;i++)
		 {
					
	    	driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(UserList.get(i).get(0));
	    	driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(UserList.get(i).get(1));
	    	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(UserList.get(i).get(4));
	    	driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(UserList.get(i).get(2));
	    	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(UserList.get(i).get(3));
	    	
	    	 driver.findElement(By.xpath("//input[@value='Female']")).click();
	         driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	         driver.findElement(By.xpath("//div[@id='msdd']")).click();
	         driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
	         Thread.sleep(6000);
	         Select dd = new Select(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[1]/select[1]")));
	         Thread.sleep(6000);
	         List<WebElement > opt= dd.getOptions();
	         dd.selectByValue("Software");
	        
	         driver.findElement(By.xpath("//b[@role='presentation']")).click();
	         driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
	         Select dd1 = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
	         List<WebElement > opt1= dd1.getOptions();
	         dd1.selectByValue("1999");
	         Select dd2 = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
	         List<WebElement> opt2 = dd2.getOptions();
	         dd2.selectByVisibleText("June");
	         Select dd3 = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
	         List<WebElement> opt3 = dd3.getOptions();
	         dd3.selectByIndex(27);
	         driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(UserList.get(i).get(5));
	         driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(UserList.get(i).get(6));
	         driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		 }
	      }

	      @Then("User registration should be successfully1")
	      public void user_registration_should_be_successfully1() {
	          driver.getTitle();
	      }
	  
	    	
	    	
	    }
	

	



