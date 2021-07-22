#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com
Feature: Try adding an animal to the cart
  I as an operator want to add an animal to the cart

  Background: User login
    Given Navigate to the page "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Login with the user "JuanSantiago" and password "1234"
    Then Observe the login page

  Scenario: Add an animal to the cart
    Given Must go to animal catalogs
    When Must select an animal randomly
    Then Observe the selected animal in the cart
