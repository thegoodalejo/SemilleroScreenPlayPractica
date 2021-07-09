#Author: jonathan.castro@sophossolutions.com
Feature: Post with authentification
  I want as a tester
  automate post api test
  to validate the result is successful

  Scenario: Post with authentification
    Given "GrupoUno" wants to post a user in "https://gorest.co.in/"
    When he required post a user in the endpoint "public-api/users/"
      | name   | jose                   |
      | gender | Female                 |
      | email  | saassspelllre@gmail.com |
      | status | Active                 |
    Then I verify that reponse contains status 200 and name "jose"
