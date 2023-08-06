package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancomMain.*;

public class showacceptedhouse {

@Given("accepted housing.")
public void accepted_housing() {
}

@When("when admins request to see the accepted housing.")
public void when_admins_request_to_see_the_accepted_housing() {
}

@Then("View the accepted housing")
public void view_the_accepted_housing() {
	equals( true==Main.WatchingReservations() );

}

}
