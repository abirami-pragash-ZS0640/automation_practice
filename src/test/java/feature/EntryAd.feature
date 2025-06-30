Feature: Entry Ad Modal Window

    

  Scenario: Entry Ad modal appears on first load
  	Given user navigates to the Entry Ad page
    Then the modal window should be displayed
    And the modal message should be "THIS IS A MODAL WINDOW"

  Scenario: Close the Entry Ad modal
  	Given user navigates to the Entry Ad page
    When user clicks the Close button on the modal
    Then the modal window should not be displayed

  Scenario: Reload the page after closing modal
  	Given user navigates to the Entry Ad page
    When user clicks the Close button on the modal
    And user refreshes the page
    Then the modal window should not be displayed

  Scenario: Re-enable the Entry Ad modal
    Given user navigates to the Entry Ad page
    When user clicks the Close button on the modal
    When user clicks the "click here" link to re-enable the modal
    Then the modal window should be displayed
