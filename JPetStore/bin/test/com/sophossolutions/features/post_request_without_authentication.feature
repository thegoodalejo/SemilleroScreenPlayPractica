#Author: juan.blanco@sophossolutions.com
Feature: POST Without Authentification
  I want as an automator
  Want to Automate a POST api
  To validate the login succesfull

  Scenario: Test Method Get in class
    Given "Juan Miguel" sets an url "https://reqres.in/"
    When he requests to the endpoint "api/users/" and
      | name | morpheus |
      | job  | leader   |
    Then he should validate that the name "morpheus" is correct
