#Author: angel.vivas@sophossolutions.com

Feature: Ingrear al sistema ParaBank
	Yo como automatizador quiero iniciar sesion en ParaBank

Scenario: Iniciar sesion en Para Bank
	Given Deseo ir a la pagina de "https://petstore.octoperf.com/actions/Account.action"
	When Ingreso nombre de usuario "MariaSophos" y password "1234"
	Then Valido el inicio de sesion
