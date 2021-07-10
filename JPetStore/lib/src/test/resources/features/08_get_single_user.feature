#Author: valentina.correa@sophossolutions.com
Feature: Usuario unico metodo Get
 Quiero automatizar una API GET para validar el resultado exitoso

  Scenario: Usuario unico Get
    Given Que "Grupo 4" quiere realizar una consulta en la api "https://reqres.in/"
    When Solicito la informacion de un usuario con el endpoint "api/users/2"
    Then Valido que la respuesta tenga status 200 y contenga id "2"