#Author: juan.blanco@sophossolutions.com
Feature: Comprobar la creacion de un nuevo usuario

  Background: 
    Given Quiero ir a la pagina "https://parabank.parasoft.com/parabank/index.htm"
    When Usando las credenciales usuario "juan" y clave "demo"
    Then Validar el acceso correcto a la pagina de usuario "Welcome"

  Scenario: Creacion de un nuevo usuario
    Given Verificar que el estamos en en el Home "Welcome"
    When Realizar la creacion del nuevo usuario tipo "Savings" y opcion "5"
    Then Validar que exista la opcion en las cuentas creadas
