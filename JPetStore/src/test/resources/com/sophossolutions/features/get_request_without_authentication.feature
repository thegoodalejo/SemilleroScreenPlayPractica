#Author: juan.blanco@sophossolutions.com
Feature: GET Without Authentification
  I want as an automator
  Want to Automate a GET api
  To validate the result is successful

  Scenario Outline: Test Method Get in class
    Given "Juan Miguel" sets an url "https://reqres.in/"
    When he requests to the endpoint "api/unknown/" and <user>
    Then he should validate that the status code is <response>

    Examples: 
      | user | response |
      |    1 |      200 |
      |    2 |      400 |
      |    3 |      200 |
      |    5 |      404 |
