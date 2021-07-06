#Author: elber.ceballos@sophossolutions.com
Feature: Add Pet To Shopping Cart
  As a tester i want to add pet to shopping cart
  
  Background:
		Given I want Login in "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When I assing "pepito" "123"
    Then I verify that the login is successful

  Scenario: Add Pet To Shopping Cart
    Given I want search pet type "FISH"
    And Select pet breed "Angelfish" 
    When decide the pet by the description "Large"   
    Then I verified that the pet is in the shopping cart
