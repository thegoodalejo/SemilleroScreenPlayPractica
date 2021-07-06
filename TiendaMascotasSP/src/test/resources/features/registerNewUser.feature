#Author: andres.guarnizo@sophossolutions.com
Feature: Agregar un nuevo usuario al sistema 
  Como grupo de automatizador se quiere ingrear los datos de un nuevo usuario
  a la tienda de mascotas 
  
Background: Hacer Login en la pagina de la tienda de mascotas
    Given Acceder a la pagina de la tienda "https://petstore.octoperf.com/actions/Catalog.action"
  
Scenario: Abrir nueva cuenta de usuario 
    Given Deseo acceder a la opcion registrar nuevo usuario 
    When Deseo ingresar los datos del nuevo usuario 
    Then Deberia visualizar los datos en pantalla del nuevo usuario 
