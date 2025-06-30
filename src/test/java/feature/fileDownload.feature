Feature: File Download Verification

  Scenario: Download a file and check its downloaded to the expected path
  
   	Given the user is on the file download page
    When the user clicks on the sample.txt link
    Then the file "sample.txt" should be downloaded successfully
