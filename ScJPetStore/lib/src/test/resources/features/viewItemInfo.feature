#Author: Group2
Feature: See animal information
  As an automatizer I want to see if 
  the animal view has an image 
  and a description.

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in

  Scenario: See animal information
  	When I select the item
      | 0 | dogs,K9-BD-01,EST-6 |    
    Then I valide if the item has an image
