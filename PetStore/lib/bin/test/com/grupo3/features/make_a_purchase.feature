#Author: your.email@your.domain.com


Feature: Hacer una compra
  Quiero automatizar el proceso de generar una compra en el sistema
  Y poder validar sus resultados al finalizar
  
  Background:
  	Given Quiero agregar un item al carrito
    When Busco 3 items y los agrego al carrito
    Then Deberia ver ese item en la lista de elementos del carrito

  Scenario: Hacer una compra
    Given Tengo al menos 1 elementos en el carrito
    When Termino el proceso de compra
    And Ingreso la informacion pertinente
    Then Valido que la informacion de la factura sea congruente con la compra

