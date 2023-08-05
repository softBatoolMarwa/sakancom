package sakancom;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancomMain.*;

public class reservation_admin {
	@Given("reservations via the system")
	public void reservations_via_the_system() {
	}

	@When("admins request to see  reservations via the system")
	public void admins_request_to_see_reservations_via_the_system() {
	}

	@Then("View the reservations id house and name tenent")
	public void view_the_reservations_id_house_and_name_tenent() {
		houseAndTennant h = new houseAndTennant(11,"bed");
		Main.houseAndTennantlist.add(h);
		equals( true==Main.showTenantToAdmin() );

	}
}
