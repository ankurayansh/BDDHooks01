package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TagStepDef {
	
//	@Before("@FunctionTest")
//	@Before(value="@FunctionTest", order=1)
//	public void setup(){
//		System.out.println("Before Each feature");
//	}
//	@Before(value="@RegressionTest", order=2)
//	public void setup2(){
//		System.out.println("Before Each feature");
//	}
	@Before(value="@SmokeTest")
	public void setup2(){
		System.out.println("Before Each feature");
	}
	
	

	
	@After
	public void teardown(){
		System.out.println("After tag");
	}
//	@BeforeStep
//	public void setupStep(){
//		System.out.println("Before step");
//	}
//	@AfterStep
//	public void adterstep(){
//		System.out.println("After each Step");
//		
//	}

	@Given("User is on login page background")
	public void user_is_on_login_page_background() {
	 System.out.println("Background");
	}
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login Page");

	}

	@Given("User enters valid crdentials")
	public void user_enters_valid_crdentials() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("cred");
	}

	@When("User enters invalid cred")
	public void user_enters_invalid_cred() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("invalid Cred");
	}

	@Given("User is on Task Page")
	public void user_is_on_Task_Page() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("TaskPage");
	}
	@Given("User is on Deal Page")
	public void user_is_on_Deal_Page() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Deal Page");
	}

	@Given("User is logged out")
	public void user_is_logged_out() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("logout");
	}

	
}
