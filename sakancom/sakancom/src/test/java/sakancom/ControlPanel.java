package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancomMain.*;
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
	Apartment firstApartment = new Apartment(1,"ownerOmar",1,1,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,true);
	Apartment secondApartment = new Apartment(2,"ownerAseel",5,1,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1500,"free internet",6,3,2,2,true);
	Apartment firstApartment2 = new Apartment(11,"ownerOmar",1,2,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,true);
	Apartment secondApartment2 = new Apartment(22,"ownerAseel",5,2,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1500,"free internet",6,3,2,2,true);
	Apartment firstApartment3 = new Apartment(111,"ownerOmar",1,1,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,true);
	Apartment secondApartment3 = new Apartment(222,"ownerAseel",5,3,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1500,"free internet",6,3,2,2,true);
	Apartment firstApartment1 = new Apartment(1111,"ownerOmar",1,1,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,true);
	Apartment secondApartment32 = new Apartment(2222,"ownerOmar",1,3,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1500,"free internet",6,3,2,2,true);
	Main.apartmentList.add(secondApartment32);
	
	Main.apartmentList.add(firstApartment1);
	Main.apartmentList.add(firstApartment);
	Main.apartmentList.add(secondApartment);

	Main.apartmentList.add(firstApartment3);
	Main.apartmentList.add(secondApartment3);

	Main.apartmentList.add(firstApartment2);
	Main.apartmentList.add(secondApartment2);
	equals( true==Main.cPanel("ownerOmar") );

}



}
