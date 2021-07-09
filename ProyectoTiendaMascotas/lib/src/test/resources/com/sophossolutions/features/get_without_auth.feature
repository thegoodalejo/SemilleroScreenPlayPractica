#Author: elber.ceballos@sophossolutions.com

Feature: Get without authentificathion
  I want as a tester
  automate get api test
  to validate the result is successful

  Scenario: Title of your scenario
    Given I want to get list of users from "https://reqres.in/"
    When he required users in the endpoint "api/users?page=" and page "2"
    Then I validate that the code 200 and are of page "2"

