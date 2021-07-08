#Author: Group2
Feature: Checkout
   I want as an automatizer to finish the purchase 
   in JPetStore and validate if the invoice is correct

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in
    And I add items to the cart
      | 0 | dogs,K9-BD-01,EST-6 |
      | 1 | dogs,K9-BD-01,EST-7 |
    And I valide my cart 
    

  Scenario: Checkout in JPetStore 
    Given I want to complete my order
    When I confirm my data
    Then I validate the invoice data

    

