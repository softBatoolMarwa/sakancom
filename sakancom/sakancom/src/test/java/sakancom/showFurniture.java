package sakancom;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class showFurniture {

@Given("user name for tenant")
public void user_name_for_tenant() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("the tenant have some used furniture and he want to sell it")
public void the_tenant_have_some_used_furniture_and_he_want_to_sell_it() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("the furniture will appear.")
public void the_furniture_will_appear() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	tenant t1 = new tenant("tenantNajeh45","05999999",19,"Comuter Engineering","yes");
	tenant t2 = new tenant("tenantNajeh44","05888888",30,"Doctor","no");
	tenant t3 = new tenant("tenantNajeh43","05777777",21," MIS","yes");
	tenant t4 = new tenant("tenantNajeh42","05666666",20,"Civil Engineering","yes");
	Main.tenantLinst.add(t1);
//	System.out.println("t1");

	Main.tenantLinst.add(t2);
//	System.out.println("t2");

	Main.tenantLinst.add(t3);
//	System.out.println("t3");

	Main.tenantLinst.add(t4);
//	System.out.println("t4");
	Main.addUsedFurniture("bed 100","tenantNajeh45");

	assertTrue(Main.showUsedFurniture("tenantNajeh45"));

}

@When("the tenant have not some used furniture")
public void the_tenant_have_not_some_used_furniture() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@Then("nothing will appear.")
public void nothing_will_appear() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	assertFalse(Main.showUsedFurniture("tenantNajeh44"));

}

}
