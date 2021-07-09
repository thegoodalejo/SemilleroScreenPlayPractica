#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com
Feature: Login for a user
  I want to start the session of a certain user

  Scenario: User login
    Given Navigate to the page "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Login with the user "JuanSantiago" and password "1234"
    Then Observe the login page
