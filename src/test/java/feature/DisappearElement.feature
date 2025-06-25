Feature: Disappearing elements Functionality

  Scenario Outline: User checks for disappearing elements
    Given User is on the heroku webpage for disappearing elements
    When User navigates to disappearing elements page
    When User refreshes the page for atleast 5 times
    Then User should see that gallery element is disappeared
    
   