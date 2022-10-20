package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	static WebDriver driver = null;
	static By EmployeeName =By.name("name");
	static By EmployeeAge =By.name("age");
	static By EmployeeAddress =By.name("address");
	static By EmployeeSalary =By.name("salary");

	static {
		System.setProperty("webdriver.chrome.driver", "E:\\Imp jar\\chromedriver_win32 (1)\\chromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8086/sdnext/add.html");
	}

	public void getName(String username) throws Throwable {
		driver.findElement(By.id("name")).sendKeys(username);
		Thread.sleep(2000);
	}

	public void getAge(String age) throws Throwable {
		driver.findElement(By.id("age")).sendKeys(age);
		Thread.sleep(2000);
	}

	public void getAddress(String address) throws Throwable {
		driver.findElement(By.id("address")).sendKeys(address);
		Thread.sleep(2000);

	}

	public void getSalary(String salary) throws Throwable {
		driver.findElement(By.id("salary")).sendKeys(salary);
		Thread.sleep(2000);
	}

	public void submit() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
	
	}
}
