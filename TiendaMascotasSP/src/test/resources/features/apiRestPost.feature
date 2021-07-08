#Author: gupor 5
Feature: Uso de API con metodo POST
  Yo como automatizador quiero probar Apis

  Scenario: Registrar usuario con metodo POST
    Given Deseo realizar un registro en la API "https://reqres.in/"
    When Enviar los datos a la API "api/register"
      | email    | eve.holt@reqres.in |
      | password | pistol             |
    Then Verificar que la respuesta sea un 200