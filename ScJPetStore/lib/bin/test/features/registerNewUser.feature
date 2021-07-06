#Author: grupo 2
#        Angel Vivas, Maria Cala
Feature: Register a person on the website JPetStore
  I want as an automation to register a person on JPetStore
  to save their credentials and 
  then validate the form is filled

  Scenario Outline: Register a person on the website
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter the user credentials <credentials> account information <info>
    And favourite category <category>
    Then I should see the whole user information

    Examples: 
      | credentials        | info                                                                                            | category |
      | Group2,12345,12345 | Group2,Sophos,group2@sophossolutions.com,2785656,Colombia,Bogota,Bogota,0000,calle 24b,calle24c | CATS     |
