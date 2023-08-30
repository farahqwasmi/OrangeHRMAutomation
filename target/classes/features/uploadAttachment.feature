Feature: be able to add a attachment to the Immigration section on my info page on  to orangeHRM site

  @Farah
  Scenario: As a  user I want to be able to upload attachment
    Given Logged in user
    When Navigate to the info page
    And Upload attachment
    Then Document will be uploaded successfully
    And Logout