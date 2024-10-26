Feature: Login scenarios


  Background:
    @site
   Given user can access HRMS portal

  @userName
   Scenario: : Incorrect login attempt userName
    When user attempts to login with an incorrect userName
    And user clicks on login button
    Then user can visibly see displayed error message errorMessage

  @password
Scenario:Incorrect login attempt password
    When user attempts to login with an incorrect password
    And user clicks on login button
    Then user can visibly see displayed error message errorMessage


