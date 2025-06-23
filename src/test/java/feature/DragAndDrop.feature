Feature: Drag and Drop Functionality


Scenario: Drag and drop an element successfully
  Given user open the Drag and Drop page
  When user drag the source element and drop it onto the target
  Then the source element should be dropped successfully
