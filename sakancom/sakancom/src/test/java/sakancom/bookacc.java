package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.Main;

public class bookacc {
	@Given("Id")
	public void id() {
	}

	@When("tenant requests to reserve an apartment and there is room in this apartment")
	public void tenant_requests_to_reserve_an_apartment_and_there_is_room_in_this_apartment() {
	}

	@Then("This apartment will be booked")
	public void this_apartment_will_be_booked() {
	equals( true==Main.bookAccommodation(2200)  );

	}

	@When("tenant requests to book an apartment and there is no space in this apartment")
	public void tenant_requests_to_book_an_apartment_and_there_is_no_space_in_this_apartment() {
	}

	@Then("It will show that this apartment is booked")
	public void it_will_show_that_this_apartment_is_booked() {
		Main.bookAccommodation(2200);
		Main.bookAccommodation(2200);
		Main.bookAccommodation(2200);
		equals( true!=Main.bookAccommodation(2200)  );

	}

}
