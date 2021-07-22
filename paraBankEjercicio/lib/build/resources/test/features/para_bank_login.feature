#Author: juan.blanco@sophossolutions.com
Feature: Verificar el login en paraBank
  Quiero implementar un login automatizado

  Scenario: Realizar el login en la pagina
    Given Quiero ir a la pagina "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC"
    When Usando las credenciales usuario "john" y clave "demo"
    Then Validar el acceso correcto a la pagina de usuario "Welcome"
