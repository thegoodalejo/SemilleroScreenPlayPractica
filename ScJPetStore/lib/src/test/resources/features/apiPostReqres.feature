#Autor: Group2
Feature: Registering a user with the Post method
  I want to make a post request to register a new user 
  and validate that they are registered

  Scenario: Registering a user
    Given I want to make a request in the api of type post "https://reqres.in/"
    When I send the information for the request "api/register"
      | email    | eve.holt@reqres.in |
      | password | pistol             |
    Then I validate the response has status 200 id "4" and token "QpwL5tke4Pnpja7X4"
