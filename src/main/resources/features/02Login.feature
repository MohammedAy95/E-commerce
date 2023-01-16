@regression
Feature: user should be able to login to the system
  Background: user open browser and go to login page
    Given user navigates to login page

  #Test Scenario1
  Scenario: user login with valid email and password
    When user enter "mohammed56@yahoo.com" and "123456"
    And user click on login button

    Then user could login successfully and go to home page

