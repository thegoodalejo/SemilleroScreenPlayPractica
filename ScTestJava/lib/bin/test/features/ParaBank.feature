Feature: Crear una cuenta bancaria
  Yo como automatizador crear una cuenta bancaria

  Scenario Outline: Buscar producto
    Given Debe  ir a la pagina de "https://parabank.parasoft.com/parabank/index.htm"
    When Ingresa las credenciales <credenciales> con numero de cuenta <numerocuenta>
    Then valida que el numero de cuenta

    Examples: 
      | credenciales | numerocuenta |
      | john-demo    |        54321 |

