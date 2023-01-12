@regression
Feature: Logged user could add different products to Shopping cart
  Background: user open browser and open home page
    Given user open home page

    Scenario: user could add different products to Shopping cart
      When user choose a product
      And user add the product to the shopping cart
      And user choose another product and add it to shopping cart

      Then the selected products are found in the shopping cart