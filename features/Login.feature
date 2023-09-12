Feature: Login Scenarios of SalesForce Application

Scenario: Login into Saleforce Application with valid usernme and clear password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Clear the Textbox "Password" "benihina1018@"
And Click on Button "Login"
Given User gets "Error Message"


Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Enter into Textbox "Password" "benihina1018@"
And Click on Button "Login"
Given User is on "HomePage"


Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Enter into Textbox "Password" "benihina1018@"
But Click on Checkbox "RememberMe" 
And Click on Button "Login"
Given User is on "HomePage"
When User Clicks dropdown "UserMenuDropdown"
Then User Clicks "Logout"
Given User is on "LoginPage"

Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "123"
Then Enter into Textbox "Password" "22131"
And Click on Button "Login"
Given User gets "Error Message"

