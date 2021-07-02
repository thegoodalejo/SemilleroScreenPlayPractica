#Author: jonathan.castro@sophossolutions.com
Feature: Create a new bank account
  As a tester I want to create a new bank account

  Background: 
    Given I want login in "https://parabank.parasoft.com/parabank/index.htm"
    When I assing "john-demo"
    Then I verify that the login is successful

  Scenario Outline: Create a new bank account
    Given I want to create a new account
    When Define the existing bank account <accountdata>
    Then I verify that account was created correctly

    Examples: 
      | accountdata  |
      | "SAVINGS-5"  |
    #  | "CHECKING-3" |
   #   | "SAVINGS-10" |
