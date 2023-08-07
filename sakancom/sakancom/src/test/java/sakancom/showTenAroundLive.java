package sakancom;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class showTenAroundLive {
	@Given("tenant is a Student")
	public void tenant_is_a_student() {
	}

	@When("tenant is Student")
	public void tenant_is_student() {
	}

	@Then("show all  people who live in around him.")
	public void show_all_people_who_live_in_around_him() {
		equals( true==MAIN.ifTenIsStudent("tenantNajeh45") );


	}


}
