package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class showacceptedhouse {

@Given("accepted housing.")
public void accepted_housing() {
}

@When("when admins request to see the accepted housing.")
public void when_admins_request_to_see_the_accepted_housing() {
}

@Then("View the accepted housing")
public void view_the_accepted_housing() {
	
	HOUSE hh = new HOUSE();
	hh.setResidenceId(22);
	hh.setResidenceName("alsafa");
	hh.setLocation("nablus");
	hh.setFloorNum(3);
	hh.setApartmentNum(2002);
	hh.setPhoto("https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link");
	hh.setRent(1200);
	hh.setServices("elevator");
	hh.setMaxNumOfTenant(2);
	hh.setNumOfBedrooms(3);
	hh.setNumOfBathrooms(3);
	hh.setBalcony(1);
	hh.setOwnerUserName("omar");
	hh.setOwnerName("ownerOmar11");
	hh.setOwnerPhone("0569696345");
	hh.setOwnerEmail("omar.112@gmail.com");
	
    HOUSE h = new HOUSE (hh);
	
	
	
	
	
	
	
	
	
	
	boolean c=MAIN.acceptAndReject(1,h);
	equals( true==MAIN.watchingReservations() );

}

}
