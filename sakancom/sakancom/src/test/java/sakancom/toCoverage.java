package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.MAIN;

public class toCoverage {
	

	@Given("information")
	public void information() {
	}

	@When("req full info")
	public void req_full_info() {
	}

	@Then("full information")
	public void full_information() {
		equals( true==MAIN.fullInformation());

	}

}
