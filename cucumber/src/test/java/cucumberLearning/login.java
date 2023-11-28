package cucumberLearning;

import io.cucumber.java.en.*;

public class login {

	@Given("open the url")
	public void userlogin() {
		System.out.println("Open successful");
	}
	
	@When("given the credentials")
	public void entercredentials()
	{
		System.out.println("login successful");
	}
}
