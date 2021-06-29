#Author: angel.vivas@sophossolutions.com

Feature: Crear cuenta en Para Bank
yo como automatizador quiero crear una cuenta en Para Bank

Scenario: Iniciar sesion en Para Bank
Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/"
When Ingreso nombre de usuario "john" y password "demo"
Then Valido la cuenta creada
