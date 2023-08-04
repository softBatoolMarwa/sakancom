package sakancom;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class showacceptedhouse {

@Given("accepted housing.")
public void accepted_housing() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("when admins request to see the accepted housing.")
public void when_admins_request_to_see_the_accepted_housing() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("View the accepted housing")
public void view_the_accepted_housing() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(Main.WatchingReservations());

//	throw new io.cucumber.java.PendingException();
}

}
