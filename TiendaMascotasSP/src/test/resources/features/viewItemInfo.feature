#Author: grupo_5
Feature: Verificar ficha tecnica del animal 
  Como grupo de automatizacion se quiere verificar la ficha tecnica del animal
 
Background:  
		Given Acceder a la pagina de la tienda "https://petstore.octoperf.com/actions/Catalog.action"

  Scenario: Quiero ver la ficha tecnica del animal 
    Given Estando en la pagina de inicio deseo seleccionar una especie "dogs"
    When Deseo seleccionar un producto "K9-PO-02" y selecionar un item "EST-8"
    Then Quiero verificar la informacion de la ficha tecnica del animal 
