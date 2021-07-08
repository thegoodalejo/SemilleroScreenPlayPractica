#Author: grupo_5
Feature: Comprobar los datos en la orden de compra de la tienda de mascotas
  Como grupo de automatizacion se quiere realizar una orden de compra y verificar que los datos sean correctos 

Background:
	  Given Acceder a la pagina de la tienda "https://petstore.octoperf.com/actions/Catalog.action"
    When Ingreso usuario "TiendaMascotasGrupo_5" y password "grupo5"
    Then Estoy en Inicio de la pagina
   	Given Estando en la pagina de inicio deseo seleccionar una especie de animal "cats"
    When Deseo seleccionar un producto "FL-DLH-02" y agregar el item "EST-17"
    Then Quiero verificar si quedo el item "EST-17" en el carrito


Scenario: Quiero generar una orden de compra y verificar los datos 
    Given Estando en el carrito deseo proceder a generar la orden de compra
    When Continuar y confirmar con el proceso de generacion de orden 
    Then Espero ver los datos correspondientes a mi compra
  

