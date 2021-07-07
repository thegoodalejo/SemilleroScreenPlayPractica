#Author: juan.ugarriza@sophossolutions.com AND valentina.correa@sophossolutions.com

Feature: Registrarse en JPetStore
	Yo como automatizador quiero registrarme en la pagina JPetStore
# POR TERMINAR:
Scenario: Registrarse en JPetStore
	Given Deseo ir a la pagina de "https://petstore.octoperf.com/actions/Catalog.action"
	When Navego a la pagina para registrarme
	And Ingreso nombre de usuario "autosophos4" y password "gruppe4"
	Then Valido que me haya registrado satisfactoriamente
