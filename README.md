# WorldLineTask4
# Selenium-Cucumber Excel Data Provider Project

This project demonstrates how to use Apache POI for Excel integration with Selenium and Cucumber to provide test data from an Excel sheet for testing the login feature of a web application.

## Prerequisites

Ensure you have the following software installed:

- Java Development Kit (JDK)
- Maven
- WebDriver (ChromeDriver in this case)
- IDE (Eclipse, IntelliJ, etc.)

## Files:
- `Features/Login.feature`: Cucumber feature file defining scenarios for login testing.
- `Features/Login.java`: Step definitions for the login feature.
- `Task4/ExcelReader.java`: Utility class for reading data from an Excel sheet.

##Configuration
Make sure to update the pom.xml file with the appropriate dependencies.
Adjust the file paths in the code according to your project structure.
Ensure that ChromeDriver is installed and its path is correctly set in the system properties.
Modify the Excel file path and sheet name in the test code according to your requirements.
