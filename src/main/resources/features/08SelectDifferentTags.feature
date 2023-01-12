@regression
Feature: Logged user could select different tags
  Background: user open browser and open a category page
    Given user go to categories page

    Scenario: user could select different tags
      When user click on a tag
      Then a list of products of the selected tag displayed

      When user click on another tag
      Then a list of products of the new selected tag displayed