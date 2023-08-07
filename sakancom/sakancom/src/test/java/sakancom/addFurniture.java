package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class addFurniture {
	@Given("information about furniture")
	public void information_about_furniture() {
	}

	@When("the tenant want to add some furniture")
	public void the_tenant_want_to_add_some_furniture() {
	}

	@Then("the furniture should be added to this tenant.")
	public void the_furniture_should_be_added_to_this_tenant() {
		TENANT t1 = new TENANT("tenantNajeh45","05999999",19,"Comuter Engineering","yes");
		MAIN.tenantLinst.add(t1);
		equals( MAIN.addUsedFurniture("bed 100","tenantNajeh45")==  true);

	}

}
