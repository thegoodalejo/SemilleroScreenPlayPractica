#Author: grupo_5
Feature: POST With Authentification
  Like an automator
  I Want to Automate a POST api in gorest page
  To validate the result is successful

  Scenario: Send an POST to gorest with Authentification
    Given Sets an url "https://gorest.co.in/"
    When I want to create a new user on the endpoint "public-api/users/"
      | name   | Andres          |
      | email  | andres3@mail.com |
      | gender | Male            |
      | status | Active          |
    Then I should validate that the status code is 201
