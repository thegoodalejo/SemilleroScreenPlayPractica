#Author: juan.ugarriza@sophossolutions.com
@RemoveAnimalFromCart
Feature: Remove animal from cart
	I as an automator want to remove an animal from the shopping cart

Scenario Outline: Remove animal from cart
	Given Navigate to shopping cart page
	When Validate that item ID <Item ID> is present
	Then Delete item with ID <Item ID>
	
	Examples:
		| Item ID    |
		| "FI-SW-01" |
