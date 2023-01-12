@regression
Feature: user could reset his password
  Background: user open browser and go to login page
    Given user navigates to the login page

  Scenario: user forget password
    When user click on forget password
    And user go to reset password page
    And user  enter his email and click recover button

    Then user get a recover mail successfully