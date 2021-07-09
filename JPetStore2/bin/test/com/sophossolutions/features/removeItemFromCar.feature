#Author: valentina.correa@sophossolutions.com
Feature: Eliminar item agregado al carrito en JPetStore
  yo como automatizador quiero probar la funcionalidad de agregar animal al carrito en la pagina JPetStore
  
  Background:
 		Given Deseo ir a la pagina "https://petstore.octoperf.com/actions/Catalog.action"
    When Agrego un animal al carrito de compras
    Then Valido que muestre el mensaje "Shopping Cart"

  Scenario: Eliminar item agregado al carrito en JPetStore
    Given Deseo ir a la pagina "https://petstore.octoperf.com/actions/Catalog.action"
    When Elimino item agregado al carrito de compras
    Then Valido que el item ya no se encuentre en el carrito
    