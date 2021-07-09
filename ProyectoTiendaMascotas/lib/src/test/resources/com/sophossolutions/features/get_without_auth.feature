#Author: elber.ceballos@sophossolutions.com

Feature: Get without authentificathion
  As a tester
  I want automate get api test
  To validate the result is successful

  Scenario: Title of your scenario
    Given I want to get list of users from "https://reqres.in/"
    When he required users in the endpoint "api/users?page=" and page "2"
    Then I validate that the code 200 and are of page

