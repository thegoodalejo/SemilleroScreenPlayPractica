#Author: valentina.correa@sophossolutions.com
@AddAnimalToCart
Feature: Add animal to cart at JPetStore
  I as an automator want to add animal to cart at JPetStore
  
  Background: Log in on JPetStore
  	Given Open website "https://petstore.octoperf.com/actions/Catalog.action"

  Scenario: Add animal to cart at JPetStore
    When A random animal is added to the cart
    Then Validate that picked animal is in the cart
    