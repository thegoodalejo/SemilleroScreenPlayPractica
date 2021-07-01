#Author: julian.rodriguez@sophossolutions.com

  Background: Registrar cuenta en ParaNank
    Given Quiero ir a la pagina "https://parabank.parasoft.com/parabank/index.htm"
    When Ingrese con el usuario "john" y contrasena "demo"
    Then Ir a la pagina de inicio

  Scenario: Registrar cuenta en Banco
    Given Quiero estar en la pagina que muestra las cuentas
    When Registrar nueva cuenta de tipo "SAVINGS"
    Then Deberia encontrar la nueva cuenta