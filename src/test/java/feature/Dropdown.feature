
Feature: Dropdown Functionality

  Scenario Outline: User selects an option in the drop down
    Given User is on the heroku webpage for drop down
    When User navigates to drop down page
    And User clicks on first option
    Then User should see that option is selected