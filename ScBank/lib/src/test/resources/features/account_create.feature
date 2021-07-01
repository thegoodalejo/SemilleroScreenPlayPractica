#Author: angel.vivas@sophossolutions.com

Feature: Creacion de una cuenta bancaria
	Yo como automatizador quiero crear una cuenta de ahorros en ParaBank

Background: 
	Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/"
	When Ingreso nombre de usuario "john" y password "demo"
	Then Valido el inicio de sesion


Scenario: Creacion cuenta de ahorro
	Given Deseo ir a la pagina de registro de cuentas "https://parabank.parasoft.com/parabank/openaccount.htm"
	When Registro una cuenta de ahorro
	Then Valido la nueva cuenta
