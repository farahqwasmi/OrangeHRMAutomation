Feature: be able to add leave to orangeHRM site

  @Farah
  Scenario: As a  user I want to be able to add a leave
    Given Logged in user
    When Navigate to the leave page
    And Enter the leave mandatory fields
    Then Leave will be created successfully
    And Logout