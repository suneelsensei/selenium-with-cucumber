Feature: opening the google browser

  Scenario: open the google and url
    Given open broswer
    When user enter the credentials
    And click on signIN
    Then Result is shown
