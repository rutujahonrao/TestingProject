package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioStepDefinition {
	
	static WebDriver driver = null;
	
	@Given("^User Launch the browser$")
	public void user_Launch_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Imp jar\\chromedriver_win32 (1)\\chromeDriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Browser Lounched successfully..");
	}

	@Given("^User opened url$")
	public void user_opened_url() throws Throwable {
		driver.get("http://localhost:8086/sdnext/add.html");
		Thread.sleep(2000);
		System.out.println("Demosite url opened successfully..");
	    
	}

	@When("^User enters Username \"([^\"]*)\",Age \"([^\"]*)\",Salary \"([^\"]*)\",Address \"([^\"]*)\"$")
	public void user_enters_Username_Age_Salary_Address(String Name, String Age, String Salary, String Address) throws Throwable {
		driver.findElement(By.id("name")).sendKeys(Name);
		driver.findElement(By.id("age")).sendKeys(Age);
		driver.findElement(By.id("address")).sendKeys(Address);
		driver.findElement(By.id("salary")).sendKeys(Salary);
		System.out.println("user enters all Credentials successfully..");
	}

	@When("^User Click on submit button$")
	public void user_Click_on_submit_button() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		System.out.println("user enters submit successfully..");
	    
	}

	@Then("^Data should be added in database$")
	public void data_should_be_added_in_database() throws Throwable {
		String expected = "http://localhost:8086/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		System.out.println("User is moved successfully on Expected information  page...  ");
		Thread.sleep(4000);
		driver.close();
	    
	}

}
