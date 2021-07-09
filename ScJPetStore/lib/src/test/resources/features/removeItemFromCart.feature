#Author: Group 2
Feature: Remove item from shopping cart
  I as an automatizer want to remove an item from 
  the shopping cart and validate that it no longer exists.

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in 
    When I add items to the cart
      | 0 | dogs,K9-RT-02,EST-23     |
      | 1 | reptiles,RP-SN-01,EST-12 |
    Then I valide my cart
        
  Scenario: Remove item from cart
    Given I want to be in the cart
    When I want to remove the item with id "EST-23"
    Then I validate that i have removed the item

 