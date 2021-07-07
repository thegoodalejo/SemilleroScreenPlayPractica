#Author: juan.ugarriza@sophossolutions.com AND valentina.correa@sophossolutions.com

Feature: Iniciar sesion en JPetStore
	Yo como automatizador quiero iniciar sesion en la pagina JPetStore

Scenario: Iniciar sesion en JPetStore
	Given Deseo ir a la pagina de "https://petstore.octoperf.com/actions/Catalog.action"
	When Ingreso nombre de usuario "autosophos4" y password "gruppe4"
	Then Valido que haya iniciado sesion satisfactoriamente
