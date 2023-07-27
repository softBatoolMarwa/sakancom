package sakancom;
import static org.junit.Assert.*;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class addhouse_test {
	
	
	@Given("infomation about the house.")
	public void infomation_about_the_house() {
	
		
		
		
		
		
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("owner add new house")
	public void owner_add_new_house() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("the house added to housing array to go into admin")
	public void the_house_added_to_housing_array_to_go_into_admin() {
		
		
		Housing firstHousing1 = new Housing (2,"alsafa" ,"nablus" ,3,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
		boolean c= Main.addHousing(firstHousing1);
			 assertTrue(c);
			
	}

	@When("owner add existing  house")
	public void owner_add_existing_house() {
	
	
	}

	@Then("A message will appear that this house already exists")
	public void a_message_will_appear_that_this_house_already_exists() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	
	
	
		Housing firstHousing1 = new Housing (2,"alsafa" ,"nablus" ,3,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");

		boolean c= Main.addHousing(firstHousing1);
		 assertFalse(c);
		
	
	
	}
	
	}

