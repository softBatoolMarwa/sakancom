package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class acceptAndReject {

@Given("Advertisement of housing")
public void advertisement_of_housing() {
}

@When("Admin acceptance of the owners request to view the house")
public void admin_acceptance_of_the_owners_request_to_view_the_house() {
}

@Then("add house in ads and delete house from ad requests.")
public void add_house_in_ads_and_delete_house_from_ad_requests() {

	
	
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
	hh.setOwnerName("ownerOmar11");
	hh.setOwnerPhone("0569696345");
	hh.setOwnerEmail("omar.112@gmail.com");
	
    Housing h = new Housing (hh);
	
	
	
	
	
	
	
	
	
	
	boolean c=Main.acceptAndReject(1,h);
equals( true==c );

}

@When("Admin reject of the owners request to view the house")
public void admin_reject_of_the_owners_request_to_view_the_house() {
}

@Then("Delete home from ad requests")
public void delete_home_from_ad_requests() {
	
	
	Housing hh = new Housing();
	hh.setResidenceId(3);
	hh.setResidenceName("alsafa");
	hh.setLocation("nablus");
	hh.setFloorNum(3);
	hh.setApartmentNum(300);
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
	
    Housing h = new Housing (hh);
	
	
	
	
	
	
	
	boolean c=Main.acceptAndReject(2,h);
	equals( true!=c );
}


}
