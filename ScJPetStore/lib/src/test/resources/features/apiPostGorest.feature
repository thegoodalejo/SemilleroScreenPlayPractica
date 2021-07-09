#Author: angel.vivas@sophossolutions.com
Feature: Post With Authentification in GoRest
  I as an automatizer
  I want to Automate a POST api
  To validate the result is successful

  Scenario: Api post validation
    Given "Angel Vivas" sets an url "https://gorest.co.in/"
    When he requests to the endpoint "public-api/users/" and id "37"
    Then he should validate that the status code is "200" and user
