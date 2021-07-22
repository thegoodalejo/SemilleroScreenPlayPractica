#Author: juan.blanco@sophossolutions.com
Feature: Registrar en la pagina
  Yo quiero registrarme en la pagina UI Test

  Scenario: Iniciar el registro
    Given Quiero ingresar a la pagina principal
    When Registrarme con las credenciales
      | firstName   | Juan                            |
      | lastName    | Blanco                          |
      | email       | juan.blanco@sophossolutions.com |
      | dateOfBirth | "October/1/19993"               |
      | language    | spanish                         |
      | location    | Soata                           |
      | computer    | windows                         |
      | version     |                              10 |
      | mobile      | samsung                         |
      | model       | j5 prime                        |
      | systemCel   | "Android 5.0"                   |
      | password    |                           12345 |
    Then Registrarme sin dar click
