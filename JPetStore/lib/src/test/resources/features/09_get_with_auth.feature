#Author: valentina.correa@sophossolutions.com
Feature: Obtener con autenticaci�n
  Quiero automatizar una API GET para validar el resultado exitoso

  Scenario: Obtener con autenticaci�n
    Given Que "Grupo 4" quiere realizar la consulta en la api "https://gorest.co.in/"
    When Solicita el endpoint "public-api/users" y el genero "Female"
    Then Valida que la respuesta tenga status 200
