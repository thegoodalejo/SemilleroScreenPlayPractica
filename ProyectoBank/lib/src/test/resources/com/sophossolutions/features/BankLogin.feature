#Author: jonathan.castro@sophossolutions.com
Feature: Login to bank
  As a tester I wante to automate the bank login
  
  Scenario: Login to bank
    Given I want login in "https://parabank.parasoft.com/parabank/index.htm"
    When I assing "john-demo"
    Then I verify that the login is successful
