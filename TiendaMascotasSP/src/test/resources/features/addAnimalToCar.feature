#Author: grupo_5
Feature: Agreagr un animal al carrito de compras
  Como grupo de automatizacion se quiere agregar un animal al carrito de compras
  de la tienda de mascotas

  Background: Hacer Login en la tienda de mascotas virtual
    Given Acceder a la pagina de la tienda "https://petstore.octoperf.com/actions/Catalog.action"
    When Ingreso usuario "TiendaMascotasGrupo_5" y password "grupo5"
    Then Estoy en Inicio de la pagina

  Scenario: Agregar un animal al carrito
    Given Estando en la pagina de inicio deseo selecionar una especie de animal "cats"
    When Deseo selecionar un producto "FL-DLH-02" y agregar el item "EST-17"
    Then Quiero verificar si quedo el item "EST-17" en el carrito
