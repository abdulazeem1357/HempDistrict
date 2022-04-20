Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    And User enters Email and Password
    Then login must be successful.