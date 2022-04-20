Feature: User Registration
  Scenario: User Signs up successfully
    Given I am on the register page
    When I enter correct first name, last name, email, phone, country, state, zipcode, password, and confirm password
    And I click on the register button
    Then I should be able to register successfully
    And I close the browser
