@regression
Feature: Logged user could add different products to Wishlist
  Background: user open browser and open home page
    Given user open the home page

  Scenario: user could add different products to Wishlist
    When user choose the product
    And user add the product to the wishlist
    And user choose another product and add it to wishlist

    Then the selected products are found in the wishlist