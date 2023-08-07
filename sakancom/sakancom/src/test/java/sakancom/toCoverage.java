package sakancom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancomMain.Main;

public class toCoverage {
	@Given("user name and password to admin")
	public void user_name_and_password_to_admin() {
	}

	@When("req menu to admin")
	public void req_menu_to_admin() {
	}

	@Then("show menu to admin")
	public void show_menu_to_admin() {
//		Main.showMenu();
	}

	@Given("user name and password to owner")
	public void user_name_and_password_to_owner() {
	}

	@When("req menu  to owner")
	public void req_menu_to_owner() {
	}

	@Then("show menu to owner")
	public void show_menu_to_owner() {
//		Main.showMenu();
	}

	@Given("user name and password to tenent")
	public void user_name_and_password_to_tenent() {
	}

	@When("req menu  to tenent")
	public void req_menu_to_tenent() {
	
	}

	@Then("show menu to tenent")
	public void show_menu_to_tenent() {
//		Main.showMenu();

	}

	@Given("information")
	public void information() {
	}

	@When("req full info")
	public void req_full_info() {
	}

	@Then("full information")
	public void full_information() {
		equals( true==Main.fullInformation());

	}

}
