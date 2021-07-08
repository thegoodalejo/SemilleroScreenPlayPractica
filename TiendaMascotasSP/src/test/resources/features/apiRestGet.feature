#Author: grupo_5

Feature: Practica utilizar Apis
  Yo como automatizador quiero probar una API

  Scenario: Deseo verificar la pagina reqre haciendo una peticion GET
    Given Deseo realizar peticiones a la API con url "https://reqres.in/"
    When Realizar la consulta GET a la url "api/users/2"
    Then Verificar que la respuesta sea un estatutus 200
