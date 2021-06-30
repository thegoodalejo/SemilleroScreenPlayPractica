#Author: andres.lopez@sophossolutions.com
Feature: Hacer Login en la pagina bancaria
  yo como automatizador quiero ingresar a la pagina del Banco 


  Scenario: Hacer Login en la pagina bancaria
    Given Deseo ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
    When Ingreso nombre de usuario "john" y password "demo"
    Then Deberia mostrar la pagina principal 
