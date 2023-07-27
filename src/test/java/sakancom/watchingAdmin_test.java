package sakancom;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class watchingAdmin_test {

@Given("available housing.")
public void available_housing() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("when admins request to see the available housing.")
public void when_admins_request_to_see_the_available_housing() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("View the available housing")
public void view_the_available_housing() {
	
	assertTrue(Main.WatchingReservations());
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

}
