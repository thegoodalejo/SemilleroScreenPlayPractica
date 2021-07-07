#Author: angel.vivas@sophossolutions.com
Feature: Agregar item al carrito de compra
  Yo como automatizador quiero agregar un item al carrito de compra

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in

  Scenario: Ver informacion del item
  	When Selecciono item
      | 0 | dogs,K9-BD-01,EST-6 |    
    Then Valido la informacion
