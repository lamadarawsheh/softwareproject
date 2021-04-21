package package1;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypackage.Library;

public class searchstepstest {
    public boolean results;
	public String subtitle1;
	public String title1;
	
	public String subauther1;
	public String auther1;
	
	public String subisbn1;
	public String isbn1;
	
	
	public String subsignature1;
	public String Signature1;
	
	public String exsubstring1;
	public String exstring1;
public Library L1;
	
	public searchstepstest(Library L1) {
		
		this.L1=L1;
	}
	
	@Given("search for a book through {string} and with subtitle {string}")
	public void search_for_a_book_through_and_with_subtitle(String t, String st) {
		subtitle1=st;
		title1=t;
	}

	@When("there is a book has {string} as subtitle")
	public void there_is_a_book_has_as_subtitle(String string) {
		results= L1.search(title1,subtitle1);
	}


	@Then("show information of the book")
	public void show_information_of_the_book()
	{   Assert.assertEquals(true,results);
	
	}


@Given("search for a book through {string} and with substring of auther {string}")
public void search_for_a_book_through_and_with_substring_of_auther(String auther, String subau) {
	subauther1=subau;
	auther1=auther;
}

@When("there is a book has {string} as  substring of auther")
public void there_is_a_book_has_as_substring_of_auther(String string) {
	results= L1.search(auther1,	subauther1);
	
}


@When("there is a book has {string} as  substring of ISBN")
public void there_is_a_book_has_as_substring_of_ISBN(String string) {
	results= L1.search(isbn1,	subisbn1);
}

@Given("search for a book through {string} and with substring of ISBN {string}")
public void search_for_a_book_through_and_with_substring_of_ISBN(String isbn, String subis) {
  
	isbn1=isbn;
	subisbn1=subis;
	
}
	
@Given("search for a book through {string} and with substring of Signature {string}")
public void search_for_a_book_through_and_with_substring_of_Signature(String string, String string2) {
	subsignature1=string2;
	 Signature1=string;
}

@When("there is a book has {string} as  substring of Signature")
public void there_is_a_book_has_as_substring_of_Signature(String string) {
	results= L1.search(Signature1,	subsignature1);
}


@Given("search for a book through  {string} and wrong substring {string}")
public void search_for_a_book_through_and_wrong_substring(String string, String string2) {

	   exstring1=string;
	   exsubstring1=string2;
}

@When("there is no  book has  {string} as substring")
public void there_is_no_book_has_as_substring(String string) {
	results= L1.search(exstring1,	exsubstring1);
	
	
}

@Then("no corrosponding book")
public void no_corrosponding_book() {
	 Assert.assertEquals(false,results);
	
}

@Given("search for a books through  {string} and wrong substring {string}")
public void search_for_a_books_through_and_wrong_substring(String string, String string2) {
	exstring1=string;
	   exsubstring1=string2;
}

@When("there is more than one book has  {string} as substring")
public void there_is_more_than_one_book_has_as_substring(String string) {
	results= L1.search(exstring1,	exsubstring1);
}

@Then("show books information")
public void show_books_information() {
	 Assert.assertEquals(true,results);
	
}
@Given("search for a books through  {string} and wrong substring {string} and admin or user is logged in")
public void search_for_a_books_through_and_wrong_substring_and_admin_or_user_is_logged_in(String string, String string2) {
	exstring1=string;
	   exsubstring1=string2;
	   
}

@When("there is a book has  {string} as substring and the status for  user {string}")
public void there_is_a_book_has_as_substring_and_the_status_for_user(String string, String string2) {
	
	if(string2.equalsIgnoreCase("true")) {
	results= L1.search(exstring1,	exsubstring1);
}
}



	
}