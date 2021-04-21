package package1;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypackage.Library;
import mypackage.User;

public class loginstepstest {

	public static String Uname ,pword,status;
	public  String Uname1 ,pword1,status1;
public boolean f;
	public Library L1;
	public User U1;
	public loginstepstest(Library L1, User U1) {
		
		this.L1=L1;
		this.U1=U1;
	}
	
	
	@Given("the users with {string} and with {string} and with  {string}")
	public void the_users_with_and_with_and_with(String string, String string2, String string3) {
	    status=string;
	    Uname=string2;
	    pword=string3;
	   
	}
	@When("the user want to login")
	public void the_user_want_to_login() {
	   L1.adduser(status,Uname,pword);
	}


	
	
	@Given("the admin username is {string} and password is {string}")
	public void the_admin_username_is_and_password_is(String username, String password) {
		Uname1=username;
		pword1=password;
	}


@When("the admin login")
public void the_admin_login() {
  f=  L1.loginadmin(Uname1,pword1);
}

	
	@Given("the admin username is {string} and wrong password is {string}")
	public void the_admin_username_is_and_wrong_password_is(String username, String password) {
		Uname1=username;
		pword1=password;
	}



	@Then("admin login succesfully")
	public void admin_login_succesfully() {
		
	  assertTrue(f);
	}
	@Then("admin login unsuccesfully")
	public void admin_login_unsuccesfully() {
	
	  assertTrue(!f);
	}
}