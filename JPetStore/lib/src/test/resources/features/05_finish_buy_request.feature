#Author: juan.ugarriza@sophossolutions.com
#Overview: Create order and make sure the info matches
@FinishBuyRequest
Feature: Finish buy request on JPetStore
  I as an automator want to finish a buy request on JPetStore

  #Background: Agregar animal al carrito
  Scenario Outline: Finish buy request on JPetStore
    Given At least one item is present in the cart
    And Go to checkout page
    When Choose card type <Card Type> with number <Card Number> and date <Card Expiry Date>
    And Validate that billing details match account information
    And Confirm order information
    Then Validate that receipt information matches order
    
    Examples:
    	| Card Type    | Card Number     | Card Expiry Date |
      | "MasterCard" | 123456789123456 | "06/26"					|
