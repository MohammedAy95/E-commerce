@regression
Feature: Logged user could add different products to compare list
  Background: user open browser and open home page
    Given user visit home page

  Scenario: user could add different products to compare list
    When user choose product
    And user add the product to the compare list
    And user choose another product and add it to compare list

    Then the selected products are found in the compare list