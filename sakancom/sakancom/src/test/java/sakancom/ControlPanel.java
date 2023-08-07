package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;
public class ControlPanel {

@Given("user name and information about apartment and residence")
public void user_name_and_information_about_apartment_and_residence() {
}

@When("owner request Control Panel.")
public void owner_request_control_panel() {
}

@Then("It will show what buildings this owner owns, the number of floors in each building, and the number of apartments on each floor.")
public void it_will_show_what_buildings_this_owner_owns_the_number_of_floors_in_each_building_and_the_number_of_apartments_on_each_floor() {
	Residence firstResidence = new Residence(1 , "alsafa" , "nablus" , 3 , 10,"ownerOmar");
	Residence secondResidence = new Residence(5 , "istanbul" , "nablus" , 3 , 21,"ownerAseel");
	Main.residenceList.add(firstResidence);
	Main.residenceList.add(secondResidence);
	
	Apartment apa = new Apartment();
	apa.setId(1);
	apa.setOwnerId("ownerOmar");
	apa.setResidenceId(1);
	apa.setFloorNum(1);
	apa.setPhoto("https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link");
	apa.setMonthlyRent(1200);
	apa.setServices("elevator");
	apa.setMaxNum(4);
	apa.setBedrooms(2);
	apa.setBathrooms(2);
	apa.setBalcony(1);
	apa.setAvailable(true);
	Apartment secondApartment32 = new Apartment(apa);
	Main.apartmentList.add(secondApartment32);
	
	

	
	

	equals( true==Main.cPanel("ownerOmar") );

}



}
