package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	private boolean status;
		
	public static ArrayList<Book>book=new ArrayList<Book>();
	public static String[]tokens;
	public static ArrayList<User>user=new ArrayList<User>();
	
	
	
	public void main (String [] s)
	{
/*
		while(true) {
			System.out.println( "Enter your command please ....🙂" );
			System.out.printf(">");
			System.out.printf(" ");
			Scanner scanner = new Scanner(System.in);
		String command =scanner.nextLine();
		tokens =command.split(" ");
		/*	System.out.println(tokens.length );
			for (String token:tokens)
				System.out.println( token );
			 System.out.println( tokens[0] );
			
			// System.out.println(s ); 
			/*if (tokens.length <2)
				continue;*/
		/*
		String st=tokens[0];
			 boolean numeric =tokens[1]. matches("\\d+");
             if (numeric==false)
             {
            	 System.out.println( "please inter right isbn " );
            	 continue;
             }
             else {
			 if (st.equalsIgnoreCase("Add"))
					{  
				 if (tokens.length <2)
						{System.out.println( "not enough arguments " );
					 continue;
						}
				 
				 else {
					 
					 addbook();
					 
					 }
					}
			 
			 else if (tokens[0].equalsIgnoreCase("search"))
         	{	
             	if (tokens.length ❤)
				{System.out.println( "not enough arguments " );
				continue;
				}
			 
             	
 else {
					 
					search(tokens[1],tokens[2]);
					 
					 }
             	
			 }
             }
		}
	*/
}
	
	public void sets(String s,String string, String string2) {
		
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
		if(status ==true)
		{
			this.status=false;
			System.out.println( "Logout succesfully" );
		}
		return this.status;
		
	}
	
	public boolean login(boolean status) {
		if(status ==false)
		{
			this.status=true;
			System.out.println( "Login succesfully" );
		}
		return this.status;
		
	}
	public boolean addbook(boolean status2, String title, String auther, String iSBN, String signature) {
		
		
		
		if(status2==true)
		{
			Book addbook = new Book () ;
			boolean numeric =iSBN. matches("\\d+");
			boolean valid=checkingisbn(iSBN);
        	   if(valid==true)
        	   {
			
	         addbook.setisbn(iSBN);
	      
	         addbook.settitle(title);
	         addbook.setauther(auther);
	         addbook.setSignature(signature);
	          if (book.isEmpty())
	          {
	        	  book.add( addbook);
		            
		           System.out.println( "Book is added" );
	          }
	         
	         
	          else {
	        	  int flag = 0; 
	       for (Book item:book) 
	       {
	    	   if( addbook.getisbn().equalsIgnoreCase(item.getisbn()))
	    	   {
	    	   System.out.println("Book is already exist ");
	    	   flag=+1;
	    	   }
	       }
	       if (flag==0)
	       { book.add( addbook);
	            
	           System.out.println( "Book is added" );
	      }
	       }
		
	        /*  for (Book item:book) 
		       {
		    	   
		    	   System.out.println(item.getisbn());
		    	   
		       }*/
			return true;
        	   }
        	   else {
       			
       			System.out.println( "please inter right isbn " );
       			return true;
       		}
        	   }
		else
		{
			System.out.println("you should login first!!");
			return false;
		}
		
		
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
		if(sumation % 11 == 0)
	         return true;
		else
			 return false;
		
		
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
  				            String sign =item.getSignature();
  				              	String TITLE=title.toLowerCase();
  				               String TOKENS=substring.toLowerCase();
  				             boolean  flag= TITLE.contains(TOKENS);
  				            		 
  				         //   System.out.println(flag);
  				                  if (flag==true)
  				                	{ 
  				                	  System.out.print(++count +".");
  				                	 System.out.println(title);
  				                	 System.out.println(auther);
  				                	 System.out.println(isbn);
  				                	 System.out.println(sign);
  				                	 
  				                	}
  				                
  				              	}    

  				              	if (string.equalsIgnoreCase("isbn"))
  				              	{
  				              		String title =item.gettitle();
  				              	String auther =item.getauther();
  				              String isbn =item.getisbn();
  				            String sign =item.getSignature();
  				              	String ISBN=isbn.toLowerCase();
  				               String TOKENS=substring.toLowerCase();
  				             boolean  flag= ISBN.contains(TOKENS);
  				            		 
  				           // System.out.println(flag);
  				                  if (flag==true)
  				                	{ 
  				                	  System.out.print(++count +".");
  				                	 System.out.println(title);
  				                	 System.out.println(auther);
  				                	 System.out.println(isbn);
  				                	 System.out.println(sign);
  				                	 
  				                	}
  				                
  				              	}    
  				              	
  				              	
  				              if (string.equalsIgnoreCase("signature"))
				              	{
				              		String title =item.gettitle();
				              	String auther =item.getauther();
				              String isbn =item.getisbn();
				            String sign =item.getSignature();
				              	String signature=sign.toLowerCase();
				               String TOKENS=substring.toLowerCase();
				             boolean  flag= signature.contains(TOKENS);
				            		 
				           // System.out.println(flag);
				                  if (flag==true)
				                	{ 
				                	  System.out.print(++count +".");
				                	 System.out.println(title);
				                	 System.out.println(auther);
				                	 System.out.println(isbn);
				                	 System.out.println(sign);
				                	 
				                	}
				                
				              	}    
  				              	
  				              if (string.equalsIgnoreCase("auther"))
				              	{
				              		String title =item.gettitle();
				              	String auther =item.getauther();
				              String isbn =item.getisbn();
				            String sign =item.getSignature();
				              	String Auther=auther.toLowerCase();
				               String TOKENS=substring.toLowerCase();
				             boolean  flag= Auther.contains(TOKENS);
				            		 
				           // System.out.println(flag);
				                  if (flag==true)
				                	{ 
				                	  System.out.print(++count +".");
				                	 System.out.println(title);
				                	 System.out.println(auther);
				                	 System.out.println(isbn);
				                	 System.out.println(sign);
				                	 
				                	}
				                
				              	}    
		
	}
                	
                	
                	
                	if(count==1)
                	{
                		return true;
                		
                		}
                	if(count>1)
                	{System.out.println("there is more than one book that satisfy criteria \r\n");
                		return true;
                		
                		}
       
                	else
                	{
                		System.out.println("No books match the criteria\r\n");
                			
                		return false;
                	}
                	
                	
                	
                	
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
	    		  System.out.println( "Login succesfully" );
	    		  return true;
	    	   }
	    	   
	       }
		  System.out.println( "Check your password" );
		return false;
	}

	public boolean checklogin(String string, String string2) {
		boolean f;
		 for (User u:user) 
	       {
	    	   if((u.getUname().equalsIgnoreCase(string))&&(u.getPassword().equalsIgnoreCase(string2)))
	    	   {
	    		  
	    		 f=u.getStatus();
	    		 if(f==true)
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
	    	System.out.println( "Logout succesfully" );
	    			return true;
	    			}
	    		 
	    	   }
		 return false;
	    	   
	       }
		
	
	
	
}