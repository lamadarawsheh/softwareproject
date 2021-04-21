package package1;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypackage.Book;
import mypackage.Library;

public class addstepstest {

	private String ISBN;
	private String Title ;
	private String Auther ;
	private String Signature ;
	public boolean  addstatus,status;
	public Library L1;
	public Book B1;
	
	public addstepstest(Library L1) {
		
		this.L1=L1;
	}
	
	

	@Given("the admin is logged in and add book with  {string} and with {string} and with  {string} and  with  {string}")
	public void the_admin_is_logged_in_and_add_book_with_and_with_and_with_and_with(String string, String string2, String string3, String string4) {
		status=true;
		 Title=string;
			Auther=string2;
			ISBN=string3;
			Signature=string4;

	}

	@Given("the admin is not logged in and add book with {string} and with {string} and with  {string} and  with  {string}")
	public void the_admin_is_not_logged_in_and_add_book_with_and_with_and_with_and_with(String string, String string2, String string3, String string4) {
	status=false;
		 Title=string;
			Auther=string2;
			ISBN=string3;
			Signature=string4;

	}


@When("the admin want to add a book")
public void the_admin_want_to_add_a_book() {
	
	addstatus=L1.addbook(status,Title,Auther,ISBN,Signature);
   
	
}

@Then("adding book succesfuly")
public void adding_book_succesfuly() {
  assertTrue(addstatus==true);
	
}




@Then("cant add book")
public void cant_add_book() {
	assertTrue(addstatus==false);
}


}