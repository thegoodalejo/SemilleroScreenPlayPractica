#Author: julian.espitaleta@sophossolutions.com

Feature: Borrar un elemento del carrito
  Quiero automatizar la eliminación de un elemento del carrito

	Background:
		Given Quiero agregar un item al carrito
    When Busco el item y lo agrego al carrito
    Then Deberia ver ese item en la lista de elementos del carrito

  Scenario: Eliminar elemento del carrito
    Given Tengo al menos 1 elemento en mi carrito
    When Elija un elemento y presione su boton de eliminar
    Then Deberia ver que el elemento ya no esta en el carrito
