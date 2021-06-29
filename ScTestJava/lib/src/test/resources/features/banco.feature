#Author: andres.lopez@sophossolutions.com
Feature: Registrar una cuenta bancaria 
  yo como automatizador quiero ingresar a la pagina del Banco y registrar una cuenta

  Scenario: Registrar cuenta en Banco
    Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
    When Ingreso nombre de usuario "john" y password "demo"
    And  Registrar una nueva cuenta "SAVINGS"
    Then Valido que la cuenta fue creada
