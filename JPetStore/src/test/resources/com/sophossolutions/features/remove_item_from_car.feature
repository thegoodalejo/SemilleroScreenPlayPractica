#Author: julian.rodriguez@sophossolutions.com
Feature: Probar eliminar un animal del carrito
  Yo como automatizador deseo eliminar un animal del carrito
  
	 
  Background: Inicio de sesion de un Usuario
    Given Navegar a la pagina "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Ingreso con el usuario "JuanSantiago" y clave "1234"
    Then Observar la pagina inicio de sesion
    And Debe ir a los catalogos de animales
    And Debe seleccionar un animal aleatoriamente
    And Observar el animal seleccionado en el carrito

  Scenario: eliminar un animal del carrito
    Given Debe ir al carrito
    When Debe seleccionar un animal del carrito aleatoriamente
    Then Validar la eliminacion del articulo 