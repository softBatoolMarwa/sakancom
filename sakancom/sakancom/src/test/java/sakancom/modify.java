package sakancom;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.*;


public class modify {
	@Given("new valus about the house.\\(Residence Id)")
	public void new_valus_about_the_house_residence_id() {
	}

	@When("owner Enter id and num  to edit {int}) Residence Id")
	public void owner_enter_id_and_num_to_edit_residence_id(Integer int1) {
	}

	@Then("The Residence Id changed")
	public void the_residence_id_changed() {
	
		
			
		 
		equals( true==Main.editHousing2(1,2200,2));
}

	@Given("new valus about the house.\\(Residence Name)")
	public void new_valus_about_the_house_residence_name() {
	}

	@When("owner Enter id and num  to edit {int})Residence Name ..")
	public void owner_enter_id_and_num_to_edit_residence_name(Integer int1) {
	}

	@Then("The Residence Name changed")
	public void the_residence_name_changed() {
	    
		equals( true==Main.editHousing1(2,2200,"Safa 2") );

}

	@Given("new valus about the house.\\(Location )")
	public void new_valus_about_the_house_location() {
}

	@When("owner Enter id and num  to edit {int})Location..")
	public void owner_enter_id_and_num_to_edit_location(Integer int1) {
}

	@Then("The Location changed")
	public void the_location_changed() {
	 equals( true==Main.editHousing1(3,2200,"Ramallah"));

}

	@Given("new valus about the house.\\(Floor Number )")
	public void new_valus_about_the_house_floor_number() {
}

	@When("owner Enter id and num  to edit {int})Floor Number..")
	public void owner_enter_id_and_num_to_edit_floor_number(Integer int1) {
}

	@Then("The Floor Number changed")
	public void the_floor_number_changed() {
	 equals( true==Main.editHousing2(4,2200,8));

}

	@Given("new valus about the house.\\(Apartment Number )")
	public void new_valus_about_the_house_apartment_number() {
}

	@When("owner Enter id and num  to edit {int})Apartment Number..")
	public void owner_enter_id_and_num_to_edit_apartment_number(Integer int1) {
}

	@Then("The Apartment Number changed")
	public void the_apartment_number_changed() {
	 equals( true==Main.editHousing2(5,2200,5) );

}

	@Given("new valus about the house.\\(Photo )")
	public void new_valus_about_the_house_photo() {
}

	@When("owner Enter id and num  to edit {int})Photo..")
	public void owner_enter_id_and_num_to_edit_photo(Integer int1) {
}

	@Then("The Photo changed")
	public void the_photo_changed() {
	 equals( true==Main.editHousing1(6,25,"https://www.google.com/search?sxsrf=AB5stBhHbiE2tsPqSjSpPMz0nf1Bh5x98Q:1690545349904&q=%D8%B4%D9%82%D8%A9&tbm=isch&source=lnms&sa=X&ved=2ahUKEwic5rqYrLGAAxVE66QKHQCeD9MQ0pQJegQIDRAB&biw=707&bih=642&dpr=1.38#imgrc=tgKsaeU4RfW7pM") );

	}

	@Given("new valus about the house.\\(Rent )")
	public void new_valus_about_the_house_rent() {
	}

	@When("owner Enter id and num  to edit {int})Rent..")
	public void owner_enter_id_and_num_to_edit_rent(Integer int1) {
	}

	@Then("The Rent changed")
	public void the_rent_changed() {
	 equals( true==Main.editHousing2(7,25,1800) );

}

	@Given("new valus about the house.\\(Services )")
	public void new_valus_about_the_house_services() {
}

	@When("owner Enter id and num  to edit {int})Services..")
	public void owner_enter_id_and_num_to_edit_services(Integer int1) {
}

	@Then("The Services changed")
	public void the_services_changed() {
	 
		 equals( true==Main.editHousing1(8,25,"Enter_net") );

}
	
	@Given("new valus about the house.\\(Max Number Of Tenant )")
	public void new_valus_about_the_house_max_number_of_tenant() {
}

	@When("owner Enter id and num  to edit {int})Max Number Of Tenant..")
	public void owner_enter_id_and_num_to_edit_max_number_of_tenant(Integer int1) {
}

	@Then("The Max Number Of Tenant changed")
	public void the_max_number_of_tenant_changed() {
	 equals( true==Main.editHousing2(9,25,3) );

}

	@Given("new valus about the house.\\(Number Of Bedrooms )")
	public void new_valus_about_the_house_number_of_bedrooms() {
}

	@When("owner Enter id and num  to edit {int})Number Of Bedrooms..")
	public void owner_enter_id_and_num_to_edit_number_of_bedrooms(Integer int1) {
}

	@Then("The Number Of Bedrooms changed")
	public void the_number_of_bedrooms_changed() {
	 equals( true==Main.editHousing2(10,25,3) );

}

	@Given("new valus about the house.\\(Number Of Bathrooms )")
	public void new_valus_about_the_house_number_of_bathrooms() {
}

	@When("owner Enter id and num  to edit {int})Number Of Bathrooms..")
	public void owner_enter_id_and_num_to_edit_number_of_bathrooms(Integer int1) {
}

	@Then("The Number Of Bathrooms changed")
	public void the_number_of_bathrooms_changed() {
	 equals( true==Main.editHousing2(11,25,2) );

	}

	@Given("new valus about the house.\\(Balcony )")
	public void new_valus_about_the_house_balcony() {
	}

	@When("owner Enter id and num  to edit {int})Balcony..")
	public void owner_enter_id_and_num_to_edit_balcony(Integer int1) {
}

	@Then("The Balcony changed")
	public void the_balcony_changed() {
		 equals( true==Main.editHousing2(12,25,0) );

}

	@Given("new valus about the house.\\(Owner Name )")
	public void new_valus_about_the_house_owner_name() {
}

	@When("owner Enter id and num  to edit {int})Owner Name..")
	public void owner_enter_id_and_num_to_edit_owner_name(Integer int1) {
}

	@Then("The Owner Name changed")
	public void the_owner_name_changed() {
		 equals( true==Main.editHousing1(13,25,"Ahmad Sami") );

	}

	@Given("new valus about the house.\\(Owner Phone )")
	public void new_valus_about_the_house_owner_phone() {
}

	@When("owner Enter id and num  to edit {int})Owner Phone..")
	public void owner_enter_id_and_num_to_edit_owner_phone(Integer int1) {
	}

	@Then("The Owner Phone changed")
	public void the_owner_phone_changed() {
		 equals( true==Main.editHousing1(14,25,"0599554455"));

}

	@Given("new valus about the house.\\(Owner Email )")
	public void new_valus_about_the_house_owner_email() {
	}

	@When("owner Enter id and num  to edit {int})Owner Email..")
	public void owner_enter_id_and_num_to_edit_owner_email(Integer int1) {
	}

	@Given("new valus about the house.\\(Residence )")
	public void new_valus_about_the_house_residence() {
	}

	@Then("The Owner Email changed")
	public void the_owner_email_changed() {
		 equals( true==Main.editHousing1(15,25,"AhmadSami@gmail.com") );

	}

	@Given("new valus about the house.\\(Status )")
	public void new_valus_about_the_house_status() {
}

	@When("owner Enter id and num  to edit {int})Status..")
	public void owner_enter_id_and_num_to_edit_status(Integer int1) {
	}

	@Then("The Status  changed")
	public void the_status_changed() {
		
		Main.ShowHousingj("ownerOmar");

		
		}

}
