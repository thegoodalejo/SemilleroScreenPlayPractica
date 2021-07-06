#Author: julian.rodriguez@sophossolutions.com
Feature: Probar agregar un animal al carrito
  Yo como automatizador deseo agregar un animal al carrito

  Background: Inicio de sesion de un Usuario
    #Given Navegar a la pagina "https://petstore.octoperf.com/actions/Account.action?signonForm="
    #When Ingreso con el usuario "JuanSantiago" y clave "1234"
    #Then Observar la pagina inicio de sesion

  Scenario: Agregar un animal al carrito
    Given Debe ir a los catalogos de animales
    When Debe seleccionar un animal aleatoriamente
    Then Observar el animal seleccionado en el carrito
