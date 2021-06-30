#Author: elber.ceballos@sophossolutions.com
Feature: Buscar productos uno
  Yo como automatizador quiero ingresar a la pagina Para Bank y crear una cuenta

  Scenario Outline: Ingresar a banco y crear cuenta
    Given Deseo ir a la pagina <url>
    When Ingreso el usuario <usuario> y la contrasena <contraseña>
    And y abrir una cuenta tipo <tipo> a la cuenta <cuenta>
    Then Muestro la cuenta y el saldo en ella

    Examples: 
      | url                                                | usuario | contraseña | tipo    | cuenta |
      | "https://parabank.parasoft.com/parabank/index.htm" | john    | demo       | SAVINGS |  13344 |
