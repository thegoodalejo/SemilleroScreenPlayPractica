#Author: your.email@your.domain.com
Feature: Check the type of operation
  I want check the build of operation selected

  Background: 
    Given I want to go to page

  Scenario Outline: Check the build of operation selected
    Given I want to verify that i am on the home page
    When Select type of operation <buildType>
    Then I verify the respective option

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
      |         9 |
