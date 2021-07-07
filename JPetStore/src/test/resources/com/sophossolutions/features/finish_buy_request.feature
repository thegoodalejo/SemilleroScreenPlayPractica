#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com

Feature: Verify the invoice information
  I as an operator want verify the invoice information

  Background: User login
    Given Navigate to the page "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Login with the user "JuanSantiago" and password "1234"
    Then Observe the login page
    And Must go to animal catalogs
    And Must select an animal randomly
    And Observe the selected animal in the cart

  Scenario: Remove an animal from the cart
    Given Must go to invoice
    When Must extract the information from the invoice
    Then Validate the date and generate id
