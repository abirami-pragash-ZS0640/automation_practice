Feature: Dynamic control

Background:
  Given user is on the Dynamic Controls page

Scenario: Remove the checkbox and verify it disappears
  When user clicks the Remove button
  Then user should see the message "It's gone!"
  And the checkbox should no longer be present

Scenario: Enable the input field
  When user click the Enable button
  Then the input field should be enabled
  And the message "It's enabled!" should be displayed

Scenario: Enable then disable the input field
  When user click the Enable button
  Then the input field should be enabled
  And the message "It's enabled!" should be displayed
  When user clicks the Disable button
  Then the input field should be disabled
  And the message "It's disabled!" should be displayed
