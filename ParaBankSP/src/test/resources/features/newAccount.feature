#Author: andres.guarnizo@sophossolutions.com

Feature: Abrir cuenta de ahorros y validar saldo
  Como aprendiz de automatizador quiero abrir una cuenta nueva 
  en ParaBank y validar que este abierta

  
  Scenario: Abrir cuenta de ahorros nueva en ParaBank
    Given La pagina web del banco "https://parabank.parasoft.com/parabank/index.htm"
    When Ingreso usuario "john" y password "demo"
    Then Creo cuenta de ahorros nueva
    And Valido que este abierta
    And Imprimo el saldo disponible
