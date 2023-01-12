@regression
Feature: Create successful Order
  Background: user open browser and go to login page
    Given user go to login page

    Scenario: Create successful Order
      When user could login successfully
      And user add a product to the shopping cart
      And go to shopping cart

      And user accept terms of service and press checkout
      And user fill his data to address and continue
      And user choose shipping method
      And user choose payment method and continue
      And user confirm order

      Then order completed
