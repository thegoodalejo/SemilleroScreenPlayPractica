#Author: juan.ugarriza@sophossolutions.com

Feature: Iniciar sesion en Parabank
Yo como automatizador quiero ingresar a la pagina Parabank

Scenario: Iniciar sesion en Parabank
Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
When Ingreso nombre de usuario "john" y password "demo"
And Abro una cuenta "SAVINGS" con un saldo inicial de 16230
And Vuelvo al accounts overview
Then Valido que la cuenta haya sido abierta
