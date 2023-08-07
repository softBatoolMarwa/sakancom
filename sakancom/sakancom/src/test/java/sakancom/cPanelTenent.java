package sakancom;
import static org.junit.Assert.*;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class cPanelTenent {

@When("tenant request own Control Panel.")
public void tenant_request_own_control_panel() {
}

@Then("It will show His personal data,The name of the residence owner and his contact information,When the rent is paid \\(time to pay).")
public void it_will_show_his_personal_data_the_name_of_the_residence_owner_and_his_contact_information_when_the_rent_is_paid_time_to_pay() {
	TENANT t1 = new TENANT("tenantNajeh451","05999999",19,"Comuter Engineering","yes");
MAIN.tenantLinst.add(t1);

		HOUSE hh = new HOUSE();
		hh.setResidenceId(4);
		hh.setResidenceName("alsafa");
		hh.setLocation("nablus");
		hh.setFloorNum(3);
		hh.setApartmentNum(3);
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
		
		
		
		
		
		
		
		
		
		
	MAIN.acceptAndReject(1,h);


HOUSEANDTENANT TenHou = new HOUSEANDTENANT(43,"tenantNajeh451");
		MAIN.houseAndTennantlist.add(TenHou);


		
	equals( true==MAIN.tenantCpanel("tenantNajeh451") );

}
}
