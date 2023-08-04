package sakancom;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;
import static org.junit.Assert.assertTrue;

import sakancom1.Main;

public class bookacc {
	@Given("Id")
	public void id() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("tenant requests to reserve an apartment and there is room in this apartment")
	public void tenant_requests_to_reserve_an_apartment_and_there_is_room_in_this_apartment() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("This apartment will be booked")
	public void this_apartment_will_be_booked() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	assertTrue(Main.bookAccommodation(2200));
	}

	@When("tenant requests to book an apartment and there is no space in this apartment")
	public void tenant_requests_to_book_an_apartment_and_there_is_no_space_in_this_apartment() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("It will show that this apartment is booked")
	public void it_will_show_that_this_apartment_is_booked() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Main.bookAccommodation(2200);
		Main.bookAccommodation(2200);
		Main.bookAccommodation(2200);
		assertFalse(Main.bookAccommodation(2200) );
	}

}
