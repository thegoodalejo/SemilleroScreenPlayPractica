#Author: elber.ceballos@sophossolutions.com
Feature: Delete pet from shopping car
  As a tester
  I want to delete pet 
  To shopping cart

  Background: 
    Given I want Login in "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When I assing "pepito" "123"
    Then I verify that the login is successful

  Scenario Outline: Delete pet from shopping car
    Given I want search pet type <type>
    And Select pet breed <breed>
    When decide the pet by the description <description>
    And i delete the pet in the shopping cart <description>
    Then I verified that the pet is not in the shopping cart

    Examples: 
      | type     | breed     | description |
      | FISH     | Angelfish | Large       |
      | REPTILES | Iguana    | Green       |
      | DOGS     | Bulldog   | Male        |