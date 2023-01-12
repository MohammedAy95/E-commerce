@regression
Feature: user should be able to register to the system
  Background: user open browser and go to registration page
    Given user navigates to registration page

    #Test Scenario1
Scenario: User could register with valid data
  When user choose his gender
  And user  enter his First name, Last name and email
  And user enter his Date of birth
  And user enter his company name
  And user enter a password and confirm password
  And user click on register button

  Then user registration completed successfully




