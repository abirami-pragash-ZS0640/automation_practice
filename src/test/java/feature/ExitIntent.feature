Feature: Exit Intent Functionality

  	Scenario Outline: exit intent checking
    Given User is on the heroku webpage for exit intent
    When User navigates to exit intent page
    And User Mouse out of the viewport pane
    Then User should see a modal window appear
    
 