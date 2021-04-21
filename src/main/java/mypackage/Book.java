package mypackage;

public class Book {

	private String isbn;
	private String tiTLE ;
	private String myAuthor ;
	private String signature ;
	private boolean borrowed;
	private String z ="un defined";
	public Book () {
		    
		this.setisbn("0000000000");
		this.settitle(z);
		this.setauther(z);
		this.setsignature(z);
	this. setborrowed(false );
		
	}
	
	
	
	 
public void  setisbn(String isbn) {
	this.isbn=isbn;
	
}
public void  settitle(String title) {
	
	this.tiTLE=title;
	
}
public void  setauther(String auther) {
	this.myAuthor=auther;
	
}
public void  setsignature(String signature) {
	this.signature=signature;
	
}
public void  setborrowed(boolean brwd) {
	this.borrowed=brwd;
	
}
	
	
public String getisbn()
{
	return isbn;
	
}
public String gettitle()
{
	return tiTLE ;
	
}
public String getauther()
{
	return myAuthor;
	
}
public String getsignature()
{
	return signature;
	
}

public String getborrow()
{
	if (borrowed)
			
  		return "not Available";
  		else 
  			return"Available"; 
	
}


}