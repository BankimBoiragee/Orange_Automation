 Feature: Valid user able to login the application 
 Description: Valid user able to login the application with the valid credentials
 
 @Sanity
  Scenario: User able to login the application with the valid credentials
 Given User able to open any browser
 And  User able to enter the url "https://opensource-demo.orangehrmlive.com/"
 And  User able to enter the userName 
 And  User able to enter the password  
 When User able to click on the LOGIN button
 And  User able to click on the Paul Collings
 And User able to click on the Logout button
 Then User can verify the user information "Login" on the grid 
 

 
 
 