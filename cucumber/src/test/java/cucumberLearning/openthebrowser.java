package cucumberLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class openthebrowser {

	WebDriver driver = null;

	@Given("open broswer")
	public void open_browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dell/eclipse-workspace/selenium/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://encorecollections-test.senseitech.com/#/signin");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@When("user enter the credentials")
	public void user_enter_the_credentials() {
		// common things need to pass find element methos and xpath
		// Enter User name
		driver.findElement(By.name("username")).sendKeys("sharan");
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("Admin@123");

	}

	@And("click on signIN")
	public void click_on_sign_in() {
		// Click on Sign in
		driver.findElement(By.xpath("//*[text()='Sign In Securely']")).click();
	}

	@Then("Result is shown")
	public void result_is_shown() {

		System.out.println("Successful");

	}
}
