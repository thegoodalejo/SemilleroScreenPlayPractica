#Author: angel.vivas@sophossolutions.com
Feature: Remover item del carrito de compra
  Yo como automatizador quiero remover un item del carrito de compra

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in 
    
    When Agrego items al carrito
      | 0 | dogs,K9-BD-01,EST-6 |
      | 1 | dogs,K9-BD-01,EST-7 |
    Then Valido el carrito
        
  Scenario: Remover item del carrito
    Given Deseo estar en el carrito
    When Deseo remover el item con id "EST-6"
    Then Verifico el carrito

 