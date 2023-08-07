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
		tenant t1 = new tenant("tenantNajeh45","05999999",19,"Comuter Engineering","yes");
		Main.tenantLinst.add(t1);
		equals( Main.addUsedFurniture("bed 100","tenantNajeh45")==  true);

	}

}
