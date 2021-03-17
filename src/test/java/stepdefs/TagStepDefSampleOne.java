package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TagStepDefSampleOne {
	@Given("User is on login pageOne")
	public void user_is_on_login_pageOne() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("login One");
	}

	@Given("User enters valid crdentialsOne")
	public void user_enters_valid_crdentialsOne() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("cred One");
	}
	@When("User enters invalid credOne")
	public void user_enters_invalid_credOne() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("invalid cred One");
	}

	@Given("User is on Task PageOne")
	public void user_is_on_Task_PageOne() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Task PageOne");
	}

	@Given("User is on Deal PageOne")
	public void user_is_on_Deal_PageOne() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Deal Page One");
	}

	@Given("User is logged outOne")
	public void user_is_logged_outOne() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("LoggedOut one");
	}



}
