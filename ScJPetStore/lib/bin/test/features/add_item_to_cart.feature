#Author: angel.vivas@sophossolutions.com
Feature: Agregar item al carrito de compra
  Yo como automatizador quiero agregar un item al carrito de compra

  Background: 
    Given I want to go to the website "https://petstore.octoperf.com/actions/Account.action"
    When I enter username "MariaSophos" password "1234"
    Then I verify that i have logged in

  Scenario Outline: Agregar item al carrito
    Given Deseo seleccionar un item
    When Elijo una categoria <categoria> un producto <producto> y un item <item>
    Then Valido el carrito

    Examples: 
      | categoria | producto | item  |
      | dogs      | K9-BD-01 | EST-6 |
#      | DOGS      | 'K9-BD-01' | 'EST-7' |
