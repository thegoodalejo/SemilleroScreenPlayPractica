#Author: juan.blanco@sophossolutions.com
Feature: Inicio de sesion para un usuario
  Quiero iniciar la sesion de un usuario determinado

  Scenario: Inicio de sesion de un Usuario
    Given Navegar a la pagina "https://petstore.octoperf.com/actions/Account.action?signonForm="
    When Ingreso con el usuario "JuanSantiago" y clave "1234"
    Then Observar la pagina inicio de sesion
