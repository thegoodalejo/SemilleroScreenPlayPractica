#Author: santiago.espinal@sophossolutions.com
Feature: Register user Post method in gorest.co.in
  I as a automation i need to learn to consume APIs
   To automate requests

  Scenario: Register a user with Post
    Given I want to register in the Api "https://gorest.co.in/"
    When he requests to the endpoint "public-api/users"
      | email  | santiagowe@gmail.com |
      | name   | Santiago Espi        |
      | gender | Male                 |
      | status | Active               |
    Then he should validate that the status code is "201"
    And Must see name "Santiago Espi"
