#Autor: maria.cala@sophossolutions.com
Feature: Make a get request on the reqres web site 
  I as an automator want to perform a get request 
  on the reqres web page and validate 
  that the response is what I expect.

  Scenario: Make a get request
    Given I want to make an api request on "https://reqres.in"
    When I send the request "/api/users/" and id "2"
    Then I check that my response is 200 