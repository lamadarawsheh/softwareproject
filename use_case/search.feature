Feature: search book
 
Scenario: search for asubstring of the title
 
Given  search for a book through "title" and with subtitle "jav"
When there is a book has "jav" as subtitle
Then  show information of the book


 


Scenario: search for asubstring of the auther
 
Given  search for a book through "auther" and with substring of auther "noah"
When there is a book has "noah" as  substring of auther
Then  show information of the book



Scenario: search for asubstring of the ISBN
 
Given  search for a book through "ISBN" and with substring of ISBN "271"
When there is a book has "271" as  substring of ISBN
Then  show information of the book

Scenario: search for asubstring of the Signature
 
Given  search for a book through "Signature" and with substring of Signature "ck2"
When there is a book has "ah2" as  substring of Signature
Then  show information of the book


Scenario Outline: search for wrong substring 
 
Given  search for a book through  <string> and wrong substring <str>
When there is no  book has  <str> as substring 
Then  no corrosponding book 

Examples:
|string|str|
|"title"|"kh"|
|"auther"|"nabil"|
|"isbn"|"777"|
|"signature"|"fg75"|


Scenario Outline: search for more than one book
 
Given  search for a books through  <string> and wrong substring <str>
When there is more than one book has  <str> as substring 
Then  show books information 

Examples:
|string|str|
|"title"|"ja"|
|"auther"|"no"|
|"isbn"|"19"|
|"signature"|"20"|

Scenario Outline: search while loggingin
 
Given  search for a books through  <string> and wrong substring <str> and admin or user is logged in
When there is a book has  <str> as substring and the status for  user "true"
Then  show books information 

Examples:
|string|str|
|"title"|"ja"|
|"auther"|"no"|
|"isbn"|"19"|
|"signature"|"20"|