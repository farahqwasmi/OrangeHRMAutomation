Feature: Add admin user to orangeHRM site

  @Farah
  Scenario: As a  user I want to be able ot add a admin user
    Given Logged in user
    When Navigate to add user page
    And Enter all of user required data
    Then New admin user will be added successfully
    And Logout