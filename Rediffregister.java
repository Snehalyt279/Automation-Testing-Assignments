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

public class Rediffregister {
	WebDriver driver;
	@Given("User is on registration1 page")
	public void user_is_on_registration1_page() {
		System.setProperty("webdriver.gecko.driver", "D:\\jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	   System.out.println("in given");
	}

	@When("User enters following details1")
	public void user_enters_following_details1(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> UserList = dataTable.asLists(String.class);
		int listlen = UserList.size();
		for(int i=0;i<=listlen;i++)
		 {
					
	    	driver.findElement(By.xpath("//td[@width='200']//input[@type='text']")).sendKeys(UserList.get(i).get(0));
	    	driver.findElement(By.xpath("//td[@valign='bottom']//input[@type='text']")).sendKeys(UserList.get(i).get(1));
	    	driver.findElement(By.xpath("//td[@valign='bottom']//input[@type='button']")).click();
	    	driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(UserList.get(i).get(2));
	    	driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(UserList.get(i).get(3));
	    	driver.findElement(By.xpath("//div[@id='div_altemail']")).sendKeys(UserList.get(i).get(4));
	    	driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys(UserList.get(i).get(5));
	    	
	    	Select dd3 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[1]")));
	        List<WebElement> opt3 = dd3.getOptions();
	        dd3.selectByIndex(27);
	        
	        Select dd2 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[2]")));
	        List<WebElement> opt2 = dd2.getOptions();
	        dd2.selectByVisibleText("JUN");
	        
	        Select dd1 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[3]")));
	        List<WebElement > opt1= dd1.getOptions();
	        dd1.selectByValue("1999");
	        
	        driver.findElement(By.xpath("//body[@topmargin='0']/center/form[@action='register.php?ref_id=']/div[@id='wrapper']/table[@id='tblcrtac']/tbody/tr[3]/td[2]")).click();
	        
	        Select dd4 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[28]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/select[1]")));
	        List<WebElement> opt4 = dd2.getOptions();
	        dd4.selectByValue("Sangli");
	        Thread.sleep(6000);
	        driver.findElement(By.xpath("//body[@topmargin='0']/center/form[@action='register.php?ref_id=']/div[@id='wrapper']/table[@id='tblcrtac']/tbody/tr[32]/td[3]/input[1]")).sendKeys(UserList.get(9).get(1));
	        
		 }
	}

	@Then("User registration1 should be successful")
	public void user_registration1_should_be_successful() {
	   System.out.println("In then");
	}

}
