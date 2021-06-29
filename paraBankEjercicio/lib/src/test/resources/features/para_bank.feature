#Author: juan.blanco@sophossolutions.com
Feature: Comprobar la creacion de un nuevo usuario

  Scenario Outline: Creacion de un nuevo usuario
    Given Ingresar a <url> y hacer login con <user> <password>
    When Hacer el proceso de creacion para la opcion <type> <number>
    Then Validar que exista el dato

    Examples: 
      | url                                              | user | password | type | number |
      | https://parabank.parasoft.com/parabank/index.htm | john | demo     |    0 |  13011 |
