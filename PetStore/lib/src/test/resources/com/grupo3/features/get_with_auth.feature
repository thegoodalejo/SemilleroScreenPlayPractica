#Author: your.email@your.domain.com

Feature: GET API para usuarios con autenticación
	Quiero automatizar las peticiones GET a la API usando autenticación

  Scenario: Pedir usuario a la API con GET
    Given Quiero hacer una peticion a la API "https://gorest.co.in/"
    When Pido el usuario con id "26" al endpoint "public-api/users/"
    Then Valido que la solicitud retorne con codigo 200 y con nombre "Washington Luis Cabral da Silva"
