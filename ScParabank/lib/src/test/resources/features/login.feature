#Author: juan.ugarriza@sophossolutions.com

Feature: Abrir una cuenta bancaria en Parabank
Yo como automatizador quiero ingresar a la pagina Parabank y agregar una nueva cuenta

Background: Iniciar sesion en Parabank
Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
When Ingreso nombre de usuario "john" y password "demo"
Then Valido que haya iniciado sesion satisfactoriamente

Scenario: Crear una nueva cuenta
Given Voy a la pagina de creacion de cuentas
When Abro una cuenta "SAVINGS" con un saldo inicial de 16230
And Valido que el mensaje de apertura sea {string}
Then Vuelvo al menu principal
And Valido que la cuenta haya sido abierta
