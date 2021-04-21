Feature: admin login 

Scenario Outline: adding users
 
Given  the users with <status> and with <uname> and with  <password> 
When the user want to login

Examples:

|status|uname|password|
|"flase"|"lama"|"1234"|
|"false"|"admin"|"123"|
|"false"|"hanan"|"254"|

 Scenario: admin can log in with valid credential
 
Given the admin username is "admin" and password is "123"
When the admin login 
Then admin login succesfully

Scenario: admin can not log in with valid credential
 
 Given the admin username is "admin" and wrong password is "1234"
When the admin login 
Then admin login unsuccesfully