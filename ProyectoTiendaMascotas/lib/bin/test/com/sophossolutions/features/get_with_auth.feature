#Author: jonathan.castro@sophossolutions.com


Feature: Get with authentificathion
  I want as a tester
  automate get api test
  to validate the result is successful

  Scenario: Geth with authentificathion
    Given "GrupoUno" wants to get users from "https://gorest.co.in/"
    When he required users in the endpoint "public-api/users/" and with status "Inactive"
    Then I validate that the users have "Inactive" status
