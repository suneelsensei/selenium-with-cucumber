package cucumberLearning;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Hooks {

	@Before(value="@smoke")
	public void openbrowser() {
		System.out.println("start");
	}
	
//	@Before(order = 0)
	public void openbrowser2() {
		System.out.println("start2");
	}

//	@After(order = 3)
	public void closebrowser() {
		System.out.println("last");
	}
//	@After(order = 2)
	public void alosebrowser2() {
		System.out.println("last2");
	}

//	@BeforeStep
	public void beforestep() {
		System.out.println("Before Step");
	}

//	@AfterStep
	public void AfterStep() {
		System.out.println("After Step");
	}

	@Given("check browser is opeaned")
	public void browser_is_opeaned() {
		System.out.println("1");

	}

	@When("give credentials")
	public void enter_credentials() {
		System.out.println("2");
	}

	@Then("signin to the application")
	public void signin_to_the_applicantion() {
		System.out.println("3");
	}

}
