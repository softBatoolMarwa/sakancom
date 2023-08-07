package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.Main;

public class StatusHouse {

@Given("Status Of Housing")
public void status_of_housing() {
 }

@When("admins request to Show Status Of Housing")
public void admins_request_to_show_status_of_housing() {
   }

@Then("show the Status housing.")
public void show_the_status_housing() {
	equals( true==Main.showStatusOfHousing());
}

}
