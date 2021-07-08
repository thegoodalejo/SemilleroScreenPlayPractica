#Author: angel.vivas@sophossolutions.com
Feature: Remove item from shopping cart
  I as an automator want to remove an item from 
  the shopping cart and validate that it no longer exists.

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in 
    When I add items to the cart
      | 0 | dogs,K9-BD-01,EST-6 |
      | 1 | dogs,K9-BD-01,EST-7 |
    Then I valide my cart
        
  Scenario: Remove item from cart
    Given I want to be in the cart
    When I want to remove the item with id "EST-6"
    Then I validate that i have removed the item

 