package sakancom;
import static org.junit.Assert.*;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancomMain.*;

public class cPanelTenent {

@When("tenant request own Control Panel.")
public void tenant_request_own_control_panel() {
}

@Then("It will show His personal data,The name of the residence owner and his contact information,When the rent is paid \\(time to pay).")
public void it_will_show_his_personal_data_the_name_of_the_residence_owner_and_his_contact_information_when_the_rent_is_paid_time_to_pay() {
	tenant t1 = new tenant("tenantNajeh451","05999999",19,"Comuter Engineering","yes");
Main.tenantLinst.add(t1);
	equals( true==Main.tenantCpanel("tenantNajeh451") );

}
}
