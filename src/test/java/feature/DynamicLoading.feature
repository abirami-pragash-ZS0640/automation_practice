Feature: Dynamic Loading Functionality

  	Scenario Outline: dynamic loading for hidden element
    Given User is on the heroku webpage for dynamic loading
    When User navigates to dynamic loading page
    And User clicks on element on page that is hidden
    Then User should see the hello world element
    
    Scenario Outline: dynamic loading for new element
    Given User is on the heroku webpage for dynamic loading
    When User navigates to dynamic loading page
    And User clicks on element rendered after the fact
    Then User should see the hello world element