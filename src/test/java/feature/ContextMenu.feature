Feature: Context Menu Functionality

  Scenario Outline: User right clicks context menu and accepts the alert
    Given User is on the heroku webpage for context menu
    When User navigates to contextmenu page
    When User right clicks context menu 
    Then User should see the alert and respond to it
    
   