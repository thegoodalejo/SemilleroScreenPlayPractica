#Author: julian.espitaleta@your.domain.com


Feature: Agregar Item a carrito
  Quiero automatizar el proceso de elegir un elemento y agregar al carrito
	
	Background:
		Given Quiero iniciar sesion
    When Ingreso el usuario "qwertyasdf" y la contrasena "asdf"
    Then Deberia ver las opciones de usuario registrado
	
  Scenario: Agregar item a carrito
    Given Quiero agregar un item al carrito
    When Busco 3 items y los agrego al carrito
    Then Deberia ver ese item en la lista de elementos del carrito
