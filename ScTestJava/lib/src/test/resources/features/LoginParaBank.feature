#Author: santiago.espinal@sophossolutions.com

Feature: Login en ParaBank 
  Yo como automatizador deseo iniciar sesion en ParaBank 

  Scenario: Iniciar sesion en ParaBank
    Given Debe  ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
    When Ingresa el usuario "garry" con password "demo"
    Then valida si esta en la pagina de bienvenida
