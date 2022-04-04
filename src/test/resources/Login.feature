Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters Email and Password
    And  Message displayed Login Successfully
    Then User Navigate to Home Page

#  Scenario: Login with invalid email and valid password
#    Given User is on Login Page
#    When User Navigate to
#    And User enter email and Password
#    Then Message displayed invalid email address

