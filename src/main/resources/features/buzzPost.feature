Feature: User can add post to buzz

  @Farah
  Scenario: As a  user I want to add post to Buzz
    Given Logged in user
    When User navigate to buzz
    Then User can add post there
    And Logout