package sakancom;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class addHouse_test {

@Given("infomation about the house.")
public void infomation_about_the_house() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("owner add new house")
public void owner_add_new_house() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("the house added to housing array to go into admin")
public void the_house_added_to_housing_array_to_go_into_admin() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();

	Housing firstHousing1 = new Housing (2,"alsafa" ,"nablus" ,1,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar","0569696345","omar.112@gmail.com");
	boolean c= Main.addHousing(firstHousing1,"owner");
	Main.ShowHousingj("ownerOmar");	
	assertTrue(c);

}

@When("owner add existing  house")
public void owner_add_existing_house() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("A message will appear that this house already exists")
public void a_message_will_appear_that_this_house_already_exists() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();

	Housing firstHousing1 = new Housing (2,"alsafa" ,"nablus" ,3,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar","0569696345","omar.112@gmail.com");

	boolean c= Main.addHousing(firstHousing1,"owner");
	 assertFalse(c);
	
}

@Given("infomation about the house.\\(admin)")
public void infomation_about_the_house_admin() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("admin add new house\\(admin)")
public void admin_add_new_house_admin() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("the house added \\(admin)")
public void the_house_added_admin() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	Housing firstHousing1 = new Housing (7,"alsafa" ,"nablus" ,1,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar","0569696345","omar.112@gmail.com");
	boolean c= Main.addHousing(firstHousing1,"admin");
	Main.ShowHousingj("ownerOmar");	
	assertTrue(c);

}

@Given("infomation about the house.\\(admin){int}")
public void infomation_about_the_house_admin(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("admin add existing  house\\(admin){int}")
public void admin_add_existing_house_admin(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("A message will appear that this house already exists\\(admin){int}")
public void a_message_will_appear_that_this_house_already_exists_admin(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();

	Housing firstHousing1 = new Housing (7,"alsafa" ,"nablus" ,3,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar","0569696345","omar.112@gmail.com");

	boolean c= Main.addHousing(firstHousing1,"admin");
	 assertFalse(c);
	
}
}
