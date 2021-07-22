#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com
Feature:  Verify the cart information
  I as an operator want verify the cart information

  Background: User login
    Given Navigate to the page "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Login with the user "JuanSantiago" and password "1234"
    Then Observe the login page
    
  Scenario: Verify the cart information
    Given Must go to animal catalogs page
    When You must go to the page of a random animal
    Then Validate the information in the table
