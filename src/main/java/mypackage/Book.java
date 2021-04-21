package mypackage;

public class Book {

	private String ISBN;
	private String Title ;
	private String Author ;
	private String Signature ;
	private boolean Borrowed;
	
	public Book () {
		    
		this.setisbn("0000000000");
		this.settitle("un defined");
		this.setauther("un defined");
		this.setSignature("un defined");
	this. setborrowed(false );
		
	}
	
	
	
	 
public void  setisbn(String isbn) {
	ISBN=isbn;
	
}
public void  settitle(String title) {
	
	Title=title;
	
}
public void  setauther(String auther) {
	Author=auther;
	
}
public void  setSignature(String signature) {
	Signature=signature;
	
}
public void  setborrowed(boolean brwd) {
	Borrowed=brwd;
	
}
	
	
public String getisbn()
{
	return ISBN;
	
}
public String gettitle()
{
	return  Title ;
	
}
public String getauther()
{
	return Author;
	
}
public String getSignature()
{
	return Signature;
	
}

public String getborrow()
{
	if (Borrowed)
			
  		return "not Available";
  		else 
  			return"Available"; 
	
}


}