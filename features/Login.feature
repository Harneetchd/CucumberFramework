Feature: Login Scenarios of SalesForce Application
@RegressionScenario
Scenario: Login into Saleforce Application with valid usernme and clear password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Clear the Textbox "Password" " "
And Click on Button "Login"
Given User gets "Error Message"

@SmokeScenario 
Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Enter into Textbox "Password" "Hello@1234"
And Click on Button "Login"
Given User is on "HomePage"

@RegressionScenario @Sanity
Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Enter into Textbox "Password" "Hello@1234"
But Click on Checkbox "RememberMe" 
And Click on Button "Login"
Given User is on "HomePage"
When User Clicks dropdown "UserMenuDropdown"
Then User Clicks logout "Logout"
Given User is on "LoginPage"

Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "123"
Then Enter into Textbox "Password" "22131"
And Click on Button "Login"
Given User gets "Error Message"

