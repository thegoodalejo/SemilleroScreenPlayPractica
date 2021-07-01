#Author: andres.guarnizo@sophossolutions.com
Feature: Abrir cuenta de ahorros y validar saldo
  Como aprendiz de automatizador quiero abrir una cuenta nueva 
  en ParaBank y validar que este abierta

  Background: 
    Given La pagina web del banco "https://parabank.parasoft.com/parabank/index.htm"
    When Ingreso usuario "john" y password "demo"
    Then Estoy en Home de la pagina

  Scenario: Abrir cuenta de ahorros nueva en ParaBank
    Given Estando en Home ingreso a crear una nueva cuenta
    When creo la cuenta Seleccionando tipo de cuenta y una cuenta previa
    Then Valido que la cuenta se haya creado con el saldo
