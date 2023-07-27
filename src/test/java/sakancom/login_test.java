package sakancom;

import static org.junit.Assert.*;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom1.*;

public class login_test {
	
	ArrayList <User> UserList = new ArrayList<User>();

@Given(": I have a username and a password from the user \\(admin\\/owner\\/tenant)")
public void i_have_a_username_and_a_password_from_the_user_admin_owner_tenant() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	


	
}



///////////////////////////////////////
@When("The username begin with \\(owner) word and username and password is correct .")
public void the_username_begin_with_owner_word_and_username_and_password_is_correct() {
	String experimental=Main.login("ownerOmar","123");
	}
@Then("i can log in the system as an owner and The owner menu will appear")
public void i_can_log_in_the_system_as_an_owner_and_the_owner_menu_will_appear() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();

	String experimental=Main.login("ownerOmar","123");
	String actual="owner";
	 assertTrue(experimental.equals(actual));
	

}


@When("The username begin with \\(owner) word and username is  correct and password not correct  .")
public void the_username_begin_with_owner_word_and_username_is_correct_and_password_not_correct() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	String experimental=Main.login("ownerOmar","159");

}
@Then("The login menu will appear again")
public void the_login_menu_will_appear_again() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();

	String experimental=Main.login("ownerOmar","159");
	String actual="owner";
	 assertFalse(experimental.equals(actual));
	


}


@When("The username begin with \\(owner) word and username is not correct  .")
public void the_username_begin_with_owner_word_and_username_is_not_correct() {
	
	String experimental=Main.login("Ownersami","123");
	String actual="owner";
	assertFalse(experimental.equals(actual));
}

///////////////////////////////////////

@When("The username begin with \\(admin) word and username and password is correct .")
public void the_username_begin_with_admin_word_and_username_and_password_is_correct() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	String experimental=Main.login("adminAhmad","159");

	

}
@Then("i can log in the system as an admin and The owner menu will appear")
public void i_can_log_in_the_system_as_an_admin_and_the_owner_menu_will_appear() {
	String experimental=Main.login("adminAhmad","159");
	String actual="admin";
	 assertTrue(experimental.equals(actual));
	
}


@When("The username begin with \\(admin) word and username is  correct and password not correct  .")
public void the_username_begin_with_admin_word_and_username_is_correct_and_password_not_correct() {
	String experimental=Main.login("adminAhmad","155");
}

@When("The username begin with \\(admin) word and username is not correct  .")
public void the_username_begin_with_admin_word_and_username_is_not_correct() {
	String experimental=Main.login("adminAhmad","155");
	String actual="admin";
	 assertFalse(experimental.equals(actual));
	
}


///////////////////////////////////////////////////////////////////////////
@When("The username begin with \\(tenant) word and username and password is correct .")
public void the_username_begin_with_tenant_word_and_username_and_password_is_correct() {
	String experimental=Main.login("tenantNajeh45","951");
}

@Then("i can log in the system as an tenant and The owner menu will appear")
public void i_can_log_in_the_system_as_an_tenant_and_the_owner_menu_will_appear() {
	String experimental=Main.login("tenantNajeh45","456");

	String actual="tenant";
	 assertTrue(experimental.equals(actual));
}

@When("The username begin with \\(tenant) word and username is  correct and password not correct  .")
public void the_username_begin_with_tenant_word_and_username_is_correct_and_password_not_correct() {
	String experimental=Main.login("tenantNajeh45","9351");
	String actual="tenant";
	 assertFalse(experimental.equals(actual));
	
}

@When("The username begin with \\(tenant) word and username is not correct  .")
public void the_username_begin_with_tenant_word_and_username_is_not_correct() {
	String experimental=Main.login("TenantNajeh","951");
	String actual="tenant";
	 assertFalse(experimental.equals(actual));
	
}

@When("the user is not signed up")
public void the_user_is_not_signed_up() {
	String experimental=Main.login("Najeh","147");
	String actual="tenant";
	 assertFalse(experimental.equals(actual));
	
}

@Then("then no menu will appear")
public void then_no_menu_will_appear() {
	String experimental=Main.login("Najeh","147");
	String actual="none";
	 assertTrue(experimental.equals(actual));
	
}
}