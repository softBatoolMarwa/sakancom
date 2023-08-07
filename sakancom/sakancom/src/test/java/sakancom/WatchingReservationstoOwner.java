package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.Housing;
import sakancommain.Main;

public class WatchingReservationstoOwner {

@Given("accepted housing and username.")
public void accepted_housing_and_username() {
}

@When("when owner request to see the accepted housing.")
public void when_owner_request_to_see_the_accepted_housing() {
}

@Then("View the accepted housing for you")
public void view_the_accepted_housing_for_you() {

	Housing hh = new Housing();
	hh.setResidenceId(2);
	hh.setResidenceName("alsafa");
	hh.setLocation("nablus");
	hh.setFloorNum(3);
	hh.setApartmentNum(200);
	hh.setPhoto("https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link");
	hh.setRent(1200);
	hh.setServices("elevator");
	hh.setMaxNumOfTenant(2);
	hh.setNumOfBedrooms(3);
	hh.setNumOfBathrooms(3);
	hh.setBalcony(1);
	hh.setOwnerUserName("omar");
	hh.setOwnerName("ownerOmar");
	hh.setOwnerPhone("0569696345");
	hh.setOwnerEmail("omar.112@gmail.com");
	
    Housing h = new Housing (hh);
	
	
	
	
	
	
	
	
	
	
	boolean c=Main.acceptAndReject(1,h);
	equals( true==Main.WatchingReservationstoOwner("ownerOmar"));

}



}
