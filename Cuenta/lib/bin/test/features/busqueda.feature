#Autor: maria.cala@sophossolutions.com
Feature: Crear una cuenta bancaria
  Yo como automatizador quiero crear una cuenta bancaria
  
  Scenario: Crear una cuenta bancaria en la pagina
    Given Deseo ir a la pagina "https://parabank.parasoft.com/parabank/index.htm"
    When Ingreso credenciales "john,demo"
    Then Muestro estado de cuenta y verifico
   