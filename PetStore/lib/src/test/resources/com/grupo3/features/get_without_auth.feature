#Author: your.email@your.domain.com

Feature: GET API sin autenticaci�n
	Quiero automatizar las peticiones GET a la API usando autenticaci�n

  Scenario: Solicitar la API con GET
    Given Quiero hacer una peticion a la API "https://reqres.in/"
    When Pidir el endpoint "api/users/"
    Then Validar que la solicitud retorne el codigo 200 y id 2

