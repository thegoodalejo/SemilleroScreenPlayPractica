#Author: jonathan.castro@sophossolutions.com

Feature: Create a new bank account
  As a tester I want to create a new bank account
  
  Scenario Outline: Create a new bank account
    Given I want to create a bank account on the site "https://parabank.parasoft.com/parabank/index.htm"
    When I assing <userdata>
    And Define the existing bank account <accountdata>
    Then I verify that account was created correctly

    Examples: 
      | userdata  | accountdata |
      | "john-demo" |    "SAVINGS-13122" |
   #   | name2 |     "" |
