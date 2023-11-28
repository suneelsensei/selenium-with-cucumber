Feature: opening the google browser

  Scenario Outline: 
    open the google and url

    Given open chrome broswer
    When user enter the <username> and <password>
    And click on signin
    Then Result shown

    Examples: 
      | username | password  |
      | sharan   | Admin@123 |
      | sachinbm | Admin@123 |
