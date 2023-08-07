package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.Main;

public class avalibleHouses {
	@Given("available housing")
	public void available_housing() {
	}

	@When("admins request to see the available housing .")
	public void admins_request_to_see_the_available_housing() {
	}

	@Then("show the available housing.")
	public void show_the_available_housing() {
		equals( true==Main.watchingReservations());

	}
}
