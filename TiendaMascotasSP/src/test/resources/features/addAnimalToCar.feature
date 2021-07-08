#Author: grupo_5
Feature: Agreagr un animal al carrito de compras
  Como grupo de automatizacion se quiere agregar un animal al carrito de compras
  de la tienda de mascotas

  Scenario: Agregar un animal al carrito
    Given Estando en la pagina de inicio deseo seleccionar una especie de animal "cats"
    When Deseo seleccionar un producto "FL-DLH-02" y agregar el item "EST-17"
    Then Quiero verificar si quedo el item "EST-17" en el carrito
