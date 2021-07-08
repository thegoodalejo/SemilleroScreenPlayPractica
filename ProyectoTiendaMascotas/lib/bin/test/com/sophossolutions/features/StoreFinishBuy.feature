#Author: jonathan.castro@sophossolutions.com
Feature: Finish purchase of pets
  As a tester, I want to finish a purchase of pets for to test billing

  Background: 
    Given I want Login in "https://petstore.octoperf.com/actions/Account.action"
    When I assing "pepito" "123"
    Then I verify that the login is successful

  Scenario Outline: Finish purchase of pets
    Given I want finish the purchase of pet <type> <breed> <description>
    When the pets are in the shopping cart, I finish the purchase
    Then I verify that the invoice matches what was entered

    Examples: 
      | type          | breed            | description |
      | FISH-REPTILES | Angelfish-Iguana | Large-Green |
