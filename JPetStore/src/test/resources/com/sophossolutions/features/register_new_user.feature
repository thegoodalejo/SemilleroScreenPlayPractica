#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com
Feature: Probar el registro de un usuario
  Yo como automatizador quiero probar el registro de un usuario

  Scenario: registro de un usuario
    Given Debe estar en la url "https://petstore.octoperf.com/actions/Account.action?newAccountForm="
    When Debe ingresar la informacion "JuanSantiago,1234,BlancoEspinal,BlancoEspinal@gmail.com,3013020432,address1,address2,Rio,canos,40021,conas,CATS"
    Then Debe estar la informacion en los campos
   