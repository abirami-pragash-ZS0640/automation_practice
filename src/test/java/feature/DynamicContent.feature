Feature: Dynamic Content Loading

  Scenario: Verify dynamic content changes on refresh
    Given user open the dynamic content page
    When  capture the content and refresh the page
    Then the content should be different
