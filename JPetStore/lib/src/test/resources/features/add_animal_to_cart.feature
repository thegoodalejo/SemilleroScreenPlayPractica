#Author: juan.ugarriza@sophossolutions.com

Feature: Agregar animal al carrito
	Yo como automatizador quiero agregar un animal al carrito

Scenario: Agregar animal al carrito
	Given Voy a la pagina de la categoria de animales
	When Abro una cuenta "SAVINGS" con un saldo inicial de 16230
	And Valido que la apertura haya sido confirmada
	Then Vuelvo al menu principal
	And Valido que la cuenta haya sido abierta exitosamente