Feature: User Login
  Scenario: Successful Login
    Given I am on the login page
    When I enter correct email and password
    Then I should be able to login successfully
    And I close the browser