#Author: julian.rodriguez@sophossolutions.com
Feature: Try update cart
  I as an automation want to try update cart
  
	 
  Background: User login
    Given Navigate to the page "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Login with the user "JuanSantiago" and password "1234"
    Then Observe the login page
    And Must go to animal catalogs
    And Must select an animal randomly
    And Observe the selected animal in the cart

  Scenario: update cart
    Given Must go to cart
    When Debe seleccionar un animal del carrito aleatoriamente
    Then Validar la eliminacion del articulo 