package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class acceptAndReject {

@Given("Advertisement of housing")
public void advertisement_of_housing() {
}

@When("Admin acceptance of the owners request to view the house")
public void admin_acceptance_of_the_owners_request_to_view_the_house() {
}

@Then("add house in ads and delete house from ad requests.")
public void add_house_in_ads_and_delete_house_from_ad_requests() {
	Housing firstHousing1 = new Housing (2,"alsafa" ,"nablus" ,3,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",2,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
boolean c=Main.acceptAndReject(1,firstHousing1);
equals( true==c );

}

@When("Admin reject of the owners request to view the house")
public void admin_reject_of_the_owners_request_to_view_the_house() {
}

@Then("Delete home from ad requests")
public void delete_home_from_ad_requests() {
	Housing firstHousing1 = new Housing (3,"alsafa" ,"nablus" ,3,300,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
	boolean c=Main.acceptAndReject(2,firstHousing1);
	equals( true!=c );
}


}
