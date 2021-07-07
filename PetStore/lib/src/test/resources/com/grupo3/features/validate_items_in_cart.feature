#Author: julian.espitaleta@your.domain.com

Feature: Validar contenidos del carrito
  
  Background:
  	Given Quiero agregar un item al carrito
    When Busco 3 items y los agrego al carrito
    Then Deberia ver ese item en la lista de elementos del carrito
  
  Scenario: Validar información del carrito
    Given Tengo al menos 3 elementos en el carrito
    When Veo la informacion de los elementos en el carrito
    Then Deberia validar que la informacion es congruente
