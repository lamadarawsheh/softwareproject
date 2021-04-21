Feature: admin logout
 
Scenario: admin log out
 
Given the admin should be logged in the admin username is "admin" and password is "123"
When the admin call the logout function
Then admin logout succesfully