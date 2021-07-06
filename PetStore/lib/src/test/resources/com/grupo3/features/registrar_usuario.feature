#Author: Grupo 3
Feature: Registrar usuario
  Yo quiero registrar nuevo usuario en JPetStore

  Scenario Outline: Registrar usuario en JPetStore
    Given Quiero ir a la pagina "https://petstore.octoperf.com/actions/Account.action?newAccountForm="
    When Ingresar info usuario <user> contrasena <password> nombre <firsName> apellido <lastName> correo <email> telefono <phone> direccion1 <address1> direccion2 <address2> ciudad <city> estado <state> zip <zip> pais <country>
    Then debe registrar el usuario

    Examples: 
      | user         | password | firsName | lastName | email            | phone        | address1      | address2    | city    | state | zip      | country         |
      | "qwertyasdf" | "asdf"   | "asdf"   | "asdf"   | "asdf@gmail.com" | "3216549870" | "123 A Blvd." | "Block 202" | "Miami" | "Fl"  | "356892" | "United States" |
