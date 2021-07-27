#Author: juan.blanco@gmail.com
Feature: Check calculator operations
  I want to check the menus of the calculator operations

  Background: 
    Given I want to go to page

  Scenario Outline: Check the build of operation selected
    Given I want to verify that i am on the home page
    When I select type of operation <buildType> operate two numbers
    Then I verify the operation result
    
    Examples: 
      | buildType |
      |         0 |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
      |         6 |
      |         7 |
      |         8 |
      |         9 |
