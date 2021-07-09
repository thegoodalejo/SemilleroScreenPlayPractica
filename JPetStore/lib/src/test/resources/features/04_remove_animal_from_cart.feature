#Author: juan.ugarriza@sophossolutions.com
@RemoveAnimalFromCart
Feature: Remove animal from cart
  I as an automator want to remove an animal from the shopping cart

	Background:
		Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
    When A random animal is added to the cart
    Then Validate that picked animal is in the cart

  Scenario: Remove animal from cart
    When Delete item from cart
		Then Validate if the cart is now empty
		