#Author: juan.blanco@sophossolutions.com
Feature: POST Without Authentification
  I want as an automator
  Want to Automate a POST api
  To validate the login succesfull

  Scenario Outline: Test Method Get in class
    Given "Juan Miguel" sets an url "https://reqres.in/"
    When he requests to the endpoint "/api/login" and 
    Then he should validate that the status is correct

