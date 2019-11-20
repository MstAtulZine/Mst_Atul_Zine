Feature: Functional Testing on Test me
Scenario: valid Login
Given User has launched testme app in browser
When User enters "Lalitha" and "Password123"
And click on login button
Then user must be logged in successfully