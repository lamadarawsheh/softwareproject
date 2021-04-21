package package1;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypackage.Library;
import mypackage.User;

public class logoutstepstest {

	
	public boolean  resultstatus;
	public boolean  status;
	public Library L1;
	public User U1;
	public String s;
	public String s1;
public logoutstepstest(Library L1, User U1) {
		
		this.L1=L1;
		this.U1=U1;
	}

@Given("the admin should be logged in the admin username is {string} and password is {string}")
public void the_admin_should_be_logged_in_the_admin_username_is_and_password_is(String string, String string2) {
	s=string;
	s1=string2;
}



	@When("the admin call the logout function")
	public void the_admin_call_the_logout_function() {
	 
		status=L1.checklogin(s,s1);
		if(status==true)
		{
			resultstatus=	L1.logoutadmin(s,s1);
		}
	}

	@Then("admin logout succesfully")
	public void admin_logout_succesfully() {
	   assertTrue(resultstatus);
	}
	
}