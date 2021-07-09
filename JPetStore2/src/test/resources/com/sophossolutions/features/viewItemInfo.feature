#Author: valentina.correa@sophossolutions.com
Feature: Ver detalle de un animal en JPetStore
  yo como automatizador quiero probar la funcionalidad de agregar animal al carrito en la pagina JPetStore
  
  Scenario: Ver detalle de un animal en JPetStore
    Given Que estoy en la pagina "https://petstore.octoperf.com/actions/Catalog.action"
    When Ingreso al detalle de un animal
    Then Valido que el ID_ITEM sea el mismo en el detalle
    