#Author: angel.vivas@sophossolutions.com

Feature: Ingrear al sistema ParaBank
	Yo como automatizador quiero iniciar sesion en ParaBank

Scenario: Iniciar sesion en Para Bank
	Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/"
	When Ingreso nombre de usuario "john" y password "demo"
	Then Valido el inicio de sesion
