#Author: grupo_5

Feature: Actualizar la cantidad de un item del carrito de compras
  Como grupo de automatizacion se quiere actualizar la cantidad de un item especifico
  que se encuentre dentro del carrito de compras

	Background: 
		Given Acceder a la pagina de la tienda "https://petstore.octoperf.com/actions/Catalog.action"
		And Estando en la pagina de inicio deseo seleccionar una especie de animal "cats"
    When Deseo seleccionar un producto "FL-DLH-02" y agregar el item "EST-17"
    Then Quiero verificar si quedo el item "EST-17" en el carrito

  Scenario: Actualizar la cantidad de un item agregado
    Given Estando en el carrito con el item agregado
    When Deseo cambiar la cantidad del item "EST-17" a 5
    Then Quiero validar que el nuevo precio total de los items sea el correcto