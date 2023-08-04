package sakancom;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class addFurniture {
	@Given("information about furniture")
	public void information_about_furniture() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("the tenant want to add some furniture")
	public void the_tenant_want_to_add_some_furniture() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("the furniture should be added to this tenant.")
	public void the_furniture_should_be_added_to_this_tenant() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		tenant t1 = new tenant("tenantNajeh45","05999999",19,"Comuter Engineering","yes");
		Main.tenantLinst.add(t1);

		assertTrue(Main.addUsedFurniture("bed 100","tenantNajeh45"));
	}

}
