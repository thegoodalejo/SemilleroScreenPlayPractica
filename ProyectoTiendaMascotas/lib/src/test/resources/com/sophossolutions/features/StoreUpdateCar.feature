#Author: jonathan.castro@sophossolutions.com
Feature: Update shopping cart in pet store
  As a tester, I want to modify the amounts of pets to verify its operation

  Background: 
    Given I want Login in "https://petstore.octoperf.com/actions/Account.action"
    When I assing "pepito" "123"
    Then I verify that the login is successful

  Scenario Outline: Update shopping cart in pet store
    Given I want search pet type <type>
    And Select pet breed <breed>
    When decide the pet by the description <description>
    And I assign <amount> pets to <type>
    Then I validate that the amounts are updated correctly

    Examples: 
      | type     | breed     | description | amount |
      | FISH     | Angelfish | Large       |      5 |
 #     | REPTILES | Iguana    | Green       |      2 |
 #     | DOGS     | Bulldog   | Male        |      3 |
