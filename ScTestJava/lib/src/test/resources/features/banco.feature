#Author: andres.lopez@sophossolutions.com
Feature: Registrar una cuenta bancaria
  yo como automatizador quiero ingresar a la pagina del Banco y registrar una cuenta
  
  Background: Hacer Login en la pagina bancaria
    Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
    When Ingreso nombre de usuario "john" y password "demo"
    Then Deberia mostrar la pagina principal

  Scenario: Registrar cuenta en Banco
    Given Deseo acceder a la vista agregar nueva cuenta
    When Registrar una nueva cuenta "SAVINGS"
    Then Deberia encontrar la cuenta nueva
