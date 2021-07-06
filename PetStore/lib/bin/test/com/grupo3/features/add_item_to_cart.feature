#Author: julian.espitaleta@your.domain.com


Feature: Title of your feature
  I want to use this template for my feature file
	
	Background:
		Given Quiero iniciar sesion
    When Ingreso el usuario "qwertyasdf" y la contrasena "asdf"
    Then Deberia ver las opciones de usuario registrado
	
  Scenario: Agregar item a carrito
    Given Quiero agregar un item al carrito
    When Busco el item y lo agrego al carrito
    Then Deberia ver ese item en la lista de elementos del carrito
