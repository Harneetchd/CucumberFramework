Feature: Login Scenarios of SalesForce Application

@ValidScenario 
Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Enter into Textbox "Password" "benihina1018@"
And Click on Button "Login"
Given User is on "HomePage"
When User Clicks dropdown "UserMenuDropdown"
Then validate usermenu dropdown "ValidateUserMenuDropdown"


Scenario: Login into Saleforce Application with valid usernme and valid password.
Given User is on "LoginPage"
When Enter into Textbox "Username" "harneetkaur@capitalforce.com"
Then Enter into Textbox "Password" "benihina1018@"
And Click on Button "Login"
Given User is on "HomePage"
When User Clicks dropdown "UserMenuDropdown"
Then validate usermenu dropdown "ValidateUserMenuDropdown"
And user clicks on "MySettings"
Then user clicks on displaylayout "DisplayandLayout"
When user clicks "CustomizemyTabs"
Then user selects from Customapp "Salesforce Chatter"
Then user selects from Availabletabs "Reports"
Then user adds "Add"
And Click on Button "Save"

