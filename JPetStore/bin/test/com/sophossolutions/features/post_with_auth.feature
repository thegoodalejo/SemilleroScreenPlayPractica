#Author: julian.rodriguez@sophossolutions.com
Feature: Post With Authentification
  I want as an automator
  Want to Automate a POST api
  To validate the result is successful

  Scenario: Title of your scenario
    Given "Julian Rodriguez" sets an url "https://gorest.co.in/"
    When he requests to the endpoint "public-api/users" and id "2"
    Then he should validate that the status code is 200
