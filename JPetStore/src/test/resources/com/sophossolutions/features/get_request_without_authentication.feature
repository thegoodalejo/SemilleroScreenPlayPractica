#Author: juan.blanco@sophossolutions.com
Feature: GET Without Authentification
  I want as an automator
  Want to Automate a GET api
  To validate the result is successful

  Scenario Outline: Test Method Get in class
    Given "Juan Miguel" sets an url "https://reqres.in/"
    When he requests to the endpoint "api/unknown/" and <user>
    Then he should validate that the status code is <response> want to verify that <name>
     

    Examples: 
      | user | response | name         |
      |    1 |      200 | cerulean     |
      |    2 |      200 | fuchsia rose |
      |    3 |      200 | true red     |
      |    5 |      404 | nombre       |
