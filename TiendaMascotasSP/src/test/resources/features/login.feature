#Author: andres.guarnizo@sophossolutions.com

Feature: Ingresar con credenciales a la pagina del banco
  Como aprendiz de automatizador quiero Loguearme
  en la pagina de ParaBank

  
  Scenario: Loguearme en la pagina de ParaBank
    Given La pagina web del banco "https://parabank.parasoft.com/parabank/index.htm"
    When Ingreso usuario "john" y password "demo"
    Then Estoy en Home de la pagina
