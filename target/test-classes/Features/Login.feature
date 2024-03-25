
Feature: Login to the website using data from Excel

  
  Scenario: Login with valid and invalid credentials
    Given User is on the login page
    When User enters "<SheetName>" and <RowNumber> from Excel
    And user clicks on login button
    Then User should be logged in successfully
    And Show successful message

Examples:

|SheetName|RowNumber|
|testdata|0|
|testdata|1|
|testdata|2|
|testdata|3|
|testdata|4|
|testdata|5|
|testdata|6|