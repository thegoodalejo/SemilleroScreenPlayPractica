#Author: grupo_5

Feature: Ingresar con credenciales a la tiende de mascotas
  Como aprendiz de automatizador quiero Loguearme
  en la pagina de ParaBank

  
  Scenario: Loguearme en la pagina de ParaBank
    Given La pagina web del banco "https://petstore.octoperf.com/actions/Catalog.action"
    When Ingreso usuario "TiendaMascotasGrupo_5" y password "grupo5"
    Then Estoy en Inicio de la pagina
