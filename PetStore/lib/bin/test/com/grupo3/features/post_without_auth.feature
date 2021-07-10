#Author: julian.rodriguez@sophossolutions.com
Feature: POST API sin autenticación
  Quiero automatizar las peticiones POST a la API sin autenticacion

  Scenario: Crear post de usuario con la API usando POST
    Given Quiero hacer una peticion a la API "https://reqres.in/"
    When Envio al endpoint "api/register" la info
      | "email"    | "eve.holt@reqres.in" |
      | "password" | "pistol"             |
    Then Valido que la solicitud POST retorne el codigo 200
