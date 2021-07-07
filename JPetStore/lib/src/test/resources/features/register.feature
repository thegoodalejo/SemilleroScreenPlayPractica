#Author: juan.ugarriza@sophossolutions.com AND valentina.correa@sophossolutions.com

Feature: Register on JPetStore
	Yo como automatizador quiero registrarme en la pagina JPetStore

Scenario: Register on JPetStore
	Given Deseo ir a la pagina de "https://petstore.octoperf.com/actions/Catalog.action"
	When Navego a la pagina para registrarme
	And Ingreso los datos <User ID> como id, <Password> como contraseña, <First Name> como nombre, <Last Name> como apellido, <Phone> 
	Then Valido que me haya registrado satisfactoriamente
	
	Examples:
    	|     User ID    |    Password    |   First Name   |  Last Name   |                 Email                |  Phone  |
    	| "autosophos41" | "contraGrupo4" |    "grupo"     |   "cuatro"   |  "juan.ugarriza@sophossolutions.com" | "12345" |