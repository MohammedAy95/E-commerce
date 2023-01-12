@regression
Feature: Logged user could filter with color
  Background: user open browser and open shoes category page
    Given user open shoes category page

    Scenario: user could filter with color
    When user choose a color
      Then categories with the choosen color displayed