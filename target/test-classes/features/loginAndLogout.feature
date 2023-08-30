Feature: Login into the orangeHRM site

  @Farahh
  Scenario: As a admin user I want to login into the admin portal
    Given The user navigate to login page
    When Enter creds
    And Click Login
    Then User should see the dashboard page
    And Logout
