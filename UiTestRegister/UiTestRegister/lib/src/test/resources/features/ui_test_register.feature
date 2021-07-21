#Author: juan.blanco@sophossolutions.com
Feature: Registrar en la pagina
  Yo quiero registrarme en la pagina UI Test

  Scenario: Iniciar el registro
    Given Quiero ingresar a la pagina principal
    When Registrarme con los datos del Usuario
      | firstName   | Juan                            |
      | lastName    | Blanco                          |
      | email       | juan.blanco@sophossolutions.com |
      | dateOfBirth | October/1/1993                  |
      | language    | spanish                         |
    And el cual vive en
      | location | Bucaramanga |
      | zipCode  |      680004 |
    And y tiene los dispositivos
      | OS        | Windows         |
      | version   | windows 10      |
      | language  | Spanish         |
      | mobile    | Samsung         |
      | model     | Galaxy J5 Prime |
      | systemCel | Android 5.0     |
    And cuya clave de usuario es J1M2b3m45*.:D
    Then Registrarme sin dar click
