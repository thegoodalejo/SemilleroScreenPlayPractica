#Author: santiago.espinal@sophossolutions.com

Feature: Crear una cuenta de ahorros
  I wish to automate the creation of a new savings account

	Background:
    Given Debe  ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
    When Ingresa el usuario "garry" con password "demo"
    Then valida si esta en la pagina de bienvenida
	
  Scenario: Crear una cuenta de ahorros
    Given Debe estar en la pagina de crear cuenta nueva
    When Debe la cuenta ser de ahorros con un numero aleatorio
    Then Debe ver el numero de la cuenta en la tabla




