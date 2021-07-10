#Author: julian.espitaleta@your.domain.com
Feature: POST API para posts de usuario con autenticación
  Quiero automatizar las peticiones POST a la API usando autenticacion
  Para crear posts de usuario

  Scenario: Crear post de usuario con la API usando POST
    Given Quiero hacer una peticion a la API "https://gorest.co.in/"
    When Envio la informacion de la publicacion al endpoint "public-api/users/26/posts"
    Then Valido que la solicitud retorne con codigo 201
