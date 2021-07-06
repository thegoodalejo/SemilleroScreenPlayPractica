#Author: grupo 2
#        Angel Vivas, Maria Cala
Feature: Log into the website JPetStore
  I want as an automation  
  to log into JPetStore and
  validate that I have login

  Scenario: Log in to the website
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in
