#Author: grupo_5

Feature: Ingresar con credenciales a la tiende de mascotas
  Como grupo de automatizacion se quiere ingresar
  en la pagina de tienda de mascotas

  
  Scenario: Loguearse en la tienda de mascotas
    Given Acceder a la pagina de la tienda "https://petstore.octoperf.com/actions/Catalog.action"
    When Ingreso usuario "TiendaMascotasGrupo_5" y password "grupo5"
    Then Estoy en Inicio de la pagina
