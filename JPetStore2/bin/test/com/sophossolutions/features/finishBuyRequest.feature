#Author: valentina.correa@sophossolutions.com
Feature: Finalizar compra en JPetStore
  yo como automatizador quiero probar la funcionalidad de agregar animal al carrito en la pagina JPetStore

  Background: 
    Given Deseo ir a la pagina "https://petstore.octoperf.com/actions/Catalog.action"
    When Agrego un animal al carrito de compras
    Then Valido que muestre el mensaje "Shopping Cart"

  Scenario: Finalizar compra en JPetStore
    Given Deseo ir a la pagina "https://petstore.octoperf.com/actions/Catalog.action"
    When Finalizo compra
    Then Valido que la orden de compra muestre "Order #"
