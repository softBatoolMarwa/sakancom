package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class reservation_admin {
	@Given("reservations via the system")
	public void reservations_via_the_system() {
	}

	@When("admins request to see  reservations via the system")
	public void admins_request_to_see_reservations_via_the_system() {
	}

	@Then("View the reservations id house and name tenent")
	public void view_the_reservations_id_house_and_name_tenent() {
		HOUSEANDTENANT h = new HOUSEANDTENANT(11,"bed");
		MAIN.houseAndTennantlist.add(h);
		equals( true==MAIN.showTenantToAdmin() );

	}
}
