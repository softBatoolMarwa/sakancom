package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class showFurniture {

@Given("user name for tenant")
public void user_name_for_tenant() {
}

@When("the tenant have some used furniture and he want to sell it")
public void the_tenant_have_some_used_furniture_and_he_want_to_sell_it() {
}

@Then("the furniture will appear.")
public void the_furniture_will_appear() {
	TENANT t1 = new TENANT("tenantNajeh45","05999999",19,"Comuter Engineering","yes");
	TENANT t2 = new TENANT("tenantNajeh44","05888888",30,"Doctor","no");
	TENANT t3 = new TENANT("tenantNajeh43","05777777",21," MIS","yes");
	TENANT t4 = new TENANT("tenantNajeh42","05666666",20,"Civil Engineering","yes");
	MAIN.getTenantlinst().add(t1);

	MAIN.getTenantlinst().add(t2);

	MAIN.getTenantlinst().add(t3);

	MAIN.getTenantlinst().add(t4);
	MAIN.addUsedFurniture("bed 100","tenantNajeh45");

	equals( true==MAIN.showUsedFurniture("tenantNajeh45") );

}

@When("the tenant have not some used furniture")
public void the_tenant_have_not_some_used_furniture() {
}

@Then("nothing will appear.")
public void nothing_will_appear() {
	equals( true!=MAIN.showUsedFurniture("tenantNajeh44") );


}

}
