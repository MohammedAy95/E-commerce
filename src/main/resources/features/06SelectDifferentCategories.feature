@regression
Feature:  Logged user could select different Categories
  Background: user open browser and go to home page
    Given user opens home page

    Scenario: user could select different Categories
      When user click on a category
      Then Electronics page opened
      And a list of sub-categories is displayed

      When user click on a sub-category
      Then the page of this sub-category is opened
      And sub-category components ar displayed
