package sakancom;


import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancommain.*;

public class login {
	
	ArrayList <USER> UserList = new ArrayList<USER>();

@Given(": I have a username and a password from the user \\(admin\\/owner\\/tenant)")
public void i_have_a_username_and_a_password_from_the_user_admin_owner_tenant() {

}



@When("The username begin with \\(owner) word and username and password is correct .")
public void the_username_begin_with_owner_word_and_username_and_password_is_correct() {
	}
@Then("i can log in the system as an owner and The owner menu will appear")
public void i_can_log_in_the_system_as_an_owner_and_the_owner_menu_will_appear() {

	
	 equals( MAIN.login("ownerOmar","123") == "owner" );


}


@When("The username begin with \\(owner) word and username is  correct and password not correct  .")
public void the_username_begin_with_owner_word_and_username_is_correct_and_password_not_correct() {

}
@Then("The login menu will appear again")
public void the_login_menu_will_appear_again() {

	 equals( MAIN.login("ownerOmar","159")!="owner" );



}


@When("The username begin with \\(owner) word and username is not correct  .")
public void the_username_begin_with_owner_word_and_username_is_not_correct() {
	
	equals( MAIN.login("Ownersami","123")!="owner" );

}


@When("The username begin with \\(admin) word and username and password is correct .")
public void the_username_begin_with_admin_word_and_username_and_password_is_correct() {

	

}
@Then("i can log in the system as an admin and The owner menu will appear")
public void i_can_log_in_the_system_as_an_admin_and_the_owner_menu_will_appear() {

	 equals( MAIN.login("adminAhmad","159")=="admin" );
	 

	
}


@When("The username begin with \\(admin) word and username is  correct and password not correct  .")
public void the_username_begin_with_admin_word_and_username_is_correct_and_password_not_correct() {
}

@When("The username begin with \\(admin) word and username is not correct  .")
public void the_username_begin_with_admin_word_and_username_is_not_correct() {

	 equals( MAIN.login("adminAhmad","155")!= "admin");

	
}


@When("The username begin with \\(tenant) word and username and password is correct .")
public void the_username_begin_with_tenant_word_and_username_and_password_is_correct() {
}

@Then("i can log in the system as an tenant and The owner menu will appear")
public void i_can_log_in_the_system_as_an_tenant_and_the_owner_menu_will_appear() {
	
	 equals( MAIN.login("tenantNajeh45","456")=="tenant" );

}

@When("The username begin with \\(tenant) word and username is  correct and password not correct  .")
public void the_username_begin_with_tenant_word_and_username_is_correct_and_password_not_correct() {

	 equals( MAIN.login("tenantNajeh45","9351")!="tenant" );

	
}

@When("The username begin with \\(tenant) word and username is not correct  .")
public void the_username_begin_with_tenant_word_and_username_is_not_correct() {
	
	 equals( MAIN.login("TenantNajeh","951")!="tenant" );

	
}

@When("the user is not signed up")
public void the_user_is_not_signed_up() {
	
	 equals( MAIN.login("Najeh","147")!= "tenant");

	
}

@Then("then no menu will appear")
public void then_no_menu_will_appear() {

	 equals( MAIN.login("Najeh","147")=="none" );

	
}
}
