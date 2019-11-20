Feature: demo on use of tags in cucumber
  @First
  Scenario: Regression Testing
    Given User is testing for login functionalityn
    Then User is able to login Successfully

  @Second
  Scenario: System Testing
    Given User is testing the search functionality
    Then Search works successfully

  @Demo
  Scenario: Display the name of the tester
      Then "Mst" is the tester on TestME