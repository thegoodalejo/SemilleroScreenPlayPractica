#Author: Group2
Feature: Update item Ammount in shopping cart
  I as an automatizer want to add an item 
  to the shopping cart and validate 
  that my products appear in the cart.

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in
    
    When I add items to the cart
      | 0 | dogs,K9-BD-01,EST-6 |
    Then I valide my cart

  Scenario: Update item Ammount
    When I want to change the quantity of the itemId "EST-6" by "5"
    Then I valide my cart updated
