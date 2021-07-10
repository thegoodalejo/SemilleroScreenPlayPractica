#Author: julian.rodriguez@sophossolutions.com

Feature: GET API sin autenticación
	Quiero automatizar las peticiones GET a la API sin autenticación

  Scenario: Solicitar la API con GET
    Given Quiero hacer una peticion a la API "https://reqres.in/"
    When Pidir el endpoint "api/unknown/2"
    Then Validar que la solicitud retorne el id 2

