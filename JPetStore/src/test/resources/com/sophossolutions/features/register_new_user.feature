#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com
Feature: Probar el registro de un usuario
  Yo como automatizador quiero probar el registro de un usuario

  Scenario: registro de un usuario
    Given Debe estar en la url "https://petstore.octoperf.com/"
    When Debe ingresar la informacion <Informacion> 
    Then Debe estar la informacion en los campos
    |Informacion|
    |
