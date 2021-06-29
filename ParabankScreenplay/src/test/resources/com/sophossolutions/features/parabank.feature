#Author: julian.rodriguez@sophossolutions.com
Feature: Probar ingreso de registro de cuenta en ParaBank
  Yo quiero probar que puedo registrar una nueba cuenta en ParaBank

  Scenario: registrar cuenta en ParaNank
    Given Quiero ir a la pagina "https://parabank.parasoft.com/parabank/index.htm"
    When Ingrese con el usuario "john" y contrasena "demo"
    Then Registre la nueva cuenta "12345"
