@MaskData
Feature: Send sensitive information 
  

Scenario: Login into Appilcation
Given User is on "LoginPage"
When Enter into Textbox "Username" ""
Then Enter into Textbox "Password" ""
And Click on Button "Login"
Given User is on "HomePage"
