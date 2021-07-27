#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com
Feature: Try removing an animal from the cart
  I as an operator want to remove an animal from the cart

  Background: User login
    Given Navigate to the page "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Login with the user "JuanSantiago" and password "1234"
    Then Observe the login page
    And Must go to animal catalogs
    And Must select an animal randomly
    And Observe the selected animal in the cart

  Scenario: Remove an animal from the cart
    Given Must go to cart
    When You must select an animal from the cart at random to upgrade
    Then Validate the updated price
