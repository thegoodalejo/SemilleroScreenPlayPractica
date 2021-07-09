#Author: juan.ugarriza@sophossolutions.s
@FinishBuyRequest
Feature: Finish buy request on JPetStore
  I as an automator want to finish a buy request on JPetStore

  Background: Add animal to cart at JPetStore
  	Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
    And Navigate to log in page
    When Enter username "autosophos100" and password "contraGrupo4"
    Then Validate successful login
    Given I am at the homepage
    When A random animal is added to the cart
    Then Validate that picked animal is in the cart
    
  Scenario Outline: Finish buy request on JPetStore
    Given Go to checkout page
    When Choose card type <Card Type> with number <Card Number> and date <Card Expiry Date>
    And Confirm order information
    Then Validate that receipt information matches order
    
    Examples:
    	| Card Type    | Card Number       | Card Expiry Date |
      | "MasterCard" | "123456789123456" | "06/26"					|
