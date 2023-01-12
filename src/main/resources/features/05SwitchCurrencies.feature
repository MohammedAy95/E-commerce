@regression
Feature: Logged User could switch between currencies
  Background: user open browser and go to home page
    Given user navigates to home page

    Scenario: user could switch between currencies US-Euro
      When user click on currencies section
      And user choose the US Dollar currency

      Then the Dollar currency applied to the products

      When user click on currencies section1
      And user choose the Euro currency

      Then the Euro currency applied to the products
