#Author: angel.vivas@sophossolutions.com
Feature: Agregar item al carrito de compra
  Yo como automatizador quiero agregar un item al carrito de compra

  Scenario Outline: Agregar item al carrito
    Given Deseo seleccionar un item
    When Elijo una categoria <categoria> un producto <producto> y un item <item>
    Then Valido el carrito

    Examples: 
      | categoria | producto   | item    |
      | DOGS      | 'K9-BD-01' | 'EST-7' |
#      | DOGS      | 'K9-BD-01' | 'EST-7' |
