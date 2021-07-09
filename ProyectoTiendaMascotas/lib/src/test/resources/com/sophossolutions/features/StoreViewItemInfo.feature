#Author: elber.ceballos@sophossolutions.com
Feature: View pet information
  As a tester,
  I want to add pet
  To shopping cart
  
  Background:
		Given I want Login in "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When I assing "pepito" "123"
    Then I verify that the login is successful

  Scenario Outline: View pet information
    Given I want search pet type <type>
    And Select pet breed <breed> 
    When I decide the pet by the description <description>
    Then I verify that show view item information
    
    Examples: 
      | type     | breed     | description |
      | FISH     | Angelfish | Large       |
      | REPTILES | Iguana    | Green       |
      | DOGS     | Bulldog   | Male        |