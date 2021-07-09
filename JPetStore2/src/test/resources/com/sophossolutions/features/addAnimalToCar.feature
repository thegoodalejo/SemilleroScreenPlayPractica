#Author: valentina.correa@sophossolutions.com
Feature: Agregar animal al carrito en JPetStore
  yo como automatizador quiero probar la funcionalidad de agregar animal al carrito en la pagina JPetStore
  
  Background:
  	Given Deseo ir a la pagina "https://petstore.octoperf.com/actions/Catalog.action"
    When Ingreso nombre de usuario "autosophos44" y password "contraGrupo4"
    Then Valido que haya iniciado sesion satisfactoriamente

  Scenario: Agregar animal al carrito en JPetStore
    Given Que me mostro el mensaje "Welcome grupo!"
    When Agrego un animal al carrito de compras
    Then Valido que en la tabla este el ID Item
    