#Author: valentina.correa@sophossolutions.com
@AddAnimalToCart
Feature: Add animal to cart at JPetStore
  I as an automator want to add animal to cart at JPetStore
  
  Background: Log in on JPetStore
  	Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
    And Navigate to log in page
    When Enter username "autosophos100" and password "contraGrupo4"
    Then Validate successful login

  Scenario: Add animal to cart at JPetStore
    Given I am at the homepage
    When A random animal is added to the cart
    Then Validate that picked animal is in the cart
    