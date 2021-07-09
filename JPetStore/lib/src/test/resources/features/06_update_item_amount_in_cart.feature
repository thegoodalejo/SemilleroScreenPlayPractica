#Author: valentina.correa@sophossolutions.com
@UpdateItemAmountInCart

Feature: Update item amount in cart on JPetStore
  I as an automator want to update item amount in cart on JPetStore

  Background:    
    Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
    When A random animal is added to the cart
    Then Validate that picked animal is in the cart

  Scenario: Update item amount in cart on JPetStore
    Given I am in the shopping cart page
    When I modify the amount of the first animal in the cart to 3
    Then Validate the new item amount in the cart
    And Validate that the total costs are correct
