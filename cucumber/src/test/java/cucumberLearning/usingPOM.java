package cucumberLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pom.usingpomacheivedetails;

public class usingPOM {

	WebDriver driver = null;
	usingpomacheivedetails login;

	@Given("open chrome broswer")
	public void open_browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Dell/eclipse-workspace/selenium/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://encorecollections-test.senseitech.com/#/signin");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	@When("^user enter the (.*) and (.*)$")
	public void user_enter_the_credentials(String username, String password) throws Exception {
		// common things need to pass find element methos and xpath

		login = new usingpomacheivedetails(driver);

		login.enterusername(username);
		login.enterpassword(password);

		/*
		 * // Enter User name
		 * driver.findElement(By.name("username")).sendKeys(username); // Enter Password
		 * driver.findElement(By.name("password")).sendKeys(password);
		 */
		Thread.sleep(2000);
	}

	@And("click on signin")
	public void click_on_sign_in() throws Exception {
		// Click on Sign in

		login.clickonsignin();

//		driver.findElement(By.xpath("//*[text()='Sign In Securely']")).click();
		Thread.sleep(3000);
	}

	@Then("Result shown")
	public void result_is_shown() {

		driver.close();
		System.out.println("Successful");

	}
}
