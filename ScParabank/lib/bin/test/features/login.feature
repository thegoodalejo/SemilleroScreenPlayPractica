#Author: juan.ugarriza@sophossolutions.com

Feature: Iniciar sesion en Parabank
	Yo como automatizador quiero iniciar sesion en la pagina Parabank

Scenario: Iniciar sesion en Parabank
	Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
	When Ingreso nombre de usuario "john" y password "demo"
	Then Valido que haya iniciado sesion satisfactoriamente
