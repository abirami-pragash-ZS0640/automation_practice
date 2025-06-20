
@tag
Feature: Add Elements
 

  @tag1
  Scenario: Clicking the add elements
    Given user is on the index page
    When users clicks the addElements Link
    And user clicks AddElementButton
    Then element is visible

  @tag2
  Scenario Outline: Delete the added element
    Given user is on the index page
    When users clicks the addElements Link
    And user clicks AddElementButton
    And user clicks the delete button
    Then element is invisible

