Feature: user has to validate the login page of fb

  Scenario: To validate the login with vaild usename and invalid password
   
    When pass the values in username and password
    And click the login button
    Then user as navigate to error page
