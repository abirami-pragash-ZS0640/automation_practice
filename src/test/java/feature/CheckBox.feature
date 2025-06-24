Feature: Clicking Checkbox Functionality

  Scenario Outline: User selects an option by clicking the checkbox
    Given User is on the heroku webpage for checkbox
    When User navigates to checkboxes page
    And User clicks on the check box
    Then User should see the check box got ticked