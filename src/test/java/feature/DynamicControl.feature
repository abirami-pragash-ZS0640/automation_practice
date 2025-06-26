

Feature: Dynamic control
 
  Scenario: Remove the checkbox and verify it disappears
    Given user is on the Dynamic Controls page
    When user clicks the Remove button
    Then user should see the message "It's gone!"
    And the checkbox should no longer be present
    
  Scenario: Enable the input field
	  Given user is on the Dynamic Controls page
	  When user click the Enable button
	  Then the input field should be enabled
	  And the message "It's enabled!" should be displayed
   
