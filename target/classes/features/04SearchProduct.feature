@regression
Feature: Logged User could search for any product
  Background: user open browser and go to home page
    Given user navigates to the home page

    Scenario: user could search for any product
      When user enter a product name in search box
      And user click on search button

      Then user find the product