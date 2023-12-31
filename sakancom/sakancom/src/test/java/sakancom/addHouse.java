package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class addHouse {

@Given("infomation about the house.")
public void infomation_about_the_house() {
}

@When("owner add new house")
public void owner_add_new_house() {
}

@Then("the house added to housing array to go into admin")
public void the_house_added_to_housing_array_to_go_into_admin() {

	HOUSE hh = new HOUSE();
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
	
    HOUSE h = new HOUSE (hh);
	
	
	
	boolean c= MAIN.addHousing(h,"owner");
	MAIN.showHousingj("ownerOmar11");	
	equals( true==c );


}

@When("owner add existing  house")
public void owner_add_existing_house() {
}

@Then("A message will appear that this house already exists")
public void a_message_will_appear_that_this_house_already_exists() {


	
	HOUSE hh = new HOUSE();
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
	
    HOUSE h = new HOUSE (hh);

	
	
	
	
	boolean c= MAIN.addHousing(h,"owner");
	equals( true!=c );
	
}

@Given("infomation about the house.\\(admin)")
public void infomation_about_the_house_admin() {
}

@When("admin add new house\\(admin)")
public void admin_add_new_house_admin() {
}

@Then("the house added \\(admin)")
public void the_house_added_admin() {
	
	
	
	HOUSE hh = new HOUSE();
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
	
    HOUSE h = new HOUSE (hh);

	
	
	boolean c= MAIN.addHousing(h,"admin");
	MAIN.showHousingj("ownerOmar");	
	equals( true==c );

}

@Given("infomation about the house.\\(admin){int}")
public void infomation_about_the_house_admin(Integer int1) {
}

@When("admin add existing  house\\(admin){int}")
public void admin_add_existing_house_admin(Integer int1) {
}

@Then("A message will appear that this house already exists\\(admin){int}")
public void a_message_will_appear_that_this_house_already_exists_admin(Integer int1) {


	HOUSE hh = new HOUSE();
	hh.setResidenceId(7);
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
	
    HOUSE h = new HOUSE (hh);

	
	
	
	boolean c= MAIN.addHousing(h,"admin");
	equals( true!=c );
	
}
}
