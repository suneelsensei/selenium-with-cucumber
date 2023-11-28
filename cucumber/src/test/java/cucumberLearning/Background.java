package cucumberLearning;

import io.cucumber.java.en.*;

public class Background {
	@Given("the url")
	public void the_url() {
		System.out.println("opne th url");
	}

	@When("enter cred")
	public void enter_cred() {
		System.out.println("cred");
	}

	@When("enter cred2")
	public void enter_cred2() {
		System.out.println("cred2");
	}

	@Given("open")
	public void open() {
		System.out.println("Inside the Open");
	}

	@When("the")
	public void the() {
		System.out.println("Inside the The");
	}

	@Then("url")
	public void url() {
		System.out.println("Inside the url");
	}
}
