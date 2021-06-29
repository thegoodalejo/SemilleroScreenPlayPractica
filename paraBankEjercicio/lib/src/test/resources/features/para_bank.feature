#Author: juan.blanco@sophossolutions.com
Feature: Comprobar la creacion de un nuevo usuario

  Scenario Outline: Creacion de un nuevo usuario
    Given Ingresar a <url> y hacer login con <user> <password>
    When Hacer el proceso de creacion capurar el dato generado
    Then Validar que exista el dato

    Examples: 
      | url                                              | user | password |
      | https://parabank.parasoft.com/parabank/index.htm | john | demo     |
