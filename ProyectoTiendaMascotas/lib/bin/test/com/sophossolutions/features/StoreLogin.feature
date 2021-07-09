#Author: jonathan.castro@sophossolutions.com

Feature: Login to the pet store
  As a tester 
  I want to automate login to the pet store
  To login successful 

  Scenario: Login to the pet store
    Given I want Login in "https://petstore.octoperf.com/actions/Account.action"
    When I assing "pepito" "123"
    Then I verify that the login is successful
