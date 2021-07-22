#Author: juan.blanco@sophossolutions.com
Feature: Comprobar la creacion de un nuevo usuario

  Background: 
    Given Quiero ir a la pagina "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC"
    When Usando las credenciales usuario "john" y clave "demo"
    Then Validar el acceso correcto a la pagina de usuario "Welcome"

  Scenario: Creacion de un nuevo usuario
    Given Verificar que el estamos en en el Home "Welcome"
    When Realizar la creacion del nuevo usuario tipo "SAVINGS" y opcion 2
    Then Validar que exista la opcion en las cuentas creadas
