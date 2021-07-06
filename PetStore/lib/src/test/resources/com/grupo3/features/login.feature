#Author: julian.espitaleta@your.domain.com

Feature: Loguearse a la tienda de mascotas
  Quiero como automatizador
  Automatizar el proceso de inicio de sesión a la tienda de mascotas
  Para poder acceder a los features que solo los usuarios registrados pueden hacer

  Scenario: Login user
    Given Quiero iniciar sesion
    When Ingreso el usuario "qwertyasdf" y la contrasena "asdf"
    Then Deberia ver las opciones de usuario registrado