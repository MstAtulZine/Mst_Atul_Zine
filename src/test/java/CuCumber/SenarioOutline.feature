Feature: Demo on Scenario outLine examples

  Scenario Outline: Login for TestMe App
    Given User must be in login page
    When user enters "<unsername>" and "<password>" 
    And performs login
    Then User must be in home page

    Examples: 
      |username||password|
      |abc|| success |
      |xyz|| Fail    |