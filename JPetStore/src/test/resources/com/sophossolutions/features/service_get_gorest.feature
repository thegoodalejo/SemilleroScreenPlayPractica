#Author: santiago.espinal@sophossolutions.com
Feature: Register user get method in https://gorest.co.in
  I as a automation i need to learn to consume APIs
   To automate requests

  Scenario: Have the name of a user by get 
    Given I want to register in the page api "https://gorest.co.in/"
    When he requests to the endpoint "public-api/users/" and id "1546"
    Then he should validate that the status code is "200"
    And Must see name "Santiago Espinal"
