Feature: Validate images on the webpage

  Scenario: All images should be loaded without any broken links
    Given user is on Broken Image page
    When I get all image elements on the page
    Then each image should return a 200 status code
