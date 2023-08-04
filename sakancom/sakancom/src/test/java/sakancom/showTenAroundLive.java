package sakancom;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class showTenAroundLive {
	@Given("tenant is a Student")
	public void tenant_is_a_student() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("tenant is Student")
	public void tenant_is_student() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("show all  people who live in around him.")
	public void show_all_people_who_live_in_around_him() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();

//		tenant t1 = new tenant("tenantNajeh45","05999999",19,"Comuter Engineering","yes");
		//tenant t2 = new tenant("tenantNajeh44","05888888",30,"Doctor","no");
//		tenant t3 = new tenant("tenantNajeh43","05777777",21," MIS","yes");
//		tenant t4 = new tenant("tenantNajeh42","05666666",20,"Civil Engineering","yes");
//		Main.tenantLinst.add(t1);
//		Main.tenantLinst.add(t2);
//		Main.tenantLinst.add(t3);
//		Main.tenantLinst.add(t4);
		assertTrue(Main.ifTenIsStudent("tenantNajeh45"));

	}


}
