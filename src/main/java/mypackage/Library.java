package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Library {

	private boolean status;
	
	private static final Logger LOGGER = Logger.getLogger(Library.class.getName());
	 protected static final List<Book>book=new ArrayList<>() ;
	 private static  String[] tokens;
	 protected static final List<User>user=new ArrayList<>() ;
	
	
	
	
	public void sets(String string, String string2) {
		
		for (User u:user) 
	       {
	    	   if((u.getUname().equalsIgnoreCase(string))&&(u.getPassword().equalsIgnoreCase(string2)))
	    	   {
	    		  u.setStatus("true");
	    		 
	    		
	    	   }
	    	   
	       }
		
	}
	public boolean gets() {
		
		return status;
		
	}
	

	public boolean logout(boolean status) {
		if(status)
		{
			this.status=false;
			  LOGGER.log(Level.INFO,"Logout succesfully");

			
		}
		return this.status;
		
	}
	
	public boolean login(boolean status) {
		if(status)
		{
			this.status=true;
			 LOGGER.log(Level.INFO,"Login succesfully");
			
		}
		return this.status;
		
	}
	
	public boolean addbook(boolean status2, String title, String auther, String iSBN, String signature) {

		
		
		if(status2)
		{
			Book addbook = new Book () ;
			boolean valid=checkingisbn(iSBN);
        	   if(valid)
        	   {
			
	         addbook.setisbn(iSBN);
	      
	         addbook.settitle(title);
	         addbook.setauther(auther);
	         addbook.setsignature(signature);
	         
	        
	         
	       for (Book item:book) 
	       {
	    	   if( checkbook(addbook, item))
	    	   {
	    		   LOGGER.log(Level.INFO,"Book is already exist");
	    	   
	    	 
	    	   }
	       
	    	   else
	       { book.add( addbook);
	       
	        LOGGER.log(Level.INFO,"Book is added");
	            
	         
	      }
	       }
		
	   
			return true;
        	   }
        	   else {
        		   LOGGER.log(Level.INFO,"please inter right isbn");
       			
       			return true;
       		}
        	   }
		
		
		else
		{
			   LOGGER.log(Level.INFO,"you should login first!!");
			
			return false;
		}
		
		
	}
	private boolean checkbook(Book addbook, Book item) {
		return addbook.getisbn().equalsIgnoreCase(item.getisbn());
	}

	private boolean checkingisbn(String iSBN) {
		int sumation = 0;
	      int num = 0;
	     int number=Integer.parseInt(iSBN);

		for(int i=0;i<10;i++)
		{
			num=number%10;
			sumation+=((i+1)*num);
number=number/10;
		}
		 return(sumation % 11 == 0);
	 
		
		
	}

	public boolean search(String string, String substring) {
		
        	int count=0;
                	for (Book item :book)
                	{

  				      
  				              	if (string.equalsIgnoreCase("title"))
  				              	{
  				              		String title =item.gettitle();
  				              	String auther =item.getauther();
  				              String isbn =item.getisbn();
  				            String sign =item.getsignature();
  				              	String tt=title.toLowerCase();
  				               String  tok=substring.toLowerCase();
  				             boolean  flag= tt.contains(tok);
  				            		 
  				    
  				                 return ( extracted(title, auther, isbn, sign, flag));
  				              	}    

  				              	if (string.equalsIgnoreCase("isbn"))
  				              	{
  				              		String title =item.gettitle();
  				              	String auther =item.getauther();
  				              String isbn =item.getisbn();
  				            String sign =item.getsignature();
  				              	String is=isbn.toLowerCase();
  				               String tok=substring.toLowerCase();
  				             boolean  flag= is.contains(tok);
  				            		 
  				
  				           return ( extracted(title, auther, isbn, sign, flag));
  				                
  				              	}    
  				              	
  				              	
  				              if (string.equalsIgnoreCase("signature"))
				              	{
				              		String title =item.gettitle();
				              	String auther =item.getauther();
				              String isbn =item.getisbn();
				            String sign =item.getsignature();
				              	String signature=sign.toLowerCase();
				               String tok=substring.toLowerCase();
				             boolean  flag= signature.contains(tok);
				            		 
				         
				             return ( extracted(title, auther, isbn, sign, flag));
				                
				              	}    
  				              	
  				              if (string.equalsIgnoreCase("auther"))
				              	{
				              		String title =item.gettitle();
				              	String auther =item.getauther();
				              String isbn =item.getisbn();
				            String sign =item.getsignature();
				              	String auth=auther.toLowerCase();
				               String  tok=substring.toLowerCase();
				             boolean  flag= auth.contains(tok);
				            		 
				        
				             return ( extracted(title, auther, isbn, sign, flag));
				                
				              	}    
		
	}
                	
                	
                	
                	if(count==1)
                	{
                		return true;
                		
                		}
                	if(count>1)
                	{
               	            LOGGER.log(Level.INFO,"there is more than one book that satisfy criteria \r\n"); 
                		return true;
                		
                		}
       
                	else
                	{
                		 LOGGER.log(Level.INFO,"No books match the criteria\r\n"); 
                	
                		return false;
                	}
                	
                	
                	
                	
                	}
	private boolean extracted(String title, String auther, String isbn, String sign, boolean flag) {
  	  if (flag) {
    	  LOGGER.info(title);
    	 LOGGER.info(auther);
    	 LOGGER.info(isbn);
    	 LOGGER.info(sign);
    	 return true;
  	  }
  	  else
  		 return false;
    	 
	}

	public void adduser(String status2, String uname, String pword) {
		User u = new User () ;
        u.setStatus(status2);
        u.setUname(uname);
        u.setPassword(pword);
        user.add( u);
	}

	public boolean loginadmin(String uname1, String pword1) {
		
		 for (User u:user) 
	       {
	    	   if((u.getUname().equalsIgnoreCase(uname1))&&(u.getPassword().equalsIgnoreCase(pword1)))
	    	   {
	    		  u.setStatus("true");
	    		  LOGGER.log(Level.INFO,"Login succesfully"); 
	    		
	    		  return true;
	    	   }
	    	   
	       }
		  LOGGER.log(Level.INFO,"Check your password"); 
		
		return false;
	}

	public boolean checklogin(String string, String string2) {
		boolean f;
		 for (User u:user) 
	       {
	    	   if((u.getUname().equalsIgnoreCase(string))&&(u.getPassword().equalsIgnoreCase(string2)))
	    	   {
	    		  
	    		 f=u.getStatus();
	    		 if(f)
	    			{
	    			
	    				return true;
	    			}
	    		 
	    	   }
	    	   
	       }
		
		
			 
			 return false;
		 
	}

	public boolean logoutadmin(String s, String s1) {
		 for (User u:user) 
	       {
	    	   if((u.getUname().equalsIgnoreCase(s))&&(u.getPassword().equalsIgnoreCase(s1)))
	    	   {
	    		  
	    	u.setStatus("false");
	    	  LOGGER.log(Level.INFO,"Logout succesfully"); 
	    	
	    			return true;
	    			}
	    		 
	    	   }
		 return false;
	    	   
	       }
	public static String[] getTokens() {
		return tokens;
	}
		
	
	
	
}