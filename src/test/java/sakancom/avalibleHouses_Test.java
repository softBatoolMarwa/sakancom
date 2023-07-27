package sakancom;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;
import static org.junit.Assert.assertTrue;

import sakancom1.Main;

public class avalibleHouses_Test {
	@Given("available housing")
	public void available_housing() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("admins request to see the available housing .")
	public void admins_request_to_see_the_available_housing() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("show the available housing.")
	public void show_the_available_housing() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(Main.WatchingReservations());
	}
}
