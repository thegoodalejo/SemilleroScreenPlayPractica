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
    Given I want to select 5 pets
    When Update cart
    Then Validate the cost in the cart
