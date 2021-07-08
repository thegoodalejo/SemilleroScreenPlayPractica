#Author: grupo_5

Feature: Se desea eliminar un item del carrito de compras
  Como grupo de automatizacion se quiere elimar item especifico
  que se encuentre dentro del carrito de compras

	Background: 
		Given Acceder a la pagina de la tienda "https://petstore.octoperf.com/actions/Catalog.action"
		And Estando en la pagina de inicio deseo seleccionar una especie de animal "cats"
    When Deseo seleccionar un producto "FL-DLH-02" y agregar el item "EST-17"
    Then Quiero verificar si quedo el item "EST-17" en el carrito

  Scenario: Eliminar un item agregado
    Given Estando en el carrito con el item agregado 
    When Deseo eliminar el item "EST-17"
    Then Quiero verificar que el item ya no esta en el carrito 
