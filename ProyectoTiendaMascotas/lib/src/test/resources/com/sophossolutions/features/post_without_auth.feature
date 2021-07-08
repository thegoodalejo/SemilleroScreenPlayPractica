#Author: elber.ceballos@sophossolutions.com

Feature: Login with user using method Post 
  As an tester 
  I want to Automate a Login using method POST api without auth	
  To validate the result is successful

  Scenario: Login a user
    Given I want to login in the api "https://reqres.in/"
    When Send the information of user to endpoint "api/login"
      | email    | eve.holt@reqres.in |
      | password | pistol             |
    Then Verify that api response contains status 200 and token "QpwL5tke4Pnpja7X4"
