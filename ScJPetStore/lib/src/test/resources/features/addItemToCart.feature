#Author: Group2
Feature: Add item to shopping cart
  I as an automatizer want to add an item 
  to the shopping cart and validate 
  that my products appear in the cart.

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in

  Scenario: Add item to shopping cart
    When I add items to the cart
      | 0 | dogs,K9-RT-02,EST-23     |
      | 1 | reptiles,RP-SN-01,EST-12 |
    Then I valide my cart
