Feature: add book
 

 
 Scenario Outline: adding abook when the admin is logged in
 
Given  the admin is logged in and add book with  <title> and with <auther> and with  <isbn> and  with  <Signature>
When the admin want to add a book
Then adding book succesfuly 

Examples:

|title|auther|isbn|Signature|
|"javafx"|"khaled kareem"|"0140449116"|"kareem2011"|
|"javascript"|"emad omar"|"0198526636"|"omar1975"|
|"javaprogrmaing"|"neck noah"|"1861972717"|"noah2005"|
|"Test-Drivenest Driven Development"|"Kent Beck"|"0716703440"|"Beck2002"|
|"c++"|"addison jack"|"0140449117"|"jack2010"|


Scenario Outline: adding abook when the admin is notlogged in 
Given  the admin is not logged in and add book with <title> and with <auther> and with  <isbn> and  with  <Signature>
 
When the admin want to add a book
Then cant add book 
Examples:

|title|auther|isbn|Signature|
|"javafx"|"khaled kareem"|"0140449116"|"kareem2011"|
|"javascript"|"emad omar"|"0198526636"|"omar1975"|
|"javaprogrmaing"|"neck noah"|"1861972717"|"noah2005"|
|"Test-Drivenest Driven Development"|"Kent Beck"|"0716703440"|"Beck2002"|
|"c++"|"addison jack"|"0140449117"|"jack2010"|
