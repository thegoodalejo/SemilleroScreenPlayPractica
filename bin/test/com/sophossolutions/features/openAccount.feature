#Author: valentina.correa@sophossolutions.com
Feature: Abrir una cuenta en 	PARABANK
  yo como automatizador quiero abrir una cuenta en la pagina PARABANK

  Scenario Outline: Abrir una cuenta en 	PARABANK
    Given Que me logueo con el <usuario> y el <password> en la pagina "https://parabank.parasoft.com/parabank/index.htm"
    When Abro una cuenta con el <tipo_cuenta> y una <cuenta_existente>
    Then Valido que la cuenta este abierta

    Examples: 
      | usuario | password | tipo_cuenta | cuenta_existente |
      | "john"  | "demo"   | "SAVINGS"   | "12900"          |
